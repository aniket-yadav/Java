import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
public class calculator implements ActionListener{
	JFrame f;
	JTextField display;
	JPanel p,p1;
	 public static boolean precedence(char op1,char op2){
		if((op1=='+'||op1=='-')&&(op2=='-'||op2=='+')){
			return true;
		}else if((op1=='*'||op1=='/')&&(op2=='-'||op2=='+')){
			return false;
		} else if((op1=='/'||op1=='*')&&(op2=='*'||op2=='/')){
			return true;
		}else if((op1=='-'||op1=='+')&&(op2=='/'||op2=='*')){
			return true;
		}
		return true;
	}
	public static float evaluate(char opr,float op2,float op1){
   switch(opr){
   	case '+':
   	return op1+op2;
   	case '-':
   	return op1-op2;
   	case '*':
   	return  op1*op2;
   	case '/':
   	if(op2!=0){
   		return op1/op2;
   	}else{
   		throw new UnsupportedOperationException();
   	}
   }
return 0;
}
	calculator(){
     f = new JFrame("Calculator");
     p = new JPanel();
     p1 = new JPanel();
     display= new JTextField();
     JButton btn1 = new JButton("1");
     JButton btn2 = new JButton("2");
     JButton btn3 = new JButton("3");
     JButton btn4 = new JButton("4");
     JButton btn5 = new JButton("5");
     JButton btn6 = new JButton("6");
     JButton btn7 = new JButton("7");
     JButton btn8 = new JButton("8");
     JButton btn9 = new JButton("9");
     JButton btn0 = new JButton("0");
     JButton add = new JButton("+");
     JButton sub = new JButton("-");
     JButton mul = new JButton("*");
     JButton div = new JButton("/");
     JButton equal = new JButton("=");
     JButton dot = new JButton(".");
     JButton ac = new JButton("Ac");
     JButton del = new JButton("Del");
     
     f.add(display).setBounds(5,10,240,60);
     display.setEditable(false);
      
     display.setHorizontalAlignment(JTextField.RIGHT);
     p1.add(del);
     p1.add(ac);
     

     p.add(btn7);
     p.add(btn8);
     p.add(btn9);
     p.add(mul);

     p.add(btn4);
     p.add(btn5);
     p.add(btn6);
     p.add(div);

     p.add(btn1);
     p.add(btn2);
     p.add(btn3);
     p.add(sub);
     
     p.add(btn0);
     p.add(dot);
     p.add(equal);
     p.add(add);

     del.addActionListener(this);
     ac.addActionListener(this);
     btn0.addActionListener(this);
     btn1.addActionListener(this);
     btn2.addActionListener(this);
     btn3.addActionListener(this);
     btn4.addActionListener(this);
     btn5.addActionListener(this);
     btn6.addActionListener(this);
     btn7.addActionListener(this);
     btn8.addActionListener(this);
     btn9.addActionListener(this);
     add.addActionListener(this);
     sub.addActionListener(this);
     mul.addActionListener(this);
     div.addActionListener(this);
     dot.addActionListener(this);
     equal.addActionListener(this);

     
     p.setLayout(new GridLayout(4,4));
     p.setBounds(20,120,200,200);
     f.add(p);
     p1.setLayout(new GridLayout(1,2,100,20));
     p1.setBounds(20,70,200,50);
     f.add(p1);
     f.setLayout(null);
     f.setSize(250,350);
     f.setVisible(true);
     f.setLocation(500,300);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand()!="="){
			if(e.getActionCommand()=="Ac"){
				display.setText("");
			}else if(e.getActionCommand()=="Del"){
				String s=display.getText();
				s=s.substring(0,s.length()-1);
				display.setText(s);
			}else{
				display.setText(display.getText()+e.getActionCommand());
			}
		}else{
           try{
        Stack<String> postfix = new Stack<String>();
        Stack<Character> stack = new Stack<Character>(); 
        Stack<String> eval= new Stack<String>();
		String Expression=display.getText();
		char  expression[]=Expression.toCharArray();
        for(int j=0;j<expression.length;j++){
        	if(expression[j]>='0'&&expression[j]<='9'){
               String value="";
               while(j<expression.length&&expression[j]>='0'&& expression[j]<='9'){
                 value+=expression[j++];
               }
               --j; 
               postfix.push(value);
        	}else{
        		if(stack.isEmpty()){
        			stack.push(expression[j]);
        		}else{
        			if(precedence(expression[j],stack.peek()))
        			{
        				postfix.push(stack.pop().toString());
        				stack.push(expression[j]);
        			}else{
        				stack.push(expression[j]);
        			}
        	}
        }
        } 
       while(!stack.isEmpty()){
        postfix.push(stack.pop().toString());
       }
       	while(!postfix.isEmpty()){
       		eval.push(postfix.pop());
       	}
       	while(!eval.isEmpty()){
       		String op;
       		op=eval.pop();
       		float f;
       		if((op.equals("/"))||(op.equals("*"))||(op.equals("-"))||(op.equals("+"))){
               f=evaluate(op.charAt(0),Float.parseFloat(postfix.pop()),Float.parseFloat(postfix.pop()));
               postfix.push(String.valueOf(f));
       		}
       		else{
	            postfix.push(op);
       		}
       	}
       display.setText(postfix.pop()); 


		}catch(Exception ex){
     	display.setText("ERROR");
     }
	 
}
} 
	public static void main(String[] args) {
		new calculator();
	}
}
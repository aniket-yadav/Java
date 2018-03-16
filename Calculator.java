import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.script.*;
class Calculator implements ActionListener{
     JFrame jf;
     JTextField display;
	Calculator(){
		 jf = new JFrame();
         display = new JTextField(); 
		jf.setTitle("Calculator");
		jf.setSize(250,350);
		jf.setLocation(300,100);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setResizable(false);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        jf.add(display).setBounds(10,10,230,50);
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b0 = new JButton("0");
        JButton bdot = new JButton(".");
        JButton bequl = new JButton("=");
        JButton badd = new JButton("+");
        JButton bsub = new JButton("-");
        JButton bdiv = new JButton("/");
        JButton bmul = new JButton("*");
        JButton bdel = new JButton("Del");
        JButton bclear = new JButton("Ac");
        jf.add(b7).setBounds(20,110,50,50);
        b7.addActionListener(this);
	    jf.add(b8).setBounds(70,110,50,50);
	    b8.addActionListener(this);
	    jf.add(b9).setBounds(120,110,50,50);
	    b9.addActionListener(this);
	    jf.add(bmul).setBounds(170,110,50,50);
	    bmul.addActionListener(this);
	    jf.add(b4).setBounds(20,160,50,50);
	    b4.addActionListener(this);
	    jf.add(b5).setBounds(70,160,50,50);
	    b5.addActionListener(this);
	    jf.add(b6).setBounds(120,160,50,50);
	    b6.addActionListener(this);
	    jf.add(bdiv).setBounds(170,160,50,50);
	    bdiv.addActionListener(this);
	    jf.add(b1).setBounds(20,210,50,50);
	    b1.addActionListener(this);
	    jf.add(b2).setBounds(70,210,50,50);
	    b2.addActionListener(this);
	    jf.add(b3).setBounds(120,210,50,50); 
	    b3.addActionListener(this); 
	    jf.add(bsub).setBounds(170,210,50,50);
	    bsub.addActionListener(this); 
	    jf.add(b0).setBounds(20,260,50,50);
	    b0.addActionListener(this);
	    jf.add(bdot).setBounds(70,260,50,50);
	    bdot.addActionListener(this);
	    jf.add(bequl).setBounds(120,260,50,50); 
	    bequl.addActionListener(this); 
	    jf.add(badd).setBounds(170,260,50,50);
	    badd.addActionListener(this);  
	    jf.add(bdel).setBounds(20,60,50,50); 
	    bdel.addActionListener(this); 
	    jf.add(bclear).setBounds(170,60,50,50);
	    bclear.addActionListener(this);  
		}
	public void actionPerformed(ActionEvent e){
        		if(e.getActionCommand()!="="){
        			if(e.getActionCommand()=="Ac"){
                       display.setText("");
        			}else if(e.getActionCommand()=="Del"){
        				String s = display.getText();
        				s=s.substring(0,s.length()-1);
        				display.setText(s);
        			}
        			else{
        		display.setText(display.getText()+e.getActionCommand());
        			}
            }else{
            try{
        		ScriptEngineManager mgr = new ScriptEngineManager();
                ScriptEngine engine = mgr.getEngineByName("JavaScript");
                String d= display.getText();
                display.setText(engine.eval(d).toString());
            }catch(Exception ex){
                  display.setText("ERROR");
        		}
        	}
        }
        public static void main(String[] args) {
             new Calculator();
	}
}
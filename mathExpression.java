import java.util.*;
class stringEvaluation{
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
	public static void main(String[] args) {
        Stack<String> postfix = new Stack<String>();
        Stack<Character> stack = new Stack<Character>(); 
        Stack<String> eval= new Stack<String>();
        System.out.println("Enter Math Expression : ");
		String Expression=new Scanner(System.in).nextLine();
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
       System.out.println(postfix.pop()); 
	}
}
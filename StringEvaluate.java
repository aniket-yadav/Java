import java.util.*;
class StringEvaluate{
  // precedence method is used to check precedence of operators
  // * / (higher)
  // + - (lower)
  // note:- this is only for addition subtraction multiplication and division 
  // don't use ( ), ++,-- ,^  etc in math expression
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
  // evaluate  method for calculation
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
    //create stack of postfix for storing postfix expresion  
        Stack<String> postfix = new Stack<String>();
        // create stack 
        Stack<Character> stack = new Stack<Character>(); 
        // stack of  eval 
        Stack<String> eval= new Stack<String>();
        //take math expression as input
        System.out.println("Enter Math Expression : ");
        String Expression=new Scanner(System.in).nextLine();
        //convert math expression into character array
		    char  expression[]=Expression.toCharArray();
        // iterate character array
        for(int j=0;j<expression.length;j++){
          //if char is digit
        	if(expression[j]>='0'&&expression[j]<='9'||expression[j]=='.'){
              // string variable value  for storinng numbers which where in math expresion
               String value="";
               // when you create char array then number splits in digit 
               // so we have to get those number
               // below code is for that 
               // eg string no = 45;
               //char[] ex= no.toCharArray()
               // ex[0]=5 and ex[1]=5 
               //  we have to restore it as 45 
               //iterate char array for number 
               // while loop iterate till it finds number if it find any oparator like + - * / it will stop
               while(j<expression.length&&((expression[j]>='0'&& expression[j]<='9')||expression[j]=='.')){
                 value+=expression[j++];
               }
               //come back to previous index 
               --j; 
               //push number to postfix stack
               postfix.push(value);
        	}else{
            // if char is operator
            // check if stack is empty
        		if(stack.isEmpty()){
              //push this operator into the stack
        			stack.push(expression[j]);
        		}else{
              // if stack is not empty 
              //check the precedence with top most oparator and this new encounter operator 
        			if(precedence(expression[j],stack.peek()))
        			{
                //if this operator has lower precedence then pop the stack 
                // push it into postfix and push this operator in stack

        				postfix.push(stack.pop().toString());
        				stack.push(expression[j]);
        			}else{
                //if this operator has higher precedence then push it in stack
        				stack.push(expression[j]);
        			}
        	}
        }
        }

        // check is  stack is empty or not if not empty it into postfix 
       while(!stack.isEmpty()){
        postfix.push(stack.pop().toString());
       }
       // empty postfix stack into eval stack here we will evaluate our expression
       	while(!postfix.isEmpty()){
       		eval.push(postfix.pop());
       	}

        // start evaluating 
       	while(!eval.isEmpty()){
          //store operator in op here it can we number or - + * /  
       		String op;

       		op=eval.pop();// pop eval 
       		float f;
          // op is operator or number 
          //if it is an operator evalute it
       		if((op.equals("/"))||(op.equals("*"))||(op.equals("-"))||(op.equals("+"))){
            //pop postfix for operands
               f=evaluate(op.charAt(0),Float.parseFloat(postfix.pop()),Float.parseFloat(postfix.pop())); // evaluate expresion
               postfix.push(String.valueOf(f)); //push evaluated value into postfix
       		}
       		else{
            //if it's push it into postfix
	            postfix.push(op);
       		}
       	}
        //pop postfix to display value
       System.out.println(postfix.pop()); 
	}
}

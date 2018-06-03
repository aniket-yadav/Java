import java.util.*;
class demoStack{
    static boolean precedence(char op1,char op2){
    	if((op1=='/'||op1=='*')&&(op2=='/'||op2=='*')){
    		return true;
    	}
    	else if((op1=='/'||op1=='*')&&(op2=='-'||op2=='+')){
    		return true;
    	}else if((op1=='-'||op1=='+')&&(op2=='-'||op2=='+')){
    		return true;
    	}else{
    		return false;
    	}
    }
  static int evaluate(char opr,int op2,int op1){
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
   		return 'e';
   	}
   }
   return 0;
  }
	public static void main(String[] args) {
		Stack<Character> operators=new Stack<Character>();
		Stack<Character> operands=new Stack<Character>();
		System.out.println("Enter expression : ");
		String exp=new Scanner(System.in).nextLine();
		char ex[] = exp.toCharArray();
		for(int i=0;i<ex.length;i++){
            if(ex[i]>='0'&&ex[i]<='9'){
            	operands.push(ex[i]);
            }else{
            	if(operators.isEmpty()){
            		operators.push(ex[i]);
            	}else{
            		if(precedence( ex[i], operators.peek())){
                      operators.push(ex[i]);
            		}
            		else{
                      operands.push(operators.pop());
                      operators.push(ex[i]);
                     }
            	}
            	}
	}
		while(!operators.isEmpty()){
          operands.push(operators.pop());	
          	}
         while(!operands.isEmpty()){
         	System.out.println(operands.pop());
         }
          	
	}
}
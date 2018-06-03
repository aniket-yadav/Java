public class evaluate{
  public Object evaluateExpression(char opr,float op1,float op2){
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
   		return " / by 0";
   	}
   }
   return 0;
  }
  public static void main(String[] args) {
  	evaluate e=new evaluate();
  	System.out.println(e.evaluateExpression('+',9,6));
  	System.out.println(e.evaluateExpression('*',9,6));
  	System.out.println(e.evaluateExpression('-',9,6));
  	System.out.println(e.evaluateExpression('/',9,0));
  }
}

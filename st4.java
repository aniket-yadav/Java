class precedence{
	boolean comparePrecedence(char op1,char op2){
		if((op1=='*'||op1=='/')&&(op2=='*'||op2=='/'))
			return false;
		else if((op1=='*'||op1=='/')&&(op2=='-'||op2=='+'))
			return true;
		else if((op1=='-'||op1=='+')&&(op2=='*'||op2=='/'))
			return true;
		else if((op1=='-'||op1=='+')&&(op2=='-'||op2=='+'))
			return false;
		return false;
	}
	
	public static void main(String[] args) {
		precedence p = new precedence();
	    System.out.println(p.comparePrecedence('+','/'));
	    System.out.println(p.comparePrecedence('+','-'));
	    System.out.println(p.comparePrecedence('+','*'));
	    System.out.println(p.comparePrecedence('-','/'));


	}
}
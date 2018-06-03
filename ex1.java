class myclass{
	public static void main(String[] args) {
		int a,b;
		try{
			b=0;
			a=42/b;
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		System.out.println("will this get printed");
	}
}
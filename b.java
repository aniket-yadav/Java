class A{
	A(){
		System.out.println("in class A");
	}
	void B(){
		System.out.println("A method named B");
	}
}

class MyProgram{
	public static void main(String[] args) {
		A a;
		a=new A();
		a.B();
		System.out.println("how are you Aniket");
	}
}
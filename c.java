class A{
	A(){
		this(3);
		System.out.println("in Class A");
	}
	A(int a){

		System.out.println("Parameterized one");
	}
}
class MyProgram{
	public static void main(String[] args) {
		A a = new A();
		System.out.println("how are you");
	}
}
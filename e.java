class A{
	int x;
	A(int x){
		this.x=x;
	}
	void Display(){
		System.out.println(x);
	}
}
class MyProgram{
	public static void main(String[] args) {
		A a = new A(7);
		a.Display();
	}
}
class A{
	int x;
	A(int b){
		x=b;
	}
	void Display(){
		System.out.println(x);
	}
}
class B extends A{
	B(int y){
		super(y);
		x=x+1+y;
	}
	void Display(){
		System.out.println(x);
	}
}
class myclass{
	public static void main(String[] args) {
		B a = new B(7);
		a.Display();
	}
}
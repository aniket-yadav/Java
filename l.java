class A{
	int x;
	A(int a){
		x=a;
	}
}
class B extends A{
	B(int y){
		super(y);
		x=100;
		
	}
}
class myclass {
	public static void main(String[] args) {
		B a = new B(7);
		System.out.println(a.x);
	}
}
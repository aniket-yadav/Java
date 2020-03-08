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
	B(int y){// super should be first line in the body 
		super(y);//super() i used to call parent class constructor 
		x=x+1+y;
	}
	void Display(){
		System.out.println(x);
	}
}
class demosuper{
	public static void main(String[] args) {
		B a = new B(7);
		a.Display();
	}
}

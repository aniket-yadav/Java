class A{
	int x;
	A(int x){
		this.x=x;
	}
	void Display(){
		System.out.println(x);
	}
	protected void finalize(){
		System.out.println("Call to finalise");
	}
}
class myclass{
	public static void main(String[] args) {
		A a = new A(7);
		a.Display();
		a=null;
		a = new A(10);
		a.Display();
		a= new A(20);
		System.gc();
	}
}
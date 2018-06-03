class Base{
	Base(int n){
		System.out.println("Base"+n);
	}
}
class Derived extends Base{
	Derived(int a){
		super(8);
		System.out.println("Derived"+a);
	}
}
class myclass{
	public static void main(String[] args) {
		Derived d=new Derived(6);
		}
}
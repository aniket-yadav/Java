class Base extends Object{
	Base(){
		System.out.println("Base");
	}
}
class Derived extends Base{
  Derived(){
  	System.out.println("Derived");
  }
}
class myclass{
	public static void main(String[] args) {
		Derived d = new Derived();
	}
}
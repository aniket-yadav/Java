class MyMaths{
	void Foo1(){
		System.out.println("in Foo");
	}
}
class OtherClass extends MyMaths{
	void Foo2(){
		System.out.println("in Foo2");
	}
}
class myclass{
	public static void main(String[] args) {
		OtherClass a = new OtherClass();
		a.Foo2();
	}
}
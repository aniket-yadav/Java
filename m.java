interface A{
	default int DisplayA(){
		return 6;
	}
	default void sayHello(){
		System.out.println("hello");
	}
}
interface B extends A{
	default int DisplayB(){
        return 7;
	}
	default void sayHello(){
		System.out.println("helloWorld");
	}
}
class AB implements B{
	void Display(){
	int c=DisplayA()+DisplayB();
	System.out.println(c);
	}
}
class myclass{
	public static void main(String[] args) {
		AB x = new AB();
		x.Display();
		x.sayHello();
	}
}
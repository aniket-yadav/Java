// with default we can write method body in interface
interface A{
	int a=10;
	default void DisplayA(){
        int d;
  	int h=9;
  	int k=6;
  	d=++h+k++;
  	System.out.println("hello"+d);
  }
}
interface B{
	final int b=5;
	void DisplayB();
}
class AB implements A,B{
	/*public void DisplayA(){
		System.out.println(a);
	}*/
	public void DisplayB(){
		System.out.println(b);
	}
}
class interfacewithdefault {
	public static void main(String[] args) {
		AB x = new AB();
		x.DisplayA();
		x.DisplayB();
		System.out.println("Finished");
	}// with default we can write method body in interface
interface A{
	int a=10;//final by default 
	default void DisplayA(){
    int d;
  	int h=9;
  	int k=6;
  	d=++h+k++;
  	System.out.println("hello"+d);
  }
}
interface B{
	final int b=5;
	void DisplayB();
}
class AB implements A,B{
	//overriding DisplayA 
	public void DisplayA(){
		//use super to access parent method
		A.super.DisplayA();
		//System.out.println(++a); //gives error
		System.out.println(b);

	}

	//overriding DisplayB 

	public void DisplayB(){
		System.out.println(b);
	}
}
class interfacewithdefault {
	public static void main(String[] args) {
		AB x = new AB();
		x.DisplayA();
		x.DisplayB();
		System.out.println("Finished");
	}
}
}

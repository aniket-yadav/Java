class A
{
  static void B(){
		System.out.println(" A method named B");

	}
	static void C(){
		System.out.println("A method that is static");
	    B();
	}
}
public class myProgram{
	public static void main(String[] args){
		A.C();
		System.out.println("how are you ajay");

	}
}
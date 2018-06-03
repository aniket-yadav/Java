class zzz{

	public static void Printme(){
		System.out.println("Hello");
	}
	void display(){
		System.out.println("Hi");
	}
}
class myclass{
	public static void main(String[] a){
		zzz b=new zzz();
		b.display();
		zzz.Printme();
	}
}
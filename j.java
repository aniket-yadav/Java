class MyMaths{
	int a;
	void AssignAndDisplay(){
		a=10;
		System.out.println(a);
	}
}
class OtherClass extends MyMaths{
	void JustDisplay(){
		System.out.println(a);

	}
}
class myclass{
	public static void main(String[] args) {
		OtherClass a = new OtherClass();
		a.a=1000;
		a.JustDisplay();
		a.AssignAndDisplay();
		a.JustDisplay();
		a.a=20;
		a.JustDisplay(); 
	}
}
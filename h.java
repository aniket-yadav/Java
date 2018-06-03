class MyMaths{
	int a;
	void AssignAndDisplay(){
		a=10;
		System.out.println(a);
	}
}
class OtherClass extends MyMaths{
	void JustDisplay(){
		AssignAndDisplay();
			System.out.println(a);	
	}
}
class MyProgram{
	public static void main(String[] args) {
		OtherClass a = new OtherClass();
		a.JustDisplay();
	}
}
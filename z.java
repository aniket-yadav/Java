class MyMaths{
	protected void Dara(){
		System.out.println("some one called singh");

	}
}
class OtherClass extends MyMaths{
	protected void Dara(){
		super.Dara();
		System.out.println("A clone  of dara  lives near my house");

	}
	void Jackie(){
		System.out.println("some one called Chan");

	}
}
class myclass{
	public static void main(String[] args) {
	 OtherClass a = new OtherClass();
	 a.Dara();
	 a.Jackie();	
	}
}
class base
{
	public void parent()
	{
		System.out.println("Base Class");

	}
}

class derived extends base
{
   public void child()
   {
   	System.out.println("Derived Class");
   }
} 

class demoSingleLevelInheritance
{
	public static void main(String... args) 
	{
	   derived o = new derived();
	   o.parent();
	   o.child();	
	}
}
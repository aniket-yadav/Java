class A extends Thread
{
	public void run()
	{

		System.out.println("Thread A");
		System.out.println("i in Thread A");
		for(int i=0;i<=5;i++)
		{
			System.out.println("i= "+i);
			try
			{
				Thread.sleep(1000);	
			}catch(InterruptedException e)
			{
             System.out.println("Exception occurs:"+e);
			}
		}
		System.out.println("Thread A Completed.");
	}
}


class B extends Thread
{
	public void run()
	{

		System.out.println("Thread B");
		System.out.println("i in Thread B");
		for(int i=0;i<=5;i++)
		{
			System.out.println("i= "+i);
			
		}
		System.out.println("Thread A Completed.");
	}
}

class demoThread
{
	public static void main(String[] args) {
		A threadA = new A();
		B threadB = new B();
		threadA.start();
		threadB.start();
		try
		{
			threadA.sleep(1000);

		} catch(InterruptedException e)
		{
			System.out.println("Exception occurs:"+e);
		}
		threadB.start();
		System.out.println("main Thread end");
	}
}


class thread1 extends Thread 
{
	public void run()
	{
		try
		{
			for(int i=0;i<=10;i++)
		    {
			   System.out.println("Thread 1 prints:"+i);
			   Thread.sleep(1000);
			}
		}catch(InterruptedException e)
		{
			System.out.println("Thread "+"Interrupted");
		}
		
	}
}
class thread2 extends Thread 
{
	public void run()
	{
		try
		{
			for(int j=0;j<=10;j++)
		    {
			   System.out.println("Thread 2 prints:"+j);
			   Thread.sleep(1000);
			}
		}catch(InterruptedException e)
		{
			System.out.println("Thread "+"Interrupted");
		}
		
	}
}


class threadtest
{
	public static void main(String[] args) {
		thread1 t1=new thread1();
		thread2 t2=new thread2();
		
		t1.start();
		t2.start();
		

	}
}
class RunnableDemo implements Runnable
{
	private Thread t;
	private String ThreadName;
	RunnableDemo(String name)
	{
		ThreadName=name;
		System.out.println("Creating "+ThreadName);
	}
	public void run()
	{
		System.out.println("Running "+ThreadName);
		try{
			for(int i=4;i>0;i--)
			{
				System.out.println("Thread "+ThreadName+" "+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e)
		{
			System.out.println("Thread "+ThreadName +"Interrupted");
		}
		System.out.println("Thread "+ThreadName+"existing");
	}
public void start()
{
	System.out.println("Starting "+ThreadName);
	if(t==null)
	{
		t=new Thread(this,ThreadName);
		t.start();

	}
}
}
class TestThread
{
	public static void main(String[] args) {
		RunnableDemo R1=new RunnableDemo("aniket");
		R1.start();
		RunnableDemo R2=new RunnableDemo("yadav");
		R2.start();
	}
}
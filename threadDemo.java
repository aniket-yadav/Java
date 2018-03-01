class A extends Thread implements Runnable
{
	public void run(){
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("i: "+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e)
		{
			System.out.println("Thread "+"Interrupted");
		}
	}
}

class B extends Thread implements Runnable
{
	public void run(){
		try{
			for(int j=0;j<5;j++)
		    {
			System.out.println("J: "+j);
			Thread.sleep(10);
			}
		}catch(InterruptedException e)
		{
			System.out.println("Thread "+"Interrupted");
		}
		
	}
}
class C extends Thread implements Runnable
{
	public void run(){
		try{for(int k=0;k<5;k++)
		{
			System.out.println("K: "+k);
			Thread.sleep(100);
			}
		}catch(InterruptedException e)
		{
			System.out.println("Thread "+"Interrupted");
		}
		}
	}


class threadDemo{
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		C c=new C();
		a.start();
		b.start();
		c.start();
		
	}
}
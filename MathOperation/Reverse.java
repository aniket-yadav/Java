package MathOperation;
 public class Reverse
{
	public Reverse(int n)
	{   int no=n;
	    int rev=0;
		int rem=0;
		while(n!=0)
		{
           rem=n%10;
           n=n/10;
           rev=rev*10+rem;
		}
		System.out.printf("Reverse of %d is %d \n",no,rev);
	}
}
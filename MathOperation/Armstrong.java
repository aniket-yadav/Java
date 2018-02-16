package MathOperation;
public class Armstrong
{
	public Armstrong(int no)
	{
		int n = no ;
		int rem = 0;
		int sum = 0;
		while(no != 0)
		{
			rem = no % 10;
			no = no / 10;
			sum = sum + rem * rem * rem ;
		}
		if(n==sum)
		{
			System.out.printf("Number %d is Armstrong \n",n);
		}
		else
		{
			System.out.printf("Number %d is not Armstrong\n",n);
		}
	}
}
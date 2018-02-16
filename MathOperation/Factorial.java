package MathOperation;
 public class Factorial
{
	public Factorial(int x)
	{
	if (x==0) 
	{
	   System.out.println(1);	
	}
	else
	{    int fact = 1;
		for(int i=x;i>0;i--)
		{
			fact =fact*i;
		}
		System.out.printf("Factorial of %d is %d \n",x,fact);
	}
	}
}
import java.util.*;

class sumChar
{
	public static void main(String[] args)
	{
		char[] charArray ={'0','1','2','3','4','5','6','7','8','9'};
		long sum=0;
		for(int i=0;i<charArray.length;i++)
		{
			sum = sum + charArray[i];
		}
		System.out.printf("the sum of digits for a given char array consisting of the digits '0' to '9' is %d\n ",sum);
	}
}
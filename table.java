import java.util.*;
class table
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number : ");

		int no = obj.nextInt();

		int m;
		System.out.println("Table of " + no );
		for(int i=1;i<=10;i++)
		{
			m=i*no;
			System.out.println(m);

		}
	}
}
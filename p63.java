import java.util.*;
class matrixMultiplication
{
	public static void main(String... args)
	{
		Scanner obj = new Scanner (System.in);
		int m1[][] = new int[2][2];
		int m2[][] = new int[2][2];
		int mult[][] = new int[2][2];
		System.out.println("Enter First 2X2 Matrix");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				m1[i][j]=obj.nextInt();

			}
		}
		System.out.println("Enter Second 2X2 Matrix");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				m2[i][j]=obj.nextInt();
				
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				for(int k=0;k<2;k++)
				{
				mult[i][j]=mult[i][j]+m1[i][k]*m2[k][j];
				}
			}
		}
		System.out.println("First Matrix:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(m1[i][j]+"\t");
				
			}
			System.out.println();
		}
		System.out.println("Second Matrix:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(m2[i][j]+"\t");
				
			}
			System.out.println();
		}
		System.out.println("Multiplication Matrix:");

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(mult[i][j]+"\t");
				
			}
			System.out.println();
		}
	}
}
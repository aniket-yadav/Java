import java.util.*;
class matrixAddition
{
	public static void main(String... args)
	{
		Scanner obj = new Scanner (System.in);
		//create 2d array for matrix m1 m2 msum
		int m1[][] = new int[2][2];
		int m2[][] = new int[2][2];
		int msum[][] = new int[2][2];
		//first matrix input
		System.out.println("Enter First 2X2 Matrix");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				m1[i][j]=obj.nextInt();

			}
		}
		//second matrix input
		System.out.println("Enter Second 2X2 Matrix");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				m2[i][j]=obj.nextInt();
				
			}
		}
		//adding two matrix
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				msum[i][j]=m1[i][j]+m2[i][j];
				
			}
		}
		//display first matrix
		System.out.println("First Matrix:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(m1[i][j]+"\t");
				
			}
			System.out.println();
		}
		//display 2nd matrix
		System.out.println("Second Matrix:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(m2[i][j]+"\t");
				
			}
			System.out.println();
		}
		
		//display addition matrix
		System.out.println("Addition Matrix:");

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(msum[i][j]+"\t");
				
			}
			System.out.println();
		}
	}
}

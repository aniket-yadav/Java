class pattern
{
	public static void main(String[] args)
	{
		int sp=0,s=5;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=sp;j++)
			{
		      System.out.print(" ");
			}

			for(int k=1;k<=s;k++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			sp=sp+1;
			s=s-1;
		}
	}
}
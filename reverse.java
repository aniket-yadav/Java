import java.util.Scanner;
class reverse
{
	public static void main(String[] args)
	{
		System.out.print("Enter String :");
		Scanner obj=new Scanner(System.in);
	
		String a=obj.nextLine();
		
		String rev="";
		for( int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		System.out.println("Reverse of the String : "+rev);
	}
}
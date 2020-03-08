import java.util.Scanner;
class generatetable  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no to generate table : ");
		int no = sc.nextInt();
		for (int i=1;i<=10 ;i++ ) {
			System.out.println(no+" X "+i +" = "+no*i);
			
		}
	}
}
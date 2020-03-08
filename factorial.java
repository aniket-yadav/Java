import java.util.Scanner;
class factorial {
	public static void main(String[] args) {
		//create object of  scanner 
		Scanner sc = new Scanner(System.in);
		//take input for factorial 
		System.out.print("Enter no to find factorial : ");
		int no =sc.nextInt();
		// variable fact to store factorial
		int fact=1;
		//multiply no from 1 to fact 
		for (int i=1;i<=no ;i++) {
		 	fact=fact*i;
		 } 
		 System.out.printf("factorial of %d is %d ",no , fact);
	}
}
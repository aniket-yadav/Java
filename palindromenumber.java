import java.util.Scanner;
class palindromenumber {
	public static void main(String[] args) {
		//create object of scanner
		Scanner sc = new Scanner(System.in);
		//take int input 
		System.out.print("Enter int to check palindrome | not palindrome : ");
		int no = sc.nextInt();
		//reverse of no
		int rev=0;
		//variable to store remainder
		int rem=0;
		// variable to store original number
		int ono= no;
		while(no>0){
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;

		}
		if (ono == rev) {
			System.out.printf("%d is a palindrome number.",ono);
		}else{
			System.out.printf("%d is not a palindrome number.",ono);

		}
	}
}
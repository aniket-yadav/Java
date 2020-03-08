import java.util.Scanner;

class primenumber {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			//take number as input
			System.out.print("Enter number to check prime | non prime : ");
			int no= sc.nextInt();
			//half the no to save time 
			int n= no/2;
			int flag =0;
			//check no is divisible by 2 to n 
			for(int i= 2 ; i<=n ;i++){
				if (no % i==0) {
					//if no is divisible then set flag 1 and break the loop
					flag=1;
					break;
				}
			}
			if (flag==1) {
				System.out.printf("%d is a non prime number.",no);
			}else{
				System.out.printf("%d is a prime number.",no);
			}
		}	
}
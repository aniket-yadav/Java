import java.util.Scanner;
class Armstrong  {
	public static void main(String[] args) {
		//create object of scanner 
		Scanner sc = new Scanner(System.in);
		//take int as input
		System.out.print("Enter int value check Armstrong | not Armstrong : ");
		int no = sc.nextInt();
		// rem to store remainder
		// sum to store sum of cube of each digit
		// origon is to store original number
		int rem=0 , sum=0 , origno=no;
		while(no >0){
			rem= no%10;
			sum=sum+rem*rem*rem;
			no=no/10;
		}
		if(origno == sum){
			System.out.printf("%d is a Armstrong number.",origno);
		}else{
			System.out.printf("%d is not a Armstrong number.",origno);

		}
	}
}
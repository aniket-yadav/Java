import java.util.Scanner;
class factorialwithrecursion {
public static void main(String[] args) {
	//create object of scanner
	Scanner sc  = new  Scanner(System.in);
	//take input
	System.out.print("Enter number to find factorial : ");
	int no = sc.nextInt();
	//check filter negative number
	if (no<0) {
		System.out.print("Enter non negative number.");
		System.exit(0);
	}
	//call fact function 
	int factno=fact(no);
	//display factorial
	System.out.printf(" factorial of number %d is %d ",no ,factno);
}
	//private static method to calculate factorial
	//it's a recursive function
	// when a function calls itself within it's body is called recursive function
	private static int fact (int no){
		if(no == 0){
			return 1;
		}else{
			return no*fact(no-1);
		}
	}
}
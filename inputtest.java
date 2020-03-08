import java.util.Scanner;
class inputtest  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter to verify String | Number : ");
		String text= sc.nextLine();
if (text.isDigit()) {
	System.out.print("it is numeric value. ");
	
}else {
	System.out.print(" it is string value .");
}
	}
}
import java.util.Scanner;
class StringReverse {
	public static void main(String[] args) {
		//create object of scanner 
		Scanner sc  = new Scanner(System.in);
		//take input 
		System.out.print("Enter String to reverse : ");
		String str = sc.nextLine();
		String reverseString="";
		//with charAt() method create reverse of value 
		//charAt() returns char at given index
		for(int i=str.length()-1;i>=0;i--){
			reverseString+=str.charAt(i);
		}
		//print output
		System.out.printf("Reverse of String %s is %s.",str,reverseString);
	}
}
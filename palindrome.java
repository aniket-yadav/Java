import java.util.Scanner;
class palindrome {
	public static void main(String[] args) {
		//create object of scanner 
		Scanner sc  = new Scanner(System.in);
		//take input 
		System.out.print("Enter value to check palindrome | not palindrome : ");
		String value = sc.nextLine();
		//temp variable to store reverse string
		String temp="";
		//with charAt() method create reverse of value 
		//charAt() returns char at given index
		for(int i=value.length()-1;i>=0;i--){
			temp+=value.charAt(i);
		}
		//check origin string and reverse string 
		if (value.equals(temp)) {
			//if they match 
			System.out.printf("%s is a palindrome ",value);
		}else{
			//if they do not  match
			System.out.printf("%s is not a palindrome ",value);

		}
	}
}
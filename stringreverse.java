import java.util.*;
class demoJava{
	   public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter string : ");
		String str1 = obj.nextLine();
		String str2="";
		for(int i=str1.length()-1;i>=0;i--){
			str2 = str2+str1.charAt(i);
		}
		System.out.printf("reverse of string %s is %s\n",str1,str2);
    }
}
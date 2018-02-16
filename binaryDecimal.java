import java.util.*;

public class binaryDecimal{
public static void main(String... e) {
	System.out.println("\t\tBinary to Decimal conversion ");
	System.out.println("Enter Binary No:");
	String b1 = new Scanner(System.in).nextLine();
	int d1 = Integer.parseInt(b1,2);
	System.out.printf("Decimal of Binary %s is = %d \n",b1,d1);
	System.out.println("\t\tDecimal to Binary conversion ");
	System.out.println("Enter Decimal No:");
	int d2 = new Scanner(System.in).nextInt();
	String b2 = Integer.toBinaryString(d2);
	System.out.printf("Binary of Decimal %d is = %s \n",d2,b2);
}
}
import java.util.*;
class binaryadd
{
	
    public static void main(String... Binary)
	{
System.out.println("First Binary number :");
String b1 = new Scanner (System.in).nextLine();
System.out.println("Second Binary number :");
String b2 = new Scanner (System.in).nextLine();

int add=Integer.parseInt(b1,2)+Integer.parseInt(b2,2);
String badd = Integer.toBinaryString(add); 
System.out.println("Sum of Binary  " +b1 +" and "+b2);
System.out.println(badd);
}
}
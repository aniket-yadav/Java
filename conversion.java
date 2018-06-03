//char to int
//get ASCII value

class CharToInt{
	public static void main(String[] args) {
		char c='a';
		char c2='1';
		int a=c;
		int b=c2;
		System.out.println(a);
		System.out.println(b);
	}
}
//get numeric value

class CharToInt{
	public static void main(String[] args) {
		char c='1';
		char d='9';
		int a=Character.getNumericValue(c);
		System.out.println(a);
		int b=Character.getNumericValue(d);
		System.out.println(b);
	}
}

//char to string to int

class CharToInt{
	public static void main(String[] args) {
		char c='9';
		int a=Integer.parseInt(String.valueOf(c));
		System.out.println(a);
	}
}


//String to int 

class StringToInt {
	public static void main(String[] args) {
		String s="100";
		int i=Integer.parseInt(s);
		int k=Integer.valueOf(s);
		System.out.println(i);
		System.out.println(k);
	}
}

//int to String

class IntToString{
	public static void main(String[] args) {
		int i=200;
		String s=String.valueOf(i);
		String s2=Integer.toString(i);
		String s3=String.format("%d",i);
		System.out.println(s+s2+s3);
	}
}


//String to long

class StringToLong{
	public static void main(String[] args) {
		String s="9823456870";
		long l=Long.parseLong(s);
		System.out.println(l);
	}
}


//long to String

class LongToString{
	public static void main(String[] args) {
		Long l=982345870L;
		String s=String.valueOf(l);
		String s2=Long.toString(l);
		System.out.println(s+s2);
	}
}


//String to Float

class StringToFloat{
	public static void main(String[] args) {
		String s="23.6";
		float f=Float.parseFloat(s);
		System.out.println(f);
	}
}


//Float to String

class FloatToString{
	public static void main(String[] args) {
		float f=12.3F;
		String s=String.valueOf(f);
		String s2=Float.toString(f);
		System.out.println(s+s2);
	}
}


//String to double

class StringTODouble{
	public static void main(String[] args) {
		String s="23.9";
		double d=Double.parseDouble(s);
		System.out.println(d);
	}
}


//double to string
class DoubleToString{
	public static void main(String[] args) {
		double d=12.3;
		String s=String.valueOf(d);
		String s2=Double.toString(d);
		System.out.println(s+s2);
	}
}
import java.io.*;
public class WriteBytes{
	public static void main(String[] args) {
		
		try{int  b;
		b=65;
	   new PrintStream(new FileOutputStream()).print(b);
		System.out.write('\n');
	}catch(Exception e){
		System.out.print(e.getMessage());
	}
}
}
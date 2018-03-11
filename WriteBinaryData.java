import java.io.*;
class WriteBinaryData{
	public static void main(String[] args) throws IOException {
		DataOutputStream dataout;
		int age=10;
		double salary=50000.00;
		boolean married=true;
		String name="Aniket Yadav";
		try{
			dataout = new DataOutputStream(new FileOutputStream("file2.txt")); 
		}catch(IOException exc){
			System.out.println("Cannot open file");
			return;
		}
		try{
			System.out.println("Writing "+age);
			dataout.writeInt(age);
			System.out.println("Writing "+salary);
			dataout.writeDouble(salary);
			System.out.println("Writing "+married);
			dataout.writeBoolean(married);
			System.out.println("Writing "+name);
			dataout.writeUTF(name);
		}catch(IOException exc){
			System.out.println("Write error.");
		}
		dataout.close();
		System.out.println();
		
	}
}
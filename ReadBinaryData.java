import java.io.*;
class ReadBinaryData{
	public static void main(String[] args) throws IOException {
		DataInputStream dataIn;
		int age;
		double salary;
		boolean married;
		String name;
		try{
			dataIn = new DataInputStream(new FileInputStream("file2.txt"));

		}catch(IOException exc){
			System.out.println("Con not open file.");
			return;
		}
		try{
			age = dataIn.readInt();
			System.out.println("Reading "+age);
			salary = dataIn.readDouble();
			System.out.println("Reading "+salary);
			married = dataIn.readBoolean();
			System.out.println("Reading "+married);
			name = dataIn.readUTF();
			System.out.println("Reading "+name);

		}catch(IOException exc){
			System.out.println("Read Error");
		}
		dataIn.close();
	}
}
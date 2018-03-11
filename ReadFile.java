import java.io.*;
class ReadFile{
	public static void main(String[] args) throws IOException{
		int i;
		//File file = new File("file.txt");
		FileInputStream fin;
		try{
			fin = new FileInputStream("file.txt");
            
			}catch(FileNotFoundException exc){
				System.out.println("File Not Found ");
				return;
			}catch(ArrayIndexOutOfBoundsException exc){
				System.out.println("Usage : ReadFile File");
				return;
			}
			do{
				i=fin.read();
				if(i!=-1){
					System.out.print((char)i);

				}
			}while(i!=-1);
			    fin.close();
			

	}
}
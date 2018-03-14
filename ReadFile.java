import java.io.*;
class ReadFile{
	public static void main(String[] args){
		int i;
	
		FileInputStream fin;
		try{
			fin = new FileInputStream("file.txt");
            
			}catch(FileNotFoundException exc){
				System.out.println("File Not Found ");
				return;
			}
			try{
			do{
				i=fin.read();
				if(i!=-1){
					System.out.print((char)i);

				}
			}while(i!=-1);
			     System.out.println();
			    fin.close();
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
}
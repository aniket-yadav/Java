import java.io.*;
class CopyFile{
	public static void main(String[] args) {
		int i;
		File file = new File("file.txt");
		File copyfile = new File("file1.txt");
		FileInputStream fin;
		FileOutputStream fout;
		try{
			try{
				fin = new FileInputStream(file);				 
			}catch(FileNotFoundException exc){
				System.out.println("Input file not found");
				return;

			}
			try{
				fout = new FileOutputStream(copyfile,false);

			}catch(FileNotFoundException exc){
				System.out.println("Error in opening Output File ");
				return; 
			}
		}catch(ArrayIndexOutOfBoundsException exc){
			System.out.println("Usage: CopyFile from to ");
			return;
		}
		try{
			do{
				i=fin.read();
				if(i!=-1){
					fout.write(i);
				}
			}while(i!=-1);
			}catch(IOException exc){
				System.out.println("File Error ");
			}
			try{
			fout.close();
			fin.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

		}
	}

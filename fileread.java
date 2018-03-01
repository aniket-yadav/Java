import java.io.*;
class fileRead
{
	public static void main(String[] args) 
	{
		FileReader fileReader;
		BufferedReader bufferedReader;
		
		String line=null;
		try{
			 fileReader = new FileReader("file.txt");
		     bufferedReader = new BufferedReader(fileReader);
			while((line=bufferedReader.readLine()) !=null)
			{
				System.out.println(line);
			}
			bufferedReader.close();
		    fileReader.close();
		}
		catch(IOException e){
			System.out.println("Error on reading file");
		}
		
		
	}

}
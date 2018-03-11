import java.io.*;
class ReadCsFile{
	public static void main(String[] args) throws Exception {
	
			FileReader fr = new FileReader("file3.txt");
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s=br.readLine())!=null)
			{
				System.out.println(s);
			} 
		
	}
}
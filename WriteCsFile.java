import java.io.*;
class WriteCsFile{
 public static void main(String[] args) throws IOException {
 	String str;
 	FileWriter fw;
 	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
 	try{
 		fw = new FileWriter("file3.txt");
 	}catch(IOException exc){
 		System.out.println(" Can not open file .");
 		return;
 	}
 	System.out.println(" Enter text('bye' to quit).");
 	do{
 		System.out.print(" : ");
 		str=br.readLine();
 		if(str.compareTo("bye")==0)
 			break;
 		str=str+"\r\n";
 		fw.write(str);
 	}while(str.compareTo("bye")!=0);
 	fw.close();
 	}
 }

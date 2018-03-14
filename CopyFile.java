import java.io.*;
class CopyFile{
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        FileOutputStream fout;

        try
        {
            fin = new FileInputStream("file.txt");               
            
            fout = new FileOutputStream("file1.txt");
            do
            {
              i=fin.read();
              if(i!=-1)
              { 
                  fout.write(i);
              }
          }while(i!=-1);
          fin.close();
          fout.close();

      }catch(IOException e)
      {
         System.out.println(e.getMessage());
     }
 }
}

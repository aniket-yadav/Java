import java.io.*;
import java.util.*;
class StudentFile{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        PrintWriter pw = null;
        String Name,Middle_Name,Last_Name,Class;
        int Rollno;
        try{
            pw=new PrintWriter(new FileOutputStream("file.txt"));

        }catch(FileNotFoundException e){
            System.out.println("Error opening the File.txt"+e.getMessage());
            System.exit(0);
        }
        System.out.println(" Enter Student Data ");
        System.out.print(" Rollno : ");
        Rollno =keyboard.nextInt();
        System.out.print(" Name : ");
        Name = keyboard.next();
        System.out.print(" Middle-Name : "); 
        Middle_Name = keyboard.next();
        System.out.print(" Last-Name : ");
        Last_Name = keyboard.next();
        System.out.print(" Class : ");
        Class = keyboard.next();
        pw.println(" Rollno : "+ Rollno);
        pw.println(" Name : "+Name);
        pw.println(" Middle-Name : "+Middle_Name); 
        pw.println(" Last-Name : "+Last_Name);
        pw.println(" Class : "+Class);
        pw.close();
        System.out.println("You have successfully entered data.");
    }
}
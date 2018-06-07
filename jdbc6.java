import java.sql.*;
import java.util.*;
public class jdbc6{
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","");
		PreparedStatement pstmt = con.prepareStatement("insert into users(username,email,password) values(?,?,?)");
        do{
        System.out.println("Enter username");
        pstmt.setString(1,new Scanner(System.in).nextLine());
        System.out.println("Enter email");
        pstmt.setString(2,new Scanner(System.in).nextLine());
        System.out.println("Enter password");
        pstmt.setString(3,new Scanner(System.in).nextLine());
        int i = pstmt.executeUpdate();
        System.out.println(i+" records inserted");
        System.out.println("Do you want to insert more data ?y/n ");
        if('n'==(new Scanner(System.in).next().charAt(0))){
        	break;
        }
        }while(true);
        con.close();
        
	}
}
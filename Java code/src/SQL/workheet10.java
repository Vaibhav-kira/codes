package SQL;


import java.sql.*;
import java.util.*;

public class workheet10 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//Register JDBC driver
		Class.forName("com.mysql.jdbc.Driver");
		//Open a connection
		System.out.println("Connecting......");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
		
		//Create statement 
		Statement st = null;
		
		String create = "CREATE TABLE WORKSHEET10 ( UID INTEGER, Name VARCHAR(255));";
		
		st = con.createStatement();
		st.executeUpdate(create);
		
		//inserting data in table
		
		System.out.println("Enter number of data to be inserted ");
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		
		for(int i=0;i<a;i++)
		{
			
			System.out.println("Enter name");
			String name1 = sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter uid");
			int uid = sc.nextInt();
			
			
			String query = "INSERT INTO `WORKSHEET10` (`UID`, `Name`) VALUES ('"+uid+"', '"+name+"');";
			st.executeUpdate(query);
			
		}	
		sc.close();
	}
}

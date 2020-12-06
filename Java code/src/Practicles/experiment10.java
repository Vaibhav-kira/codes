
package Practicles;

import java.sql.*;


public class experiment10

{

public static void main(String[] args )

{

try

{

String query1 = "INSERT INTO Registration (ID, First, Last, Age)"

+ "VALUES ('1', 'Tom', 'Hanks', '61 ')";

String query2 = "INSERT INTO Registration (ID, First, Last, Age)"

+ "VALUES ('2', 'Johnny', 'Depp', '54')";

String query3 = "INSERT INTO Registration (ID, First, Last, Age)"

+ "VALUES ('3', 'Leo', 'Dicaprio', '42')";



//Loading and registering MYSQL database thin driver 

Class.forName("com.mysql.jdbc.Driver");



//Creating a connection between Java program and  database.

Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");



//Creating a Statement object to excute SQL statements 

Statement stmt = con.createStatement();



//Executing a SQL INSERT query using executeUpdate() method of Statement object.

int count = stmt.executeUpdate(query1);

System.out.println("Number of rows updated in database = " + count);



//Executing next SQL INSERT query using executeUpdate() method of Statement object.

count = stmt.executeUpdate(query2);

System.out.println("Number of rows updated in database = " + count);



//Executing next SQL INSERT query using executeUpdate() method of Statement object.

count = stmt.executeUpdate(query3);

System.out.println("Number of rows updated in database = " + count);

}

catch(Exception e)

{

System.out.println(e);

}

}//main() defintion ends

}//class definition ends

package training.lab63;

// PrepareTest.java
import java.sql.*;
import java.io.*;
class PrepareTest {
	public static void main(String argv[]) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		// jdbc:mysql://[hostname][,failoverhost...][:port]/[dbname][?param1=value1][&param2=value2].....
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/mysql", "", "");
		
		c.setAutoCommit(false);
		try{
			PreparedStatement p = c.prepareStatement(
				"CREATE TABLE Student(id INTEGER, name VARCHAR(20), dept VARCHAR(20), gpa REAL)");
			p.executeUpdate();
			p = c.prepareStatement(
				"INSERT INTO Student VALUES (?, ?, ?, ?)");
			BufferedReader br = new BufferedReader(new FileReader("data.txt"));
			for (int i = 0; i < 4; i++) {
				p.setString(1, br.readLine());
				p.setString(2, br.readLine());
				p.setString(3, br.readLine());
				p.setString(4, br.readLine());
				p.executeUpdate();
			}
			
			c.commit();
			
			br.close(); p.close();
		}
		catch( Exception e ){
			c.rollback();
		}
		finally{
			c.close();
		}

	}
}

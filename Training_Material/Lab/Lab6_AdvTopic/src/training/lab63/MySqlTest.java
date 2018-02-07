package training.lab63;

// MySqleTest.java
import java.sql.*;
class MySqlTest {
	public static void main(String argv[]) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/mysql", "", "");
		Statement s = c.createStatement();
		ResultSet r = s.executeQuery("SELECT * FROM student");
		while (r.next())
			System.out.println(r.getInt(1) + "," + r.getString(2) + "," + r.getString(3) + "," + r.getDouble(4));
		s.close();
		c.close();
	}
}



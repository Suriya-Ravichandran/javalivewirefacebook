package jdbcprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connecttype1 {

	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/javadb?user=root&password=";
			Connection conn=DriverManager.getConnection(dburl);
			System.out.println("Connection success");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

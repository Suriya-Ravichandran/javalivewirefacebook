package jdbcprogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Connectiontype3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			File f =new File("./Credentials/Configration.properties");
			FileReader reader=new FileReader(f);
			Properties prop=new Properties();
			prop.load(reader);
			String dburl=prop.getProperty("dburl");
			Connection conn =DriverManager.getConnection(dburl);
			System.out.println("connection Sucess");
		
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

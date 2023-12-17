package infrastructure.persistence.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	
	public static Connection getConnection() {
		String host= "localhost";
		String port="3306";
		String username="root";
		String password="";
		String nombrebd="conferencia";
		// Driver to connection to BD Mysql..
		
		String driverClassName="com.mysql.cj.jdbc.Driver";
		
		Connection connection=null;
		
		try {
			
			Class.forName(driverClassName);
			String url="jdbc:mysql://"+host+":"+port+"/"+nombrebd;
			connection = DriverManager.getConnection(url, username, password);
			
			System.out.println("CONEXION ESTABLECIDA...MYSQL");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("CONEXION  NO ESTABLECIDA.... MySQL");
			e.printStackTrace();
		}
		return connection;
	}
	
}

package ElectricityBillingSystem;

import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
 
public class testsql {
 
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
	
		String url ="jdbc:mysql://localhost:3306/customerdetails";
		String user = "root";
		String pass = "Chair@2460";
		Connection conn =null;
		Statement stmt = null;
		
		try {
			
		//Creating a connection to the database
		 conn = DriverManager.getConnection(url,user,pass);
		 
		 stmt = conn.createStatement();
		 
		 String sql = "INSERT INTO customerinfo (client_name, client_email, client_phn, client_address, client_metno, client_city, client_prov)\r\n"
		 		+ "VALUES ('Cardinal', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', '4006', 'Norway');";
		 
		 int rowsAffected = stmt.executeUpdate(sql);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		
		}		finally {
			if(stmt!=null) {
				stmt.close();
			}
			if (conn!=null) {
				conn.close();
			}
		}
	}
}
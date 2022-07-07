package ElectricityBillingSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testmysql {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/customerdetails";
		String username = "root";
		String password = "Chair@2460";

		System.out.println("Connecting database...");

		try (Connection connection = DriverManager.getConnection(url, username, password)) {
		    System.out.println("Database connected!");
		} catch (SQLException e) {
		    throw new IllegalStateException("Cannot connect the database!", e);
		}
	}
}

package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Load the DB
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Connect the DB
		String url = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		
		System.out.println("Succesfully connected");

		String query = "select * from movies";

		// send query to the DB
		Connection conn = DriverManager.getConnection(url, username, password);
		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) {

			System.out.println("Title:  " + rs.getString("Title") + "\t");

			System.out.println("Genre:  " + rs.getString("Genre") + "\t");

			System.out.println("Director:  " + rs.getString("Director") + "\t");

			System.out.println("Release_Year:  " + rs.getInt("Release_year") + "\t");

		}

		conn.close();

	}
}

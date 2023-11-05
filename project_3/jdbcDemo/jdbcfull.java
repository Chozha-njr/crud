package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcfull {
	public static void main(String[] args) throws Exception{
		
		
		
		
		
		readRecord();
		//InsertRecord();
		//InsertRecord2();
		//InsertRecordprep(); 
	    //Delete();
		
		
		
		
		
	}
	public static void readRecord() throws Exception {
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/Animated_movies";
		String username = "root";
		String password = "root";
		
		System.out.println("Succesfully connected");

		String query = "select * from movies";

		
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
	
	public static void InsertRecord() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Connect the DB
		String url = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		
		System.out.println("Succesfully connected");

		String query = "INSERT INTO movies VALUES('bigboss1','serial2','someone5',20179)";


		
		Connection conn = DriverManager.getConnection(url, username, password);
		Statement stmt = conn.createStatement();

		int rows = stmt.executeUpdate(query);

		System.out.println("No of rows Affected:  " + rows);
		conn.close();
		
	}  
	
	
	public static void InsertRecord2() throws Exception {// Build the SQL query with user input
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/Animated_movies";
		String username = "root";
		String password = "root";
		
		String Title="dhoom";
		String Genre="Action";
		String Director ="dilip";
		int Release_Year =2000;
		
		
		System.out.println("Succesfully connected");

		String query = "INSERT INTO movies VALUES('" + Title + "','" + Genre + "','" + Director + "'," + Release_Year+")";


	
		Connection conn = DriverManager.getConnection(url, username, password);
		Statement stmt = conn.createStatement();

		int rows = stmt.executeUpdate(query);

		System.out.println("No of rows Affected:  " + rows);
		conn.close();
	}
	
	
	
	public static void InsertRecordprep() throws Exception {
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Connect the DB
		String url = "jdbc:mysql://localhost:3306/Animated_movies";
		String username = "root";
		String password = "root";
		
		String Title="dhoom2";
		String Genre="Action";//3
		String Director ="dilip";//4
		int Release_Year =2010;
		
		
		System.out.println("Succesfully connected");

		String query = "INSERT INTO movies VALUES(?,?,?,?);";


	
		Connection conn = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = conn.prepareStatement(query);
        pst.setString(1,Title );
        pst.setString(2,Genre );
        pst.setString(3,Director );
        pst.setInt(4,Release_Year );
        
        int rows = pst.executeUpdate();
        System.out.println("Number of rows affected: " + rows);
        
		conn.close();
	}	
	
	//delete
	public static void Delete() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		
		String Title="bigboss";
		
		System.out.println("Succesfully connected");

		String query = "delete from movies Where Titile = " + Title;


		
		
		Connection conn = DriverManager.getConnection(url, username, password);
		Statement stmt = conn.createStatement();
        
        int rows = stmt.executeUpdate(query);
        System.out.println("Number of rows affected: " + rows);
        
		conn.close();
	}
}




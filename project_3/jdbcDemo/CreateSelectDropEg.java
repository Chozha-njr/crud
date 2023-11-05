package jdbcDemo;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.Statement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	public class CreateSelectDropEg {
	    public static void main(String[] args) {
	        String jdbcUrl = "jdbc:mysql://localhost:3306"; // Modify this URL as per your MySQL setup
	        String username = "root"; // Replace with your MySQL username
	        String password = "root"; // Replace with your MySQL password

	        try {
	            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
	            Statement statement = connection.createStatement();

	            // Create a new database
	            //createDatabase(statement);
	           // System.out.println("Database created successfully.");

	            // Select data from an existing database
	            //selectData(statement, "animated_movies;"); // Replace 'existingdb' with your existing database name

	            // Drop the created database
	            dropDatabase(statement);
	            System.out.println("Database dropped successfully.");

	            // Close resources
	            statement.close();
	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public static void createDatabase(Statement statement) throws SQLException {
	        String createDatabaseSQL = "CREATE DATABASE pegasus"; // Replace 'mynewdb' with the desired database name
	        statement.executeUpdate(createDatabaseSQL);
	    }

	    public static void selectData(Statement statement, String dbName) throws SQLException {
	        String selectQuery = "SELECT * FROM " + dbName + "movies"; // Replace 'employees' with your table name
	        ResultSet resultSet = statement.executeQuery(selectQuery);

	        System.out.println("Selected data from 'movies':");
	        while (resultSet.next()) {
	        	String Title=resultSet.getString("Title");
	        	String Genre=resultSet.getString("Genre");
	        	String Director=resultSet.getString("Director");
	        	

	            System.out.println("Title: " + Title + ", Genre: " + Genre + ", Director: " + Director);
	        }
	    }

	    public static void dropDatabase(Statement statement) throws SQLException {
	        String dropDatabaseSQL = "DROP DATABASE animated1"; // Replace 'mynewdb' with the database name to be dropped
	        statement.executeUpdate(dropDatabaseSQL);
	    }
	}

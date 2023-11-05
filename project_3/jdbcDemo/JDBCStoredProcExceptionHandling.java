package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.SQLException;

public class JDBCStoredProcExceptionHandling {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/employees"; // Modify this URL as per your MySQL setup
        String username = "root"; // Replace with your MySQL username
        String password = "root"; // Replace with your MySQL password

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Create a CallableStatement for the stored procedure
            CallableStatement callableStatement = connection.prepareCall("{call CalculateSquare(?, ?)}");

            // Set the input parameter
            int inputNum = 5;
            callableStatement.setInt(1, inputNum);

            // Register the output parameter
            callableStatement.registerOutParameter(2, java.sql.Types.INTEGER);

            // Execute the stored procedure
            callableStatement.execute();

            // Retrieve the result from the stored procedure
            int result = callableStatement.getInt(2);

            System.out.println("Square of " + inputNum + " is " + result);

            // Close resources
            callableStatement.close();
            connection.close();
        } catch (SQLException e) {
            // Handle any SQLException that may occur
            e.printStackTrace();
        }
    }
}


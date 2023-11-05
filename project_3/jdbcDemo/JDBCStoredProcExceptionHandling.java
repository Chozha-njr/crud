package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.SQLException;

public class JDBCStoredProcExceptionHandling {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/employees"; 
        String username = "root"; 
        String password = "root"; 

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            
            CallableStatement callableStatement = connection.prepareCall("{call CalculateSquare(?, ?)}");

      
            int inputNum = 5;
            callableStatement.setInt(1, inputNum);

          
            callableStatement.registerOutParameter(2, java.sql.Types.INTEGER);

           
            callableStatement.execute();

           
            int result = callableStatement.getInt(2);

            System.out.println("Square of " + inputNum + " is " + result);

       
            callableStatement.close();
            connection.close();
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
    }
}


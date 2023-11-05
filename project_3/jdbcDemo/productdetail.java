package jdbcDemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class productdetail {
	

	public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/employee"; 
        String username = "root"; 
        String password = "root"; 
        int productIdToRetrieve = 102; 
        
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

   
            String selectProductSql = "SELECT product_name, price FROM products WHERE product_id = " + productIdToRetrieve;

       
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectProductSql);

            if (resultSet.next()) {
                String productName = resultSet.getString("product_name");
                double price = resultSet.getDouble("price");

                System.out.println("Product ID: " + productIdToRetrieve);
                System.out.println("Product Name: " + productName);
                System.out.println("Price: $" + price);
            } else {
                System.out.println("Product with ID " + productIdToRetrieve + " not found.");
            }

   
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



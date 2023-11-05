package jdbcDemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class productdetailmul {
	

	public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/employee"; // Modify this URL as per your MySQL setup
        String username = "root"; // Replace with your MySQL username
        String password = "root"; // Replace with your MySQL password

        List<Integer> productIdsToRetrieve = new ArrayList<>();
        productIdsToRetrieve.add(101); // Replace with the product IDs you want to retrieve
        productIdsToRetrieve.add(102);
        productIdsToRetrieve.add(103);

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Define the SQL query to retrieve product details by product ID
            String selectProductSql = "SELECT product_name, price FROM products WHERE product_id = ?";

            for (int productId : productIdsToRetrieve) {
                // Create a PreparedStatement with the product ID as a parameter
                try (PreparedStatement preparedStatement = connection.prepareStatement(selectProductSql)) {
                    preparedStatement.setInt(1, productId);

                    // Execute the query
                    ResultSet resultSet = preparedStatement.executeQuery();

                    if (resultSet.next()) {
                        String productName = resultSet.getString("product_name");
                        double price = resultSet.getDouble("price");

                        System.out.println("Product ID: " + productId);
                        System.out.println("Product Name: " + productName);
                        System.out.println("Price: $" + price);
                    } else {
                        System.out.println("Product with ID " + productId + " not found.");
                    }
                }
            }

            // Close resources
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

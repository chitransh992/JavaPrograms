package IsolationLevel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class IsolationLevelTest {
    public static void main(String[] args) {
        try{
            String url = "jdbc:postgresql://localhost:5432/customers";
            String username = "postgres";
            String password = "Ncncnnsh@9983821408";

            Connection connection = DriverManager.getConnection(url,username,password);
            connection.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);

            connection.setAutoCommit(false);

            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE customer set customer_first_name = 'Rohan' where customer_id = 1 ");
            preparedStatement.executeUpdate();

            ResultSet resultset = preparedStatement.executeQuery("Select*from customer");
            resultset.next();

            String name = resultset.getString("customer_first_name");
            System.out.println(name);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

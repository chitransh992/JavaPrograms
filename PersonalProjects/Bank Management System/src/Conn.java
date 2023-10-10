import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public class Conn {
    Connection connection;
    Statement statement;

    Conn() throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver Loaded");

        try{
            String url = "jdbc:postgresql://localhost:5432/BankManagementSystem";
            String username ="postgres";
            String password = "Ncncnnsh@9983821408";

             //Establish Connection
             connection = DriverManager.getConnection(url,username,password);
             System.out.println("Connection Established !");

             //create statement
            statement = connection.createStatement();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

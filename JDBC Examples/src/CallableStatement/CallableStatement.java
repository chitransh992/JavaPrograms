package CallableStatement;

import java.awt.dnd.DragGestureEvent;
import java.sql.Connection;
import java.sql.DriverManager;

//callable statement is an jdbc api used to call a stored procedure
public class CallableStatement {
    public static void main(String[] args) {
        try{
            String url = "jdbc:postgresql://localhost:5432/CallableStatement";
            String username = "postgres";
            String password = "Ncncnnsh@9983821408";

            Connection connection = DriverManager.getConnection(url,username,password);

            System.out.println("Connection established");

            //The prepare call method is used to create callable statement object and pass sql query as argument
            java.sql.CallableStatement callableStatement = connection.prepareCall("Insert into student values(?,?)");

            callableStatement.setInt(1,100);
            callableStatement.setString(2,"Amit");
            callableStatement.execute();

            System.out.println("Inserted Successfully");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

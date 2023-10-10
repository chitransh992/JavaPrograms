package JdbcExample1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCExample1 {
    public static void main(String[] args) {
        Student student = new Student();
        //student.createDatabase();
        //student.createTable();
        //student.insertTable();
        student.showTable();
        //student.InsertusingPreparedStatement();
        //student.updateTable();
        //student.deleteRecord();
    }
}

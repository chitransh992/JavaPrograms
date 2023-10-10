package JdbcExample1;

import java.sql.*;
import java.util.ArrayList;

public class Student {

    public void createDatabase() {
        try {
            String url = "jdbc:postgresql://localhost:5432/";
            String username = "postgres";
            String password = "Ncncnnsh@9983821408";



            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String query = "CREATE DATABASE DB";
            statement.execute(query);
            connection.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void createTable(){
        try {
            String url = "jdbc:postgresql://localhost:5432/db";
            //String database = "db";
            String username = "postgres";
            String password = "Ncncnnsh@9983821408";
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String query = "create table student(student_id int,student_name varchar(50),subject varchar(25),marks int)";
            statement.execute(query);
            System.out.println("Table created successfully !!");
            connection.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
    public void insertTable() {
        try {
            String url = "jdbc:postgresql://localhost:5432/db";
            //String database = "db";
            String username = "postgres";
            String password = "Ncncnnsh@9983821408";
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String query ="INSERT INTO student(student_id,student_name,subject,marks) VALUES(101,'Ashish Kashyap','DSA',100),(102,'Roshan Kumar','Mathematics',100),(103,'Chitransh Mathur','Physics',100)";
            statement.execute(query);
            System.out.println("Values Inserted !!!");
            connection.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    public void showTable() {
        try {
            String url = "jdbc:postgresql://localhost:5432/db";
            //String database = "db";
            String username = "postgres";
            String password = "Ncncnnsh@9983821408";
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();


            String query ="select*from student";
            ResultSet resultSet = statement.executeQuery(query);
            ArrayList<Class> arrayList = new ArrayList<>();

            while (resultSet.next()){
                Class cl = new Class();
                cl.setStudent_id(resultSet.getInt("student_id"));
                cl.setStudent_name(resultSet.getString("student_name"));
                cl.setSubject(resultSet.getString("subject"));
                cl.setMarks(resultSet.getInt("marks"));
                arrayList.add(cl);
            }

            for(Class obj : arrayList){
                System.out.print("Id :"+obj.getId()+", ");
                System.out.print("name :"+obj.getStudent_name()+", ");
                System.out.print("subject :"+obj.getSubject()+", ");
                System.out.print("marks :"+obj.getMarks());
                System.out.println();
            }
            System.out.println("Read Successfully");
            connection.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }


    public void InsertusingPreparedStatement() {
        try {
            String url = "jdbc:postgresql://localhost:5432/db";
            //String database = "db";
            String username = "postgres";
            String password = "Ncncnnsh@9983821408";
            Connection connection = DriverManager.getConnection(url,username,password);

            String query ="INSERT INTO student(student_id,student_name,subject,marks) values(?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1,105);
            preparedStatement.setString(2,"Yashsva Lonkar");
            preparedStatement.setString(3,"Computer Networks");
            preparedStatement.setInt(4,100);
            preparedStatement.execute();

            System.out.println("Values Inserted !!!");
            connection.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }


    }

    public void updateTable() {
        try {
            String url = "jdbc:postgresql://localhost:5432/db";
            //String database = "db";
            String username = "postgres";
            String password = "Ncncnnsh@9983821408";
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String query = "alter table student ADD PRIMARY KEY(student_id)";
            statement.execute(query);
            System.out.println("Primary key updated !!");
            connection.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    public void deleteRecord() {
        try {
            String url = "jdbc:postgresql://localhost:5432/db";
            //String database = "db";
            String username = "postgres";
            String password = "Ncncnnsh@9983821408";
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String query ="";
            statement.execute(query);
            System.out.println("Values Inserted !!!");
            connection.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

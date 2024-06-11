import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class Create{

    public static void main(String[] args) {
        try {

            String url = "jdbc:mysql://localhost:3306";
            String username = "root";
            String password = "4549";
            // String query = "CREATE DATABASE CRUD";
            String query = "CREATE TABLE emp (eid number ,ename varchar(50) , esal number)";

            Connection conn = DriverManager.getConnection(url, username , password);

            Statement smt = conn.createStatement();
            smt.executeQuery(query);

            System.out.println("Table created successfully");

            
        } catch (Exception e) {
            System.out.println(e);
            
        }
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {
    
    public static void main( String args[]){

        try {
            String url = "jdbc:mysql://localhost:3306/CRUD";
            String username = "root";
            String password ="4549";
    
            Connection conn = DriverManager.getConnection(url , username , password);
    
            Statement smt = conn.createStatement();

           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

           while (true) {

            System.out.println("Enter which id you want to delete..");
            int eno = Integer.parseInt(br.readLine());

            int count = smt.executeUpdate("DELETE FROM CRUD WHERE eno ="+eno);
            if(count > 0 ){
                System.out.println("Data deleted successfully ..");
            }
            else{
                System.out.println("Error while deleting the data...");

            }

            System.out.println("Do you want to delete more records [yes/no]");

            String ch = br.readLine();
            if(ch.equalsIgnoreCase("no")){
                break;
            }
            
           }
        }catch(Exception e){
            System.out.println(e);
        }
}
}

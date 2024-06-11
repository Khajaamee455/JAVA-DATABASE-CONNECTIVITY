import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class Insert{

    public static void main( String args[]){

        try {
            String url = "jdbc:mysql://localhost:3306/CRUD";
            String username = "root";
            String password ="4549";

            Connection conn = DriverManager.getConnection(url , username , password);

            PreparedStatement pstm = conn.prepareStatement("INSERT INTO CRUD VALUES (?,?,?)");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (true) { 
                
                System.out.println("Enter your id ...:");
                int eno = Integer.parseInt(br.readLine());

                System.out.println("Enter your name :");
                String name = br.readLine();

                System.out.println("Enter your salary");
                double salary = Double.parseDouble(br.readLine());

                pstm.setInt(1, eno);
                pstm.setString(2, name);
                pstm.setDouble (3 , salary);

                int count = pstm.executeUpdate();
                if(count > 0){
                    System.out.println("Record is inserted ...");
                }
                else{
                    System.out.println("Error occured while inserting records ");
                }
                
                System.out.println("Do you insert more records [yes/no]");

                String ch = br.readLine();
                if(ch.equalsIgnoreCase("no")){
                    break;
                }

            }

        } catch (Exception e) {

            System.out.println(e);
        }

    
    }
}
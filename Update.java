
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class Update{

    public static void main( String args[]){

        String value ; int eid ; double esal;

        try {
            String url = "jdbc:mysql://localhost:3306/CRUD";
            String username = "root";
            String password ="4549";
    
            Connection conn = DriverManager.getConnection(url , username , password);
    
           Statement smt = conn.createStatement();
    
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter Eid :");
            value = br.readLine();
            eid = Integer.parseInt(value);

            System.out.println("Enter EMP new Salary");
            esal = Double.parseDouble(value);

            int count = smt.executeUpdate("Update CRUD set salary="+esal+"WHERE eno ="+eid);

            if(count > 0 ){
                System.out.println("Salary updated succesfully");
            }
            else{
                System.out.println("Error occured while updating salary");
            }
    
        }catch(Exception e){
            System.out.println(e);
        }
}
}



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
class Read{

    public static void main( String args[]){

        try {
            String url = "jdbc:mysql://localhost:3306/CRUD";
            String username = "root";
            String password ="4549";
    
            Connection conn = DriverManager.getConnection(url , username , password);
    
           Statement smt = conn.createStatement();
    
           ResultSet rs = smt.executeQuery("SELECT * FROM CRUD");
           while (rs.next()) {

            int eid = rs.getInt(1);
            String ename = rs.getString(2);
            double esal = rs.getDouble(3);

            System.out.println("Eid :"+eid);
            System.out.println("Ename :"+ename);
            System.out.println("Esal :"+esal);
            System.out.println("\n");          //getting data with space ..

            
           }
        }catch(Exception e){
            System.out.println(e);
        }
}

}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbc{
       private static String url ="jdbc:mysql://localhost:3306/Demojdbc";
       private static String username ="root";
       private static String password ="1234";
       public  static String ViewQuerry="Select * from students";
       public  static String updatequery="UPDATE students SET Sname = ? WHERE Sid = ?";
       public static String deletequery="DELETE FROM students WHERE Sid = ?";

       
    public static void main(String[] args) throws Exception {
       
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn =DriverManager.getConnection(url,username,password);
        if (conn != null) {
            System.out.println("Connected successfully!");
        }
        PreparedStatement query = conn.prepareStatement(ViewQuerry); 
        ResultSet rm=  query.executeQuery();
        
       while(rm.next()){
        System.out.println(rm.getString("Sname") + " "+ rm.getInt("Sid"));
       }
        System.out.println("data fetched successfully!");
        PreparedStatement update = conn.prepareStatement(updatequery);
        update.setString(1,"amit");
        update.setInt(2, 1);
        update.executeUpdate();

        PreparedStatement delete = conn.prepareStatement(deletequery);
        delete.setInt(1, 1);
        delete.executeUpdate();

        
        conn.close();
   
    }
}
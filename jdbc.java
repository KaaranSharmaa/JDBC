
import java.sql.Connection;
import java.sql.DriverManager;

public class jdbc{
       private static  String url ="jdbc:mysql://localhost:3306/Demojdbc";
       private static String username ="root";
       private static String password ="1234";
       
    public static void main(String[] args) throws Exception {
       
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn =DriverManager.getConnection(url,username,password);
        if (conn != null) {
            System.out.println("Connected successfully!");
        }
        conn.close();

    }
}
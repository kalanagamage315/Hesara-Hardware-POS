
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
    public static Connection getcon()
    {
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hardware","root","");
            return conn;
            
            
        }
        catch(ClassNotFoundException | SQLException e)
        {
            return null;
        }
        
    }
    
}

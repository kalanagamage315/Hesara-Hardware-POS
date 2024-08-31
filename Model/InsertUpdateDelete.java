
package Model;
import Model.ConnectionProvider;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class InsertUpdateDelete {
    public static void setData(String Query,String msg)
    {
        Connection con=null;
        Statement st=null;
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals(""))
                JOptionPane.showMessageDialog(null, msg);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            try
            {
                con.close();
            }
            catch(Exception e)
            {
            }
        }
    }
    
    
}
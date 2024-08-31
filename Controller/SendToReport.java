
package Controller;

import Model.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class SendToReport {
    public static String getWaterQuant()
    {
        Connection con=null;
        Statement st=null;
        String Amount = null;
        
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            
            String sqlQuery = "SELECT SUM(Water_Quant) AS total_quant FROM feeding";
            ResultSet resultSet = st.executeQuery(sqlQuery);
            if (resultSet.next()) {
                double totalQuantity = resultSet.getDouble("total_quant");
                Amount=String.valueOf(totalQuantity);
                
                //System.out.println("Total Quantity: " + totalQuantity);
            }
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
        return Amount;
    }
    public static String getfertileQuant(String fer)
    {
        Connection con=null;
        Statement st=null;
        String Urea = null;
        
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            
            String sqlQuery = "SELECT SUM(Fertile_quant) AS total_quant FROM feeding Where Fertilizer='"+fer+"'";
            ResultSet resultSet = st.executeQuery(sqlQuery);
            if (resultSet.next()) {
                double totalQuantity = resultSet.getDouble("total_quant");
                Urea= String.valueOf(totalQuantity);
                
                //System.out.println("Total Quantity: " + totalQuantity);
            }
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
        
        return Urea;
    }
    
    
}


package Model;

import View.Hardware;
import View.Admin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class GetFromDatabase {
    
    public static int getRowCount(String tableName) {
        String url = "jdbc:mysql://localhost:3306/hardware";
        String username = "root";
        String password = "";
        int rowCount = 0;

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String countQuery = "SELECT COUNT(*) FROM " + tableName;

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(countQuery)) {

                if (resultSet.next()) {
                    rowCount = resultSet.getInt(1);                    
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rowCount;
    }
    public static String logdata(String uname) {
        Connection con=null;
        Statement st=null;
       
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            String query = "Select Password from employee where UserName='"+uname+"'";
            
            ResultSet resultSet = st.executeQuery(query);
        
            if (resultSet.next()) {
                String Password=resultSet.getString("Password");
                return Password;
            } else {
                
                return null;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
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
    
    public static String EmpTele(String name) {
        Connection con=null;
        Statement st=null;
       
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            String query = "Select Telephone from employee where Name='"+name+"'";
            
            ResultSet resultSet = st.executeQuery(query);
        
            if (resultSet.next()) {
                String tele=resultSet.getString("Telephone");
                return tele;
            } else {
                
                return null;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
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
    
    public static String EmpMob(String name) {
        Connection con=null;
        Statement st=null;
       
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            String query = "Select Mobile from employee where Name='"+name+"'";
            
            ResultSet resultSet = st.executeQuery(query);
        
            if (resultSet.next()) {
                String tele=resultSet.getString("Mobile");
                return tele;
            } else {
                
                return null;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
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
    
    
    
    
    public static String getQuant(String itemcode){
        Connection con=null;
        Statement st=null;
        
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            String query ="SELECT Quantity FROM stock where Item_Code='"+itemcode+"'";
            
            ResultSet resultSet = st.executeQuery(query);
        
            if (resultSet.next()) {
                String quant=resultSet.getString("Quantity");
                return quant;
            } else {
                
                return null;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
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
    
    public static String getDisc(String itemcode){
        Connection con=null;
        Statement st=null;
        
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            String query ="SELECT Discount FROM stock where Item_Code='"+itemcode+"' ";
            
            ResultSet resultSet = st.executeQuery(query);
        
            if (resultSet.next()) {
                String disc=resultSet.getString("Discount");
                return disc;
            } else {
                
                return null;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
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
    public static String getSalesItmQuant(String itemcode,String SalesID){
        Connection con=null;
        Statement st=null;
        
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            String query ="SELECT Quantity FROM sales_item where ItemCode='"+itemcode+"' AND SalesNum='"+SalesID+"'";
            
            ResultSet resultSet = st.executeQuery(query);
        
            if (resultSet.next()) {
                String quant=resultSet.getString("Quantity");
                return quant;
            } else {
                
                return null;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
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
    
    public static String getBuyingPrice(String itemcode){
        Connection con=null;
        Statement st=null;
        
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            String query ="SELECT Retail_price FROM stock where Item_Code='"+itemcode+"'";
            
            ResultSet resultSet = st.executeQuery(query);
        
            if (resultSet.next()) {
                String buypri=resultSet.getString("Retail_price");
                return buypri;
            } else {
                
                return null;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
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
    public static String getTotalItemCost(){
        Connection con=null;
        Statement st=null;
        
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            String query ="SELECT SUM(Retail_price) FROM stock";
            
            ResultSet resultSet = st.executeQuery(query);
        
            if (resultSet.next()) {
                String buypri=resultSet.getString("Retail_price");
                return buypri;
            } else {
                
                return null;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
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
    
    public static String getItemName(String icode){
        Connection con=null;
        Statement st=null;
        
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            String query ="SELECT Item FROM stock where Item_Code='"+icode+"'";
            
            ResultSet resultSet = st.executeQuery(query);
        
            if (resultSet.next()) {
                String iname=resultSet.getString("Item");
                return iname;
            } else {
                System.out.println("null");
                return null;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
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
    public static String getItemSalesQuant(String icode){
        Connection con=null;
        Statement st=null;
        
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            String query ="SELECT Quantity FROM sales_item where ItemCode='"+icode+"'";
            
            ResultSet resultSet = st.executeQuery(query);
        
            if (resultSet.next()) {
                String quant=resultSet.getString("Quantity");
                return quant;
            } else {
                System.out.println("null");
                return null;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
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
    
    public static String getItemUniPrice(String icode){
        Connection con=null;
        Statement st=null;
        
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            String query ="SELECT Unit_Price FROM stock where Item_Code='"+icode+"'";
            
            ResultSet resultSet = st.executeQuery(query);
        
            if (resultSet.next()) {
                String unitPri=resultSet.getString("Unit_Price");
                return unitPri;
            } else {
                
                return null;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
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
    public static String getUserType(String uname){
        Connection con=null;
        Statement st=null;
        
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            String query ="SELECT User_Type FROM employee where UserName='"+uname+"'";
            
            ResultSet resultSet = st.executeQuery(query);
        
            if (resultSet.next()) {
                String type=resultSet.getString("User_Type");
                return type;
            } else {
                System.out.println("null");
                return null;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
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
    
    public static String getlastLogIn(){
        Connection con=null;
        Statement st=null;
        
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            
            String query ="SELECT U_name FROM login ORDER BY LogId DESC LIMIT 1";
            
            ResultSet resultSet = st.executeQuery(query);
        
            if (resultSet.next()) {
                String user=resultSet.getString("U_name");
                return user;
            } else {
                System.out.println("null");
                return null;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
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
    
    
    public static String getlastSaleID(){
        Connection con=null;
        Statement st=null;
        
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            
            String query ="SELECT SalesNum FROM sales ORDER BY SalesNum DESC LIMIT 1";
            
            ResultSet resultSet = st.executeQuery(query);
        
            if (resultSet.next()) {
                String user=resultSet.getString("SalesNum");
                return user;
            } else {
                System.out.println("null");
                return null;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
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
    
    public static String GetItmUnit(String icode) {
        Connection con=null;
        Statement st=null;
       
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            String query = "Select Unit from stock where Item_Code='"+icode+"'";
            
            ResultSet resultSet = st.executeQuery(query);
        
            if (resultSet.next()) {
                String unit=resultSet.getString("Unit");
                return unit;
            } else {
                
                return null;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import View.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author kalan
 */
public class SalesCostProfit {
    
    public static double getItmCost(String salesId){
        double buypri=0;
        double itmQuant=0;
        double totCost=0;
        Connection con=null;
        Statement st=null;
       
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            String query = "SELECT ItemCode FROM sales_item where SalesNum = '"+salesId+"'";
            
            ResultSet resultSet = st.executeQuery(query);
            while(resultSet.next()){
                String itmCode=String.valueOf(resultSet.getString("ItemCode"));
                buypri=Double.parseDouble(GetFromDatabase.getBuyingPrice(itmCode));
                itmQuant=Double.parseDouble(GetFromDatabase.getSalesItmQuant(itmCode,salesId));
                totCost=totCost+(buypri*itmQuant);
            }
            con.close();
            return totCost;
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            
        }
        return totCost;
        
    }
    public static double getStockItmCost(){
        double buypri=0;
        double itmQuant=0;
        double totCost=0;
        Connection con=null;
        Statement st=null;
       
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            String query = "SELECT SUM(Quantity * Retail_price) AS total_cost FROM stock";
            
            ResultSet resultSet = st.executeQuery(query);
             if (resultSet.next()) {
                totCost = resultSet.getDouble("total_cost");
                
            }
            con.close();
            return totCost;
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            
        }
        return totCost;
        
    }
    
    
}

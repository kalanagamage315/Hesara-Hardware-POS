/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.GetFromDatabase;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author kalan
 */
public class ValidateStockBill {
    public static boolean isValidQuant(String quant) {
        String regex = "[0-9]+[.][0-9]{3}"; //only quantity value
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(quant);
        return matcher.matches();
    }
    
    
    
    public static boolean isValidDisc(String disc) {
        String regex = "[0-9]{0,2}"; 
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(disc);
        return matcher.matches();
    }
    
   // public static boolean isValidItemCode(String Itmcode) {
      //  String regex = "[a-zA-Z0-9_*/@.^%$()-]+"; 
       // Pattern pattern = Pattern.compile(regex);
       // Matcher matcher = pattern.matcher(Itmcode);
       // return matcher.matches();
   // }
    
    //public static boolean isValidItemName(String Itmcode) {
       // String regex = "[a-zA-Z0-9_*/@.^%$()-]+"; 
       // Pattern pattern = Pattern.compile(regex);
       // Matcher matcher = pattern.matcher(Itmcode);
       // return matcher.matches();
    //}
    
    public static boolean isValidBuyingPrice(String Itmprice) {
        String regex = "[0-9]+[.][0-9]{2}"; 
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Itmprice);
        return matcher.matches();
    }
    
    public static boolean isValidUnitPrice(String unitprice) {
        String regex = "[0-9]+[.][0-9]{2}"; 
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(unitprice);
        return matcher.matches();
    }
    
    public static boolean isValidStockAdd(String itmcode,String itmname,String Buyprice,String Unitprice,String quant){
        if( isValidBuyingPrice(Buyprice)==true && isValidUnitPrice(Unitprice)==true && isValidQuant(quant)==true){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isValidStockUpdate(String itmcode,String itmname,String Buyprice,String Unitprice,String quant){
        if(isValidBuyingPrice(Buyprice)==true && isValidUnitPrice(Unitprice)==true && isValidQuant(quant)==true){
            return true;
        }else{
            return false;
        }
    }
    public static String generateSalesID(){
        int rowCount=GetFromDatabase.getRowCount("sales");
        int lenID=5;
        int rclen=String.valueOf(rowCount).length();
        int loop=lenID-rclen;
        String id="";
        String itnum=String.valueOf(rowCount);
        for(int i=0;i<loop;i++){
            id=id+"0";            
        }
        id=id+itnum;
        return id;
    
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.GetFromDatabase;

public class ValidateBilling {
    public static boolean isStockAvailable(String Itmcode,String needQuant){
        int neeQuant=Integer.parseInt(needQuant);
        int iquant=Integer.parseInt(GetFromDatabase.getQuant(Itmcode));
        
        if((iquant-neeQuant)>0){
            return true;
        }else{
            return false;
        }
    }
    
}

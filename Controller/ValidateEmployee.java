
package Controller;

import Model.ConnectionProvider;
import Model.InsertUpdateDelete;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;



public class ValidateEmployee {
    public static boolean isValidName(String firstName) {
        String regex = "^[A-Za-z]+$"; 
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
    public static boolean isValidPhone(String mobile) {
        String regex = "[0][0-9]{9}"; 
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobile);
        return matcher.matches();
    }
    public static boolean isValidtele(String tele) {
        String regex = "[0][0-9]{9}"; 
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(tele);
        return matcher.matches();
    }
    public static boolean isValidUname(String uname) {
        String regex = "[a-zA-z0-9_@#$&*]+"; 
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(uname);
        return matcher.matches();
    }
    public static boolean isValidpassword(String pswd) {
        String regex = "[a-zA-z0-9_@#$&*]{8,10}"; 
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pswd);
        return matcher.matches();
    }
    
    public static boolean isVaildEmployee(String name,String uname,String PSWD,String mobile,String tele){
        if(isValidName(name)==true && isValidUname(uname)==true && isValidpassword(PSWD)==true && isValidPhone(mobile)==true && isValidtele(tele)==true){
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean isVaildEmployeeUpdate(String Upname,String mobile,String tele){
        if(isValidName(Upname)==true && isValidPhone(mobile)==true && isValidtele(tele)==true){
            return true;
        }else{
            return false;
        }
    }
    
    
    
    
    
    
    
    
    
}

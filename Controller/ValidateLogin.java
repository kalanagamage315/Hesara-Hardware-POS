
package Controller;
import Model.GetFromDatabase;
import View.Hardware;
import javax.swing.JOptionPane;


public class ValidateLogin {
    public static boolean validlogin(String uname,String PSWD)
    {
        boolean val;
        
        String Password=GetFromDatabase.logdata(uname);
        if(Password!=null && Password==PSWD)
        { 
            val=true;
        }
        else
        {
            val=false;
        }
        
        return val;
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.DateTime;
import Controller.ValidateLogin;
import Model.ConnectionProvider;
import Model.GetFromDatabase;
import Model.InsertUpdateDelete;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author kalan
 */
public class Hardware extends javax.swing.JFrame {

    /**
     * Creates new form Hardware
     */
    public Hardware() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Login = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLogUname = new javax.swing.JTextField();
        txtLogPswd = new javax.swing.JPasswordField();
        btnLogIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 722));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Heshara Hardware");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        Login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LogIn");
        Login.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("User Name");
        Login.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Password");
        Login.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        txtLogUname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Login.add(txtLogUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 230, -1));

        txtLogPswd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Login.add(txtLogPswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 230, -1));

        btnLogIn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogIn.setText("LogIn");
        btnLogIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });
        Login.add(btnLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 90, -1));

        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 560, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        String Uname=txtLogUname.getText();
        String Password=txtLogPswd.getText();
        LocalDate date=LocalDate.now();
        LocalTime time=LocalTime.now();
        String ID=String.valueOf(GetFromDatabase.getRowCount("login")+1);
        
        
        String pswd=GetFromDatabase.logdata(Uname);
        if(Password.equals(pswd)){
            InsertUpdateDelete.setData("Insert into login values ('"+ID+"','"+Uname+"','"+date+"','"+time+"')", "Data Inserted Successfully");
            String type=GetFromDatabase.getUserType(Uname);
            if("Admin".equals(type)){
                Admin a=new Admin();
                a.show();
                dispose();
            }else if("Cashier".equals(type)){
                Cashier c=new Cashier();
                c.show();
                dispose();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Invalid username or password");
           
        }
        
        
        
    }//GEN-LAST:event_btnLogInActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Hardware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hardware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hardware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hardware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hardware().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login;
    private javax.swing.JButton btnLogIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtLogPswd;
    private javax.swing.JTextField txtLogUname;
    // End of variables declaration//GEN-END:variables
}
package librarymanagement;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import librarymanagement.MySqlConnect;
import librarymanagement.SignUp;
import librarymanagement.Welcome;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amol
 */
public class Login_page extends javax.swing.JFrame {

     Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    /**
     * Creates new form Login_page
     */
    public Login_page() {
        initComponents();
         Toolkit tk = Toolkit.getDefaultToolkit();
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
      /*  int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;
       */
        
        this.setSize(1366,730);
       // this.setLocation(x,y);
    }
     public void close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
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
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lib_id_txt = new javax.swing.JTextField();
        password_txt = new javax.swing.JPasswordField();
        login_btn = new javax.swing.JButton();
        signup_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        forgot_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Password    :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 270, 110, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("Login");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 80, 160, 42);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Librarian id:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 207, 100, 30);
        getContentPane().add(lib_id_txt);
        lib_id_txt.setBounds(240, 210, 190, 30);

        password_txt.setText("jPasswordField1");
        password_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                password_txtMouseClicked(evt);
            }
        });
        getContentPane().add(password_txt);
        password_txt.setBounds(240, 270, 190, 30);

        login_btn.setText("Login");
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });
        getContentPane().add(login_btn);
        login_btn.setBounds(240, 350, 70, 30);

        signup_btn.setText("Sign Up");
        signup_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_btnActionPerformed(evt);
            }
        });
        getContentPane().add(signup_btn);
        signup_btn.setBounds(350, 350, 80, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Forgot password ?...");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 470, 150, 20);

        forgot_btn.setText("Click Here");
        forgot_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgot_btnActionPerformed(evt);
            }
        });
        getContentPane().add(forgot_btn);
        forgot_btn.setBounds(320, 463, 90, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Amol\\Documents\\NetBeansProjects\\LibraryManagement\\pics\\login.jpg")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1370, 730);

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 90, 34, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        // TODO add your handling code here:
          conn=MySqlConnect.ConnectDB();
        String Sql="select * from login where lib_id=? and password=?";
        try{
            pst=conn.prepareStatement(Sql);
            pst.setString(1, lib_id_txt.getText());
            pst.setString(2, password_txt.getText());
            rs=pst.executeQuery();
            
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null, "Welcome User :"+rs.getString(2));
                close();
                Welcome wm=new Welcome();
                wm.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "invalid librarian id or password","Access Denied",JOptionPane.ERROR_MESSAGE);
            
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_login_btnActionPerformed

    private void signup_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_btnActionPerformed
        // TODO add your handling code here:
        
        close();
        SignUp sp=new SignUp();
        sp.setVisible(true);
    }//GEN-LAST:event_signup_btnActionPerformed

    private void forgot_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgot_btnActionPerformed
        // TODO add your handling code here:
          close();
        ForgotPassword fp=new ForgotPassword();
        fp.setVisible(true);
        
    }//GEN-LAST:event_forgot_btnActionPerformed

    private void password_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_txtMouseClicked
        // TODO add your handling code here:
        String str=" ";
        password_txt.setText(str);
    }//GEN-LAST:event_password_txtMouseClicked

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
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton forgot_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField lib_id_txt;
    private javax.swing.JButton login_btn;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JButton signup_btn;
    // End of variables declaration//GEN-END:variables
}

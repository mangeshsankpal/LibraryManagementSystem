/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.*;

/**
 *
 * @author Amol
 */
public class Student_Book_Details extends javax.swing.JFrame {
     Connection conn=null;
     ResultSet rs=null;
     PreparedStatement pst=null;
     
    /**
     * Creates new form Student_Details
     */
    public Student_Book_Details() {
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
        txt_rno = new javax.swing.JTextField();
        getrno_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        stud_table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_branch = new javax.swing.JComboBox<>();
        get_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_book_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_author_name = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        txt_return = new javax.swing.JTextField();
        txt_issue = new javax.swing.JTextField();
        issue_btn = new javax.swing.JButton();
        return_btn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 730));
        getContentPane().setLayout(null);

        jLabel1.setText("Enter the ERP of Student :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 9, 150, 30);
        getContentPane().add(txt_rno);
        txt_rno.setBounds(198, 12, 124, 30);

        getrno_btn.setBackground(new java.awt.Color(153, 153, 255));
        getrno_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getrno_btn.setText("Get Details");
        getrno_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getrno_btnActionPerformed(evt);
            }
        });
        getContentPane().add(getrno_btn);
        getrno_btn.setBounds(362, 14, 100, 30);

        back_btn.setBackground(new java.awt.Color(153, 153, 255));
        back_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        getContentPane().add(back_btn);
        back_btn.setBounds(780, 14, 70, 30);

        stud_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Book Id", "Book Name", "Author Name", "Price", "Issue Date", "Return Date"
            }
        ));
        jScrollPane1.setViewportView(stud_table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 70, 1060, 90);

        jLabel2.setText("Enter Book Id :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 170, 100, 30);
        getContentPane().add(txt_id);
        txt_id.setBounds(150, 170, 130, 30);

        jLabel3.setText("Branch :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 220, 60, 30);

        txt_branch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "computer", "mechanical", "electrical", "electronics" }));
        txt_branch.setToolTipText("");
        getContentPane().add(txt_branch);
        txt_branch.setBounds(190, 220, 200, 30);

        get_btn.setBackground(new java.awt.Color(153, 153, 255));
        get_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        get_btn.setText("Get Details");
        get_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                get_btnActionPerformed(evt);
            }
        });
        getContentPane().add(get_btn);
        get_btn.setBounds(390, 163, 100, 40);

        jLabel4.setText("Book Name :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 270, 80, 30);

        txt_book_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_book_nameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_book_name);
        txt_book_name.setBounds(190, 270, 200, 30);

        jLabel5.setText("Author Name :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 320, 90, 30);

        jLabel6.setText("Return Date :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 470, 80, 30);

        jLabel7.setText("Price :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 370, 60, 30);

        jLabel8.setText("Issue Date :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 420, 80, 30);
        getContentPane().add(txt_author_name);
        txt_author_name.setBounds(190, 320, 200, 30);

        txt_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_priceActionPerformed(evt);
            }
        });
        getContentPane().add(txt_price);
        txt_price.setBounds(190, 370, 200, 30);
        getContentPane().add(txt_return);
        txt_return.setBounds(190, 470, 200, 30);
        getContentPane().add(txt_issue);
        txt_issue.setBounds(190, 420, 200, 30);

        issue_btn.setBackground(new java.awt.Color(153, 153, 255));
        issue_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        issue_btn.setText("Issue");
        issue_btn.setBorder(null);
        issue_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issue_btnActionPerformed(evt);
            }
        });
        getContentPane().add(issue_btn);
        issue_btn.setBounds(140, 530, 70, 30);

        return_btn.setBackground(new java.awt.Color(153, 153, 255));
        return_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        return_btn.setText("Return");
        return_btn.setBorder(null);
        return_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_btnActionPerformed(evt);
            }
        });
        getContentPane().add(return_btn);
        return_btn.setBounds(240, 530, 80, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Amol\\Documents\\NetBeansProjects\\LibraryManagement\\pics\\student_details_page.jpg")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 1370, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getrno_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getrno_btnActionPerformed
        // TODO add your handling code here:
         try{
            conn=MySqlConnect.ConnectDB();
            PreparedStatement pst=conn.prepareStatement("select book_id,book_name,author_name,price,issue_date,return_date,datediff(sysdate(),return_date) as Fine from student_books where ERP=?");
            pst.setString(1,txt_rno.getText());
            rs=pst.executeQuery();
            stud_table.setModel(DbUtils.resultSetToTableModel(rs));
           
        }catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_getrno_btnActionPerformed

    private void get_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_get_btnActionPerformed
        // TODO add your handling code here:
       
       try{
            conn=MySqlConnect.ConnectDB();
            String b_id=txt_id.getText();
            
            if(b_id.startsWith("1"))
            {
                 pst=conn.prepareStatement("select book_id,book_name,author_name,price from computer where book_id=?");
           pst.setString(1,txt_id.getText());
           rs=pst.executeQuery();
           
           if(rs.next())
           {
               txt_branch.setSelectedIndex(0);
               txt_book_name.setText(rs.getString("book_name"));
               txt_author_name.setText(rs.getString("author_name"));
               txt_price.setText(rs.getString("price"));
               
               DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
               Calendar cal = Calendar.getInstance();
    
               txt_issue.setText(dateFormat.format(cal.getTime()));
               cal.add(Calendar.DATE,14);
               txt_return.setText(dateFormat.format(cal.getTime()));
               
               
           }
         
            }
             if(b_id.startsWith("2"))
            {
                 pst=conn.prepareStatement("select book_id,book_name,author_name,price from mechanical where book_id=?");
           pst.setString(1,txt_id.getText());
           rs=pst.executeQuery();
           
           if(rs.next())
           {
               txt_branch.setSelectedIndex(1);
               txt_book_name.setText(rs.getString("book_name"));
               txt_author_name.setText(rs.getString("author_name"));
               txt_price.setText(rs.getString("price"));
               
               DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
               Calendar cal = Calendar.getInstance();
    
               txt_issue.setText(dateFormat.format(cal.getTime()));
               cal.add(Calendar.DATE,14);
               txt_return.setText(dateFormat.format(cal.getTime()));
               
               
           }
         
            }
            if(b_id.startsWith("3"))
            {
                 pst=conn.prepareStatement("select book_id,book_name,author_name,price from electrical where book_id=?");
           pst.setString(1,txt_id.getText());
           rs=pst.executeQuery();
           
           if(rs.next())
           {
               txt_branch.setSelectedIndex(2);
               txt_book_name.setText(rs.getString("book_name"));
               txt_author_name.setText(rs.getString("author_name"));
               txt_price.setText(rs.getString("price"));
               
               DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
               Calendar cal = Calendar.getInstance();
    
               txt_issue.setText(dateFormat.format(cal.getTime()));
               cal.add(Calendar.DATE,14);
               txt_return.setText(dateFormat.format(cal.getTime()));
               
               
           }
         
            }
            if(b_id.startsWith("4"))
            {
                 pst=conn.prepareStatement("select book_id,book_name,author_name,price from electronics where book_id=?");
           pst.setString(1,txt_id.getText());
           rs=pst.executeQuery();
           
           if(rs.next())
           {
               txt_branch.setSelectedIndex(3);
               txt_book_name.setText(rs.getString("book_name"));
               txt_author_name.setText(rs.getString("author_name"));
               txt_price.setText(rs.getString("price"));
               
               DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
               Calendar cal = Calendar.getInstance();
    
               txt_issue.setText(dateFormat.format(cal.getTime()));
               cal.add(Calendar.DATE,14);
               txt_return.setText(dateFormat.format(cal.getTime()));
               
               
           }
         
            }
            
          
            
       }catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_get_btnActionPerformed

    private void issue_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issue_btnActionPerformed
        // TODO add your handling code here:
        try{
            String b_id=txt_id.getText();
            String str=" ";
            conn=MySqlConnect.ConnectDB();
            pst=conn.prepareStatement("insert into student_books values("+txt_rno.getText()+","+txt_id.getText()+",'"+txt_book_name.getText()+"','"+txt_author_name.getText()+"',"+txt_price.getText()+",'"+txt_issue.getText()+"','"+txt_return.getText()+"')");
            pst.executeUpdate();
            
            if(b_id.startsWith("1"))
            {
                 pst=conn.prepareStatement("update computer set quantity=quantity-1 where book_id=?");
                 
                 pst.setString(1, txt_id.getText());
                  pst.executeUpdate();
             
            }
            if(b_id.startsWith("2"))
            {
                 pst=conn.prepareStatement("update mechanical set quantity=quantity-1 where book_id=?");
                 
                 pst.setString(1, txt_id.getText());
                  pst.executeUpdate();
             
            }
            if(b_id.startsWith("3"))
            {
                 pst=conn.prepareStatement("update electrical set quantity=quantity-1 where book_id=?");
                 
                 pst.setString(1, txt_id.getText());
                  pst.executeUpdate();
             
            }
            if(b_id.startsWith("4"))
            {
                 pst=conn.prepareStatement("update electronics set quantity=quantity-1 where book_id=?");
                 
                 pst.setString(1, txt_id.getText());
                  pst.executeUpdate();
             
            }
           
            JOptionPane.showMessageDialog(null, "Book is issued to student with ERP : "+txt_rno.getText());
            txt_rno.setText(str);
            txt_id.setText(str);
            txt_book_name.setText(str);
            txt_author_name.setText(str);
            txt_price.setText(str);
            txt_issue.setText(str);
            txt_return.setText(str);
            txt_branch.setSelectedIndex(0);
            stud_table.setModel(new DefaultTableModel(null,new String[]{"book_id","book_name","author_name","price","issue_date","return_date","fine"}));
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_issue_btnActionPerformed

    private void return_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_btnActionPerformed
        // TODO add your handling code here:
        try{
            String str=" ";
            String b_id=txt_id.getText();
            conn=MySqlConnect.ConnectDB();
            pst=conn.prepareStatement("delete from student_books where ERP=? and book_id=?");
            pst.setString(1,txt_rno.getText());
            pst.setString(2,txt_id.getText());
            pst.executeUpdate();
            
            if(b_id.startsWith("1"))
            {
                 pst=conn.prepareStatement("update computer set quantity=quantity+1 where  book_id=?");
                 
                 pst.setString(1, txt_id.getText());
                 pst.executeUpdate();
            
            }
            if(b_id.startsWith("2"))
            {
                 pst=conn.prepareStatement("update mechanical set quantity=quantity+1 where  book_id=?");
                 
                 pst.setString(1, txt_id.getText());
                 pst.executeUpdate();
            
            }
            if(b_id.startsWith("3"))
            {
                 pst=conn.prepareStatement("update electrical set quantity=quantity+1 where  book_id=?");
                 
                 pst.setString(1, txt_id.getText());
                 pst.executeUpdate();
            
            }
            if(b_id.startsWith("4"))
            {
                 pst=conn.prepareStatement("update electronics set quantity=quantity+1 where  book_id=?");
                 
                 pst.setString(1, txt_id.getText());
                 pst.executeUpdate();
            
            }
           
            JOptionPane.showMessageDialog(null, "Book is returnd by student with ERP : "+txt_rno.getText());
            txt_rno.setText(str);
            txt_id.setText(str);
            txt_book_name.setText(str);
            txt_author_name.setText(str);
            txt_price.setText(str);
            txt_issue.setText(str);
            txt_return.setText(str);
            txt_branch.setSelectedIndex(0);
            stud_table.setModel(new DefaultTableModel(null,new String[]{"book_id","book_name","author_name","price","issue_date","return_date","fine"}));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_return_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        close();
        Welcome wm=new Welcome();
        wm.setVisible(true);
    }//GEN-LAST:event_back_btnActionPerformed

    private void txt_book_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_book_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_book_nameActionPerformed

    private void txt_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_priceActionPerformed

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
            java.util.logging.Logger.getLogger(Student_Book_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Book_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Book_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Book_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Book_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JButton get_btn;
    private javax.swing.JButton getrno_btn;
    private javax.swing.JButton issue_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton return_btn;
    private javax.swing.JTable stud_table;
    private javax.swing.JTextField txt_author_name;
    private javax.swing.JTextField txt_book_name;
    private javax.swing.JComboBox<String> txt_branch;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_issue;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_return;
    private javax.swing.JTextField txt_rno;
    // End of variables declaration//GEN-END:variables
}

import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author Lenovo
 */
public class Login extends javax.swing.JFrame {
Connection con = null;
Statement state = null;
ResultSet rs = null;
PreparedStatement ps = null;
String user = "admin1"; String pass = "admin"; String value;
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        userna = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tick (1).png"))); // NOI18N
        jButton1.setText("Login");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 170, -1));
        getContentPane().add(userna, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 250, 30));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 250, 30));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("User Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jRadioButton1.setText("Admin");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jRadioButton2.setText("Student");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Sans Typewriter", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("New? Register yourself now");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blur-background-6z-2048x1152.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 940, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean flg = false;
        try{
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          System.out.println("connected");
          con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=lab; user=proj; password = 1234");
          System.out.println("loaded");
        if (value.equals("admin")){
            String query = "SELECT * FROM LOGIN_ADMIN";
            state = con.createStatement();
            rs = state.executeQuery(query);
            while (rs.next()){
                String username = rs.getString(2);
                String pass = rs.getString(3);
                if (userna.getText().equals(username) && password.getText().equals(pass)){
                    JOptionPane.showMessageDialog(this,"Login successfull");
                    flg = true; 
                    break;
                } 
            }
            if(flg == false){
                    JOptionPane.showMessageDialog(this,"Incorrect User Name or Password! Please try again.");
            
            userna.setText("");
            password.setText("");
            } else{
          Admin admin = new Admin();
          admin.setVisible(true);
          dispose();
            }
            userna.setText("");
            password.setText("");
      } else if(value.equals("student")){
            String query = "SELECT * FROM LOGIN";
            state = con.createStatement();
            rs = state.executeQuery(query);
            while (rs.next()){
                String username = rs.getString(1);
                String pass = rs.getString(3);
                if (userna.getText().equals(username) && password.getText().equals(pass)){
                    flg = true; 
                    String sql = "INSERT INTO LOG VALUES(?)";
                    ps = con.prepareStatement(sql);
                    ps.setString(1,userna.getText());
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Login successfull");
                    break;
                } 
            }
            if(flg == false){
                    JOptionPane.showMessageDialog(this,"Incorrect User Name or Password! Please try again.");
            userna.setText("");
            password.setText("");
            } else{
                Pre_MCQ a = new Pre_MCQ();
                a.setVisible(true);
                dispose();
            }
            userna.setText("");
            password.setText("");
      }
      }catch(SQLServerException e){  JOptionPane.showMessageDialog(this,"You cannot attempt the quiz twice!!"); userna.setText("");password.setText("");}
        catch (SQLException e){System.out.println(e);}
      catch(ClassNotFoundException e){System.out.println(e);}   
        catch(NullPointerException e){JOptionPane.showMessageDialog(this,"Please identify yourself as an Admin or Student");}
        catch(Exception e){System.out.println(e);}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
       value  = "admin";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        value = "student";
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
      try{
          if(value.equals("student")){
        Registration a = new Registration();
        a.setVisible(true);
        dispose();
       } else if(value.equals("admin")){
           JOptionPane.showMessageDialog(this,"This is only accessible by Students!");
       }
      }catch(Exception e){ JOptionPane.showMessageDialog(this,"Please identify whether you are a student or an admin.");}
    }//GEN-LAST:event_jLabel4MouseClicked
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField userna;
    // End of variables declaration//GEN-END:variables
}

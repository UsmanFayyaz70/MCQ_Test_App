import java.awt.event.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.Timer;
/**
 *
 * @author Lenovo
 */
public class Test extends javax.swing.JFrame {
Connection con = null;
Statement state = null;
ResultSet rs = null;
PreparedStatement ps = null;
int marks =0;  int i = 30;
String user = "admin1", pass = "admin", value1,value2,value3,value4,value5,answer,username;
   Timer T = new Timer(1000,new ActionListener()
{ public void actionPerformed(ActionEvent e){
        i--;
        if(i>0){
        jLabel3.setText(""+i);
} if(i==0){
        jLabel3.setText(""+i);
        JOptionPane.showMessageDialog(null,"Time's Up! You got "+marks+" marks! Thank you for attempting the quiz!"); 
         Login L = new Login();
           L.setVisible(true);
         dispose();
}
}
        });
    public Test() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton24 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jRadioButton28 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        jRadioButton35 = new javax.swing.JRadioButton();
        jRadioButton36 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Q1: What will be the out of the following code? ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton1.setText("Equal");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton2.setText("Not Equal");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton3.setText("Depends on the compiler");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton4.setText("Error");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/submit.png"))); // NOI18N
        jButton1.setText("Submit Answer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 810, 440, 69));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setText("Time Remaining: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setText("30");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Q1.PNG"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 376, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Answer");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Answer");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        buttonGroup2.add(jRadioButton21);
        jRadioButton21.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton21.setText("Panel");
        jRadioButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        buttonGroup2.add(jRadioButton22);
        jRadioButton22.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton22.setText("Frame");
        jRadioButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, -1, -1));

        buttonGroup2.add(jRadioButton23);
        jRadioButton23.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton23.setText("Container");
        jRadioButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton23ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("Q2: Which is the container that doesn't contain title bar and MenuBars but it can have other components like button etc?");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        buttonGroup2.add(jRadioButton24);
        jRadioButton24.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton24.setText("Window");
        jRadioButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton24ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Answer");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        buttonGroup3.add(jRadioButton25);
        jRadioButton25.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton25.setText("Yes, always");
        jRadioButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton25ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, -1, -1));

        buttonGroup3.add(jRadioButton26);
        jRadioButton26.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton26.setText("No, main must not be defined inside abstract class");
        jRadioButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton26ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, -1, -1));

        buttonGroup3.add(jRadioButton27);
        jRadioButton27.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton27.setText("No, because main() is not abstract function");
        jRadioButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton27ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setText(" Q3: Can abstract class have main() function defined inside it?");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        buttonGroup3.add(jRadioButton28);
        jRadioButton28.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton28.setText("Yes, depending on return type of main()");
        jRadioButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton28ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Answer");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, -1, -1));

        buttonGroup4.add(jRadioButton29);
        jRadioButton29.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton29.setText("Others");
        jRadioButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton29ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 660, -1, -1));

        buttonGroup4.add(jRadioButton30);
        jRadioButton30.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton30.setText("Multi Parties");
        jRadioButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton30ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 620, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setText("Q4:  A substituition cipher subsitutes one symbol with?\\");
            getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, -1, -1));

            buttonGroup4.add(jRadioButton31);
            jRadioButton31.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
            jRadioButton31.setText("Keys");
            jRadioButton31.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jRadioButton31ActionPerformed(evt);
                }
            });
            getContentPane().add(jRadioButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 620, -1, -1));

            buttonGroup4.add(jRadioButton32);
            jRadioButton32.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
            jRadioButton32.setText("Single Party");
            jRadioButton32.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jRadioButton32ActionPerformed(evt);
                }
            });
            getContentPane().add(jRadioButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 660, -1, -1));

            jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            jLabel9.setText("Answer");
            getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 730, -1, -1));

            buttonGroup5.add(jRadioButton33);
            jRadioButton33.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
            jRadioButton33.setText("IPv6 Layer");
            jRadioButton33.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jRadioButton33ActionPerformed(evt);
                }
            });
            getContentPane().add(jRadioButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 720, -1, -1));

            buttonGroup5.add(jRadioButton34);
            jRadioButton34.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
            jRadioButton34.setText("Sessional Layer");
            jRadioButton34.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jRadioButton34ActionPerformed(evt);
                }
            });
            getContentPane().add(jRadioButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 760, -1, -1));

            jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            jLabel18.setText("Q5: Packets are called Datagrams at the? ");
            getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, -1, -1));

            buttonGroup5.add(jRadioButton35);
            jRadioButton35.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
            jRadioButton35.setText("IPv4 Layer");
            jRadioButton35.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jRadioButton35ActionPerformed(evt);
                }
            });
            getContentPane().add(jRadioButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 720, -1, -1));

            buttonGroup5.add(jRadioButton36);
            jRadioButton36.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
            jRadioButton36.setText("Presentation Layer");
            jRadioButton36.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jRadioButton36ActionPerformed(evt);
                }
            });
            getContentPane().add(jRadioButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 760, -1, -1));

            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paper background.jpg"))); // NOI18N
            getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 10, 1000, 920));
            getContentPane().add(jScrollBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

            pack();
        }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   try{ 
       
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
          System.out.println("connected");
          con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=lab; user=proj; password = 1234");
          System.out.println("loaded");
          
          String query = "SELECT * FROM LOG";
          state = con.createStatement();
          rs = state.executeQuery(query);
          while(rs.next()){
              username = rs.getString(1);
          }
          System.out.println(username);
          rs.close();
           query = "DELETE FROM SUBANS";
            ps = con.prepareStatement(query);
            ps.executeUpdate();
          query = "INSERT INTO SUBANS VALUES (?,?)";
          ps = con.prepareStatement(query);
          ps.setInt(1,1);
          ps.setString(2,value1);
           ps.executeUpdate();
          ps.setInt(1, 2);
          ps.setString(2,value2);
           ps.executeUpdate();
          ps.setInt(1,3);
          ps.setString(2, value3);
           ps.executeUpdate();
          ps.setInt(1, 4);
          ps.setString(2, value4);
           ps.executeUpdate();
          ps.setInt(1, 5);
          ps.setString(2, value5);
          ps.executeUpdate();
          query = "SELECT ANS.ANSWER, SUBANS.ANSWER FROM ANS INNER JOIN SUBANS ON ANS.ANSWER = SUBANS.ANSWER";
            state = con.createStatement();
            rs = state.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getString(1));
                marks++;
            }
          rs.close();
           JOptionPane.showMessageDialog(this,"You got "+marks+" marks! Thank you for attempting the quiz!");
           query = "UPDATE STUDENT_RECORD SET MARKS = ? WHERE STUDENT_ID = ?";
           ps = con.prepareStatement(query);
           ps.setInt(1, marks);
           ps.setString(2, username);
           ps.executeUpdate();
           T.stop();
          
           Login L = new Login();
           L.setVisible(true);
           dispose();
       
         
   }catch (Exception e){System.out.println(e);}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        T.start();
    }//GEN-LAST:event_formWindowOpened

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
       value1 = "Equal";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
     value1 = "Not Equal";
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
       value1 = "Depends on the compiler";
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        value1 = "Error";
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton21ActionPerformed
     value2 = "Panel";  
// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton21ActionPerformed

    private void jRadioButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton22ActionPerformed
        value2 = "Frame";
// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton22ActionPerformed

    private void jRadioButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton23ActionPerformed
value2 = "Container";
// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton23ActionPerformed

    private void jRadioButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton24ActionPerformed
value2 = "Window";
// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton24ActionPerformed

    private void jRadioButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton25ActionPerformed
        value3 = "Yes, always";        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton25ActionPerformed

    private void jRadioButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton26ActionPerformed
        value3 = "No, main must not be defined inside abstract class";        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton26ActionPerformed

    private void jRadioButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton27ActionPerformed
        value3 = "No, because main() is not abstract function";        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton27ActionPerformed

    private void jRadioButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton28ActionPerformed
        value3 = "Yes, depending on return type of main()";
    }//GEN-LAST:event_jRadioButton28ActionPerformed

    private void jRadioButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton29ActionPerformed
        value4 = "Others";
    }//GEN-LAST:event_jRadioButton29ActionPerformed

    private void jRadioButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton30ActionPerformed
       value4 = "Multi Parties";
    }//GEN-LAST:event_jRadioButton30ActionPerformed

    private void jRadioButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton31ActionPerformed
      value4 = "Keys";
    }//GEN-LAST:event_jRadioButton31ActionPerformed

    private void jRadioButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton32ActionPerformed
     value4 = "Single Party";
    }//GEN-LAST:event_jRadioButton32ActionPerformed

    private void jRadioButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton33ActionPerformed
       value5 = "IPv6 Layer";
    }//GEN-LAST:event_jRadioButton33ActionPerformed

    private void jRadioButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton34ActionPerformed
       value5 = "Sessional Layer";
    }//GEN-LAST:event_jRadioButton34ActionPerformed

    private void jRadioButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton35ActionPerformed
        value5 = "IPv4 Layer";
    }//GEN-LAST:event_jRadioButton35ActionPerformed

    private void jRadioButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton36ActionPerformed
       value5 = "Presentation Layer";
    }//GEN-LAST:event_jRadioButton36ActionPerformed
   
 
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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollBar jScrollBar1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * insert.java
 *
 * Created on Nov 23, 2016, 2:59:45 PM
 */

/**
 *
 * @author ayush
 */import java.sql.*;
 import javax.swing.JOptionPane;
 import java.util.Calendar;
 import java.util.GregorianCalendar;

 public class insert extends javax.swing.JFrame {

    /** Creates new form insert */
    public insert() {
        initComponents();
        currentDate();
    }
    public void currentDate() {
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        jMenu2.setText(day+"/"+(month+1)+"/"+year);

        int second = cal.get(Calendar.SECOND);
        int minute= cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);
        jMenu1.setText(hour+":"+(minute+1)+":"+second);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        m1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36));
        jLabel1.setText("Order No.");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(260, 70, 159, 37);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36));
        jLabel2.setText("Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(260, 130, 87, 42);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 36));
        jLabel3.setText("Date");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(260, 190, 70, 42);
        jPanel1.add(t1);
        t1.setBounds(550, 70, 100, 37);
        jPanel1.add(t2);
        t2.setBounds(550, 132, 100, 40);
        jPanel1.add(t3);
        t3.setBounds(550, 190, 100, 40);

        jButton1.setFont(new java.awt.Font("Tw Cen MT", 3, 48));
        jButton1.setText("INSERT");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(160, 450, 189, 70);

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 48));
        jButton2.setText("BACK");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(510, 440, 200, 70);

        buttonGroup1.add(r1);
        r1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        r1.setText("Home Delivery");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        jPanel1.add(r1);
        r1.setBounds(280, 360, 120, 30);

        buttonGroup1.add(r2);
        r2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        r2.setText("Pick Up");
        jPanel1.add(r2);
        r2.setBounds(520, 360, 80, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 36));
        jLabel4.setText("Address");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(260, 250, 170, 50);

        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        jPanel1.add(t4);
        t4.setBounds(550, 250, 100, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 36));
        jLabel6.setText("Address");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(260, 250, 170, 50);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel5.setText("Phone No");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(260, 310, 170, 40);
        jPanel1.add(t5);
        t5.setBounds(550, 300, 100, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/635837252467158845719254630_background3.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(-20, 0, 1040, 620);

        m1.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Home");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        m1.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem1.setText("Your order");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        m1.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Save");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        m1.add(jMenuItem3);

        jMenuBar1.add(m1);

        jMenu2.setText("Date");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu1.setText("Time");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new order().setVisible(true);
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try {
            Class.forName("java.sql.Driver");
            Connection C1=DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/dominos","root","123");
            Statement S1=C1.createStatement();
            String Q1="insert into ins values("+t1.getText()
                    +",'"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"',"+t5.getText()+");";
            S1.executeUpdate(Q1);
            S1.close();
            C1.close();
            JOptionPane.showMessageDialog(null,"Order Placed. Thankyou for Shopping! Come Again");
                    
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR IN CONNECTIVITY");
        }
        
}//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new order().setVisible(true);
}//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new search_1().setVisible(true);
}//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("java.sql.Driver");
            Connection C1=DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/dominos","root","123");
            Statement S1=C1.createStatement();
            String Q1="insert into ins values("+t1.getText()
                    +",'"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"',"+t5.getText()+");";
            S1.executeUpdate(Q1);
            S1.close();
            C1.close();
            JOptionPane.showMessageDialog(null,"Order Placed. Thankyou for Shopping! Come Again");

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR IN CONNECTIVITY");
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        currentDate();
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
        if(r1.isSelected())
        {
    System.out.println("test");
    t4.setVisible(true);
        }
 else
        {
            System.out.println("test");
    t4.setVisible(false);
 }
    }//GEN-LAST:event_r1ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
        t4.setVisible(false);
    }//GEN-LAST:event_t4ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu m1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    // End of variables declaration//GEN-END:variables

}
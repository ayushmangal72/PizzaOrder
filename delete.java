/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * delete.java
 *
 * Created on Nov 23, 2016, 5:18:47 PM
 */

/**
 *
 * @author ayush
 */import java.sql.*;
 import javax.swing.JOptionPane;
  import java.util.Calendar;
 import java.util.GregorianCalendar;
public class delete extends javax.swing.JFrame {

    /** Creates new form delete */
    public delete() {
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
        jMenu3.setText(hour+":"+(minute+1)+":"+second);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        m1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 36));
        jLabel3.setText("Order No.");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(180, 80, 159, 37);
        jPanel1.add(t1);
        t1.setBounds(460, 80, 143, 40);

        jButton1.setFont(new java.awt.Font("Tw Cen MT", 3, 48));
        jButton1.setText("DELETE");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(300, 240, 189, 77);

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 48));
        jButton2.setText("BACK");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(620, 250, 200, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pizza01.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-1270, -70, 1720, 570);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1300297554787535097.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(390, 0, 470, 400);

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

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Delete");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        m1.add(jMenuItem3);

        jMenuBar1.add(m1);

        jMenu2.setText("Date");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Time");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("java.sql.Driver");
            Connection C1=DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/dominos","root","123");
            Statement S1=C1.createStatement();
            String Q1="delete from ins where order_no="+t1.getText()+";";
            S1.executeUpdate(Q1);
            S1.close();
            C1.close();
             JOptionPane.showMessageDialog(null,"DATA SUCCESSFULLYDELETED");
        }
        catch(Exception e) {
             JOptionPane.showMessageDialog(null,"ERROR IN CONNECTIVITY");
        }
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new order().setVisible(true);
}//GEN-LAST:event_jButton2ActionPerformed

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
            String Q1="delete from ins where order_no="+t1.getText()+";";
            S1.executeUpdate(Q1);
            S1.close();
            C1.close();
             JOptionPane.showMessageDialog(null,"DATA SUCCESSFULLYDELETED");
        }
        catch(Exception e) {
             JOptionPane.showMessageDialog(null,"ERROR IN CONNECTIVITY");
        }
}//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu m1;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables

   /* private void initComponents() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
*/
}

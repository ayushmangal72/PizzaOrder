/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Welcome.java
 *
 * Created on Nov 23, 2016, 2:20:01 PM
 */

/**
 *
 * @author ayush
 */
 import java.util.Calendar;
 import java.util.GregorianCalendar;
public class Welcome extends javax.swing.JFrame {

    /** Creates new form Welcome */
    public Welcome() {
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48));
        jLabel1.setText("WELCOME TO CHEESE WORLD");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 90, 720, 56);

        jButton1.setFont(new java.awt.Font("Tw Cen MT", 3, 48));
        jButton1.setText("GO FOR LOGIN");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(260, 210, 333, 69);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza_PNG7147.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-230, -10, 1920, 430);

        jLabel2.setBackground(new java.awt.Color(120, 120, 120));
        jLabel2.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-180, 80, 1370, 660);

        jMenu2.setText("Date");
        jMenuBar1.add(jMenu2);

        jMenu3.setText(" Time");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new login().setVisible(true);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}

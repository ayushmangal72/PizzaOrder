/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * pizzat.java
 *
 * Created on Sep 25, 2017, 6:04:38 PM
 */

/**
 *
 * @author ayush
 */
import java.util.Calendar;
 import java.util.GregorianCalendar;
public class pizzat extends javax.swing.JFrame {

    /** Creates new form pizzat */
    public pizzat() {
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

        jLabel7 = new javax.swing.JLabel();
        t11 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        c1 = new javax.swing.JCheckBox();
        t6 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        c2 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        t12 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 24));
        jLabel7.setText("Total including tax");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 350, 210, 30);
        getContentPane().add(t11);
        t11.setBounds(280, 350, 110, 30);
        getContentPane().add(t10);
        t10.setBounds(280, 270, 110, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 24));
        jLabel5.setText("SubTotal");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 270, 130, 40);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18));
        jLabel8.setText("Total");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(100, 200, 50, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18));
        jLabel4.setText("Qty");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 160, 40, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18));
        jLabel6.setText("Price");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 120, 50, 22);

        c1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        c1.setText("Cheese Pizza");
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        getContentPane().add(c1);
        c1.setBounds(150, 80, 130, 30);
        getContentPane().add(t6);
        t6.setBounds(200, 120, 60, 20);

        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        getContentPane().add(t4);
        t4.setBounds(210, 160, 60, 20);
        getContentPane().add(t8);
        t8.setBounds(210, 200, 59, 20);
        getContentPane().add(t9);
        t9.setBounds(350, 200, 50, 20);

        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        getContentPane().add(t5);
        t5.setBounds(350, 160, 50, 20);
        getContentPane().add(t7);
        t7.setBounds(350, 120, 50, 20);

        c2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        c2.setText("Vegie and Cheese");
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        getContentPane().add(c2);
        c2.setBounds(340, 80, 160, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48));
        jLabel1.setForeground(new java.awt.Color(102, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select Pizza");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 20, 409, 48);

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 48));
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 410, 234, 65);

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 48));
        jButton2.setText("Go for billing");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(610, 410, 303, 65);

        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 48));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(360, 410, 160, 60);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24));
        jLabel2.setText("Tax");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 320, 100, 20);
        getContentPane().add(t12);
        t12.setBounds(280, 310, 110, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3278663-pizza-wallpapers.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-170, 0, 1280, 550);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_c1ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_t4ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_t5ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_c2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a,b,c,d,e,f,g,h,i,j,k,l,m,n;
       a=Integer.parseInt(t4.getText());
       d=Integer.parseInt(t5.getText());
       if(c1.isSelected())
       {b=150;}
       else
       {b=0;}
       t6.setText(""+b);
       c=a*b;
        t8.setText(""+c);
        if(c2.isSelected())
       {e=200;}
       else
       {e=0;}
        t7.setText(""+e);
        f=d*e;
        t9.setText(""+f);
        g=f+c;
        t10.setText(""+g);
        h=(g*5)/100;
        t12.setText(""+h);
        i=g+h;
        t11.setText(""+i);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new insert().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        t8.setText("");
        t9.setText("");
        t10.setText("");
        t11.setText("");
        t12.setText("");
        c1.setSelected(false);
        c2.setSelected(false);


}//GEN-LAST:event_jButton3ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        currentDate();
}//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jMenu1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pizzat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables

}

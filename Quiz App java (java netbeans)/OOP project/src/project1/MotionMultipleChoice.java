/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class MotionMultipleChoice extends javax.swing.JFrame {

    /**
     * Creates new form MotionMultipleChoice
     */
    private String Q1OP1ANS,Q1OP2ANS, Q1OP3ANS, Q1OP4ANS, Q2OP1ANS, Q2OP2ANS, Q2OP3ANS, Q3OP1ANS, Q3OP2ANS, Q3OP3ANS,
            Q4OP1ANS, Q4OP2ANS, Q4OP3ANS, Q5OP1ANS, Q5OP2ANS, Q5OP3ANS;
   private int count;
    private ArrayList<MultipleChoice> aList;
    
    
    public MotionMultipleChoice() {
        initComponents();
        
        aList = new ArrayList<>();
        count = 0;
        Q1OP1ANS = new String();
        Q1OP2ANS = new String();
        Q1OP3ANS = new String();
        Q1OP4ANS = new String();
        Q2OP1ANS = new String();
        Q2OP2ANS = new String();
        Q2OP3ANS = new String();
        Q3OP1ANS = new String();
        Q3OP2ANS = new String();
        Q3OP3ANS = new String();
        Q4OP1ANS = new String();
        Q4OP2ANS = new String();
        Q4OP3ANS = new String();
        Q5OP1ANS = new String();
        Q5OP2ANS = new String();
        Q5OP3ANS = new String();
       AnswerBTN.setVisible(false);  
       BackBTN.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Q1GRP = new javax.swing.ButtonGroup();
        Q2GRP = new javax.swing.ButtonGroup();
        Q3GRP = new javax.swing.ButtonGroup();
        Q4GRP = new javax.swing.ButtonGroup();
        Q5GRP = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Q1OP1 = new javax.swing.JRadioButton();
        Q1OP2 = new javax.swing.JRadioButton();
        Q1OP3 = new javax.swing.JRadioButton();
        Q1OP4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        Q2OP1 = new javax.swing.JRadioButton();
        Q2OP2 = new javax.swing.JRadioButton();
        Q2OP3 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        Q3OP1 = new javax.swing.JRadioButton();
        Q3OP2 = new javax.swing.JRadioButton();
        Q3OP3 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        Q4OP1 = new javax.swing.JRadioButton();
        Q4OP2 = new javax.swing.JRadioButton();
        Q4OP3 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        Q5OP1 = new javax.swing.JRadioButton();
        Q5OP2 = new javax.swing.JRadioButton();
        Q5OP3 = new javax.swing.JRadioButton();
        SubmitBtn = new javax.swing.JButton();
        AnswerBTN = new javax.swing.JButton();
        BackBTN = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("MOTION AND FORCE MULTIPLE CHOICE QUESTIONS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(33, 11, 393, 36);

        jLabel2.setText("1. The most common frame of reference is the?");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 58, 288, 14);

        Q1GRP.add(Q1OP1);
        Q1OP1.setText(" Earth ");
        Q1OP1.setBorder(null);
        Q1OP1.setContentAreaFilled(false);
        getContentPane().add(Q1OP1);
        Q1OP1.setBounds(36, 78, 141, 15);

        Q1GRP.add(Q1OP2);
        Q1OP2.setText("Sun");
        Q1OP2.setContentAreaFilled(false);
        getContentPane().add(Q1OP2);
        Q1OP2.setBounds(36, 101, 43, 23);

        Q1GRP.add(Q1OP3);
        Q1OP3.setText("Outer Space");
        Q1OP3.setContentAreaFilled(false);
        getContentPane().add(Q1OP3);
        Q1OP3.setBounds(36, 124, 85, 23);

        Q1GRP.add(Q1OP4);
        Q1OP4.setText("Gravity ");
        Q1OP4.setContentAreaFilled(false);
        getContentPane().add(Q1OP4);
        Q1OP4.setBounds(36, 151, 63, 23);

        jLabel3.setText("2. How do you calculate the speed? ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 176, 220, 14);

        Q2GRP.add(Q2OP1);
        Q2OP1.setText("Divide time by distance ");
        Q2OP1.setContentAreaFilled(false);
        getContentPane().add(Q2OP1);
        Q2OP1.setBounds(23, 193, 139, 23);

        Q2GRP.add(Q2OP2);
        Q2OP2.setText("Multiply speed by time ");
        Q2OP2.setContentAreaFilled(false);
        getContentPane().add(Q2OP2);
        Q2OP2.setBounds(22, 216, 135, 23);

        Q2GRP.add(Q2OP3);
        Q2OP3.setText("Divide distance by time");
        Q2OP3.setContentAreaFilled(false);
        getContentPane().add(Q2OP3);
        Q2OP3.setBounds(23, 239, 135, 23);

        jLabel4.setText("3. What is distance?");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 269, 318, 14);

        Q3GRP.add(Q3OP1);
        Q3OP1.setText("How far I am from somewhere");
        Q3OP1.setContentAreaFilled(false);
        getContentPane().add(Q3OP1);
        Q3OP1.setBounds(21, 285, 171, 23);

        Q3GRP.add(Q3OP2);
        Q3OP2.setText("The length between two points ");
        Q3OP2.setContentAreaFilled(false);
        getContentPane().add(Q3OP2);
        Q3OP2.setBounds(20, 308, 177, 23);

        Q3GRP.add(Q3OP3);
        Q3OP3.setText("The length between two areas");
        Q3OP3.setContentAreaFilled(false);
        getContentPane().add(Q3OP3);
        Q3OP3.setBounds(21, 334, 173, 23);

        jLabel5.setText("4. A force is a?");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 378, 208, 14);

        Q4GRP.add(Q4OP1);
        Q4OP1.setText("Push ");
        Q4OP1.setContentAreaFilled(false);
        getContentPane().add(Q4OP1);
        Q4OP1.setBounds(21, 399, 51, 23);

        Q4GRP.add(Q4OP2);
        Q4OP2.setText("Pull");
        Q4OP2.setContentAreaFilled(false);
        getContentPane().add(Q4OP2);
        Q4OP2.setBounds(21, 422, 41, 23);

        Q4GRP.add(Q4OP3);
        Q4OP3.setText("The ability to change directions ");
        Q4OP3.setContentAreaFilled(false);
        getContentPane().add(Q4OP3);
        Q4OP3.setBounds(21, 448, 177, 23);

        jLabel6.setText("5. An unbalanced force is calculated by using addition/subtraction. ?");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 478, 352, 14);

        Q5GRP.add(Q5OP1);
        Q5OP1.setText("Addition");
        Q5OP1.setContentAreaFilled(false);
        getContentPane().add(Q5OP1);
        Q5OP1.setBounds(20, 494, 65, 23);

        Q5GRP.add(Q5OP2);
        Q5OP2.setText("Subtraction");
        Q5OP2.setContentAreaFilled(false);
        getContentPane().add(Q5OP2);
        Q5OP2.setBounds(20, 517, 81, 23);

        Q5GRP.add(Q5OP3);
        Q5OP3.setText("All of the above");
        Q5OP3.setContentAreaFilled(false);
        getContentPane().add(Q5OP3);
        Q5OP3.setBounds(20, 543, 101, 23);

        SubmitBtn.setText("SUBMIT");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SubmitBtn);
        SubmitBtn.setBounds(475, 584, 100, 41);

        AnswerBTN.setText("SHOW ANSWERS");
        getContentPane().add(AnswerBTN);
        AnswerBTN.setBounds(261, 593, 115, 23);

        BackBTN.setText("BACK");
        BackBTN.setDefaultCapable(false);
        BackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBTNActionPerformed(evt);
            }
        });
        getContentPane().add(BackBTN);
        BackBTN.setBounds(48, 593, 89, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("A.");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(17, 81, 13, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("B.");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(18, 104, 12, 15);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("C.");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(18, 127, 12, 15);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("D.");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(17, 154, 13, 15);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("A.");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 196, 13, 15);

        jLabel12.setText("A.");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 289, 11, 14);

        jLabel13.setText("A.");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 403, 11, 14);

        jLabel14.setText("A.");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(9, 498, 11, 14);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("B.");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(10, 219, 12, 15);

        jLabel16.setText("B.");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 312, 10, 14);

        jLabel17.setText("B.");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(10, 426, 10, 14);

        jLabel18.setText("B.");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(10, 521, 10, 14);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("C.");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(10, 242, 12, 15);

        jLabel21.setText("C.");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(10, 338, 11, 14);

        jLabel22.setText("C.");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(10, 452, 11, 14);

        jLabel23.setText("C.");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(9, 547, 11, 14);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1/Background3.png"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(0, 0, 600, 640);

        jMenu1.setText("EXIT");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(619, 680));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBTNActionPerformed
        // TODO add your handling code here:
        Motions myFrame = new Motions();
        myFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBTNActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        // TODO add your handling code here:n
        JOptionPane.showMessageDialog(null, "me " + Q1OP1);
    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenu1MouseClicked

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
            java.util.logging.Logger.getLogger(MotionMultipleChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MotionMultipleChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MotionMultipleChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MotionMultipleChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MotionMultipleChoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnswerBTN;
    private javax.swing.JButton BackBTN;
    private javax.swing.ButtonGroup Q1GRP;
    private javax.swing.JRadioButton Q1OP1;
    private javax.swing.JRadioButton Q1OP2;
    private javax.swing.JRadioButton Q1OP3;
    private javax.swing.JRadioButton Q1OP4;
    private javax.swing.ButtonGroup Q2GRP;
    private javax.swing.JRadioButton Q2OP1;
    private javax.swing.JRadioButton Q2OP2;
    private javax.swing.JRadioButton Q2OP3;
    private javax.swing.ButtonGroup Q3GRP;
    private javax.swing.JRadioButton Q3OP1;
    private javax.swing.JRadioButton Q3OP2;
    private javax.swing.JRadioButton Q3OP3;
    private javax.swing.ButtonGroup Q4GRP;
    private javax.swing.JRadioButton Q4OP1;
    private javax.swing.JRadioButton Q4OP2;
    private javax.swing.JRadioButton Q4OP3;
    private javax.swing.ButtonGroup Q5GRP;
    private javax.swing.JRadioButton Q5OP1;
    private javax.swing.JRadioButton Q5OP2;
    private javax.swing.JRadioButton Q5OP3;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}

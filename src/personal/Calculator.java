/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

/**
 *
 * @author Iredafe
 */
public class Calculator extends javax.swing.JFrame {

    //declare your variables
    
    double firstnum, secondnum, result;
    String operation;
    
    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
        
        jON.setEnabled(false);
        
    }

    public void enable(){
    
        jDisplay.setEnabled(true);
        jON.setEnabled(false);       //ON button disabled once the calculator is on
        jOFF.setEnabled(true);
        jbtn1.setEnabled(true);
        jbtn2.setEnabled(true);
        jbtn3.setEnabled(true);
        jbtn4a.setEnabled(true);
        jbtn5a.setEnabled(true);
        jbtn6.setEnabled(true);
        jbtn7.setEnabled(true);
        jbtn8.setEnabled(true);
        jbtn9.setEnabled(true);
        jbtn0.setEnabled(true);
        jbtnplus.setEnabled(true);
        jbtnminus.setEnabled(true);
        jbtnMultiply.setEnabled(true);
        jbtnDivide.setEnabled(true);
        jbtnPlusorMinus.setEnabled(true);
        jbtnEquals.setEnabled(true);
        jbtnPoint.setEnabled(true);
        jbtnClear.setEnabled(true);

    }

    public void disable() {
    
        jDisplay.setEnabled(false);
        jON.setEnabled(true);       
        jOFF.setEnabled(false);              //OFF button disabled once the calculator is off

        jbtn1.setEnabled(false);
        jbtn2.setEnabled(false);
        jbtn3.setEnabled(false);
        jbtn4a.setEnabled(false);
        jbtn5a.setEnabled(false);
        jbtn6.setEnabled(false);
        jbtn7.setEnabled(false);
        jbtn8.setEnabled(false);
        jbtn9.setEnabled(false);
        jbtn0.setEnabled(false);
        jbtnplus.setEnabled(false);
        jbtnminus.setEnabled(false);
        jbtnMultiply.setEnabled(false);
        jbtnDivide.setEnabled(false);
        jbtnPlusorMinus.setEnabled(false);
        jbtnEquals.setEnabled(false);
        jbtnPoint.setEnabled(false);
        jbtnClear.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDisplay = new javax.swing.JTextField();
        jbtn4a = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn5a = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtnminus = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtnplus = new javax.swing.JButton();
        jbtnPoint = new javax.swing.JButton();
        jbtnDivide = new javax.swing.JButton();
        jbtnMultiply = new javax.swing.JButton();
        jbtnPlusorMinus = new javax.swing.JButton();
        jbtnClear = new javax.swing.JButton();
        jbtnEquals = new javax.swing.JButton();
        jON = new javax.swing.JRadioButton();
        jOFF = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 153));
        setMinimumSize(new java.awt.Dimension(395, 600));
        setPreferredSize(new java.awt.Dimension(400, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDisplay.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 350, 100));

        jbtn4a.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jbtn4a.setText("4");
        jbtn4a.setMaximumSize(new java.awt.Dimension(100, 50));
        jbtn4a.setMinimumSize(new java.awt.Dimension(100, 50));
        jbtn4a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4aActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn4a, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 80, 70));

        jbtn1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jbtn1.setText("1");
        jbtn1.setMaximumSize(new java.awt.Dimension(100, 50));
        jbtn1.setMinimumSize(new java.awt.Dimension(100, 50));
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 80, 70));

        jbtn2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jbtn2.setText("2");
        jbtn2.setMaximumSize(new java.awt.Dimension(100, 50));
        jbtn2.setMinimumSize(new java.awt.Dimension(100, 50));
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 80, 70));

        jbtn3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jbtn3.setText("3");
        jbtn3.setMaximumSize(new java.awt.Dimension(100, 50));
        jbtn3.setMinimumSize(new java.awt.Dimension(100, 50));
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 80, 70));

        jbtn8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jbtn8.setText("8");
        jbtn8.setMaximumSize(new java.awt.Dimension(100, 50));
        jbtn8.setMinimumSize(new java.awt.Dimension(100, 50));
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 80, 80));

        jbtn5a.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jbtn5a.setText("5");
        jbtn5a.setMaximumSize(new java.awt.Dimension(100, 50));
        jbtn5a.setMinimumSize(new java.awt.Dimension(100, 50));
        jbtn5a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5aActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn5a, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 80, 80));

        jbtn6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jbtn6.setText("6");
        jbtn6.setMaximumSize(new java.awt.Dimension(100, 50));
        jbtn6.setMinimumSize(new java.awt.Dimension(100, 50));
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 80, 80));

        jbtn7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jbtn7.setText("7");
        jbtn7.setMaximumSize(new java.awt.Dimension(100, 50));
        jbtn7.setMinimumSize(new java.awt.Dimension(100, 50));
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 80, 80));

        jbtnminus.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jbtnminus.setText("-");
        jbtnminus.setMaximumSize(new java.awt.Dimension(100, 50));
        jbtnminus.setMinimumSize(new java.awt.Dimension(100, 50));
        jbtnminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnminusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnminus, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 80, 80));

        jbtn9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jbtn9.setText("9");
        jbtn9.setMaximumSize(new java.awt.Dimension(100, 50));
        jbtn9.setMinimumSize(new java.awt.Dimension(100, 50));
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 80, 80));

        jbtn0.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jbtn0.setText("0");
        jbtn0.setMaximumSize(new java.awt.Dimension(100, 50));
        jbtn0.setMinimumSize(new java.awt.Dimension(100, 50));
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 80, 80));

        jbtnplus.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jbtnplus.setText("+");
        jbtnplus.setMaximumSize(new java.awt.Dimension(100, 50));
        jbtnplus.setMinimumSize(new java.awt.Dimension(100, 50));
        jbtnplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnplusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnplus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 80, 80));

        jbtnPoint.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jbtnPoint.setText(".");
        jbtnPoint.setMaximumSize(new java.awt.Dimension(100, 50));
        jbtnPoint.setMinimumSize(new java.awt.Dimension(100, 50));
        jbtnPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPointActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 80, 80));

        jbtnDivide.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jbtnDivide.setText("/");
        jbtnDivide.setMaximumSize(new java.awt.Dimension(100, 50));
        jbtnDivide.setMinimumSize(new java.awt.Dimension(100, 50));
        jbtnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivideActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 80, 80));

        jbtnMultiply.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jbtnMultiply.setText("*");
        jbtnMultiply.setMaximumSize(new java.awt.Dimension(100, 50));
        jbtnMultiply.setMinimumSize(new java.awt.Dimension(100, 50));
        jbtnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMultiplyActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMultiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 80, 80));

        jbtnPlusorMinus.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jbtnPlusorMinus.setText("+/-");
        jbtnPlusorMinus.setMaximumSize(new java.awt.Dimension(100, 50));
        jbtnPlusorMinus.setMinimumSize(new java.awt.Dimension(100, 50));
        jbtnPlusorMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusorMinusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPlusorMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 80, 80));

        jbtnClear.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jbtnClear.setText("c");
        jbtnClear.setMaximumSize(new java.awt.Dimension(100, 50));
        jbtnClear.setMinimumSize(new java.awt.Dimension(100, 50));
        jbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 150, 60));

        jbtnEquals.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jbtnEquals.setText("=");
        jbtnEquals.setMaximumSize(new java.awt.Dimension(100, 50));
        jbtnEquals.setMinimumSize(new java.awt.Dimension(100, 50));
        jbtnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqualsActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnEquals, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 150, 60));

        buttonGroup1.add(jON);
        jON.setText("ON");
        jON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jONActionPerformed(evt);
            }
        });
        getContentPane().add(jON, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        buttonGroup1.add(jOFF);
        jOFF.setText("OFF");
        jOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOFFActionPerformed(evt);
            }
        });
        getContentPane().add(jOFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //set the buttons to enter number in display field
    
    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
 String Enternumber = jDisplay.getText() + "1";
 jDisplay.setText(Enternumber);
        

    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
String Enternumber = jDisplay.getText() + "2";
 jDisplay.setText(Enternumber);
 
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
String Enternumber = jDisplay.getText() + "3";
 jDisplay.setText(Enternumber);
 
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn4aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4aActionPerformed
String Enternumber = jDisplay.getText() + "4";
 jDisplay.setText(Enternumber);

    }//GEN-LAST:event_jbtn4aActionPerformed

    private void jbtn5aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5aActionPerformed

String Enternumber = jDisplay.getText() + "5";
 jDisplay.setText(Enternumber);

    }//GEN-LAST:event_jbtn5aActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
String Enternumber = jDisplay.getText() + "6";
 jDisplay.setText(Enternumber);

    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
String Enternumber = jDisplay.getText() + "7";
 jDisplay.setText(Enternumber);

    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
String Enternumber = jDisplay.getText() + "8";
 jDisplay.setText(Enternumber);

 
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
String Enternumber = jDisplay.getText() + "9";
 jDisplay.setText(Enternumber);

    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
String Enternumber = jDisplay.getText() + "0";
 jDisplay.setText(Enternumber);


    }//GEN-LAST:event_jbtn0ActionPerformed

    
    private void jbtnplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnplusActionPerformed
String Enternumber = jDisplay.getText() + "+";
 jDisplay.setText(Enternumber);

    }//GEN-LAST:event_jbtnplusActionPerformed

    private void jbtnminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnminusActionPerformed

String Enternumber = jDisplay.getText() + "-";
 jDisplay.setText(Enternumber);

    }//GEN-LAST:event_jbtnminusActionPerformed

    private void jbtnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDivideActionPerformed

String Enternumber = jDisplay.getText() + "/";
 jDisplay.setText(Enternumber);


    }//GEN-LAST:event_jbtnDivideActionPerformed

    private void jbtnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMultiplyActionPerformed

        
String Enternumber = jDisplay.getText() + "*";
 jDisplay.setText(Enternumber);

    }//GEN-LAST:event_jbtnMultiplyActionPerformed

    private void jbtnPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPointActionPerformed

String Enternumber = jDisplay.getText() + ".";
 jDisplay.setText(Enternumber);

    }//GEN-LAST:event_jbtnPointActionPerformed

    private void jbtnPlusorMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusorMinusActionPerformed
 double ops = Double.parseDouble(String.valueOf(jDisplay.getText()));
 ops = ops * (-1);       
 jDisplay.setText(String.valueOf(ops));
        
    }//GEN-LAST:event_jbtnPlusorMinusActionPerformed

    private void jbtnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqualsActionPerformed

        String answer;
secondnum = Double.parseDouble(jDisplay.getText());
//if(operation = "+")
    

    }//GEN-LAST:event_jbtnEqualsActionPerformed

    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearActionPerformed
jDisplay.setText("0");
        
        
    }//GEN-LAST:event_jbtnClearActionPerformed

    private void jOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOFFActionPerformed
disable(); //call the disable method
    }//GEN-LAST:event_jOFFActionPerformed

    private void jONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jONActionPerformed

enable();
    
    }//GEN-LAST:event_jONActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField jDisplay;
    private javax.swing.JRadioButton jOFF;
    private javax.swing.JRadioButton jON;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4a;
    private javax.swing.JButton jbtn5a;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnDivide;
    private javax.swing.JButton jbtnEquals;
    private javax.swing.JButton jbtnMultiply;
    private javax.swing.JButton jbtnPlusorMinus;
    private javax.swing.JButton jbtnPoint;
    private javax.swing.JButton jbtnminus;
    private javax.swing.JButton jbtnplus;
    // End of variables declaration//GEN-END:variables
}

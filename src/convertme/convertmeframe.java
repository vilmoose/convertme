/*
 *Vilmos Feher
 * convertmeframe.java
 * 1/5/2018
 */

package convertme;

import java.text.*;

/**
 *
 * @author vifeh1685
 */
public class convertmeframe extends javax.swing.JFrame {

    /**
     * Creates new form convertmeframe
     */
    public convertmeframe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inchestocentimetres = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        feettocentimetres = new javax.swing.JRadioButton();
        yardstometres = new javax.swing.JRadioButton();
        milestokilometres = new javax.swing.JRadioButton();
        centimetrestoinches = new javax.swing.JRadioButton();
        centimetrestofeet = new javax.swing.JRadioButton();
        metrestoyards = new javax.swing.JRadioButton();
        kilometrestomiles = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        outputLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textField = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Linear Conversion");

        inchestocentimetres.setText("Inches to Centimetres");
        inchestocentimetres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inchestocentimetresActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Choose a conversion choice:");

        jLabel3.setText("(Select one)");

        feettocentimetres.setText("Feet to Centimetres");
        feettocentimetres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feettocentimetresActionPerformed(evt);
            }
        });

        yardstometres.setText("Yards to Metres");
        yardstometres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yardstometresActionPerformed(evt);
            }
        });

        milestokilometres.setText("Miles to Kilometres");
        milestokilometres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                milestokilometresActionPerformed(evt);
            }
        });

        centimetrestoinches.setText("Centimteres to Inches");
        centimetrestoinches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centimetrestoinchesActionPerformed(evt);
            }
        });

        centimetrestofeet.setText("Centimetres to Feet");
        centimetrestofeet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centimetrestofeetActionPerformed(evt);
            }
        });

        metrestoyards.setText("Metres to yards");
        metrestoyards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metrestoyardsActionPerformed(evt);
            }
        });

        kilometrestomiles.setText("Kilometres to Miles");
        kilometrestomiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kilometrestomilesActionPerformed(evt);
            }
        });

        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        outputLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Enter a value to be converted:");

        textField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        resetButton.setText("RESET");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(25, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(milestokilometres)
                                .addGap(26, 26, 26)
                                .addComponent(kilometrestomiles))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(feettocentimetres)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(metrestoyards)
                                    .addComponent(centimetrestofeet)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inchestocentimetres)
                                    .addComponent(yardstometres))
                                .addGap(8, 8, 8)
                                .addComponent(centimetrestoinches)))))
                .addGap(112, 112, 112))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outputLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(resetButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inchestocentimetres)
                    .addComponent(centimetrestoinches))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(feettocentimetres)
                    .addComponent(centimetrestofeet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yardstometres)
                    .addComponent(metrestoyards, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(milestokilometres)
                    .addComponent(kilometrestomiles))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(resetButton))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Close");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kilometrestomilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kilometrestomilesActionPerformed
       if(kilometrestomiles.isSelected()){
        inchestocentimetres.setSelected(false);
        centimetrestoinches.setSelected(false);
        feettocentimetres.setSelected(false);
        centimetrestofeet.setSelected(false);
        yardstometres.setSelected(false);
        metrestoyards.setSelected(false);
        milestokilometres.setSelected(false);
       }
    }//GEN-LAST:event_kilometrestomilesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double unit;
        unit = Double.parseDouble(textField.getText());
         
        /*
        *this code is simply just showing what method will run
        *depending on what the user will select
        */
        
        if (inchestocentimetres.isSelected()){
            inchesToCentimetres(unit);
        }
        else if(centimetrestoinches.isSelected()){
            centimetresToInches(unit);
        }    
        else if(feettocentimetres.isSelected()){
            feetToCentimetres(unit);
        }
        else if(centimetrestofeet.isSelected()){
            centimetresToFeet(unit);
        }
        else if(yardstometres.isSelected()){
            yardsToMetres(unit);
        }
        else if(metrestoyards.isSelected()){
            metresToYards(unit);
        }
        else if(milestokilometres.isSelected()){
            milesToKilometres(unit);
        }            
        else if(kilometrestomiles.isSelected()){
            kilometresToMiles(unit);
        }
        else{
            outputLabel.setText("Please choose a unit to be converted");
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
        //closes the window
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void inchestocentimetresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inchestocentimetresActionPerformed
      if(inchestocentimetres.isSelected()){
        centimetrestoinches.setSelected(false);
        feettocentimetres.setSelected(false);
        centimetrestofeet.setSelected(false);
        yardstometres.setSelected(false);
        metrestoyards.setSelected(false);
        milestokilometres.setSelected(false);
        kilometrestomiles.setSelected(false);   
      }
    }//GEN-LAST:event_inchestocentimetresActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        /*
        *clears all the fields and resets buttons
        */
        textField.setText(" ");
        outputLabel.setText(" ");
        inchestocentimetres.setSelected(false);
        centimetrestoinches.setSelected(false);
        feettocentimetres.setSelected(false);
        centimetrestofeet.setSelected(false);
        yardstometres.setSelected(false);
        metrestoyards.setSelected(false);
        milestokilometres.setSelected(false);
        kilometrestomiles.setSelected(false);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void centimetrestoinchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centimetrestoinchesActionPerformed
       if(centimetrestoinches.isSelected()){
        inchestocentimetres.setSelected(false);
        feettocentimetres.setSelected(false);
        centimetrestofeet.setSelected(false);
        yardstometres.setSelected(false);
        metrestoyards.setSelected(false);
        milestokilometres.setSelected(false);
        kilometrestomiles.setSelected(false);
       }
    }//GEN-LAST:event_centimetrestoinchesActionPerformed

    private void feettocentimetresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feettocentimetresActionPerformed
        if(feettocentimetres.isSelected()){
        inchestocentimetres.setSelected(false);
        centimetrestoinches.setSelected(false);
        centimetrestofeet.setSelected(false);
        yardstometres.setSelected(false);
        metrestoyards.setSelected(false);
        milestokilometres.setSelected(false);
        kilometrestomiles.setSelected(false);
        }
    }//GEN-LAST:event_feettocentimetresActionPerformed

    private void centimetrestofeetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centimetrestofeetActionPerformed
        if(centimetrestofeet.isSelected()){
        inchestocentimetres.setSelected(false);
        centimetrestoinches.setSelected(false);
        feettocentimetres.setSelected(false);
        yardstometres.setSelected(false);
        metrestoyards.setSelected(false);
        milestokilometres.setSelected(false);
        kilometrestomiles.setSelected(false);
        }
    }//GEN-LAST:event_centimetrestofeetActionPerformed

    private void yardstometresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yardstometresActionPerformed
        if(yardstometres.isSelected()){
        inchestocentimetres.setSelected(false);
        centimetrestoinches.setSelected(false);
        feettocentimetres.setSelected(false);
        centimetrestofeet.setSelected(false);
        metrestoyards.setSelected(false);
        milestokilometres.setSelected(false);
        kilometrestomiles.setSelected(false);
        }
    }//GEN-LAST:event_yardstometresActionPerformed

    private void metrestoyardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metrestoyardsActionPerformed
        if(metrestoyards.isSelected()){
        inchestocentimetres.setSelected(false);
        centimetrestoinches.setSelected(false);
        feettocentimetres.setSelected(false);
        centimetrestofeet.setSelected(false);
        yardstometres.setSelected(false);
        milestokilometres.setSelected(false);
        kilometrestomiles.setSelected(false);
        }
    }//GEN-LAST:event_metrestoyardsActionPerformed

    private void milestokilometresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_milestokilometresActionPerformed
        if(milestokilometres.isSelected()){
        inchestocentimetres.setSelected(false);
        centimetrestoinches.setSelected(false);
        feettocentimetres.setSelected(false);
        centimetrestofeet.setSelected(false);
        yardstometres.setSelected(false);
        metrestoyards.setSelected(false);
        kilometrestomiles.setSelected(false);
        }
    }//GEN-LAST:event_milestokilometresActionPerformed

    private void inchesToCentimetres(double unit){
        double centimetres;
        centimetres= unit*2.54;
        DecimalFormat x= new DecimalFormat ("###.##");
       
        outputLabel.setText(unit + " inches is= " + x.format(centimetres) + " centimetres");
       
    }
    private void centimetresToInches(double unit){
        double inches;
        inches=unit/2.54;
        DecimalFormat x= new DecimalFormat ("###.##");
        
        outputLabel.setText(unit + " centimetres is= " + x.format(inches) + " inches");
        
    }
    private void feetToCentimetres(double unit){
        double centimetres;
        centimetres=unit*30;
        DecimalFormat x= new DecimalFormat ("###.##");
        
        outputLabel.setText(unit + " feet is= " + x.format(centimetres) + " centimetres");
        
    }
    private void centimetresToFeet(double unit){
        double feet;
        feet= unit/30;
        DecimalFormat x= new DecimalFormat ("###.##");
        
        outputLabel.setText(unit + " centimetres is= " + x.format(feet) + " feet");
        
    }
    private void yardsToMetres(double unit){
        double metres;
        metres=unit*0.91;
        DecimalFormat x= new DecimalFormat ("###.##");
        
        outputLabel.setText(unit + " yards is= " + x.format(metres) + " metres");
        
    }
    private void metresToYards(double unit){
        double yards;
        yards=unit/0.91;
        DecimalFormat x= new DecimalFormat ("###.##");
        
        outputLabel.setText(unit + " metres is= " + x.format(yards) + " yards");
        
    }
    private void milesToKilometres(double unit){
        double kilometres;
        kilometres=unit*1.6;
        DecimalFormat x= new DecimalFormat ("###.##");
        
        outputLabel.setText(unit + " miles is= " + x.format(kilometres) + " kilometres");
        
    }
    private void kilometresToMiles(double unit){
        double miles;
        miles=unit/1.6;
        DecimalFormat x= new DecimalFormat ("###.##");
        
        outputLabel.setText(unit + " kilometres is= " + x.format(miles) + " miles");
        
    }
        
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
            java.util.logging.Logger.getLogger(convertmeframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(convertmeframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(convertmeframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(convertmeframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new convertmeframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton centimetrestofeet;
    private javax.swing.JRadioButton centimetrestoinches;
    private javax.swing.JRadioButton feettocentimetres;
    private javax.swing.JRadioButton inchestocentimetres;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton kilometrestomiles;
    private javax.swing.JRadioButton metrestoyards;
    private javax.swing.JRadioButton milestokilometres;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField textField;
    private javax.swing.JRadioButton yardstometres;
    // End of variables declaration//GEN-END:variables
}

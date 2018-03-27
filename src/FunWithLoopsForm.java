/*
This program was made by Dylan T
It was created on March 27th, 2018
This program the user enters a starting and an ending value and it shows the values in between
 */
;

public class FunWithLoopsForm extends javax.swing.JFrame {
    
    public FunWithLoopsForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelHeader = new javax.swing.JLabel();
        labelStartingValue = new javax.swing.JLabel();
        labelEndingValue = new javax.swing.JLabel();
        buttonShowValues = new javax.swing.JButton();
        textStartingValue = new javax.swing.JTextField();
        textEndingValue = new javax.swing.JTextField();
        labelValues = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelHeader.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelHeader.setText("Fun With Loops!");

        labelStartingValue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelStartingValue.setText("Enter Starting Value:");

        labelEndingValue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelEndingValue.setText("Enter Ending Value:");

        buttonShowValues.setText("Show Values");
        buttonShowValues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShowValuesActionPerformed(evt);
            }
        });

        textStartingValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textStartingValueActionPerformed(evt);
            }
        });

        textEndingValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEndingValueActionPerformed(evt);
            }
        });

        labelValues.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonShowValues)
                .addGap(53, 53, 53))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(labelHeader))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelStartingValue)
                            .addComponent(labelEndingValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textEndingValue, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(textStartingValue))))
                .addContainerGap(75, Short.MAX_VALUE))
            .addComponent(labelValues, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelHeader)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStartingValue)
                    .addComponent(textStartingValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEndingValue)
                    .addComponent(textEndingValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(buttonShowValues)
                .addGap(31, 31, 31)
                .addComponent(labelValues, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

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

    private void buttonShowValuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShowValuesActionPerformed
  
        int valueStart, valueEnd;// Declares integers called valueStart and valueEnd
        
        String values;// Declares a String called values
        values = Integer.toString(0);// Converting values from String to int and assigns it zero 
         
        valueStart = Integer.parseInt(textStartingValue.getText());//Assigns valueStart with the textfield textStartingValue
        valueEnd = Integer.parseInt(textEndingValue.getText());//Assings valueEnd with the textfield textEndingValue
        
        for(int startingValue = valueStart; startingValue <= valueEnd; startingValue ++){//for Loop that declares and assigns startingValue with valueStart and sets the parameters with valueEnd and it adds one everytime it runs
            
            values += Integer.toString(startingValue);// values plus and equals startingValue where it holds the value of startingValue each time it runs
        }
        
        labelValues.setText(values);// Sets values to labelValues
    }//GEN-LAST:event_buttonShowValuesActionPerformed

    private void textStartingValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textStartingValueActionPerformed
        
    }//GEN-LAST:event_textStartingValueActionPerformed

    private void textEndingValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEndingValueActionPerformed
       
    }//GEN-LAST:event_textEndingValueActionPerformed

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(FunWithLoopsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FunWithLoopsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FunWithLoopsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FunWithLoopsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FunWithLoopsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonShowValues;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelEndingValue;
    private javax.swing.JLabel labelHeader;
    private javax.swing.JLabel labelStartingValue;
    private javax.swing.JLabel labelValues;
    private javax.swing.JTextField textEndingValue;
    private javax.swing.JTextField textStartingValue;
    // End of variables declaration//GEN-END:variables
}

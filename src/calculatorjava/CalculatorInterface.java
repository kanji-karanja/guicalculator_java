/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorjava;

/**
 *
 * @author Karim K Kanji
 * 
 */
public class CalculatorInterface extends javax.swing.JFrame {
      double sum=0, firstnum=0, secondnum=0;
      int state;
      String output=new String("");
      String output2 = new String("");
      //1-add 2-minus 3-multiply 4-divide
    /**
     * Creates new form CalculatorInterface
     */
    public CalculatorInterface() {
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

        jLabel1 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        equalsButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        threebutton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        operationsHere = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        answersHere = new javax.swing.JTextField();
        deleteCharacters = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator ");
        setAlwaysOnTop(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel1.setText("Cryosoft Computing");

        addButton.setText("+");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        minusButton.setText("-");
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });

        multiplyButton.setText("x");
        multiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyButtonActionPerformed(evt);
            }
        });

        divideButton.setText("÷");
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButtonActionPerformed(evt);
            }
        });

        equalsButton.setBackground(new java.awt.Color(0, 204, 51));
        equalsButton.setText("=");
        equalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsButtonActionPerformed(evt);
            }
        });

        sevenButton.setText("7");
        sevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenButtonActionPerformed(evt);
            }
        });

        eightButton.setText("8");
        eightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightButtonActionPerformed(evt);
            }
        });

        nineButton.setText("9");
        nineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineButtonActionPerformed(evt);
            }
        });

        fourButton.setText("4");
        fourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourButtonActionPerformed(evt);
            }
        });

        fiveButton.setText("5");
        fiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveButtonActionPerformed(evt);
            }
        });

        sixButton.setText("6");
        sixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixButtonActionPerformed(evt);
            }
        });

        oneButton.setText("1");
        oneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneButtonActionPerformed(evt);
            }
        });

        twoButton.setText("2");
        twoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoButtonActionPerformed(evt);
            }
        });

        threebutton.setText("3");
        threebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threebuttonActionPerformed(evt);
            }
        });

        zeroButton.setText("0");
        zeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroButtonActionPerformed(evt);
            }
        });

        resetButton.setBackground(new java.awt.Color(255, 0, 51));
        resetButton.setText("C");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        operationsHere.setEditable(false);
        operationsHere.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        operationsHere.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        operationsHere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operationsHereActionPerformed(evt);
            }
        });

        jButton1.setText(".");

        answersHere.setEditable(false);
        answersHere.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        answersHere.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        answersHere.setAutoscrolls(false);

        deleteCharacters.setText("←");
        deleteCharacters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCharactersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(oneButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twoButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(threebutton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(operationsHere, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(zeroButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(equalsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(addButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(minusButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(multiplyButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(divideButton))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(sevenButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(eightButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(nineButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(resetButton)))
                                    .addGap(25, 25, 25))
                                .addComponent(answersHere, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(fourButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fiveButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sixButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(deleteCharacters))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(operationsHere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(answersHere, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(minusButton)
                    .addComponent(multiplyButton)
                    .addComponent(divideButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sevenButton)
                    .addComponent(eightButton)
                    .addComponent(nineButton)
                    .addComponent(resetButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fourButton)
                    .addComponent(fiveButton)
                    .addComponent(sixButton)
                    .addComponent(deleteCharacters))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oneButton)
                    .addComponent(twoButton)
                    .addComponent(threebutton))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(zeroButton)
                    .addComponent(equalsButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void multiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyButtonActionPerformed
        // TODO add your handling code here:
        state=3;
        output=output+"x";
      output2=output2+"i";
      operationsHere.setText(output);
    }//GEN-LAST:event_multiplyButtonActionPerformed

    private void eightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightButtonActionPerformed
        // TODO add your handling code here:
        output=output+"8";
        output2=output2+"8";
            operationsHere.setText(output);
        
    }//GEN-LAST:event_eightButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
      state=1;
      output=output+"+";
      output2=output2+"i";
      operationsHere.setText(output);
    }//GEN-LAST:event_addButtonActionPerformed

    private void sevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenButtonActionPerformed
        // TODO add your handling code here:
            output=output+"7";
            output2=output2+"7";
            operationsHere.setText(output);
    }//GEN-LAST:event_sevenButtonActionPerformed

    private void fiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveButtonActionPerformed
        // TODO add your handling code here:
        output=output+"5";
        output2=output2+"5";
            operationsHere.setText(output);
    }//GEN-LAST:event_fiveButtonActionPerformed

    private void oneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneButtonActionPerformed
        // TODO add your handling code here:
        output=output+"1";
        output2=output2+"1";
            operationsHere.setText(output);
    }//GEN-LAST:event_oneButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        answersHere.setText(""+0.0);
        state=0;
        output="";
        output2="";
        sum=0;
        firstnum=0;
        secondnum=0;
        operationsHere.setText("0");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void equalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsButtonActionPerformed
        // TODO add your handling code here:
        if(state==1){
          String[] subSplit =output2.split("i");
          double[] num=new double[100];
          double sum=0;
        for(int i=0; i <subSplit.length;i++){
            num[i]=Double.parseDouble(subSplit[i]);
sum=sum+num[i];
        }
           //firstnum=Double.parseDouble(subSplit[0]);
          // secondnum=Double.parseDouble(subSplit[1]);
          //  sum=firstnum+secondnum;
            answersHere.setText(""+sum);
           // operationsHere.setText(""+firstnum);
            reset();
        }
        else if(state==2){
             String[] subSplit =output2.split("i");
                    double[] num=new double[100];
          double sum=0;
        for(int i=0; i <subSplit.length;i++){
            num[i]=Double.parseDouble(subSplit[i]);
            if(i==0){
                sum=num[i];
            }
            else{
                sum=sum-num[i];
            }
        }
          // firstnum=Double.parseDouble(subSplit[0]);
          // secondnum=Double.parseDouble(subSplit[1]);
           // sum=firstnum-secondnum;
            answersHere.setText(""+sum);
           // operationsHere.setText(""+firstnum);
            reset();
        }
        else if(state==3){
             String[] subSplit =output2.split("i");
                double[] num=new double[100];
          double sum=0;
        for(int i=0; i <subSplit.length;i++){
            num[i]=Double.parseDouble(subSplit[i]);
            if(i==0){
                sum=num[i];
            }
            else{
                sum=sum*num[i];
            }
        }
           //firstnum=Double.parseDouble(subSplit[0]);
           //secondnum=Double.parseDouble(subSplit[1]);
          //  sum=firstnum*secondnum;
            answersHere.setText(""+sum);
           // operationsHere.setText(""+firstnum);
            reset();
        }
        else if(state==4){
             String[] subSplit =output2.split("i");
                double[] num=new double[100];
          double sum=0;
        for(int i=0; i <subSplit.length;i++){
            num[i]=Double.parseDouble(subSplit[i]);
            if(i==0){
                sum=num[i];
            }
            else{
                sum=sum/num[i];
            }
        }
          // firstnum=Double.parseDouble(subSplit[0]);
           //secondnum=Double.parseDouble(subSplit[1]);
           // sum=firstnum/secondnum;
            answersHere.setText(""+sum);
           // operationsHere.setText(""+firstnum);
            reset();
        }
    }//GEN-LAST:event_equalsButtonActionPerformed

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
        // TODO add your handling code here:
        state=2;
      output=output+"-";
      output2=output2+"i";
      operationsHere.setText(output);
    }//GEN-LAST:event_minusButtonActionPerformed

    private void threebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threebuttonActionPerformed
        // TODO add your handling code here:
        output=output+"3";
        output2=output2+"3";
            operationsHere.setText(output);
    }//GEN-LAST:event_threebuttonActionPerformed

    private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroButtonActionPerformed
        // TODO add your handling code here:
        output=output+"0";
        output2=output2+"0";
            operationsHere.setText(output);
    }//GEN-LAST:event_zeroButtonActionPerformed

    private void twoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoButtonActionPerformed
        // TODO add your handling code here:
        output=output+"2";
        output2=output2+"2";
        operationsHere.setText(output);
    }//GEN-LAST:event_twoButtonActionPerformed

    private void fourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourButtonActionPerformed
        // TODO add your handling code here:
        output=output+"4";
        output2=output2+"4";
            operationsHere.setText(output);
    }//GEN-LAST:event_fourButtonActionPerformed

    private void sixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixButtonActionPerformed
        // TODO add your handling code here:
        output=output+"6";
        output2=output2+"6";
            operationsHere.setText(output);
    }//GEN-LAST:event_sixButtonActionPerformed

    private void nineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineButtonActionPerformed
        // TODO add your handling code here:
        output=output+"9";
        output2=output2+"9";
            operationsHere.setText(output);
    }//GEN-LAST:event_nineButtonActionPerformed

    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideButtonActionPerformed
        // TODO add your handling code here:
        state=4;
        output=output+"÷";
      output2=output2+"i";
      operationsHere.setText(output);
    }//GEN-LAST:event_divideButtonActionPerformed

    private void operationsHereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operationsHereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_operationsHereActionPerformed

    private void deleteCharactersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCharactersActionPerformed
        // TODO add your handling code here:
        int toBeRemoved = output.length();
String removed = output.substring(0, (toBeRemoved-1)); 
String removed2 = output2.substring(0, (toBeRemoved-1)); 
output=removed;
operationsHere.setText(removed);
output2=removed2;
    }//GEN-LAST:event_deleteCharactersActionPerformed
    
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
            java.util.logging.Logger.getLogger(CalculatorInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorInterface().setVisible(true);
            }
        });
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField answersHere;
    private javax.swing.JButton deleteCharacters;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton equalsButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JTextField operationsHere;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton threebutton;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables

    private void reset() {
        state=0;
        output="";
        output2="";
        sum=0;
        firstnum=0;
        secondnum=0;
        operationsHere.setText("0");
    }
}

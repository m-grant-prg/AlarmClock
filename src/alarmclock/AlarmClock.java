/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alarmclock;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.Timer;

/**
 *
 * @author mgrantprg
 */
public class AlarmClock extends javax.swing.JFrame {

    /**
     * Creates new form AlarmClock
     */
    public AlarmClock() {
        initComponents();
        setTime();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alarm1ButtonGroup = new javax.swing.ButtonGroup();
        alarm2ButtonGroup = new javax.swing.ButtonGroup();
        alarm1 = new javax.swing.JPanel();
        alarmAtRadioButton1 = new javax.swing.JRadioButton();
        alarmAtHoursLabel1 = new javax.swing.JLabel();
        alarmAtHoursSpinner1 = new javax.swing.JSpinner();
        alarmAtMinsLabel1 = new javax.swing.JLabel();
        alarmAtMinsSpinner1 = new javax.swing.JSpinner();
        alarmInRadioButton1 = new javax.swing.JRadioButton();
        alarmInHoursLabel1 = new javax.swing.JLabel();
        alarmInHoursSpinner1 = new javax.swing.JSpinner();
        alarmInMinsLabel1 = new javax.swing.JLabel();
        alarmInMinsSpinner1 = new javax.swing.JSpinner();
        alarmActivatedCheckBox1 = new javax.swing.JCheckBox();
        countdownLabel1 = new javax.swing.JLabel();
        alarmCountdownHoursLabel1 = new javax.swing.JLabel();
        alarmCountdownMinsLabel1 = new javax.swing.JLabel();
        alarm2 = new javax.swing.JPanel();
        alarmAtRadioButton2 = new javax.swing.JRadioButton();
        alarmAtHoursLabel2 = new javax.swing.JLabel();
        alarmAtHoursSpinner2 = new javax.swing.JSpinner();
        alarmAtMinsLabel2 = new javax.swing.JLabel();
        alarmAtMinsSpinner2 = new javax.swing.JSpinner();
        alarmInRadioButton2 = new javax.swing.JRadioButton();
        alarmInHoursLabel2 = new javax.swing.JLabel();
        alarmInHoursSpinner2 = new javax.swing.JSpinner();
        alarmInMinsLabel2 = new javax.swing.JLabel();
        alarmInMinsSpinner2 = new javax.swing.JSpinner();
        alarmActivatedCheckBox2 = new javax.swing.JCheckBox();
        countdownLabel2 = new javax.swing.JLabel();
        alarmCountdownHoursLabel2 = new javax.swing.JLabel();
        alarmCountdownMinsLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AlarmClock");
        setName("AlarmClock");

        alarm1.setBorder(javax.swing.BorderFactory.createTitledBorder("Alarm 1"));
        alarm1.setName("Alarm 1");

        alarm1ButtonGroup.add(alarmAtRadioButton1);
        alarmAtRadioButton1.setSelected(true);
        alarmAtRadioButton1.setText("Alarm at");
        alarmAtRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alarmAtRadioButton1ActionPerformed(evt);
            }
        });

        alarmAtHoursLabel1.setText("Hours");

        alarmAtHoursSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

        alarmAtMinsLabel1.setText("Mins");

        alarmAtMinsSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        alarm1ButtonGroup.add(alarmInRadioButton1);
        alarmInRadioButton1.setText("Alarm in");
        alarmInRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alarmInRadioButton1ActionPerformed(evt);
            }
        });

        alarmInHoursLabel1.setText("Hours");

        alarmInHoursSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        alarmInHoursSpinner1.setEnabled(false);

        alarmInMinsLabel1.setText("Mins");

        alarmInMinsSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        alarmInMinsSpinner1.setEnabled(false);

        alarmActivatedCheckBox1.setText("Activated");
        alarmActivatedCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alarmActivatedCheckBox1ActionPerformed(evt);
            }
        });

        countdownLabel1.setText("Countdown");

        alarmCountdownHoursLabel1.setText("    0");

        alarmCountdownMinsLabel1.setText("    0");

        javax.swing.GroupLayout alarm1Layout = new javax.swing.GroupLayout(alarm1);
        alarm1.setLayout(alarm1Layout);
        alarm1Layout.setHorizontalGroup(
            alarm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alarm1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(alarm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alarm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alarm1Layout.createSequentialGroup()
                            .addComponent(alarmAtRadioButton1)
                            .addGap(46, 46, 46))
                        .addGroup(alarm1Layout.createSequentialGroup()
                            .addComponent(alarmAtHoursSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(alarm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(alarmAtMinsLabel1)
                                .addComponent(alarmAtMinsSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)))
                    .addGroup(alarm1Layout.createSequentialGroup()
                        .addComponent(alarmAtHoursLabel1)
                        .addGap(102, 102, 102)))
                .addGroup(alarm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alarm1Layout.createSequentialGroup()
                        .addGroup(alarm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alarmInHoursSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alarmInHoursLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(alarm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alarmInMinsSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alarmInMinsLabel1))
                        .addGap(50, 50, 50)
                        .addGroup(alarm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(alarm1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(alarmCountdownHoursLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(alarmCountdownMinsLabel1)
                                .addGap(24, 24, 24))
                            .addGroup(alarm1Layout.createSequentialGroup()
                                .addGroup(alarm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(countdownLabel1)
                                    .addComponent(alarmActivatedCheckBox1))
                                .addContainerGap())))
                    .addGroup(alarm1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(alarmInRadioButton1)
                        .addContainerGap())))
        );
        alarm1Layout.setVerticalGroup(
            alarm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alarm1Layout.createSequentialGroup()
                .addGroup(alarm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alarmAtRadioButton1)
                    .addComponent(alarmInRadioButton1)
                    .addComponent(alarmActivatedCheckBox1))
                .addGap(7, 7, 7)
                .addGroup(alarm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alarmAtHoursLabel1)
                    .addComponent(alarmInHoursLabel1)
                    .addComponent(alarmAtMinsLabel1)
                    .addComponent(alarmInMinsLabel1)
                    .addComponent(countdownLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(alarm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alarmAtHoursSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alarmAtMinsSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alarmInHoursSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alarmInMinsSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alarmCountdownHoursLabel1)
                    .addComponent(alarmCountdownMinsLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        alarm2.setBorder(javax.swing.BorderFactory.createTitledBorder("Alarm 2"));
        alarm2.setName("Alarm 2");

        alarm2ButtonGroup.add(alarmAtRadioButton2);
        alarmAtRadioButton2.setSelected(true);
        alarmAtRadioButton2.setText("Alarm at");
        alarmAtRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alarmAtRadioButton2ActionPerformed(evt);
            }
        });

        alarmAtHoursLabel2.setText("Hours");

        alarmAtHoursSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

        alarmAtMinsLabel2.setText("Mins");

        alarmAtMinsSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        alarm2ButtonGroup.add(alarmInRadioButton2);
        alarmInRadioButton2.setText("Alarm in");
        alarmInRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alarmInRadioButton2ActionPerformed(evt);
            }
        });

        alarmInHoursLabel2.setText("Hours");

        alarmInHoursSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        alarmInHoursSpinner2.setEnabled(false);

        alarmInMinsLabel2.setText("Mins");

        alarmInMinsSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        alarmInMinsSpinner2.setEnabled(false);

        alarmActivatedCheckBox2.setText("Activated");
        alarmActivatedCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alarmActivatedCheckBox2ActionPerformed(evt);
            }
        });

        countdownLabel2.setText("Countdown");

        alarmCountdownHoursLabel2.setText("    0");

        alarmCountdownMinsLabel2.setText("    0");

        javax.swing.GroupLayout alarm2Layout = new javax.swing.GroupLayout(alarm2);
        alarm2.setLayout(alarm2Layout);
        alarm2Layout.setHorizontalGroup(
            alarm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alarm2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(alarm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alarm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alarm2Layout.createSequentialGroup()
                            .addComponent(alarmAtRadioButton2)
                            .addGap(46, 46, 46))
                        .addGroup(alarm2Layout.createSequentialGroup()
                            .addComponent(alarmAtHoursSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(alarm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(alarmAtMinsLabel2)
                                .addComponent(alarmAtMinsSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)))
                    .addGroup(alarm2Layout.createSequentialGroup()
                        .addComponent(alarmAtHoursLabel2)
                        .addGap(102, 102, 102)))
                .addGroup(alarm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alarm2Layout.createSequentialGroup()
                        .addGroup(alarm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alarmInHoursSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alarmInHoursLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(alarm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alarmInMinsSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alarmInMinsLabel2))
                        .addGap(50, 50, 50)
                        .addGroup(alarm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(alarm2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(alarmCountdownHoursLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(alarmCountdownMinsLabel2)
                                .addGap(24, 24, 24))
                            .addGroup(alarm2Layout.createSequentialGroup()
                                .addGroup(alarm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(countdownLabel2)
                                    .addComponent(alarmActivatedCheckBox2))
                                .addContainerGap())))
                    .addGroup(alarm2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(alarmInRadioButton2)
                        .addContainerGap())))
        );
        alarm2Layout.setVerticalGroup(
            alarm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alarm2Layout.createSequentialGroup()
                .addGroup(alarm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alarmAtRadioButton2)
                    .addComponent(alarmInRadioButton2)
                    .addComponent(alarmActivatedCheckBox2))
                .addGap(7, 7, 7)
                .addGroup(alarm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alarmAtHoursLabel2)
                    .addComponent(alarmInHoursLabel2)
                    .addComponent(alarmAtMinsLabel2)
                    .addComponent(alarmInMinsLabel2)
                    .addComponent(countdownLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(alarm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alarmAtHoursSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alarmAtMinsSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alarmInHoursSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alarmInMinsSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alarmCountdownHoursLabel2)
                    .addComponent(alarmCountdownMinsLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alarm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alarm2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(alarm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alarm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        alarm2.getAccessibleContext().setAccessibleName("Alarm 2");
        alarm2.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alarmAtRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alarmAtRadioButton1ActionPerformed
        alarmAtHoursSpinner1.setEnabled(true);
        alarmAtMinsSpinner1.setEnabled(true);
        alarmInHoursSpinner1.setEnabled(false);
        alarmInMinsSpinner1.setEnabled(false);
    }//GEN-LAST:event_alarmAtRadioButton1ActionPerformed

    private void alarmInRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alarmInRadioButton1ActionPerformed
        alarmAtHoursSpinner1.setEnabled(false);
        alarmAtMinsSpinner1.setEnabled(false);
        alarmInHoursSpinner1.setEnabled(true);
        alarmInMinsSpinner1.setEnabled(true);
    }//GEN-LAST:event_alarmInRadioButton1ActionPerformed

    private void alarmActivatedCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alarmActivatedCheckBox1ActionPerformed
        if (alarmActivatedCheckBox1.isSelected()) {
            alarmAtHoursSpinner1.setEnabled(false);
            alarmAtMinsSpinner1.setEnabled(false);
            alarmInHoursSpinner1.setEnabled(false);
            alarmInMinsSpinner1.setEnabled(false);
            if (alarmAtRadioButton1.isSelected())
                timerDelay1 = alarmAtDelayCalc1();
            else
                timerDelay1 = alarmInDelayCalc1();
            timerAlarm1 = new Timer(timerDelay1, this.playAlarm1);
            playerThread1 = new PlaySoundThread("AlarmClock.wav", true);
            timerAlarm1.start();
            timerCounter1 = new Timer(60000, this.counterUpdater1);
            timerCounter1.start();
            updateCounters1();
        }
        else
        {
            if (alarmAtRadioButton1.isSelected()) {
                alarmAtHoursSpinner1.setEnabled(true);
                alarmAtMinsSpinner1.setEnabled(true);
            }
            else {
                alarmInHoursSpinner1.setEnabled(true);
                alarmInMinsSpinner1.setEnabled(true);
            }
            timerAlarm1.stop();
            timerCounter1.stop();
            if (playerThread1.playThread.isAlive())
                    playerThread1.playThread.interrupt();
        }
    }//GEN-LAST:event_alarmActivatedCheckBox1ActionPerformed

    private void alarmAtRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alarmAtRadioButton2ActionPerformed
        alarmAtHoursSpinner2.setEnabled(true);
        alarmAtMinsSpinner2.setEnabled(true);
        alarmInHoursSpinner2.setEnabled(false);
        alarmInMinsSpinner2.setEnabled(false);
    }//GEN-LAST:event_alarmAtRadioButton2ActionPerformed

    private void alarmInRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alarmInRadioButton2ActionPerformed
        alarmAtHoursSpinner2.setEnabled(false);
        alarmAtMinsSpinner2.setEnabled(false);
        alarmInHoursSpinner2.setEnabled(true);
        alarmInMinsSpinner2.setEnabled(true);
    }//GEN-LAST:event_alarmInRadioButton2ActionPerformed

    private void alarmActivatedCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alarmActivatedCheckBox2ActionPerformed
        if (alarmActivatedCheckBox2.isSelected()) {
            alarmAtHoursSpinner2.setEnabled(false);
            alarmAtMinsSpinner2.setEnabled(false);
            alarmInHoursSpinner2.setEnabled(false);
            alarmInMinsSpinner2.setEnabled(false);
            if (alarmAtRadioButton2.isSelected())
                timerDelay2 = alarmAtDelayCalc2();
            else
                timerDelay2 = alarmInDelayCalc2();
            timerAlarm2 = new Timer(timerDelay2, this.playAlarm2);
            playerThread2 = new PlaySoundThread("AlarmClock.wav", true);
            timerAlarm2.start();
            timerCounter2 = new Timer(60000, this.counterUpdater2);
            timerCounter2.start();
            updateCounters2();
        }
        else
        {
            if (alarmAtRadioButton2.isSelected()) {
                alarmAtHoursSpinner2.setEnabled(true);
                alarmAtMinsSpinner2.setEnabled(true);
            }
            else {
                alarmInHoursSpinner2.setEnabled(true);
                alarmInMinsSpinner2.setEnabled(true);
            }
            timerAlarm2.stop();
            timerCounter2.stop();
            if (playerThread2.playThread.isAlive())
                    playerThread2.playThread.interrupt();
        }
    }//GEN-LAST:event_alarmActivatedCheckBox2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlarmClock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlarmClock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlarmClock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlarmClock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AlarmClock().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alarm1;
    private javax.swing.ButtonGroup alarm1ButtonGroup;
    private javax.swing.JPanel alarm2;
    private javax.swing.ButtonGroup alarm2ButtonGroup;
    private javax.swing.JCheckBox alarmActivatedCheckBox1;
    private javax.swing.JCheckBox alarmActivatedCheckBox2;
    private javax.swing.JLabel alarmAtHoursLabel1;
    private javax.swing.JLabel alarmAtHoursLabel2;
    private javax.swing.JSpinner alarmAtHoursSpinner1;
    private javax.swing.JSpinner alarmAtHoursSpinner2;
    private javax.swing.JLabel alarmAtMinsLabel1;
    private javax.swing.JLabel alarmAtMinsLabel2;
    private javax.swing.JSpinner alarmAtMinsSpinner1;
    private javax.swing.JSpinner alarmAtMinsSpinner2;
    private javax.swing.JRadioButton alarmAtRadioButton1;
    private javax.swing.JRadioButton alarmAtRadioButton2;
    private javax.swing.JLabel alarmCountdownHoursLabel1;
    private javax.swing.JLabel alarmCountdownHoursLabel2;
    private javax.swing.JLabel alarmCountdownMinsLabel1;
    private javax.swing.JLabel alarmCountdownMinsLabel2;
    private javax.swing.JLabel alarmInHoursLabel1;
    private javax.swing.JLabel alarmInHoursLabel2;
    private javax.swing.JSpinner alarmInHoursSpinner1;
    private javax.swing.JSpinner alarmInHoursSpinner2;
    private javax.swing.JLabel alarmInMinsLabel1;
    private javax.swing.JLabel alarmInMinsLabel2;
    private javax.swing.JSpinner alarmInMinsSpinner1;
    private javax.swing.JSpinner alarmInMinsSpinner2;
    private javax.swing.JRadioButton alarmInRadioButton1;
    private javax.swing.JRadioButton alarmInRadioButton2;
    private javax.swing.JLabel countdownLabel1;
    private javax.swing.JLabel countdownLabel2;
    // End of variables declaration//GEN-END:variables

    private ActionListener playAlarm1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            timerAlarm1.stop();
            timerCounter1.stop();
            playerThread1.playThread.start();
        }
    };

    private ActionListener playAlarm2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            timerAlarm2.stop();
            timerCounter2.stop();
            playerThread2.playThread.start();
        }
    };
        private ActionListener counterUpdater1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            updateCounters1();
        }
    };

    private ActionListener counterUpdater2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            updateCounters2();
        }
    };

    private Timer timerAlarm1;
    private Timer timerCounter1;
    private PlaySoundThread playerThread1;
    private Calendar currentDate;
    private int timerDelay1;
    private Calendar targetTime1;

    private Timer timerAlarm2;
    private Timer timerCounter2;
    private PlaySoundThread playerThread2;
    private int timerDelay2;
    private Calendar targetTime2;

    private void setTime() {
        currentDate = Calendar.getInstance();
        alarmAtHoursSpinner1.getModel().setValue(currentDate.get(Calendar.HOUR_OF_DAY));
        alarmAtMinsSpinner1.getModel().setValue(currentDate.get(Calendar.MINUTE));
        alarmAtHoursSpinner2.getModel().setValue(currentDate.get(Calendar.HOUR_OF_DAY));
        alarmAtMinsSpinner2.getModel().setValue(currentDate.get(Calendar.MINUTE));
    }

    private int alarmAtDelayCalc1() {
        currentDate = Calendar.getInstance();
        Integer hoursInMillis = (Integer) alarmAtHoursSpinner1.getModel().getValue();
        Integer minsInMillis = (Integer) alarmAtMinsSpinner1.getModel().getValue();
        int timeDelayHoursInMillis = (hoursInMillis.intValue() - currentDate.get(Calendar.HOUR_OF_DAY)) * 60 * 60 * 1000;
        int timeDelayMinsInMillis = (minsInMillis.intValue()- currentDate.get(Calendar.MINUTE)) * 60 * 1000;
        int timeDelayInMillis = timeDelayHoursInMillis + timeDelayMinsInMillis;
        if (timeDelayInMillis < 0)
            timeDelayInMillis = (24 * 60 * 60 * 1000) + timeDelayInMillis;
        targetTime1 = currentDate;
        targetTime1.add(Calendar.MILLISECOND, timeDelayInMillis);
        return timeDelayInMillis;
    }
    private int alarmAtDelayCalc2() {
        currentDate = Calendar.getInstance();
        Integer hoursInMillis = (Integer) alarmAtHoursSpinner2.getModel().getValue();
        Integer minsInMillis = (Integer) alarmAtMinsSpinner2.getModel().getValue();
        int timeDelayHoursInMillis = (hoursInMillis.intValue() - currentDate.get(Calendar.HOUR_OF_DAY)) * 60 * 60 * 1000;
        int timeDelayMinsInMillis = (minsInMillis.intValue()- currentDate.get(Calendar.MINUTE)) * 60 * 1000;
        int timeDelayInMillis = timeDelayHoursInMillis + timeDelayMinsInMillis;
        if (timeDelayInMillis < 0)
            timeDelayInMillis = (24 * 60 * 60 * 1000) + timeDelayInMillis;
        targetTime2 = currentDate;
        targetTime2.add(Calendar.MILLISECOND, timeDelayInMillis);
        return timeDelayInMillis;
    }
        private int alarmInDelayCalc1() {
        currentDate = Calendar.getInstance();
        Integer hoursInMillis = (Integer) alarmInHoursSpinner1.getModel().getValue();
        Integer minsInMillis = (Integer) alarmInMinsSpinner1.getModel().getValue();
        int timeDelayInMillis = (hoursInMillis.intValue() * 60 * 60 * 1000)
                + (minsInMillis.intValue() *60 * 1000);
        targetTime1 = currentDate;
        targetTime1.add(Calendar.MILLISECOND, timeDelayInMillis);
        return timeDelayInMillis;
    }
    private int alarmInDelayCalc2() {
        currentDate = Calendar.getInstance();
        Integer hoursInMillis = (Integer) alarmInHoursSpinner2.getModel().getValue();
        Integer minsInMillis = (Integer) alarmInMinsSpinner2.getModel().getValue();
        int timeDelayInMillis = (hoursInMillis.intValue() * 60 * 60 * 1000)
                + (minsInMillis.intValue() *60 * 1000);
        targetTime2 = currentDate;
        targetTime2.add(Calendar.MILLISECOND, timeDelayInMillis);
        return timeDelayInMillis;
    }

    private void updateCounters1() {
        currentDate = Calendar.getInstance();
        long remainingTimeInMillis = (targetTime1.getTimeInMillis() - currentDate.getTimeInMillis());

        Long remainingHoursLong = new Long(remainingTimeInMillis / (60 * 60 * 1000));
        alarmCountdownHoursLabel1.setText(remainingHoursLong.toString());

        Long remainingMinsLong = new Long((remainingTimeInMillis - (remainingHoursLong.longValue() * 60 * 60 * 1000)) / (60 * 1000));
        alarmCountdownMinsLabel1.setText(remainingMinsLong.toString());
    }

    private void updateCounters2() {
        currentDate = Calendar.getInstance();
        long remainingTimeInMillis = (targetTime2.getTimeInMillis() - currentDate.getTimeInMillis());

        Long remainingHoursLong = new Long(remainingTimeInMillis / (60 * 60 * 1000));
        alarmCountdownHoursLabel2.setText(remainingHoursLong.toString());

        Long remainingMinsLong = new Long((remainingTimeInMillis - (remainingHoursLong.longValue() * 60 * 60 * 1000)) / (60 * 1000));
        alarmCountdownMinsLabel2.setText(remainingMinsLong.toString());
    }
}

/*
 * Class ID: AlarmClock
 * Copyright (C) 2014-2018, 2020  Mark Grant
 *
 * Released under the GPLv3 or later.
 * SPDX-License-Identifier: GPL-3.0-or-later
 *
 */

/* **********************************************************************
 *									*
 * Changelog								*
 *									*
 * Date		Author	Version	Description				*
 *									*
 * 09/12/2015	MG	1.0.11	Introduced in-source ChangeLogs.	*
 * 23/01/2020	MG	1.0.12	Correct in-jar resource locations and	*
 *				add getClassLoader to access resource.	*
 *				Increase counter update timer frequency.*
 *									*
 ************************************************************************
 */

package alarmclock;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Calendar;
import javax.imageio.ImageIO;
import javax.swing.Timer;
import gnu.getopt.*;

/**
 * A Swing GUI application providing the functionality of an alarm clock.
 * @author Mark Grant
 * @version 1.0.12
 */
public class AlarmClock extends javax.swing.JFrame {

	BufferedImage alarmClockImage;

	/**
	 * Creates new form AlarmClock
	 */
	public AlarmClock() {
		// Initialise icon for use in frame borders etc..
		try {
			alarmClockImage = ImageIO.read(this.getClass().getClassLoader()
				.getResource("jarobjects/AlarmClock.png"));
		}
		catch (Exception e) { }

		initComponents();
		setTime();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		alarm1ButtonGroup = new javax.swing.ButtonGroup();
		alarm2ButtonGroup = new javax.swing.ButtonGroup();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextPane1 = new javax.swing.JTextPane();
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
		alarmSnoozeButton1 = new javax.swing.JButton();
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
		alarmSnoozeButton2 = new javax.swing.JButton();
		mainMenuBar = new javax.swing.JMenuBar();
		fileMenu = new javax.swing.JMenu();
		exitMenuItem = new javax.swing.JMenuItem();
		helpMenu = new javax.swing.JMenu();
		aboutMenuItem = new javax.swing.JMenuItem();

		jScrollPane1.setViewportView(jTextPane1);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("AlarmClock");
		setIconImage(alarmClockImage);
		setName("AlarmClock"); // NOI18N

		alarm1.setBorder(javax.swing.BorderFactory.createTitledBorder("Alarm 1"));
		alarm1.setName("Alarm 1"); // NOI18N
		alarm1.setPreferredSize(new java.awt.Dimension(546, 125));

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

		alarmCountdownHoursLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
		alarmCountdownHoursLabel1.setText("	0");

		alarmCountdownMinsLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
		alarmCountdownMinsLabel1.setText("	0");

		alarmSnoozeButton1.setText("Snooze");
		alarmSnoozeButton1.setEnabled(false);
		alarmSnoozeButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				alarmSnoozeButton1ActionPerformed(evt);
			}
		});

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
							.addComponent(alarmActivatedCheckBox1)
							.addGroup(alarm1Layout.createSequentialGroup()
								.addGroup(alarm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
									.addGroup(alarm1Layout.createSequentialGroup()
										.addComponent(alarmCountdownHoursLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(alarmCountdownMinsLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
									.addComponent(countdownLabel1))
								.addGap(28, 28, 28)
								.addComponent(alarmSnoozeButton1))))
					.addGroup(alarm1Layout.createSequentialGroup()
						.addGap(11, 11, 11)
						.addComponent(alarmInRadioButton1)))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		alarm1Layout.setVerticalGroup(
			alarm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(alarm1Layout.createSequentialGroup()
				.addGroup(alarm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(alarmAtRadioButton1)
					.addComponent(alarmInRadioButton1)
					.addComponent(alarmActivatedCheckBox1))
				.addGap(2, 2, 2)
				.addGroup(alarm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(alarmAtHoursLabel1)
					.addComponent(alarmInHoursLabel1)
					.addComponent(alarmAtMinsLabel1)
					.addComponent(alarmInMinsLabel1)
					.addComponent(countdownLabel1)
					.addComponent(alarmSnoozeButton1))
				.addGap(4, 4, 4)
				.addGroup(alarm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(alarmAtHoursSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(alarmAtMinsSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(alarmInHoursSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(alarmInMinsSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(alarmCountdownHoursLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(alarmCountdownMinsLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addContainerGap(30, Short.MAX_VALUE))
		);

		alarm2.setBorder(javax.swing.BorderFactory.createTitledBorder("Alarm 2"));
		alarm2.setName("Alarm 2"); // NOI18N
		alarm2.setPreferredSize(new java.awt.Dimension(546, 125));

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

		alarmCountdownHoursLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
		alarmCountdownHoursLabel2.setText("	0");

		alarmCountdownMinsLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
		alarmCountdownMinsLabel2.setText("	0");

		alarmSnoozeButton2.setText("Snooze");
		alarmSnoozeButton2.setEnabled(false);
		alarmSnoozeButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				alarmSnoozeButton2ActionPerformed(evt);
			}
		});

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
							.addComponent(alarmActivatedCheckBox2)
							.addGroup(alarm2Layout.createSequentialGroup()
								.addGroup(alarm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
									.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alarm2Layout.createSequentialGroup()
										.addComponent(alarmCountdownHoursLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(alarmCountdownMinsLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
									.addComponent(countdownLabel2))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(alarmSnoozeButton2))))
					.addGroup(alarm2Layout.createSequentialGroup()
						.addGap(11, 11, 11)
						.addComponent(alarmInRadioButton2)))
				.addContainerGap())
		);
		alarm2Layout.setVerticalGroup(
			alarm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(alarm2Layout.createSequentialGroup()
				.addGroup(alarm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(alarmAtRadioButton2)
					.addComponent(alarmInRadioButton2)
					.addComponent(alarmActivatedCheckBox2))
				.addGap(2, 2, 2)
				.addGroup(alarm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(alarmAtHoursLabel2)
					.addComponent(alarmInHoursLabel2)
					.addComponent(alarmAtMinsLabel2)
					.addComponent(alarmInMinsLabel2)
					.addComponent(countdownLabel2)
					.addComponent(alarmSnoozeButton2))
				.addGap(4, 4, 4)
				.addGroup(alarm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(alarmAtHoursSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(alarmAtMinsSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(alarmInHoursSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(alarmInMinsSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(alarmCountdownHoursLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(alarmCountdownMinsLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addContainerGap(30, Short.MAX_VALUE))
		);

		fileMenu.setText("File");

		exitMenuItem.setText("Exit");
		exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				exitMenuItemActionPerformed(evt);
			}
		});
		fileMenu.add(exitMenuItem);

		mainMenuBar.add(fileMenu);

		helpMenu.setText("Help");

		aboutMenuItem.setText("About");
		aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				aboutMenuItemActionPerformed(evt);
			}
		});
		helpMenu.add(aboutMenuItem);

		mainMenuBar.add(helpMenu);

		setJMenuBar(mainMenuBar);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
					.addComponent(alarm1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
					.addComponent(alarm2, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
				.addContainerGap(14, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(alarm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(alarm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);

		alarm2.getAccessibleContext().setAccessibleDescription("");

		pack();
	}// </editor-fold>//GEN-END:initComponents

	/**
	 * Event handler for "Alarm at" radio button 1.
	 * @param evt Event object.
	 */
	private void alarmAtRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alarmAtRadioButton1ActionPerformed
		alarmAtHoursSpinner1.setEnabled(true);
		alarmAtMinsSpinner1.setEnabled(true);
		alarmInHoursSpinner1.setEnabled(false);
		alarmInMinsSpinner1.setEnabled(false);
	}//GEN-LAST:event_alarmAtRadioButton1ActionPerformed

	/**
	 * Event handler for "Alarm in" radio button 1.
	 * @param evt Event object.
	 */
	private void alarmInRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alarmInRadioButton1ActionPerformed
		alarmAtHoursSpinner1.setEnabled(false);
		alarmAtMinsSpinner1.setEnabled(false);
		alarmInHoursSpinner1.setEnabled(true);
		alarmInMinsSpinner1.setEnabled(true);
	}//GEN-LAST:event_alarmInRadioButton1ActionPerformed

	/**
	 * Event handler for processing the alarm activated checkbox.
	 * @param evt Event object.
	 */
	private void alarmActivatedCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alarmActivatedCheckBox1ActionPerformed
		if (alarmActivatedCheckBox1.isSelected()) {
			alarmAtRadioButton1.setEnabled(false);
			alarmInRadioButton1.setEnabled(false);
			alarmAtHoursSpinner1.setEnabled(false);
			alarmAtMinsSpinner1.setEnabled(false);
			alarmInHoursSpinner1.setEnabled(false);
			alarmInMinsSpinner1.setEnabled(false);
			if (alarmAtRadioButton1.isSelected())
				timerDelay1 = alarmAtDelayCalc1();
			else
				timerDelay1 = alarmInDelayCalc1();
			startTimer1();
		}
		else
		{
			alarmAtRadioButton1.setEnabled(true);
			alarmInRadioButton1.setEnabled(true);
			if (alarmAtRadioButton1.isSelected()) {
				alarmAtHoursSpinner1.setEnabled(true);
				alarmAtMinsSpinner1.setEnabled(true);
			}
			else {
				alarmInHoursSpinner1.setEnabled(true);
				alarmInMinsSpinner1.setEnabled(true);
			}
			alarmSnoozeButton1.setEnabled(false);
			stopTimer1();
		}
	}//GEN-LAST:event_alarmActivatedCheckBox1ActionPerformed

	/**
	 * Event handler for checking the "Alarm at" radio button 2.
	 * @param evt Event object.
	 */
	private void alarmAtRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alarmAtRadioButton2ActionPerformed
		alarmAtHoursSpinner2.setEnabled(true);
		alarmAtMinsSpinner2.setEnabled(true);
		alarmInHoursSpinner2.setEnabled(false);
		alarmInMinsSpinner2.setEnabled(false);
	}//GEN-LAST:event_alarmAtRadioButton2ActionPerformed

	/**
	 * Event handler for checking the "Alarm in" radio button 2.
	 * @param evt Event object.
	 */
	private void alarmInRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alarmInRadioButton2ActionPerformed
		alarmAtHoursSpinner2.setEnabled(false);
		alarmAtMinsSpinner2.setEnabled(false);
		alarmInHoursSpinner2.setEnabled(true);
		alarmInMinsSpinner2.setEnabled(true);
	}//GEN-LAST:event_alarmInRadioButton2ActionPerformed

	/**
	 * Event handler for checking the "Alarm activated" checkbox 2.
	 * @param evt Event object.
	 */
	private void alarmActivatedCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alarmActivatedCheckBox2ActionPerformed
		if (alarmActivatedCheckBox2.isSelected()) {
			alarmAtRadioButton2.setEnabled(false);
			alarmInRadioButton2.setEnabled(false);
			alarmAtHoursSpinner2.setEnabled(false);
			alarmAtMinsSpinner2.setEnabled(false);
			alarmInHoursSpinner2.setEnabled(false);
			alarmInMinsSpinner2.setEnabled(false);
			if (alarmAtRadioButton2.isSelected())
				timerDelay2 = alarmAtDelayCalc2();
			else
				timerDelay2 = alarmInDelayCalc2();
			startTimer2();
		}
		else
		{
			alarmAtRadioButton2.setEnabled(true);
			alarmInRadioButton2.setEnabled(true);
			if (alarmAtRadioButton2.isSelected()) {
				alarmAtHoursSpinner2.setEnabled(true);
				alarmAtMinsSpinner2.setEnabled(true);
			}
			else {
				alarmInHoursSpinner2.setEnabled(true);
				alarmInMinsSpinner2.setEnabled(true);
			}
			alarmSnoozeButton2.setEnabled(false);
			stopTimer2();
		}
	}//GEN-LAST:event_alarmActivatedCheckBox2ActionPerformed

	/**
	 * Event handler for the menu action File | Exit.
	 * @param evt Event object.
	 */
	private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
		dispose();
		System.exit(0);
	}//GEN-LAST:event_exitMenuItemActionPerformed

	/**
	 * Event handler for the menu action Help | About.
	 * @param evt Event object.
	 */
	private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
		new AlarmClockHelpAboutJDialog(this, true).setVisible(true);
	}//GEN-LAST:event_aboutMenuItemActionPerformed

	private void alarmSnoozeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alarmSnoozeButton1ActionPerformed
		stopTimer1();
		timerDelay1 = 300000;
		targetTime1 = Calendar.getInstance();
		targetTime1.add(Calendar.MILLISECOND, timerDelay1);
		startTimer1();
		alarmSnoozeButton1.setEnabled(false);
	}//GEN-LAST:event_alarmSnoozeButton1ActionPerformed

	private void alarmSnoozeButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alarmSnoozeButton2ActionPerformed
		stopTimer2();
		timerDelay2 = 300000;
		targetTime2 = Calendar.getInstance();
		targetTime2.add(Calendar.MILLISECOND, timerDelay2);
		startTimer2();
		alarmSnoozeButton2.setEnabled(false);
	}//GEN-LAST:event_alarmSnoozeButton2ActionPerformed

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

		LongOpt[] longOpts = new LongOpt[2];
		longOpts[0] = new LongOpt("help", LongOpt.NO_ARGUMENT, null, 'h');
		longOpts[1] = new LongOpt("version", LongOpt.NO_ARGUMENT, null, 'V');
		Getopt g = new Getopt("AlarmClock", args, ":hV", longOpts);
		int c;
		while ((c = g.getopt()) != -1) {
			switch (c) {
				case 'h':
					System.out.println("Usage is 'Command' [options]");
					System.out.println("	-h or --help displays usage information");
					System.out.println("	OR");
					System.out.println("	-V or --version displays version information");
					System.exit(0);
				case 'V':
					System.out.println("AlarmClock Source version " + Version.getSrcVersion());
					System.out.println("AlarmClock Package version " + Version.getPkgVersion());
					System.exit(0);
				case '?':
					System.exit(64); // getopt() has already printed an error.
			}
		}

		// Program does not accept other arguments.
		if (g.getOptind() < args.length) {
			System.out.println("Invalid argument.");
			System.exit(64);
		}

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
	private javax.swing.JMenuItem aboutMenuItem;
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
	private javax.swing.JButton alarmSnoozeButton1;
	private javax.swing.JButton alarmSnoozeButton2;
	private javax.swing.JLabel countdownLabel1;
	private javax.swing.JLabel countdownLabel2;
	private javax.swing.JMenuItem exitMenuItem;
	private javax.swing.JMenu fileMenu;
	private javax.swing.JMenu helpMenu;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextPane jTextPane1;
	private javax.swing.JMenuBar mainMenuBar;
	// End of variables declaration//GEN-END:variables

	/**
	 * Action taken when action event raised for play alarm 1.
	 */
	private ActionListener playAlarm1 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			timerAlarm1.stop();
			timerCounter1.stop();
			alarmSnoozeButton1.setEnabled(true);
			playerThread1.playThread.start();
		}
	};

	/**
	 * Action taken when action event raised for play alarm 2.
	 */
	private ActionListener playAlarm2 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			timerAlarm2.stop();
			timerCounter2.stop();
			alarmSnoozeButton2.setEnabled(true);
			playerThread2.playThread.start();
		}
	};

	/**
	 * Action taken when action event raised to update timer counter 1.
	 */
	private ActionListener counterUpdater1 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			updateCounters1();
		}
	};

	/**
	 * Action taken when action event raised to update timer counters 2.
	 */
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

	/**
	 * Private method to initially populate the Alarm at spinners with the current time.
	 */
	private void setTime() {
		currentDate = Calendar.getInstance();
		alarmAtHoursSpinner1.getModel().setValue(currentDate.get(Calendar.HOUR_OF_DAY));
		alarmAtMinsSpinner1.getModel().setValue(currentDate.get(Calendar.MINUTE));
		alarmAtHoursSpinner2.getModel().setValue(currentDate.get(Calendar.HOUR_OF_DAY));
		alarmAtMinsSpinner2.getModel().setValue(currentDate.get(Calendar.MINUTE));
	}

	/**
	 * Calculate the time to wait based on the "Alarm at" value set in clock 1.
	 * @return Time to wait in milliseconds.
	 */
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

	/**
	 * Calculate the time to wait based on the "Alarm at" value set in clock 2.
	 * @return Time to wait in milliseconds.
	 */
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

	/**
	 * Calculate the time to wait based on the "Alarm in" value set in clock 1.
	 * @return Time to wait in milliseconds.
	 */
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

	/**
	 * Calculate the time to wait based on the "Alarm in" value set in clock 2.
	 * @return Time to wait in milliseconds.
	 */
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

	/**
	 * Method to update the countdown labels for clock 1.
	 */
	private void updateCounters1() {
		currentDate = Calendar.getInstance();
		long remainingTimeInMillis = (targetTime1.getTimeInMillis() - currentDate.getTimeInMillis());

		Long remainingHoursLong = new Long(remainingTimeInMillis / (60 * 60 * 1000));
		alarmCountdownHoursLabel1.setText(remainingHoursLong.toString());

		Long remainingMinsLong = new Long((remainingTimeInMillis - (remainingHoursLong.longValue() * 60 * 60 * 1000)) / (60 * 1000));
		alarmCountdownMinsLabel1.setText(remainingMinsLong.toString());
	}

	/**
	 * Method to update the countdown labels for clock 2.
	 */
	private void updateCounters2() {
		currentDate = Calendar.getInstance();
		long remainingTimeInMillis = (targetTime2.getTimeInMillis() - currentDate.getTimeInMillis());

		Long remainingHoursLong = new Long(remainingTimeInMillis / (60 * 60 * 1000));
		alarmCountdownHoursLabel2.setText(remainingHoursLong.toString());

		Long remainingMinsLong = new Long((remainingTimeInMillis - (remainingHoursLong.longValue() * 60 * 60 * 1000)) / (60 * 1000));
		alarmCountdownMinsLabel2.setText(remainingMinsLong.toString());
	}

	private void startTimer1() {
		timerAlarm1 = new Timer(timerDelay1, this.playAlarm1);
		playerThread1 = new PlaySoundThread("jarobjects/AlarmClock.wav", true);
		timerAlarm1.start();
		timerCounter1 = new Timer(5000, this.counterUpdater1);
		timerCounter1.start();
		updateCounters1();
	}

	private void stopTimer1() {
		timerAlarm1.stop();
		timerCounter1.stop();
		if (playerThread1.playThread.isAlive())
				playerThread1.playThread.interrupt();
	}

	private void startTimer2() {
		timerAlarm2 = new Timer(timerDelay2, this.playAlarm2);
		playerThread2 = new PlaySoundThread("jarobjects/AlarmClock.wav", true);
		timerAlarm2.start();
		timerCounter2 = new Timer(5000, this.counterUpdater2);
		timerCounter2.start();
		updateCounters2();
	}

	private void stopTimer2() {
		timerAlarm2.stop();
		timerCounter2.stop();
		if (playerThread2.playThread.isAlive())
				playerThread2.playThread.interrupt();
	}
}

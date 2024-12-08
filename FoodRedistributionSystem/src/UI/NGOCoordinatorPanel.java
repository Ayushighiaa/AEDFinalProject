/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import controller.NGOCoordinatorController;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ayushighia
 */
public class NGOCoordinatorPanel extends javax.swing.JPanel {

    private NGOCoordinatorController ngoCoordinatorController;
    private JPanel mainPanel;
    private CardLayout cardLayout;

    /**
     * Creates new form NGOCoordinatorPanel
     */
    public NGOCoordinatorPanel(NGOCoordinatorController ngoCoordinatorController,JPanel mainPanel, CardLayout cardLayout) {
        initComponents();
        this.ngoCoordinatorController = ngoCoordinatorController;
        populateFoodDistributionList();
        populateWorkshopSchedule();
        this.mainPanel = mainPanel;
        this.cardLayout = cardLayout;
      
    }

    /**
     * Populates the food distribution list table.
     */
    private void populateFoodDistributionList() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear existing data

        ngoCoordinatorController.getFoodDistributionList().forEach(distribution -> {
            model.addRow(new Object[]{
                distribution.getId(),
                distribution.getFoodItem(),
                distribution.getNGO(),
                distribution.getStatus()
            });
        });
    }

    /**
     * Populates the workshop schedule table.
     */
    private void populateWorkshopSchedule() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0); // Clear existing data

        ngoCoordinatorController.getWorkshopSchedule().forEach(workshop -> {
            model.addRow(new Object[]{
                workshop.getId(),
                workshop.getTitle(),
                workshop.getDate(),
                workshop.getCoordinator()
            });
        });
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel1.setText("Food Distribution List ");

        jLabel2.setText("Workshop Schedule");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Food Item", "NGO", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Title", "Date", "Coordinator"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton1.setText("Plan Workshop");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Assign Distribution");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("<<Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(48, 48, 48)
                        .addComponent(jButton1)
                        .addGap(58, 58, 58)
                        .addComponent(jButton2)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton3))
                    .addComponent(jButton2))
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      JDialog dialog = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), "Plan Workshop", true);
    dialog.setSize(400, 300);
    dialog.setLayout(new BorderLayout());

    // Create input fields for workshop details
    JPanel inputPanel = new JPanel();
    inputPanel.setLayout(new GridLayout(4, 2, 10, 10));

    JLabel titleLabel = new JLabel("Workshop Title:");
    JTextField titleField = new JTextField();

    JLabel dateLabel = new JLabel("Workshop Date (YYYY-MM-DD):");
    JTextField dateField = new JTextField();

    JLabel coordinatorLabel = new JLabel("Coordinator:");
    JTextField coordinatorField = new JTextField();

    inputPanel.add(titleLabel);
    inputPanel.add(titleField);
    inputPanel.add(dateLabel);
    inputPanel.add(dateField);
    inputPanel.add(coordinatorLabel);
    inputPanel.add(coordinatorField);

    dialog.add(inputPanel, BorderLayout.CENTER);

    // Create buttons for saving or canceling
    JPanel buttonPanel = new JPanel();
    JButton saveButton = new JButton("Save");
    JButton cancelButton = new JButton("Cancel");

    buttonPanel.add(saveButton);
    buttonPanel.add(cancelButton);
    dialog.add(buttonPanel, BorderLayout.SOUTH);

    // Action listener for the save button
    saveButton.addActionListener(e -> {
        String title = titleField.getText().trim();
        String date = dateField.getText().trim();
        String coordinator = coordinatorField.getText().trim();

        // Validate inputs
        if (title.isEmpty() || date.isEmpty() || coordinator.isEmpty()) {
            JOptionPane.showMessageDialog(dialog, "All fields are required.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate date format (simple regex for YYYY-MM-DD)
        if (!date.matches("\\d{4}-\\d{2}-\\d{2}")) {
            JOptionPane.showMessageDialog(dialog, "Invalid date format. Please use YYYY-MM-DD.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Confirm workshop details
        int confirm = JOptionPane.showConfirmDialog(dialog,
                "Please confirm the workshop details:\n\n" +
                "Title: " + title + "\n" +
                "Date: " + date + "\n" +
                "Coordinator: " + coordinator,
                "Confirm Workshop",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            // Add the new workshop
            ngoCoordinatorController.addWorkshop(title, date, coordinator);
            JOptionPane.showMessageDialog(dialog, "Workshop added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);

            // Update the workshop table
            populateWorkshopSchedule();

            dialog.dispose(); // Close the dialog
        }
    });

    // Action listener for the cancel button
    cancelButton.addActionListener(e -> dialog.dispose());

    // Show the dialog
    dialog.setLocationRelativeTo(this);
    dialog.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = jTable1.getSelectedRow();
    if (selectedRow < 0) {
        JOptionPane.showMessageDialog(this, "Please select a food distribution to assign.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int distributionId = (int) jTable1.getValueAt(selectedRow, 0);
    String foodItem = (String) jTable1.getValueAt(selectedRow, 1);
    String ngoName = (String) jTable1.getValueAt(selectedRow, 2);

    // Show a confirmation dialog with food item and NGO details
    int confirm = JOptionPane.showConfirmDialog(this,
            "Are you sure you want to assign the following distribution?\n\n" +
            "Food Item: " + foodItem + "\n" +
            "NGO: " + ngoName,
            "Confirm Assignment",
            JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        ngoCoordinatorController.assignDistribution(distributionId);
        JOptionPane.showMessageDialog(this, "Food distribution assigned successfully to " + ngoName + ".", "Success", JOptionPane.INFORMATION_MESSAGE);

        populateFoodDistributionList();
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        cardLayout.show(mainPanel, "LoginPanel");
    }//GEN-LAST:event_jButton3ActionPerformed
  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}

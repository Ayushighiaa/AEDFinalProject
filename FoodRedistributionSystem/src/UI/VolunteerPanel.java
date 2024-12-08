/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package UI;

import controller.TaskController;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import model.Task;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * VolunteerPanel allows volunteers to view, claim, and complete tasks.
 */
public class VolunteerPanel extends javax.swing.JPanel {

    private TaskController taskController;
    private int loggedInVolunteerId;
    private JPanel mainPanel;
    private CardLayout cardLayout;
    
   

    /**
     * Creates new form VolunteerPanel
     */
    public VolunteerPanel(TaskController taskController, int volunteerId,JPanel mainPanel, CardLayout cardLayout) {
        initComponents();
        this.taskController = taskController;
        this.loggedInVolunteerId = volunteerId;
        this.mainPanel = mainPanel;
        this.cardLayout = cardLayout;
        populateTaskList();
        

       
    }

    /**
     * Populates the task list table with available tasks.
     */
    private void populateTaskList() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0); // Clear existing data

    List<Task> tasks = taskController.getAllTasks();
    for (Task task : tasks) {
        model.addRow(new Object[]{
            task.getTaskId(),
            task.getDescription(),
            task.getStatus(),
            task.getAssignedTo() == null ? "Unassigned" : "Volunteer " + task.getAssignedTo()
        });
    }
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
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel1.setText("Task List ");

        jLabel2.setText("Task details ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton1.setText("Claim Task ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Complete Task");
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
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(45, 45, 45)
                        .addComponent(jButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton3)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(90, 90, 90))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         int selectedRow = jTable1.getSelectedRow();
    if (selectedRow < 0) {
        JOptionPane.showMessageDialog(this, "Please select a task to claim.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int taskId = (int) jTable1.getValueAt(selectedRow, 0);
    String result = taskController.assignTask(taskId, loggedInVolunteerId);

    if (result.equals("Success")) {
        JOptionPane.showMessageDialog(this, "Task claimed successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        jTextArea1.setText(""); // Clear task details
        populateTaskList(); // Refresh the task list
    } else {
        JOptionPane.showMessageDialog(this, result, "Error", JOptionPane.ERROR_MESSAGE);
    }
       

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       int selectedRow = jTable1.getSelectedRow();
    if (selectedRow < 0) {
        JOptionPane.showMessageDialog(this, "Please select a task to complete.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int taskId = (int) jTable1.getValueAt(selectedRow, 0);
    String details = jTextArea1.getText();

    if (details.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please provide details for task completion.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String result = taskController.completeTask(taskId, details);

    if (result.equals("Success")) {
        JOptionPane.showMessageDialog(this, "Task completed successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        jTextArea1.setText(""); // Clear task details
        populateTaskList(); // Refresh the task list
    } else {
        JOptionPane.showMessageDialog(this, result, "Error", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
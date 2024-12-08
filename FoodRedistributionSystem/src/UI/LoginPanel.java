/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import controller.DonationController;
import controller.EducationalContentController;
import controller.InspectionController;
import controller.LogisticsController;
import controller.NGOCoordinatorController;
import controller.TaskController;
import controller.TransportDriverController;
import controller.UserController;
import controller.WarehouseController;
import controller.WorkshopController;
import model.User;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import model.Delivery;
import model.Distribution;
import model.Donation;
import model.Donor;
import model.FoodItem;
import model.Workshop;
import service.DonationService;
import service.LogisticsService;
import service.TaskService;
import service.UserService;

/**
 * LoginPanel handles user authentication and role-based redirection.
 */
public class LoginPanel extends javax.swing.JPanel {
    
    private UserController userController;
    private DonationController donationController;
    private LogisticsController logisticsController;
    private TaskController taskController;
    private NGOCoordinatorController ngoCoordinatorController;
    private WorkshopController workshopController;
    private InspectionController inspectionController;
    private WarehouseController warehouseController;
    private TransportDriverController transportDriverController;
    LogisticsService logiscticsService = new LogisticsService();
    
   
   

    private CardLayout cardLayout;
    private JPanel mainPanel;
    

   
    

    /**
     * Creates new form LoginPanel.
     */
    public LoginPanel(UserController userController,JPanel mainPanel, CardLayout cardLayout) {
        
        this.userController = userController;
        this.mainPanel = mainPanel;
        this.cardLayout = cardLayout;
        
        initComponents();
        
        UserService userService = new UserService();
        DonationService donationService = new DonationService();
        
        
        
      
        List<Delivery> deliveryList = new ArrayList<>();

        deliveryList.add(new Delivery(1, "Warehouse A to NGO 1", "Pending", ""));
        deliveryList.add(new Delivery(2, "Warehouse B to Community Kitchen 2", "Pending", ""));
        
        List<Distribution> foodDistributions = new ArrayList<>();

        foodDistributions.add(new Distribution(1, "Rice", "NGO 1", "Pending"));
        foodDistributions.add(new Distribution(2, "Wheat", "NGO 2", "Pending"));
        
        List<Workshop> workshops = new ArrayList<>();

        workshops.add(new Workshop(1, "Food Safety Training", "2024-12-10", "Coordinator 1"));
        workshops.add(new Workshop(2, "Sustainable Food Practices", "2024-12-15", "Coordinator 2"));

        
        List<FoodItem> inventory = new ArrayList<>();

        inventory.add(new FoodItem(1, "Rice", 100, "2024-12-15"));
        inventory.add(new FoodItem(2, "Wheat Flour", 50, "2024-12-20"));
        inventory.add(new FoodItem(3, "Canned Beans", 200, "2025-01-10"));
        
        List<Donation> donations = new ArrayList<>();

        // Creating dummy food items
        FoodItem foodItem1 = new FoodItem(101, "Canned Beans", 20, "2024-12-31");
        FoodItem foodItem2 = new FoodItem(102, "Rice Packets", 50, "2025-01-15");
        FoodItem foodItem3 = new FoodItem(103, "Pasta", 30, "2024-12-15");

        // Creating dummy donors
        Donor donor1 = new Donor(1, "John Doe", "johndoe@example.com", "123-456-7890");
        Donor donor2 = new Donor(2, "Jane Smith", "janesmith@example.com", "987-654-3210");
        Donor donor3 = new Donor(3, "Alex Johnson", "alexj@example.com", "555-666-7777");

        // Adding donations to the list
        donations.add(new Donation(1, foodItem1, donor1, "Pending"));
        donations.add(new Donation(2, foodItem2, donor2, "Inspected - Approved"));
        donations.add(new Donation(3, foodItem3, donor3, "Pending"));
        
   
        
        this.userController = new UserController(userService);
        this.donationController = new DonationController(donationService);
        this.logisticsController = new LogisticsController(logiscticsService);
        this.transportDriverController = new TransportDriverController(deliveryList);
        this.taskController = new TaskController();
        this.ngoCoordinatorController = new NGOCoordinatorController(foodDistributions,workshops);
        this.workshopController = new WorkshopController();
        this.inspectionController = new InspectionController(donations);
        this.warehouseController = new WarehouseController(inventory);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 0));

        jLabel1.setText("Username ");

        jLabel2.setText("Password");

        jLabel3.setText("Role");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Logistics Manager", "Volunteer ", "NGO Coordinator", "Educator", "Food Safety Inspector", "Warehouse Manager", "Transport Driver", "Donor", "Donation Scheduler" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("View Educational Content");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jButton1)))
                .addContainerGap(238, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(88, 88, 88))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
      
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    String selectedRole = ((String) jComboBox1.getSelectedItem()).trim();

    // Get entered username and password
    String username = jTextField1.getText().trim();
    String password = jTextField2.getText().trim();

    // Validate input fields
    if (username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter both username and password.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Authenticate the user
    User authenticatedUser = userController.authenticate(username, password);
    if (authenticatedUser != null) {
        // Check role matching
        if (!authenticatedUser.getRole().equalsIgnoreCase(selectedRole)) {
            JOptionPane.showMessageDialog(this, "Selected role does not match your credentials.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Successful login
        JOptionPane.showMessageDialog(this, "Login successful! Redirecting to the " + selectedRole + " dashboard.", "Success", JOptionPane.INFORMATION_MESSAGE);

        // Redirect to respective role panel
        switch (selectedRole) {
    case "Donor" -> {
        DonorPanel donorPanel = new DonorPanel(donationController, new Donor(1, "Donor", "donor@example.com", "123-456-7890"), mainPanel, cardLayout);
        mainPanel.add(donorPanel, "DonorPanel");
        cardLayout.show(mainPanel, "DonorPanel");
    }
    case "Logistics Manager" -> {
        LogisticsManagerPanel logisticsPanel = new LogisticsManagerPanel(logisticsController, logiscticsService, mainPanel, cardLayout);
        mainPanel.add(logisticsPanel, "LogisticsManagerPanel");
        cardLayout.show(mainPanel, "LogisticsManagerPanel");
    }
    case "Volunteer" -> {
        VolunteerPanel volunteerPanel = new VolunteerPanel(taskController, authenticatedUser.getUserId(), mainPanel, cardLayout);
        mainPanel.add(volunteerPanel, "VolunteerPanel");
        cardLayout.show(mainPanel, "VolunteerPanel");
    }
    case "NGO Coordinator" -> {
        NGOCoordinatorPanel ngoPanel = new NGOCoordinatorPanel(ngoCoordinatorController, mainPanel, cardLayout);
        mainPanel.add(ngoPanel, "NGOCoordinatorPanel");
        cardLayout.show(mainPanel, "NGOCoordinatorPanel");
    }
    case "Educator" -> {
        EducatorPanel educatorPanel = new EducatorPanel(workshopController, mainPanel, cardLayout);
        mainPanel.add(educatorPanel, "EducatorPanel");
        cardLayout.show(mainPanel, "EducatorPanel");
    }
    case "Food Safety Inspector" -> {
        FoodSafetyInspectorPanel inspectorPanel = new FoodSafetyInspectorPanel(inspectionController, mainPanel, cardLayout);
        mainPanel.add(inspectorPanel, "FoodSafetyInspectorPanel");
        cardLayout.show(mainPanel, "FoodSafetyInspectorPanel");
    }
    case "Warehouse Manager" -> {
        WarehouseManagerPanel warehousePanel = new WarehouseManagerPanel(warehouseController, mainPanel, cardLayout);
        mainPanel.add(warehousePanel, "WarehouseManagerPanel");
        cardLayout.show(mainPanel, "WarehouseManagerPanel");
    }
    case "Transport Driver" -> {
        TransportDriverPanel driverPanel = new TransportDriverPanel(transportDriverController, mainPanel, cardLayout);
        mainPanel.add(driverPanel, "TransportDriverPanel");
        cardLayout.show(mainPanel, "TransportDriverPanel");
    }
    case "Donation Scheduler" -> {
                DonationSchedulerPanel donationSchedulerPanel = new DonationSchedulerPanel(donationController, mainPanel, cardLayout);
                mainPanel.add(donationSchedulerPanel, "DonationSchedulerPanel");
                cardLayout.show(mainPanel, "DonationSchedulerPanel");
            }
    default -> JOptionPane.showMessageDialog(this, "Unknown role selected.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    } else {
        // Authentication failed
        JOptionPane.showMessageDialog(this, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    EducationalContentController contentController = new EducationalContentController();
    contentController.addContent("Food Safety", "Learn the basics of food safety and hygiene.");
    contentController.addContent("Zero Waste Cooking", "Tips and tricks to reduce waste in your kitchen.");
    contentController.addContent("Sustainable Farming", "Explore methods for sustainable agriculture.");
    contentController.addContent("Healthy Eating", "Nutritional advice for a balanced diet.");

    // Create the EducationalContentPanel
    EducationalContentPanel contentPanel = new EducationalContentPanel(contentController, mainPanel, cardLayout);

    // Create a dialog to display the EducationalContentPanel
    JDialog contentDialog = new JDialog((Frame) SwingUtilities.getWindowAncestor(this), "Educational Content", true);
    contentDialog.setSize(600, 400);
    contentDialog.setLayout(new BorderLayout());
    contentDialog.add(contentPanel, BorderLayout.CENTER);

    // Center the dialog relative to the parent
    contentDialog.setLocationRelativeTo(SwingUtilities.getWindowAncestor(this));

    // Display the dialog
    contentDialog.setVisible(true);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed
    private void showPanel(JPanel panel) {
        // Remove all existing components from the parent container
        this.removeAll();

        // Add the new panel
        this.setLayout(new BorderLayout());
        this.add(panel, BorderLayout.CENTER);

        // Revalidate and repaint the container to reflect the changes
        this.revalidate();
        this.repaint();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

package UI;

import controller.UserController;
import service.UserService;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private JPanel mainPanel;
    private CardLayout cardLayout;

    public MainFrame() {
        setTitle("Food Redistribution System");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Initialize CardLayout and main panel
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Initialize services and controllers
        UserService userService = new UserService();
        UserController userController = new UserController(userService);

        // Create LoginPanel and add it to mainPanel
        LoginPanel loginPanel = new LoginPanel(userController, mainPanel, cardLayout);
        mainPanel.add(loginPanel, "LoginPanel");

        // Add mainPanel to the frame
        add(mainPanel);

        setLocationRelativeTo(null); // Center window
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}

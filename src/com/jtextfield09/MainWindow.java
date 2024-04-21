package com.jtextfield09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {

    public MainWindow(){
        initialize();
    }

    private JFrame window;
    private JPanel panel;
    private JTextField textField;
    private JLabel username;
    private JButton checkUsername;

    private void initialize(){
        window = new JFrame();
        window.setTitle("JTextField Application");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(1000, 500);
        window.setLocationRelativeTo(null);
        panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
        panel.setBackground(Color.GRAY);
        // seting up an empty label to display entered username
        username = new JLabel();
        // setting up the textfield and action button
        textField = createTextField();
        checkUsername = createActionBtn();
        // adding textfield and label to panel
        panel.add(textField);
        panel.add(username);
        // adding panel and action button to frame/window
        window.add(panel, BorderLayout.CENTER);
        window.add(checkUsername, BorderLayout.SOUTH);
    }

    private JTextField createTextField(){
        // initialize textfield with 10 20 visible text characters
        JTextField textField = new JTextField(20);
        textField.setFont(new Font("Helvetica", Font.PLAIN, 18));
        textField.setMargin(new Insets(5, 10, 5, 10));
        textField.setBackground(Color.LIGHT_GRAY);
        textField.setToolTipText("Enter Game Username");
        return textField;
    }

    private JButton createActionBtn(){
        JButton btn = new JButton("Check Username");
        btn.setFocusable(false);
        btn.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredUsername = textField.getText();
                String output = !enteredUsername.isBlank() ? enteredUsername : "No username provided!";
                username.setText(output);
                textField.setText("");
            }
        });
        return btn;
    }

    public void show(){
        this.window.setVisible(true);
    }

}
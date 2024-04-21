package com.jlabel08;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainWindow {
    private JFrame window;
    private JPanel panel;
    private JButton button;
    private JLabel label;

    public MainWindow(){
        initialize();
    }

    private void initialize(){
        // setting up the frame
        this.window = new JFrame();
        this.window.setTitle("JLabel Application");
        this.window.setSize(500, 500);
        this.window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.window.setLocationRelativeTo(null);
        // setting up the panel
        this.panel = new JPanel();
        this.panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.panel.setBackground(Color.GRAY);
        // setting up the label
        this.label = new JLabel("Sample Application");
        // changing the color of the label to white
        this.label.setForeground(Color.WHITE);
        // changing its font and size
        this.label.setFont(new Font("Sans-serif", Font.BOLD, 25));
        // adding the label to the panel
        this.panel.add(this.label);
        // adding graphics to the label
        ImageIcon icon = new ImageIcon("logo.png");
        this.label.setIcon(icon);
        // adding space btwn the icon and label
        this.label.setIconTextGap(20);
        // adding interactivity to change the label to multiple line texts
        this.button = new JButton("Update App Label");
        this.button.setFocusable(false);
        this.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("<html><h2>Sample Application</h2><p>Version: 1.0.0</p></html>");
            }
        });
        // adding the button to the frame -> bottom position
        this.window.add(this.button, BorderLayout.SOUTH);
        // adding the panel to the frame/window -> top position
        this.window.add(this.panel, BorderLayout.NORTH);
    }

    public void show(){
        this.window.setVisible(true);
    }
}

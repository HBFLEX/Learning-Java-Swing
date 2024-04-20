package com.gridlayout06;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;


public class MainWindow {
    private JFrame window;
    private JPanel panel;

    public MainWindow(){
        initialize();
    }

    private void initialize(){
        this.window = new JFrame();
        this.window.setLayout(new BorderLayout());
        this.window.setTitle("Grid-Layout Application");
        this.window.setSize(600, 600);
        this.window.setLocationRelativeTo(null);
        this.window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // create a jpanel border-layout with 10 rows and 5 columns plus 5, 5 on width and horizontal margin
        this.panel = new JPanel();
        this.panel.setLayout(new GridLayout(10, 5, 5, 5));
        // add button to the grid
        for(int i = 0; i < 50; i++){
            JButton btn = new JButton("Button " + Integer.toString(i + 1));
            this.panel.add(btn);
        }
        this.window.add(panel);
    }

    public void show(){
        this.window.setVisible(true);
    }
}

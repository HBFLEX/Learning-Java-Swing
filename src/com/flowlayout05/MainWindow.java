package com.flowlayout05;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;


public class MainWindow {
    private JFrame window;
    private JPanel panel;

    public MainWindow(){
        initialize();
    }

    private void initialize(){
        this.window = new JFrame();
        this.window.setLayout(new BorderLayout());
        this.window.setTitle("Flow-Layout Application");
        this.window.setSize(600, 600);
        this.window.setLocationRelativeTo(null);
        this.window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // set the jpanel layout
        this.panel = new JPanel();
        this.panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        // add the jpanel to the frame/window
        this.window.add(panel, BorderLayout.CENTER);
        // add buttons to the jpanel flow-layout
        for(int i = 0; i < 5; i++){
            JButton btn = new JButton("Button " + Integer.toString(i + 1));
            this.panel.add(btn);
        }
    }

    public void show(){
        this.window.setVisible(true);
    }
}

package com.firstwindow01;

import javax.swing.JFrame;

public class MainWindow {
    final private JFrame window;

    public MainWindow(){
        window = new JFrame();
        window.setTitle("First Application");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(500, 500);
        window.setLocationRelativeTo(null);
    }

    public void show(){
        window.setVisible(true);
    }
}

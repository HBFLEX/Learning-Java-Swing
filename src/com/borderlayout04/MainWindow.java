package com.borderlayout04;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;

public class MainWindow {
    private JFrame window;

    public MainWindow(){
        initialize();
    }

    private void initialize(){
        this.window = new JFrame();
        this.window.setTitle("BorderLayout Application");
        this.window.setSize(600, 600);
        this.window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // make a border layout
        this.window.setLayout(new BorderLayout(5, 5));
        // add buttons to each region of the border layout
        this.window.add(new JButton("NORTH"), BorderLayout.NORTH);
        this.window.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        this.window.add(new JButton("WEST"), BorderLayout.WEST);
        this.window.add(new JButton("EAST"), BorderLayout.EAST);
        this.window.add(new JButton("CENTER"), BorderLayout.CENTER);
    }

    public void show(){
        this.window.setVisible(true);
    }
}

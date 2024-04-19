package com.jframe02.second_way;

import javax.swing.JFrame;

public class MainWindow {

    public void initialize(){
        JFrame window = new JFrame();
        window.setTitle("Second Way Application");
        // This sets the behavior what we want the app to do when we click the X/closing icon
        // DISPOSE_ON_CLOSE means close/shutdown the whole application leaving no trace.
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(500, 500);
        // to center the launching app, we set its relative location to null
        window.setLocationRelativeTo(null);
        // if you wish to disable the resizing of window, set it to false
        window.setResizable(false);
        // finally, draw the frame on screen
        window.setVisible(true);
    }
}

package com.jframe02.first_way;

import javax.swing.JFrame;


public class MainWindow extends JFrame {

    public void initialize(){
        setTitle("First Way Application");
        // This sets the behavior what we want the app to do when we click the X/closing icon
        // DISPOSE_ON_CLOSE means close/shutdown the whole application leaving no trace.
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);
        // to center the launching app, we set its relative location to null
        setLocationRelativeTo(null);
        // if you wish to disable the resizing of window, set it to false
        setResizable(false);
        // finally, draw the frame on screen
        setVisible(true);
    }

}

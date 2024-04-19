package com.jpanel03;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class MainWindow {

    public void initialize(){
        JFrame window = new JFrame();
        window.setTitle("JPanel Application");
        // By default, the JFrame has a Border Layout manager
        window.setLayout(new BorderLayout(10, 5));
        // This sets the behavior what we want the app to do when we click the X/closing icon
        // DISPOSE_ON_CLOSE means close/shutdown the whole application leaving no trace.
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(500, 500);
        // to center the launching app, we set its relative location to null
        window.setLocationRelativeTo(null);
        // a jpanel is used to add other components on top of it which itself is added on top jframe
        // By default, it has the FlowLayout manager
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 4));
        // adding the panel on top of jframe, positioned on the center
        window.add(panel, BorderLayout.NORTH);
        // the jpane covers all the entire space on the jframe.
        // to visualize this we set its background color to red
        panel.setBackground(Color.red);
        // add buttons component to the jpanel
        Button watchBtn = new Button("Home");
        panel.add(watchBtn);

        Button notesBtn = new Button("Notes");
        panel.add(notesBtn);

        Button settingsBtn = new Button("Settings");
        panel.add(settingsBtn);
        // if you wish you can change the size of the panel
        // panel.setPreferredSize(new Dimension(200, 60));
        // finally, draw the frame on screen
        window.setVisible(true);
    }

}

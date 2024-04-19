package com.firstwindow01;

import javax.swing.SwingUtilities;


public class Launcher {

    public static void main(String[] args){
        // run this program on event dispatch thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow main = new MainWindow();
                main.show();
            }
        });
    }

}

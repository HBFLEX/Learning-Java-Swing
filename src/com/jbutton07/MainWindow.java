package com.jbutton07;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MainWindow {
    private JFrame window;
    private JPanel panel;

    public MainWindow(){
        initialize();
    }

    private void initialize(){
        this.window = new JFrame();
        this.window.setLayout(new BorderLayout());
        this.window.setTitle("JButton application");
        this.window.setSize(500, 500);
        this.window.setLocationRelativeTo(null);
        this.window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        this.panel = new JPanel();
        this.panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        // creating a button with different properties
        JButton btn = createButton("Print");
        this.panel.add(btn);

        this.window.add(panel);
    }

    private JButton createButton(String btnName){
        JButton btn = new JButton(btnName);
        // remove the dotted focused lines
        btn.setFocusable(false);
        // setting the button size
        btn.setPreferredSize(new Dimension(200, 50));
        // setting the button icon
        ImageIcon icon = new ImageIcon("print.png");
        btn.setIcon(icon);
        // set the text toootip
        btn.setToolTipText("Print 2 papers");
        // set the text and icon gap
        btn.setIconTextGap(8);
        // set the text direction
        btn.setHorizontalTextPosition(SwingConstants.LEFT);
        btn.setVerticalTextPosition(SwingConstants.CENTER);
        // set btn action event listeners
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Print button clicked");
            }
        });
        // automatic programmed button click
        btn.doClick();
        // set button font
        btn.setFont(new Font(Font.SERIF, Font.BOLD, 25));
        // bind key event
        btn.setMnemonic(KeyEvent.VK_P);
        return btn;
    }

    public void show(){
        this.window.setVisible(true);
    }
}

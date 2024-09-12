package OpenNewWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton myButton = new JButton("New window");

    public LaunchPage(){

        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.add(myButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        frame.dispose();// create only one window

        if(e.getSource() == myButton){
            frame.dispose();// create only one window (close main page)
            NewWindow newWindow = new NewWindow();
        }
    }
}

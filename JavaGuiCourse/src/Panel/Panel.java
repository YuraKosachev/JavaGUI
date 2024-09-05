package Panel;

import javax.swing.*;
import java.awt.*;

public class Panel {
    public static void main(String[] args) {
        // JPanel = a GUI component that functions as a container to hold other components
        ImageIcon icon = new ImageIcon("calculate-icon-1.png");
        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.TOP);// use with border layuot
        label.setHorizontalAlignment(JLabel.LEFT); // use with border layout

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);

        greenPanel.setLayout(new BorderLayout());

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setLayout(null);
        frame.setVisible(true);
        //redPanel.add(label);
        // bluePanel.add(label);
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}

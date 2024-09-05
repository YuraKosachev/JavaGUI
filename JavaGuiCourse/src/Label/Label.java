package Label;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Label {
    public static void main(String[] args) {
        //JLabel = a GUI display area for a string of text, an image, or both
        ImageIcon image = new ImageIcon("dude.jpg");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel();
        label.setText("Label text");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.BLUE);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setIconTextGap(10);

        label.setBackground(Color.BLACK);
        label.setOpaque(true);

        label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(0, 0,250,250); // set x, y position within frame as well as dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500, 500);
        //frame.setLayout(null); // use witn setBounds
        frame.setVisible(true);
        frame.add(label);
        frame.pack();// add components before use pack
    }
}

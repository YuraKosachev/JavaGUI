import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        //JFrame frame = new JFrame();
        this.setTitle("JFrame title goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420,420);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("calculate-icon-1.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.GREEN); // background color new Color(0,255,0) rgb
    }
}

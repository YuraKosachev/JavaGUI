package BorderLayout;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new BorderLayout(10,10));// border h 10 border v 10
        this.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.blue);
        panel4.setBackground(Color.yellow);
        panel5.setBackground(Color.orange);

        Dimension dimension = new Dimension(100,100);
        panel1.setPreferredSize(dimension);
        panel2.setPreferredSize(dimension);
        panel3.setPreferredSize(dimension);
        panel4.setPreferredSize(dimension);
        panel5.setPreferredSize(dimension);

        //----------- sub panels -------------
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.black);
        panel7.setBackground(Color.darkGray);
        panel8.setBackground(Color.magenta);
        panel9.setBackground(Color.gray);
        panel10.setBackground(Color.white);

        panel5.setLayout(new BorderLayout());

        Dimension subDimension = new Dimension(50,50);
        panel6.setPreferredSize(subDimension);
        panel7.setPreferredSize(subDimension);
        panel8.setPreferredSize(subDimension);
        panel9.setPreferredSize(subDimension);
        panel10.setPreferredSize(subDimension);

        panel5.add(panel6,BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.WEST);
        panel5.add(panel8,BorderLayout.EAST);
        panel5.add(panel9,BorderLayout.SOUTH);
        panel5.add(panel10,BorderLayout.CENTER);

        //
        this.add(panel1,BorderLayout.NORTH);
        this.add(panel2,BorderLayout.WEST);
        this.add(panel3,BorderLayout.EAST);
        this.add(panel4,BorderLayout.SOUTH);
        this.add(panel5,BorderLayout.CENTER);
    }
}

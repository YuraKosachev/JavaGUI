package Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Format;

public class CustomFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    public CustomFrame(){

        ImageIcon icon = new ImageIcon("home.png");
        this.button = new JButton();
        this.button.setIcon(icon);

        this.button.setHorizontalTextPosition(JButton.CENTER);
        this.button.setVerticalTextPosition(JButton.BOTTOM);
        this.button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        this.button.setIconTextGap(-20);
        this.button.setForeground(Color.cyan);
        this.button.setBackground(Color.RED);
        this.button.setBorder(BorderFactory.createEtchedBorder());
        //this.button.setEnabled(false);

        this.button.addActionListener(this); // or use lambda e -> System.out.println()
        this.button.setBounds(100,100,250,50);
        this.button.setText("I'm a buttom");
        this.button.setFocusable(false);

        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(150,250,150,150);
        label.setVisible(true);


        this.setTitle("Custom frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(420,420);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource() == button){

         label.setText(label.getText() + " Boom");
     }
    }
}

package TextFields;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JTextField textField;
    JButton button;
    public MyFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 35));
        button = new JButton("Submit");
        button.addActionListener(this);

        add(button);
        add(textField);
        pack();
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button){
            System.out.println("Welcome "+textField);
        }
    }
}

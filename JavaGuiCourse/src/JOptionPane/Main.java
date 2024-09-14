package JOptionPane;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //JOptionPane = pop up a standard dialog box that prompts users for a value
        // or informs them of something


        //JOptionPane.showMessageDialog(null,"This is some useles info", "info", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Here is some useles info", "info", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"IS here any useles info?", "question", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"You're computer has  A VIRUS!!", "warning", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null,"You have an error", "error", JOptionPane.ERROR_MESSAGE);

        //JOptionPane.showConfirmDialog(null, "Bro? do you even code?", "this my title", JOptionPane.YES_NO_CANCEL_OPTION);
        //int answer = JOptionPane.showConfirmDialog(null, "Bro? do you even code?", "this my title", JOptionPane.YES_OPTION);

        //System.out.println(answer);

        //String name = JOptionPane.showInputDialog("What is your name?:");
        ImageIcon icon = new ImageIcon("");
        String[] responses = {"No, you're awesome!", "Tjank you!","*blush*"};
        JOptionPane.showOptionDialog(null,
                "You are awesomw!!",
                "secret message",JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null, // set icon here
                responses,
                0);
    }
}

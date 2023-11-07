package GUIForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWord {



    public HelloWord() {
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }





    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloWord");
        frame.setContentPane(new HelloWord().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(550,450,500,300);
    }

    private JPanel panel1;
    private JButton button1;
    private JButton button2;
}


package PreparacionExamen2.controller;

import PreparacionExamen2.model.GUIPrincipal;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUIPrincipal");
        frame.setUndecorated(true);
        frame.setContentPane(new GUIPrincipal().PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setBounds(500,100,500,400);
        frame.setVisible(true);
        frame.setResizable(false);

    }
}

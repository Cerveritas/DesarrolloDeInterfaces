package hundirLaFlota.controller;

import hundirLaFlota.model.PAGPrincipal;

import javax.swing.*;

public class main {


    public static void main(String[] args) {
        JFrame frame = new JFrame("GUImainFOR");
        frame.setUndecorated(true);
        frame.setContentPane(new PAGPrincipal().PanelPrincipalInicio);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(800,300,500,500);

    }
}

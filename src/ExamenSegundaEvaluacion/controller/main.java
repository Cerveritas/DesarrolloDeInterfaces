package ExamenSegundaEvaluacion.controller;

import ExamenSegundaEvaluacion.model.GUIPrincipal;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUIPrincipal");
        frame.setUndecorated(true);
        frame.setBounds(700,200,100,900);
        frame.setContentPane(new GUIPrincipal().PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

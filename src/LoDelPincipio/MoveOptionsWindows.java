package LoDelPincipio;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MoveOptionsWindows {
    public static void main(String[] args) {


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 200, 520, 400);

        JPanel panelPrincipal = new JPanel(new GridBagLayout());







        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> listaNombres = new JList<>(listModel);
        panelPrincipal.add(listaNombres, new GridBagConstraints(0, 2, 0, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(5, 0, 0, 10), 0, 0));




        ScrollPane scrollPaneIZQ = new ScrollPane();
            scrollPaneIZQ.add(listaNombres);
                panelPrincipal.add(scrollPaneIZQ, new GridBagConstraints(0, 0, 0, 0, 1, 0, GridBagConstraints.WEST, GridBagConstraints.WEST, new Insets(0, 15, 0, 15), 0, 0));
                scrollPaneIZQ.setPreferredSize(new Dimension(180, 200));

        ScrollPane scrollPaneDER = new ScrollPane();
        scrollPaneDER.add(listaNombres);
        panelPrincipal.add(scrollPaneDER, new GridBagConstraints(0, 0, 0, 0, 1, 0, GridBagConstraints.EAST, GridBagConstraints.EAST, new Insets(0, 15, 0, 15), 0, 0));
        scrollPaneDER.setPreferredSize(new Dimension(180, 200));




        JButton botonDERDER = new JButton(">>");
            panelPrincipal.add(botonDERDER, new GridBagConstraints(2, 0, 0, 1, 1.0, 0, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 0), 0, 0));


        JButton botonDER = new JButton(" >");
            panelPrincipal.add(botonDER, new GridBagConstraints(2, 1, 0, 1, 1.0, 0, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 0), 0, 0));


        JButton botonIZQ = new JButton("< ");
        panelPrincipal.add(botonIZQ, new GridBagConstraints(2, 2, 0, 1, 1.0, 0, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 0), 0, 0));


        JButton botonIZQIZQ = new JButton("<<");
        panelPrincipal.add(botonIZQIZQ, new GridBagConstraints(2, 3, 0, 1, 1.0, 0, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 0), 0, 0));



        /*
        JLabel textIZQ = new JLabel("Disponibles:");
            panelPrincipal.add(textIZQ);

*/



        frame.add(panelPrincipal);
        frame.setVisible(true);
        frame.setResizable(true);


    }
}













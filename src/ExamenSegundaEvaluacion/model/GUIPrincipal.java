package ExamenSegundaEvaluacion.model;

import ExamenSegundaEvaluacion.view.GUIMostrarImagenes6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIPrincipal {

    public JPanel PanelPrincipal;
    private JPanel PanelImagenes;
    private JPanel PanelOpciones;
    private JMenuBar menuBarPrincipal;
    private JMenu NAVEGACIONMenu;
    private JMenu BUSCARMenu;
    private JMenu FAVORITOSMenu;
    private JMenuItem naturalezaMenuItem;
    private JMenuItem tecnologiaMenuItem;
    private JMenuItem arteMenuItem;
    private JMenuItem soloFavoritosMenuItem;
    private JButton xButton;
    private JButton button1;
    private JButton button2;
    private JButton button5;
    private JButton button6;
    private JButton button4;
    private JButton button3;
    private JMenuItem restaurarMenuItem;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JRadioButton radioButton5;
    private JRadioButton radioButton6;
    private JMenuItem mostrarTodoMenuItem;
    private JMenuItem buscarMenuItem;


    public GUIPrincipal() {

        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });




        // USO DE NAVEGACION

        button1.setVisible(true);
        button2.setVisible(true);
        button3.setVisible(true);
        button4.setVisible(true);
        button5.setVisible(true);
        button6.setVisible(true);




        naturalezaMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setVisible(true);
                button2.setVisible(true);
                button3.setVisible(false);
                button4.setVisible(false);
                button5.setVisible(false);
                button6.setVisible(false);
                radioButton1.setVisible(false);
                radioButton2.setVisible(false);
                radioButton3.setVisible(false);
                radioButton4.setVisible(false);
                radioButton5.setVisible(false);
                radioButton6.setVisible(false);
            }
        });

        tecnologiaMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setVisible(false);
                button2.setVisible(false);
                button3.setVisible(true);
                button4.setVisible(true);
                button5.setVisible(false);
                button6.setVisible(false);
                radioButton1.setVisible(false);
                radioButton2.setVisible(false);
                radioButton3.setVisible(false);
                radioButton4.setVisible(false);
                radioButton5.setVisible(false);
                radioButton6.setVisible(false);
            }
        });

        arteMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setVisible(false);
                button2.setVisible(false);
                button3.setVisible(false);
                button4.setVisible(false);
                button5.setVisible(true);
                button6.setVisible(true);
                radioButton1.setVisible(false);
                radioButton2.setVisible(false);
                radioButton3.setVisible(false);
                radioButton4.setVisible(false);
                radioButton5.setVisible(false);
                radioButton6.setVisible(false);
            }
        });

        restaurarMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setVisible(true);
                button2.setVisible(true);
                button3.setVisible(true);
                button4.setVisible(true);
                button5.setVisible(true);
                button6.setVisible(true);
                radioButton1.setVisible(true);
                radioButton2.setVisible(true);
                radioButton3.setVisible(true);
                radioButton4.setVisible(true);
                radioButton5.setVisible(true);
                radioButton6.setVisible(true);
            }
        });

        // FUNCIONALIDAD DE CADA BOTON (imagen)

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("GUIMostrarImagenes");
                frame.setContentPane(new GUIMostrarImagenes().PanelPrincipal);
                frame.setBounds(700,200,500,500);
                frame.pack();
                frame.setVisible(true);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("GUIMostrarImagenes2");
                frame.setContentPane(new GUIMostrarImagenes2().PanelPrincipal);
                frame.setBounds(700,200,500,500);
                frame.pack();
                frame.setVisible(true);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("GUIMostrarImagenes3");
                frame.setContentPane(new GUIMostrarImagenes3().PanelPrincipal);
                frame.setBounds(700,200,500,500);
                frame.pack();
                frame.setVisible(true);
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("GUIMostrarImagenes4");
                frame.setContentPane(new GUIMostrarImagenes4().PanelPrincipal);
                frame.setBounds(700,200,500,500);
                frame.pack();
                frame.setVisible(true);
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("GUIMostrarImagenes5");
                frame.setContentPane(new GUIMostrarImagenes5().PanelPrincipal);
                frame.setBounds(700,200,500,500);
                frame.pack();
                frame.setVisible(true);
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("GUIMostrarImagenes6");
                frame.setContentPane(new GUIMostrarImagenes6().PanelPrincipal);
                frame.setBounds(700,200,500,500);
                frame.pack();
                frame.setVisible(true);
            }
        });


        // USO DE FAVORITOS

        soloFavoritosMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                button1.setVisible(false);
                button2.setVisible(false);
                button3.setVisible(false);
                button4.setVisible(false);
                button5.setVisible(false);
                button6.setVisible(false);
                radioButton1.setVisible(false);
                radioButton2.setVisible(false);
                radioButton3.setVisible(false);
                radioButton4.setVisible(false);
                radioButton5.setVisible(false);
                radioButton6.setVisible(false);

                if (radioButton1.isSelected()){
                    button1.setVisible(true);
                    radioButton1.setVisible(false);
                    radioButton2.setVisible(false);
                    radioButton3.setVisible(false);
                    radioButton4.setVisible(false);
                    radioButton5.setVisible(false);
                    radioButton6.setVisible(false);
                }
                if (radioButton2.isSelected()){
                    button2.setVisible(true);
                    radioButton1.setVisible(false);
                    radioButton2.setVisible(false);
                    radioButton3.setVisible(false);
                    radioButton4.setVisible(false);
                    radioButton5.setVisible(false);
                    radioButton6.setVisible(false);
                }
                if (radioButton3.isSelected()){
                    button3.setVisible(true);
                    radioButton1.setVisible(false);
                    radioButton2.setVisible(false);
                    radioButton3.setVisible(false);
                    radioButton4.setVisible(false);
                    radioButton5.setVisible(false);
                    radioButton6.setVisible(false);
                }
                if (radioButton4.isSelected()){
                    button4.setVisible(true);
                    radioButton1.setVisible(false);
                    radioButton2.setVisible(false);
                    radioButton3.setVisible(false);
                    radioButton4.setVisible(false);
                    radioButton5.setVisible(false);
                    radioButton6.setVisible(false);
                }
                if (radioButton5.isSelected()){
                    button5.setVisible(true);
                    radioButton1.setVisible(false);
                    radioButton2.setVisible(false);
                    radioButton3.setVisible(false);
                    radioButton4.setVisible(false);
                    radioButton5.setVisible(false);
                    radioButton6.setVisible(false);
                }
                if (radioButton6.isSelected()) {
                    button6.setVisible(true);
                    radioButton1.setVisible(false);
                    radioButton2.setVisible(false);
                    radioButton3.setVisible(false);
                    radioButton4.setVisible(false);
                    radioButton5.setVisible(false);
                    radioButton6.setVisible(false);
                }
            }
        });

        mostrarTodoMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                radioButton1.setVisible(true);
                radioButton2.setVisible(true);
                radioButton3.setVisible(true);
                radioButton4.setVisible(true);
                radioButton5.setVisible(true);
                radioButton6.setVisible(true);

                button1.setVisible(true);
                button2.setVisible(true);
                button3.setVisible(true);
                button4.setVisible(true);
                button5.setVisible(true);
                button6.setVisible(true);
            }
        });

        // USO DE BUSCAR
        buscarMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(PanelPrincipal, "OPCION DE MENU BUSCAR EN BETA...");
            }
        });






    }


}

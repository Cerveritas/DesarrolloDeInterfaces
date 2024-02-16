package undirLaFlota.model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUImainFOR {
    public JPanel PanelPrincipal;
    private JPanel PanelEnemigo;
    private JPanel PanelMio;
    private JPanel PanelBotones;
    private JButton RESETButton;
    private JButton FORMACION1Button;
    private JButton FORMACION2Button;
    private JButton FORMACION3Button;
    private JPanel Panelmagenes;
    private JButton buttonFRAGATA;
    private JButton buttonPATERA;
    private JButton buttonPORTAVIONES;
    private JButton buttonACORAZADO;
    private JButton buttonSUBMARINO;
    private JButton buttonDESTRUCTOR;
    private JLabel ACORAZADOLabel;
    private JLabel DESTRUCTORLabel;
    private JLabel PATERALabel;
    private JLabel FRAGATALabel;
    private JLabel PORTAVIONESLabel;
    private JLabel SUBMARINOLabel;
    private JButton[][] botones;

    private final String COLORBARCOS = "#AB25E5";



    public GUImainFOR() {
        botonesTableroEnemigo();
        botonesTableroMio();

        FORMACION1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Primero limpiamos lo anteiror
                for (int i = 0; i < 20; i++){
                    for (int j = 0; j < 20; j++){
                        botones[i][j].setBackground(Color.blue);
                    }
                }

                // ACORAZADO
                for (int i = 2; i <= 8; i++){
                    botones[3][i].setBackground(Color.decode(COLORBARCOS));
                }
                // SUBMARINO
                for (int i = 4; i <= 8; i++){
                    botones[9][i].setBackground(Color.decode(COLORBARCOS));
                }
                // DESTRUCTOR
                for (int i = 12; i <= 17; i++){
                    botones[3][i].setBackground(Color.decode(COLORBARCOS));
                }
                // PATERA
                for (int i = 0; i <= 1; i++){
                    botones[19][i].setBackground(Color.decode(COLORBARCOS));
                }
                // PORTAVIONES
                for (int i = 7; i <= 10; i++){
                    botones[17][i].setBackground(Color.decode(COLORBARCOS));
                }
                // FRAGATA
                for (int i = 5; i <= 7; i++){
                    botones[15][i].setBackground(Color.decode(COLORBARCOS));
                }
            }
        });

        FORMACION2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Primero limpiamos lo anteiror
                for (int i = 0; i < 20; i++){
                    for (int j = 0; j < 20; j++){
                        botones[i][j].setBackground(Color.blue);
                    }
                }

                // ACORAZADO
                for (int i = 2; i <= 8; i++){
                    botones[i][3].setBackground(Color.decode(COLORBARCOS));
                }
                // SUBMARINO
                for (int i = 4; i <= 8; i++){
                    botones[i][9].setBackground(Color.decode(COLORBARCOS));
                }
                // DESTRUCTOR
                for (int i = 12; i <= 17; i++){
                    botones[i][3].setBackground(Color.decode(COLORBARCOS));
                }
                // PATERA
                for (int i = 0; i <= 1; i++){
                    botones[i][19].setBackground(Color.decode(COLORBARCOS));
                }
                // PORTAVIONES
                for (int i = 7; i <= 10; i++){
                    botones[i][17].setBackground(Color.decode(COLORBARCOS));
                }
                // FRAGATA
                for (int i = 5; i <= 7; i++){
                    botones[i][15].setBackground(Color.decode(COLORBARCOS));
                }
            }
        });

        FORMACION3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Primero limpiamos lo anteiror
                for (int i = 0; i < 20; i++){
                    for (int j = 0; j < 20; j++){
                        botones[i][j].setBackground(Color.blue);
                    }
                }

                // ACORAZADO
                for (int i = 2; i <= 8; i++){
                    botones[i][3].setBackground(Color.decode(COLORBARCOS));
                }
                // SUBMARINO
                for (int i = 4; i <= 8; i++){
                    botones[9][i].setBackground(Color.decode(COLORBARCOS));
                }
                // DESTRUCTOR
                for (int i = 12; i <= 17; i++){
                    botones[i][3].setBackground(Color.decode(COLORBARCOS));
                }
                // PATERA
                for (int i = 0; i <= 1; i++){
                    botones[19][i].setBackground(Color.decode(COLORBARCOS));
                }
                // PORTAVIONES
                for (int i = 7; i <= 10; i++){
                    botones[i][17].setBackground(Color.decode(COLORBARCOS));
                }
                // FRAGATA
                for (int i = 5; i <= 7; i++){
                    botones[15][i].setBackground(Color.decode(COLORBARCOS));
                }
            }
        });

        RESETButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 20; i++){
                    for (int j = 0; j < 20; j++){
                        botones[i][j].setBackground(Color.blue);
                    }
                }
            }
        });




        // ESTILO DE BARCOS
        buttonACORAZADO.setPreferredSize(new Dimension(250,20));
        buttonDESTRUCTOR.setPreferredSize(new Dimension(200,20));
        buttonSUBMARINO.setPreferredSize(new Dimension(150,20));
        buttonPORTAVIONES.setPreferredSize(new Dimension(100,20));
        buttonFRAGATA.setPreferredSize(new Dimension(50,20));
        buttonPATERA.setPreferredSize(new Dimension(50,30));

        // MENSAJE DE LOS BARCOS
        buttonACORAZADO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(PanelPrincipal, "EL ACORAZADO OCUPA --> 7 ESPACIOS");
            }
        });

        buttonDESTRUCTOR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(PanelPrincipal, "EL DESTRUCTOR OCUPA --> 6 ESPACIOS");
            }
        });

        buttonSUBMARINO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(PanelPrincipal, "EL SUBMARINO OCUPA --> 5 ESPACIOS");
            }
        });

        buttonPORTAVIONES.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(PanelPrincipal, "EL PORTAVIONES OCUPA --> 4 ESPACIOS");
            }
        });

        buttonFRAGATA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(PanelPrincipal, "LA FRAGATA OCUPA --> 3 ESPACIOS");
            }
        });

        buttonPATERA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(PanelPrincipal, "LA PATERA OCUPA --> 2 ESPACIOS");
            }
        });



    }







    // METODOS TABLERO
    public void botonesTableroEnemigo(){
        botones = new JButton[20][20];
        PanelEnemigo.setLayout(new GridLayout(20,20));
        for (int i = 0; i < 20; i++){
            for (int j = 0; j< 20; j++){
                botones[i][j] = new JButton();
                botones[i][j].setBackground(Color.blue);
                PanelEnemigo.add(botones[i][j], i,j);
            }
        }
    }

    public void botonesTableroMio(){
        botones = new JButton[20][20];
        PanelMio.setLayout(new GridLayout(20,20));
        for (int i = 0; i < 20; i++){
            for (int j = 0; j< 20; j++){
                botones[i][j] = new JButton();
                botones[i][j].setBackground(Color.blue);
                PanelMio.add(botones[i][j], i,j);
            }
        }
    }











}

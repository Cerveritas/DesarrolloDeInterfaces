package hundirLaFlota.model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PAGPrincipal {

    public JPanel PanelPrincipalInicio;
    private JPanel FotoPanel;
    private JPanel TituloPanel;
    private JLabel barcoLabel;
    private JButton JUGARButton;
    private JLabel theShipLabel;
    private JLabel añoLabel;
    private JMenu ARCHIVOMenu;
    private JMenu OPCIONESMenu;
    private JMenuBar MenuBar;
    private JMenuItem cerrarMenuItem;
    private JMenuItem ColorMenuItem;
    private JMenuItem pantallaCompletaMenuItem;
    public JTextField nombreText;
    private JLabel NOMBREDECAPITANLabel;
    private JMenu AÑOMenu;
    private JMenuItem año12AcMenuItem;
    private JMenuItem año1920MenuItem;
    private JMenuItem año2029MenuItem;
    private boolean ColorOriginal;



    public PAGPrincipal() {

        //Quitar la barra superior



        /*JUGARButton.setBorder(bordeRedondeado);*/
        JUGARButton.setPreferredSize(new Dimension(250,20));

        JUGARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                // Configura las propiedades del nuevo JFrame
                JFrame frame = new JFrame("GUImainFOR");
                frame.setUndecorated(true);
                frame.setContentPane(new GUImainFOR().PanelPrincipal);
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setBounds(500,200,1000,700);


                // Hace visible el nuevo JFrame
                frame.setVisible(true);



            }
        });


        cerrarMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        ColorMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (ColorOriginal){
                    FotoPanel.setBackground(Color.decode("#A4A4A4"));
                    MenuBar.setBackground(Color.decode("#302C3C"));
                    TituloPanel.setBackground(Color.decode("#A4A4A4"));
                    JUGARButton.setBackground(Color.decode("#302C3C"));
                    JUGARButton.setForeground(Color.decode("#4CB1FF"));

                    ColorOriginal = false;
                } else {
                    FotoPanel.setBackground(Color.cyan);
                    MenuBar.setBackground(Color.white);
                    TituloPanel.setBackground(Color.cyan);
                    JUGARButton.setBackground(Color.WHITE);
                    JUGARButton.setForeground(Color.BLACK);

                    ColorOriginal = true;
                }


            }
        });

        pantallaCompletaMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame ventana = (JFrame) SwingUtilities.getWindowAncestor(OPCIONESMenu);

                if (ventana.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
                    ventana.setExtendedState(JFrame.NORMAL);
                } else {
                    ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
                }
            }
        });


        nombreText.getText();


        año12AcMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                añoLabel.setText("12A.C");
            }
        });

        año1920MenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                añoLabel.setText("1920");
            }
        });

        año2029MenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                añoLabel.setText("2029");
            }
        });



    }
}

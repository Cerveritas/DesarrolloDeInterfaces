package EditorDeImagenes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class editorGUI {
    private JPanel PanelPrincipal;
    private JLabel IMAGENLabel;
    private JButton CONVERTIRButton;
    private JSlider slider1;
    private JSlider slider2;
    private JLabel NIVELDECONTRASTELabel;
    private JLabel NIVELDEBRILLOLabel;
    private JPanel PanelSlider;
    private JPanel PanelImagen;
    private JButton ButtonLinea;
    private JButton ButtonCuadrado;
    private JButton ButtonX;
    private JPanel PanelMenus;
    private JMenuBar MenuBar;
    private JMenu archivoMenu;
    private JMenu efectosMenu;
    private JMenuItem ABRIRMenuItem;
    private JMenuItem GUARDARMenuItem;
    private JMenuItem CERRARMenuItem;
    private JMenuItem originalMenuItem;
    private JMenuItem altoContrasteMenuItem;
    private JMenuItem bajaResolucionMenuItem;
    private JMenuItem blancoYNegroMenuItem;
    private JMenuItem escalaDeGrisesMenuItem;
    private JMenuItem convertirIconoMenuItem;
    private JMenuItem pixeladaMenuItem;
    private JMenuItem sepiaMenuItem;


    public static void main(String[] args) {
        JFrame frame = new JFrame("editorGUI");
        frame.setUndecorated(true);
        frame.setContentPane(new editorGUI().PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(500,100,900,500);
    }


    public editorGUI() {

        // Quitar opciones visuales de botones

        ButtonX.setFocusPainted(false);


        //ButtonCuadrado.setBorder(null);
        ButtonCuadrado.setFocusPainted(false);

        //ButtonLinea.setBorder(null);
        ButtonCuadrado.setFocusPainted(false);



        // ACCIONES DE BOTONES
        ButtonX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });








    }
}



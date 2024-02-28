package PreparacionExamen2.model;

import PreparacionExamen2.properties.Propiedades;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Properties;

public class GUIPrincipal {
    public JPanel PanelPrincipal;
    private JButton verImagenButton;
    private JLabel imagenLabel;
    private JMenuBar MenuBarPrinicipal;
    private JMenu ARCHIVOMenu;
    private JMenu ALGOMenu;
    private JMenuItem abrirMenuItem;
    private JMenuItem salirMenuItem;
    private JComboBox comboBox1;

    public JFileChooser selectorImagen = new JFileChooser();




    public GUIPrincipal() {


        salirMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idiomaSeleccionado = comboBox1.getSelectedItem().toString();


                switch (idiomaSeleccionado){
                    case "Español":
                        cargarIdioma("spanish");
                        break;

                    case "Ingles":
                        cargarIdioma("english");
                        break;

                    default:
                        System.out.println("Fuera de rangos de idiomas");
                }


            }
        });


        abrirMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirImagen();
            }
        });


        verImagenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("GUIverImagen");
                frame.setContentPane(new GUIverImagen().PanelPrincipal);

                frame.pack();
                frame.setVisible(true);
            }
        });







    }

    private void abrirImagen(){
        int resultado = selectorImagen.showOpenDialog(null);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivoImangen = selectorImagen.getSelectedFile();

            ImageIcon imageIcon = new ImageIcon(archivoImangen.getAbsolutePath());
            imagenLabel.setIcon(imageIcon);
        }
    }

    public void cargarIdioma(String idioma){


        Properties properties = new Propiedades(idioma);

        abrirMenuItem.setText(properties.getProperty("Abrir"));
        salirMenuItem.setText(properties.getProperty("Salir"));
        verImagenButton.setText(properties.getProperty("Verimagen"));





    }


}




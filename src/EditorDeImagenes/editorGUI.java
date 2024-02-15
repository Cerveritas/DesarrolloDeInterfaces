package EditorDeImagenes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class editorGUI  {
    private JPanel PanelPrincipal;
    private JLabel IMAGENLabel;
    private JButton CONVERTIRButton;
    private JSlider slider1;
    private JSlider slider2;
    private JLabel parametro1Label;
    private JLabel parametro2Label;
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
    private JPanel panelBtotonesFunciones;
    private JButton buttonImagen;
    private JSlider slider3;
    private JSlider slider4;
    private JSlider slider5;
    private JSlider slider6;
    private JSlider slider7;
    private JLabel parametro3Label;
    private JLabel parametro4Label;
    private JLabel parametro5Label;
    private JLabel parametro6Label;
    private JLabel parametro7Label;


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

        // MENSAJE DE AYUDA INICIO APP
        JOptionPane.showMessageDialog(PanelPrincipal, "Para visualizar IMAGEN: archivo --> abrir\n" +
                "Para ver parametros seleccionar efectos");

        // Quitar opciones visuales de botones
        ButtonX.setFocusPainted(false);


        //ButtonCuadrado.setBorder(null);
        ButtonCuadrado.setFocusPainted(false);


        // TEXTO EN BOTONES
        ButtonCuadrado.setToolTipText("Maximizar");
        ButtonLinea.setToolTipText("Minimizar");
        ButtonX.setToolTipText("Salir");
        CONVERTIRButton.setToolTipText("Convertir");



        // ACCIONES DE BOTONES
        ButtonX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        ButtonLinea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame ventana = (JFrame) SwingUtilities.getWindowAncestor(ButtonLinea);
                ventana.setExtendedState(JFrame.ICONIFIED);
            }
        });

        ButtonCuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame ventana = (JFrame) SwingUtilities.getWindowAncestor(ButtonLinea);

                if (ventana.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
                    ventana.setExtendedState(JFrame.NORMAL);
                } else {
                    ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
                }

            }
        });


        buttonImagen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(PanelPrincipal, "EN MANTENIMIENTO..." +
                        "Funcion de imprimir muy pronto...");

            }
        });

        CERRARMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        GUARDARMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser explorador = new JFileChooser();
                explorador.setFileSelectionMode(JFileChooser.FILES_ONLY);
                explorador.setCurrentDirectory(new File("/ruta/al/directorio/inicial"));

                int seleccion = explorador.showSaveDialog(null);

                if (seleccion == JFileChooser.APPROVE_OPTION) {
                    File archivo = explorador.getSelectedFile();

                    try {
                        // Crea un objeto FileWriter para escribir en el archivo.
                        FileWriter escritor = new FileWriter(archivo);

                        // Escribe el contenido que deseas guardar en el archivo.
                        escritor.write(buttonImagen.getText());

                        // Cierra el objeto FileWriter para guardar los cambios.
                        escritor.close();

                        // Muestra un mensaje de confirmación al usuario.
                        JOptionPane.showMessageDialog(null, "Archivo guardado correctamente!");
                    } catch (IOException ex) {
                        // Maneja la excepción de escritura en el archivo.
                        JOptionPane.showMessageDialog(null, "Error al guardar el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });


        buttonImagen.setVisible(false);
        ABRIRMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonImagen.setVisible(true);
            }
        });



        // ACCIONES DE EFECTOS

        parametro1Label.setVisible(false);
        parametro2Label.setVisible(false);
        parametro3Label.setVisible(false);
        parametro4Label.setVisible(false);
        parametro5Label.setVisible(false);
        parametro6Label.setVisible(false);
        parametro7Label.setVisible(false);

        slider1.setVisible(false);
        slider2.setVisible(false);
        slider3.setVisible(false);
        slider4.setVisible(false);
        slider5.setVisible(false);
        slider6.setVisible(false);
        slider7.setVisible(false);


        originalMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parametro1Label.setVisible(false);
                parametro2Label.setVisible(false);
                parametro3Label.setVisible(false);
                parametro4Label.setVisible(false);
                parametro5Label.setVisible(false);
                parametro6Label.setVisible(false);
                parametro7Label.setVisible(false);

                slider1.setVisible(false);
                slider2.setVisible(false);
                slider3.setVisible(false);
                slider4.setVisible(false);
                slider5.setVisible(false);
                slider6.setVisible(false);
                slider7.setVisible(false);
            }
        });



        altoContrasteMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parametro1Label.setVisible(true);
                parametro2Label.setVisible(false);
                parametro3Label.setVisible(false);
                parametro4Label.setVisible(false);
                parametro5Label.setVisible(false);
                parametro6Label.setVisible(false);
                parametro7Label.setVisible(false);

                slider1.setVisible(true);
                slider2.setVisible(false);
                slider3.setVisible(false);
                slider4.setVisible(false);
                slider5.setVisible(false);
                slider6.setVisible(false);
                slider7.setVisible(false);
            }
        });

        bajaResolucionMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parametro1Label.setVisible(true);
                parametro2Label.setVisible(true);
                parametro3Label.setVisible(false);
                parametro4Label.setVisible(false);
                parametro5Label.setVisible(false);
                parametro6Label.setVisible(false);
                parametro7Label.setVisible(false);

                slider1.setVisible(true);
                slider2.setVisible(true);
                slider3.setVisible(false);
                slider4.setVisible(false);
                slider5.setVisible(false);
                slider6.setVisible(false);
                slider7.setVisible(false);
            }
        });

        blancoYNegroMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parametro1Label.setVisible(true);
                parametro2Label.setVisible(true);
                parametro3Label.setVisible(true);
                parametro4Label.setVisible(false);
                parametro5Label.setVisible(false);
                parametro6Label.setVisible(false);
                parametro7Label.setVisible(false);

                slider1.setVisible(true);
                slider2.setVisible(true);
                slider3.setVisible(true);
                slider4.setVisible(false);
                slider5.setVisible(false);
                slider6.setVisible(false);
                slider7.setVisible(false);
            }
        });

        escalaDeGrisesMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parametro1Label.setVisible(true);
                parametro2Label.setVisible(true);
                parametro3Label.setVisible(true);
                parametro4Label.setVisible(true);
                parametro5Label.setVisible(false);
                parametro6Label.setVisible(false);
                parametro7Label.setVisible(false);

                slider1.setVisible(true);
                slider2.setVisible(true);
                slider3.setVisible(true);
                slider4.setVisible(true);
                slider5.setVisible(false);
                slider6.setVisible(false);
                slider7.setVisible(false);
            }
        });

        convertirIconoMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parametro1Label.setVisible(true);
                parametro2Label.setVisible(true);
                parametro3Label.setVisible(true);
                parametro4Label.setVisible(true);
                parametro5Label.setVisible(true);
                parametro6Label.setVisible(false);
                parametro7Label.setVisible(false);

                slider1.setVisible(true);
                slider2.setVisible(true);
                slider3.setVisible(true);
                slider4.setVisible(true);
                slider5.setVisible(true);
                slider6.setVisible(false);
                slider7.setVisible(false);
            }
        });

        pixeladaMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parametro1Label.setVisible(true);
                parametro2Label.setVisible(true);
                parametro3Label.setVisible(true);
                parametro4Label.setVisible(true);
                parametro5Label.setVisible(true);
                parametro6Label.setVisible(true);
                parametro7Label.setVisible(false);

                slider1.setVisible(true);
                slider2.setVisible(true);
                slider3.setVisible(true);
                slider4.setVisible(true);
                slider5.setVisible(true);
                slider6.setVisible(true);
                slider7.setVisible(false);
            }
        });

        sepiaMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parametro1Label.setVisible(true);
                parametro2Label.setVisible(true);
                parametro3Label.setVisible(true);
                parametro4Label.setVisible(true);
                parametro5Label.setVisible(true);
                parametro6Label.setVisible(true);
                parametro7Label.setVisible(true);

                slider1.setVisible(true);
                slider2.setVisible(true);
                slider3.setVisible(true);
                slider4.setVisible(true);
                slider5.setVisible(true);
                slider6.setVisible(true);
                slider7.setVisible(true);
            }
        });


        altoContrasteMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Icon icoo = new ImageIcon("src/EditorDeImagenes/CostaAltoContraste.jpg");
                buttonImagen.setIcon(icoo);
            }
        });








    }









}



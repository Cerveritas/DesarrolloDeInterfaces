package MULTILENGUAGE;

import MULTILENGUAGE.Properties.Propiedades;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.CancellationException;

public class Form {


    public Form() throws Exception {


        botonRojoButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                CargarIdioma("english");






            }
        });



        // Cambios de idioma en un combobox con un switch
        comboBox1.addItem("Español");
        comboBox1.addItem("Ingles");

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String idiomaSeleccionado = comboBox1.getSelectedItem().toString();


                switch (idiomaSeleccionado) {
                    case "Español":
                        CargarIdioma("spanish");
                        break;

                    case "Ingles":
                        CargarIdioma("english");
                        break;

                    default:
                        System.out.println("Fuera de rangos de switch");
                }


            }
        });
    }


    private JLabel textoLabel;
    private JLabel holaLabel;
    private JLabel adiosLabel;
    private JButton botonRojoButton;
    private JPanel panelPrincipal;
    private JPanel panel1;
    private JComboBox comboBox1;


    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Form");
        frame.setContentPane(new Form().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);





    }






    public void CargarIdioma(String idioma) {


        Properties propiedades = new Propiedades(idioma);


        adiosLabel.setText(propiedades.getProperty("Adios"));
        holaLabel.setText(propiedades.getProperty("Hola"));
        textoLabel.setText(propiedades.getProperty("Texto"));

        botonRojoButton.setText(propiedades.getProperty("Boton_Rojo"));


    }
}









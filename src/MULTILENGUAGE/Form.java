package MULTILENGUAGE;

import MULTILENGUAGE.Properties.Propiedades;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

public class Form {


    public Form() throws Exception {


        botonRojoButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                CargarIdioma("english");






            }
        });
    }


    private JLabel textoLabel;
    private JLabel holaLabel;
    private JLabel adiosLabel;
    private JButton botonRojoButton;
    private JPanel panelPrincipal;
    private JPanel panel1;





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









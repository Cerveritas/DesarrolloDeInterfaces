package Tablas.PrimerTrabajo;

import Tablas.StudentTableModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        JFrame frame = new JFrame();
        JPanel panelMain = new JPanel();
        panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
        JPanel panelPrincipal = new JPanel();
        JPanel panelSecundario = new JPanel(new GridBagLayout());


        Persona p1 = new Persona("Prueba", "Estatica", "00000000A", "prueba@gmail.com", "xxxxxx");
        Persona p2 = new Persona("dfd", "ef", "fsdff", "dfsf", "ewfef");

        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(p1);
        personas.add(p2);


        JTable tablaPrincipal = new JTable(new ModeloTablaPersona(personas));

        tablaPrincipal.setPreferredScrollableViewportSize(new Dimension(700, 500));
        JScrollPane scrollPane = new JScrollPane(tablaPrincipal);


/********************************************************************************************************************************************************************************************************************/
        // ZONA DE BOTONES, LABELS, TEXTFIELD //


        //labels
        JLabel labelID = new JLabel("ID");
        panelSecundario.add(labelID, new GridBagConstraints(0, 0, 1, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 10), 0, 0));
        JLabel labelNOMBRE = new JLabel("NOMBRE");
        panelSecundario.add(labelNOMBRE, new GridBagConstraints(1, 0, 1, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 10), 0, 0));
        JLabel labelAPELLIDOS = new JLabel("APELLIDOS");
        panelSecundario.add(labelAPELLIDOS, new GridBagConstraints(2, 0, 1, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 10), 0, 0));
        JLabel labelDNI = new JLabel("DNI");
        panelSecundario.add(labelDNI, new GridBagConstraints(3, 0, 1, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 10), 0, 0));
        JLabel labelEMAIL = new JLabel("EMAIL");
        panelSecundario.add(labelEMAIL, new GridBagConstraints(4, 0, 1, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 10), 0, 0));
        JLabel labelCONSTRASEÑA = new JLabel("CONSTRASEÑA");
        panelSecundario.add(labelCONSTRASEÑA, new GridBagConstraints(5, 0, 1, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 10), 0, 0));


        //textfields
        JTextField textID = new JTextField();
        panelSecundario.add(textID, new GridBagConstraints(0, 1, 1, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 10), 100, 0));
        JTextField textNOMBRE = new JTextField();
        panelSecundario.add(textNOMBRE, new GridBagConstraints(1, 1, 1, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 10), 100, 0));
        JTextField textAPELLIDOS = new JTextField();
        panelSecundario.add(textAPELLIDOS, new GridBagConstraints(2, 1, 1, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 10), 100, 0));
        JTextField textDNI = new JTextField();
        panelSecundario.add(textDNI, new GridBagConstraints(3, 1, 1, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 10), 100, 0));
        JTextField textEMAIL = new JTextField();
        panelSecundario.add(textEMAIL, new GridBagConstraints(4, 1, 1, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 10), 100, 0));
        JTextField textCONTRASEÑA = new JTextField();
        panelSecundario.add(textCONTRASEÑA, new GridBagConstraints(5, 1, 1, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 10), 100, 0));


        //botones
        JButton botonNuevo = new JButton("NUEVO");
        panelSecundario.add(botonNuevo, new GridBagConstraints(0, 2, 1, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 0), 0, 0));
        JButton botonAñadir = new JButton("AÑADIR");
        panelSecundario.add(botonAñadir, new GridBagConstraints(1, 2, 1, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 0), 0, 0));
        JButton botonModificar = new JButton("MODIFICAR");
        panelSecundario.add(botonModificar, new GridBagConstraints(2, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 0), 0, 0));
        JButton botonEliminar = new JButton("ELIMINAR");
        panelSecundario.add(botonEliminar, new GridBagConstraints(3, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 0), 0, 0));

/********************************************************************************************************************************************************************************************************************/


        panelPrincipal.add(scrollPane);
        frame.add(panelMain);
        panelMain.add(panelSecundario);
        panelMain.add(panelPrincipal);

        frame.setBounds(0, 0, 800, 700);
        frame.setVisible(true);






        ModeloTablaPersona modeloTablaPersona = new ModeloTablaPersona(personas);

        botonAñadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtiene los valores de los campos del formulario
                String nombre = textNOMBRE.getText();
                String apellidos = textAPELLIDOS.getText();
                String dni = textDNI.getText();
                String email = textEMAIL.getText();
                String contraseña = textCONTRASEÑA.getText();

                // Crea una nueva persona con los valores de los parámetros
                Persona persona = new Persona(nombre, apellidos, dni, email, contraseña);

                // Agrega la nueva persona a la tabla
                modeloTablaPersona.agregarPersona(persona);


                // Limpia los campos del formulario
                textNOMBRE.setText("");
                textAPELLIDOS.setText("");
                textDNI.setText("");
                textEMAIL.setText("");
                textCONTRASEÑA.setText("");
            }
        });









    } //cierre main
}

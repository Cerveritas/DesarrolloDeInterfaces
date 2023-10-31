package Tablas.PrimerTrabajo;

import Tablas.StudentTableModel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        JFrame frame = new JFrame();
        JPanel panelPrincipal = new JPanel(new GridBagLayout()); // <-- esto de grid activa los borones enormes


        Persona p1 = new Persona(1, "Prueba", "Estatica", "00000000A", "prueba@gmail.com", "xxxxxx");

        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(p1);


        JTable tablaPrincipal = new JTable(new ModeloTablaPersona(personas));

        tablaPrincipal.setPreferredScrollableViewportSize(new Dimension(700, 300));
        JScrollPane scrollPane = new JScrollPane(tablaPrincipal);


/********************************************************************************************************************************************************************************************************************/
                    // ZONA DE BOTONES //
/*
        JButton botonNuevo = new JButton("NUEVO");
            panelPrincipal.add(botonNuevo, new GridBagConstraints(0,0,0,0,1.0,1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5,0,0,10),0,0));

        JButton botonAñadir = new JButton("AÑADIR");
            panelPrincipal.add(botonAñadir, new GridBagConstraints(1,1,0,0,1.0,1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5,0,0,10),0,0));

        JButton botonModificar = new JButton("MODIFICAR");
            panelPrincipal.add(botonModificar, new GridBagConstraints(2,2,0,0,1.0,1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5,0,0,10),0,0));

        JButton botonEliminar = new JButton("ELIMINAR");
            panelPrincipal.add(botonEliminar, new GridBagConstraints(3,3,0,0,1.0,1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5,0,0,10),0,0));
*/
/********************************************************************************************************************************************************************************************************************/













        panelPrincipal.add(scrollPane);
        frame.add(panelPrincipal);
        frame.setBounds(0,0,800,700);
        frame.setVisible(true);





    }
}

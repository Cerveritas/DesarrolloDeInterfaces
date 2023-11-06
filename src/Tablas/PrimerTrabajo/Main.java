package Tablas.PrimerTrabajo;

import Tablas.StudentTableModel;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {


        JFrame frame = new JFrame();
        JPanel panelMain = new JPanel();
            panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
        JPanel panelPrincipal = new JPanel();
            panelPrincipal.setBackground(Color.decode("#C7C7C7"));
        JPanel panelSecundario = new JPanel(new GridBagLayout());
            panelSecundario.setBackground(Color.decode("#C7C7C7"));


        Persona p1 = new Persona(1, "Prueba", "Estatica", "00000000A", "prueba@gmail.com", "xxxxxx");
        Persona p2 = new Persona(2, "dfd", "ef", "fsdff", "dfsf", "ewfef");

        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(p1);
        personas.add(p2);


        JTable tablaPrincipal = new JTable(new ModeloTablaPersona(personas));
        tablaPrincipal.setBackground(Color.decode("#F7D4FF"));

        actualizarTabla(tablaPrincipal, personas);

        tablaPrincipal.setPreferredScrollableViewportSize(new Dimension(700, 500));
        JScrollPane scrollPane = new JScrollPane(tablaPrincipal);


/********************************************************************************************************************************************************************************************************************/
        // ZONA DE BOTONES, LABELS, TEXTFIELD //


        JButton tituloL = new JButton("------- BASE DE USUARIOS -------");
            panelSecundario.add(tituloL, new GridBagConstraints(0, 0, 0, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(10, 4, 10, 5), 20, 10));
            tituloL.setBorder(new BevelBorder(1));
            tituloL.setBackground(Color.decode("#D1D1D1" +
                    ""));;
            tituloL.setHorizontalAlignment(JLabel.CENTER);
                Font font = new Font("Arial", Font.PLAIN, 15);
                    tituloL.setFont(font);


        //labels
        JLabel labelID = new JLabel("ID");
            panelSecundario.add(labelID, new GridBagConstraints(0, 1, 1, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 10), 0, 0));
        JLabel labelNOMBRE = new JLabel("NOMBRE");
            panelSecundario.add(labelNOMBRE, new GridBagConstraints(1, 1, 1, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 10), 0, 0));
        JLabel labelAPELLIDOS = new JLabel("APELLIDOS");
            panelSecundario.add(labelAPELLIDOS, new GridBagConstraints(2, 1, 1, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 10), 0, 0));
        JLabel labelDNI = new JLabel("DNI");
            panelSecundario.add(labelDNI, new GridBagConstraints(3, 1, 1, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 10), 0, 0));
        JLabel labelEMAIL = new JLabel("EMAIL");
            panelSecundario.add(labelEMAIL, new GridBagConstraints(4, 1, 1, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 10), 0, 0));
        JLabel labelCONSTRASEÑA = new JLabel("CONSTRASEÑA");
            panelSecundario.add(labelCONSTRASEÑA, new GridBagConstraints(5, 1, 1, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 10), 0, 0));


        //textfields
        JTextField textID = new JTextField();
            panelSecundario.add(textID, new GridBagConstraints(0, 2, 1, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 10, 10), 100, 0));
            textID.setEditable(false);
        JTextField textNOMBRE = new JTextField();
            panelSecundario.add(textNOMBRE, new GridBagConstraints(1, 2, 1, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 10, 10), 100, 0));
        JTextField textAPELLIDOS = new JTextField();
            panelSecundario.add(textAPELLIDOS, new GridBagConstraints(2, 2, 1, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 10, 10), 100, 0));
        JTextField textDNI = new JTextField();
            panelSecundario.add(textDNI, new GridBagConstraints(3, 2, 1, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 10, 10), 100, 0));
        JTextField textEMAIL = new JTextField();
            panelSecundario.add(textEMAIL, new GridBagConstraints(4, 2, 1, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 10, 10), 100, 0));
        JPasswordField textCONTRASEÑA = new JPasswordField();
            panelSecundario.add(textCONTRASEÑA, new GridBagConstraints(5, 2, 1, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 10, 10), 100, 0));



        //botones
        JButton botonNuevo = new JButton("NUEVO");
            panelSecundario.add(botonNuevo, new GridBagConstraints(0, 3, 3, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 0), 0, 0));
            botonNuevo.setBackground(Color.decode("#B3FFFF"));
        JButton botonAñadir = new JButton("AÑADIR");
            panelSecundario.add(botonAñadir, new GridBagConstraints(1, 3, 3, 1, 1.0, 0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 0), 0, 0));
            botonAñadir.setBackground(Color.decode("#B3FFFF"));
        JButton botonModificar = new JButton("MODIFICAR");
            panelSecundario.add(botonModificar, new GridBagConstraints(2, 3, 3, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 0), 0, 0));
            botonModificar.setBackground(Color.decode("#B3FFFF"));
        JButton botonEliminar = new JButton("ELIMINAR");
            panelSecundario.add(botonEliminar, new GridBagConstraints(3, 3, 3, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0, 0, 0, 0), 0, 0));
            botonEliminar.setBackground(Color.decode("#B3FFFF"));

/********************************************************************************************************************************************************************************************************************/


        panelPrincipal.add(scrollPane);
        frame.add(panelMain);
        panelMain.add(panelSecundario);
        panelMain.add(panelPrincipal);

        frame.setBounds(520, 150, 800, 700);
        frame.setUndecorated(true);
        frame.setVisible(true);
        frame.setResizable(false);




/********************************************************************************************************************************************************************************************************************/
/*********************************************************************************************************************************************************************************************/
/************************************  ACCIONES DE LOS BOTONES  *****************************************************************************************************************************************************/


        // ANTES DE DARLE A NUEVO, JUSTO AL ABRIR EL PROGRAMA

        /** de esta manera todos los campos estaran desactivados, y estarás obligado a darle a nuevo para activarlos **/
        textNOMBRE.setEditable(false);
        textAPELLIDOS.setEditable(false);
        textDNI.setEditable(false);
        textEMAIL.setEditable(false);
        textCONTRASEÑA.setEditable(false);


        //BOTON PARA SALIR DEL PROGRAMA
        tituloL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });



        //BOTON NUEVO
        botonNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textID.setText(String.valueOf(obtenerID(personas)));
                textNOMBRE.setText("");
                textAPELLIDOS.setText("");
                textDNI.setText("");
                textEMAIL.setText("");
                textCONTRASEÑA.setText("");
                textNOMBRE.setEditable(true);
                textAPELLIDOS.setEditable(true);
                textDNI.setEditable(true);
                textEMAIL.setEditable(true);
                textCONTRASEÑA.setEditable(true);

                botonNuevo.setEnabled(false);
                botonModificar.setEnabled(false);
                botonEliminar.setEnabled(false);

            }
        });





        ModeloTablaPersona modeloTablaPersona = new ModeloTablaPersona(personas);

        //BOTON AÑADIR
        botonAñadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                // Obtiene los valores de los campos del formulario
                int id = Integer.parseInt(textID.getText());
                String nombre = textNOMBRE.getText();
                String apellidos = textAPELLIDOS.getText();
                String dni = textDNI.getText();
                String email = textEMAIL.getText();
                String contraseña = textCONTRASEÑA.getText();

                actualizarTabla(tablaPrincipal, personas);


                // Crea una nueva persona con los valores de los parámetros
                Persona persona = new Persona(id, nombre, apellidos, dni, email, contraseña);

                // Agrega la nueva persona a la tabla
                modeloTablaPersona.agregarPersona(persona);

                // Mensaje de aceptacion
                JOptionPane.showMessageDialog(frame, "Persona agregada con éxito");


                // Limpia los campos del formulario
                textID.setText("");
                textNOMBRE.setText("");
                textAPELLIDOS.setText("");
                textDNI.setText("");
                textEMAIL.setText("");
                textCONTRASEÑA.setText("");

                // Manda a false la editablidad los campos
                textNOMBRE.setEditable(false);
                textAPELLIDOS.setEditable(false);
                textDNI.setEditable(false);
                textEMAIL.setEditable(false);
                textCONTRASEÑA.setEditable(false);

                botonNuevo.setEnabled(true);
                botonModificar.setEnabled(true);
                botonEliminar.setEnabled(true);


            }
        });


        //BOTON ELIMINAR
        botonEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(JOptionPane.showConfirmDialog(frame, "¿Seguro que desea eliminar al usuario seleccionado?", "Confirmación", JOptionPane.INFORMATION_MESSAGE) == 0){
                    personas.remove(tablaPrincipal.getSelectedRow());
                    actualizarTabla(tablaPrincipal, personas);
                    //tablaPrincipal.revalidate();
                    //tablaPrincipal.repaint();
                    textID.setText("");
                    textNOMBRE.setText("");
                    textAPELLIDOS.setText("");
                    textDNI.setText("");
                    textEMAIL.setText("");
                    textCONTRASEÑA.setText("");
                    JOptionPane.showMessageDialog(frame, "Usuario eliminado correctamente...");
                }
            }
        });


        //BOTON MOFICICAR
        botonModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Persona usuario = personas.get(tablaPrincipal.getSelectedRow());
                personas.remove(tablaPrincipal.getSelectedRow());

                usuario.setID(Integer.parseInt(textID.getText()));
                usuario.setNombre(textNOMBRE.getText());
                usuario.setApellidos(textAPELLIDOS.getText());
                usuario.setDNI(textDNI.getText());
                usuario.setEmail(textEMAIL.getText());
                usuario.setContraseña(textCONTRASEÑA.getText());

                personas.add(usuario);
                actualizarTabla(tablaPrincipal, personas);
                tablaPrincipal.revalidate();
                tablaPrincipal.repaint();


            }
        });








    } // <-- cierre del main

    private static int obtenerID (ArrayList<Persona> personas) {

        int id = 1;
        boolean encontrado = false;

        for(int i = 0; i < personas.size(); i++){
            if (personas.get(i).getID() != (i+1) && encontrado == false){
                id = i+1;
                encontrado = true;
            }else if (encontrado == false) {
                id = personas.get(i).getID()+1;
            }
        }

        return id;
    }

    private static void actualizarTabla(JTable tablaPrincipal, ArrayList<Persona> personas) {
        tablaPrincipal.setModel(new ModeloTablaPersona(personas));
        tablaPrincipal.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
}

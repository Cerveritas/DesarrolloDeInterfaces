package PracticaRecuperacionExamen1.controller;

import PracticaRecuperacionExamen1.model.ModeloTablaPersona;
import PracticaRecuperacionExamen1.model.Persona;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;



public class EjercicioFormulario {
    private JPanel panelPrinicipal;
    private JTextField textCONTRASEÑA;
    private JTextField textEMAIL;
    private JTextField textDNI;
    private JTextField textAPELLIDO;
    private JTextField textNOMBRE;
    private JTextField textID;
    private JButton NUEVOButton;
    private JButton AÑADIRButton;
    private JButton ELIMINARButton;
    private JButton MODIFICARButton;
    private JTable table1;
    private JLabel labelID;
    private JLabel labelNOMBRE;
    private JLabel labelAPELLIDO;
    private JLabel labelDNI;
    private JLabel labelEMAIL;
    private JLabel labelCONTRASEÑA;
    private JPanel panel1;


    static ArrayList<Persona> personas = new ArrayList<>();


    // MAIN
    public static void main(String[] args) throws SQLException {
        JFrame frame = new JFrame("EjercicioFormulario");
        frame.setContentPane(new EjercicioFormulario().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setBounds(500,350,1100,500);
        frame.setVisible(true);


        ArrayList<Persona>personas = new ArrayList<Persona>();



        actualizarTabla(new EjercicioFormulario().table1, personas);

        new EjercicioFormulario().table1.setPreferredScrollableViewportSize(new Dimension(700, 500));
        JScrollPane scrollPane = new JScrollPane(new EjercicioFormulario().table1);

    }



    // METODO DE ACTUALIZAR LA TABLA
    private static void actualizarTabla(JTable table1, ArrayList<Persona> personas){
        table1.setModel(new ModeloTablaPersona(personas));
        table1.getColumnModel().getColumn(0).setPreferredWidth(0);
    }



    public EjercicioFormulario() {

        textID.setEditable(false);

        table1.setModel(new ModeloTablaPersona(personas));

        TableRowSorter<ModeloTablaPersona> sorter = new TableRowSorter<>(new ModeloTablaPersona(personas));
        table1.setRowSorter(sorter);



        table1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                int seleccionado = table1.getSelectedRow();

                if (seleccionado != -1){
                    Persona per = personas.get(seleccionado);

                    textID.setText(String.valueOf(per.getId()));
                    textNOMBRE.setText(per.getNombre());
                    textAPELLIDO.setText(per.getApellidos());
                    textDNI.setText(per.getDNI());
                    textEMAIL.setText(per.getEmail());
                    textCONTRASEÑA.setText(per.getContraseña());

                    textNOMBRE.setEditable(true);
                    textAPELLIDO.setEditable(true);
                    textDNI.setEditable(true);
                    textEMAIL.setEditable(true);
                    textCONTRASEÑA.setEditable(true);

                    AÑADIRButton.setEnabled(true);
                    NUEVOButton.setEnabled(true);
                }

            }
        });


        //METODO DE LOS BOTONES

        /** DESACTIVAMOS LOS CAMPOS PARA OBLIGACION DE PULSAR BOTONNUEVO **/

        textNOMBRE.setEditable(false);
        textAPELLIDO.setEditable(false);
        textDNI.setEditable(false);
        textEMAIL.setEditable(false);
        textCONTRASEÑA.setEditable(false);


      // metodo NUEVO
      NUEVOButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {

              textNOMBRE.setEditable(true);
              textAPELLIDO.setEditable(true);
              textDNI.setEditable(true);
              textEMAIL.setEditable(true);
              textCONTRASEÑA.setEditable(true);

              textID.setText(String.valueOf(obtenerID(personas)));
              textNOMBRE.setText("");
              textAPELLIDO.setText("");
              textDNI.setText("");
              textEMAIL.setText("");
              textCONTRASEÑA.setText("");



          }
          private int obtenerID(ArrayList<Persona>personas){
              int id = 1;
              boolean encontrado = false;

              for(int i = 0; i < personas.size(); i++){
                  if (personas.get(i).getId() != (i+1) && encontrado == false){
                      id = i+1;
                      encontrado = true;
                  }else if (encontrado == false) {
                      id = personas.get(i).getId()+1;
                  }
              }

              return id;
          }
      });




        AÑADIRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // metodo añadir
                ModeloTablaPersona modeloTablaPersona = new ModeloTablaPersona(personas);

                int id = Integer.parseInt(textID.getText());
                String nombre = textNOMBRE.getText();
                String apellido = textAPELLIDO.getText();
                String dni = textDNI.getText();
                String email = textEMAIL.getText();
                String contraseña = textCONTRASEÑA.getText();

                actualizarTabla(table1, personas);

                Persona persona = new Persona(id, nombre, apellido, dni, email, contraseña);

                modeloTablaPersona.agregarPersona(persona);

                JOptionPane.showMessageDialog(panel1, "Persona agregada con exito");


                textID.setText("");
                textNOMBRE.setText("");
                textAPELLIDO.setText("");
                textDNI.setText("");
                textEMAIL.setText("");
                textCONTRASEÑA.setText("");

                textNOMBRE.setEditable(false);
                textAPELLIDO.setEditable(false);
                textDNI.setEditable(false);
                textEMAIL.setEditable(false);
                textCONTRASEÑA.setEditable(false);

            }
        });

        // metodo eliminar
        ELIMINARButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (JOptionPane.showConfirmDialog(panel1, "¿Seguro que quieres borrar?", "Confirmacion", JOptionPane.INFORMATION_MESSAGE) == 0 ){

                    personas.remove(table1.getSelectedRow());
                    actualizarTabla(table1, personas);
                }


                JOptionPane.showMessageDialog(table1, "Usuario eliminado correctamente...");
                textID.setText("");
                textNOMBRE.setText("");
                textAPELLIDO.setText("");
                textDNI.setText("");
                textEMAIL.setText("");
                textCONTRASEÑA.setText("");

            }
        });

        // metodo modificar
        MODIFICARButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Persona usuario = personas.get(table1.getSelectedRow());

                usuario.setId(Integer.parseInt(textID.getText()));
                usuario.setNombre(textNOMBRE.getText());
                usuario.setApellidos(textAPELLIDO.getText());
                usuario.setDNI(textDNI.getText());
                usuario.setEmail(textEMAIL.getText());
                usuario.setContraseña(textCONTRASEÑA.getText());

                actualizarTabla(table1, personas);

                textID.setText("");
                textNOMBRE.setText("");
                textAPELLIDO.setText("");
                textDNI.setText("");
                textEMAIL.setText("");
                textCONTRASEÑA.setText("");


            }
        });


    }



}



package GUIForm;




import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class EjercicioFormulario {



    public EjercicioFormulario() {



        textID.setEditable(false);//opcion super importante para no poder escribir en el campo ID
        Persona p1 = new Persona(1, "Prueba", "Estatica", "00000000A", "prueba@gmail.com", "xxxxxx");
        Persona p2 = new Persona(2, "dfd", "ef", "fsdff", "dfsf", "ewfef");

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(p1);
        personas.add(p2);



        table1.setModel(new ModeloTablaPersona(personas));



        // ANTES DE DARLE A NUEVO, JUSTO AL ABRIR EL PROGRAMA

        /** de esta manera todos los campos estaran desactivados, y estarás obligado a darle a nuevo para activarlos **/
        textNOMBRE.setEditable(false);
        textAPELLIDOS.setEditable(false);
        textDNI.setEditable(false);
        textEMAIL.setEditable(false);
        textCONTRASEÑA.setEditable(false);


        //boton nuevo accion
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

            private int obtenerID(ArrayList<Persona> personas) {
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
        });

        //boton modificar accion
        botonModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Persona usuario = personas.get(table1.getSelectedRow());
                personas.remove(table1.getSelectedRow());

                usuario.setID(Integer.parseInt(textID.getText()));
                usuario.setNombre(textNOMBRE.getText());
                usuario.setApellidos(textAPELLIDOS.getText());
                usuario.setDNI(textDNI.getText());
                usuario.setEmail(textEMAIL.getText());
                usuario.setContraseña(textCONTRASEÑA.getText());

                personas.add(usuario);
                actualizarTabla(table1, personas);
                table1.revalidate();
                table1.repaint();


            }
        });

        //boton eliminar accion
        botonEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(JOptionPane.showConfirmDialog(table1, "¿Seguro que desea eliminar al usuario seleccionado?", "Confirmación", JOptionPane.INFORMATION_MESSAGE) == 0){
                    personas.remove(table1.getSelectedRow());
                    actualizarTabla(table1, personas);
                    //tablaPrincipal.revalidate();
                    //tablaPrincipal.repaint();
                    textID.setText("");
                    textNOMBRE.setText("");
                    textAPELLIDOS.setText("");
                    textDNI.setText("");
                    textEMAIL.setText("");
                    textCONTRASEÑA.setText("");
                    JOptionPane.showMessageDialog(table1, "Usuario eliminado correctamente...");
                }

            }
        });

        ModeloTablaPersona modeloTablaPersona = new ModeloTablaPersona(personas);
        //boton añadir accion
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

                actualizarTabla(table1, personas);


                // Crea una nueva persona con los valores de los parámetros
                Persona persona = new Persona(id, nombre, apellidos, dni, email, contraseña);

                // Agrega la nueva persona a la tabla
                modeloTablaPersona.agregarPersona(persona);

                // Mensaje de aceptacion
                JOptionPane.showMessageDialog(panel1, "Persona agregada con éxito");


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
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("EjercicioFormulario");
        frame.setContentPane(new EjercicioFormulario().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setBounds(500,350,1100,500);
        frame.setVisible(true);




        Persona p1 = new Persona(1, "Prueba", "Estatica", "00000000A", "prueba@gmail.com", "xxxxxx");
        Persona p2 = new Persona(2, "dfd", "ef", "fsdff", "dfsf", "ewfef");

        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(p1);
        personas.add(p2);




        actualizarTabla(new EjercicioFormulario().table1, personas);

        new EjercicioFormulario().table1.setPreferredScrollableViewportSize(new Dimension(700, 500));
        JScrollPane scrollPane = new JScrollPane(new EjercicioFormulario().table1);


    }

    private static void actualizarTabla(JTable tablaPrincipal, ArrayList<Persona> personas) {
        tablaPrincipal.setModel(new GUIForm.ModeloTablaPersona(personas));
        tablaPrincipal.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    private JPanel panel1;
    private JPanel PanelPrincipal;
    private JLabel labelID;
    private JTextField textID;
    private JTextField textNOMBRE;
    private JTextField textAPELLIDOS;
    private JTextField textDNI;
    private JTextField textEMAIL;
    private JTextField textCONTRASEÑA;
    private JButton botonNuevo;
    private JButton botonAñadir;
    private JButton botonModificar;
    private JButton botonEliminar;
    private JTable table1;
    private JLabel labelNombre;
    private JLabel labelApellidos;
    private JLabel labelDNI;
    private JLabel labelEMAIL;
    private JLabel labelCONTRASEÑA;


}

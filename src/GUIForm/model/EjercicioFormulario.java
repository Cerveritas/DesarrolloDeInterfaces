package GUIForm.model;



import GUIForm.controller.Persona;
import GUIForm.propierties.Propiedades;


import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;


public class EjercicioFormulario {


    static Connection conn;
    static Scanner sc;

    static ArrayList<Persona> personas = new ArrayList<>();

    public EjercicioFormulario() throws SQLException {




        textID.setEditable(false);//opcion super importante para no poder escribir en el campo ID




        table1.setModel(new ModeloTablaPersona(personas));



        TableRowSorter<ModeloTablaPersona> sorter = new TableRowSorter<>(new ModeloTablaPersona(personas));
        table1.setRowSorter(sorter);





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
                botonAñadir.setEnabled(true);

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

                usuario.setID(Integer.parseInt(textID.getText()));
                usuario.setNombre(textNOMBRE.getText());
                usuario.setApellidos(textAPELLIDOS.getText());
                usuario.setDNI(textDNI.getText());
                usuario.setEmail(textEMAIL.getText());
                usuario.setContraseña(textCONTRASEÑA.getText());




                try {

                    PreparedStatement ps = conn.prepareStatement("UPDATE users SET username = ?, surname = ?, dni = ?, email = ?, password = ? WHERE id = ?");
                    ps.setString(1, usuario.getNombre());
                    ps.setString(2, usuario.getApellidos());
                    ps.setString(3, usuario.getDNI());
                    ps.setString(4, usuario.getEmail());
                    ps.setString(5, usuario.getContraseña());
                    ps.setInt(6, usuario.getID());

                    ps.executeUpdate();


                } catch (SQLException throwables){
                    throwables.printStackTrace();
                }


                actualizarTabla(table1, personas);
                botonAñadir.setEnabled(true);
                botonNuevo.setEnabled(true);
                //table1.revalidate();
                //table1.repaint();



                // Limpia los campos del formulario
                textID.setText("");
                textNOMBRE.setText("");
                textAPELLIDOS.setText("");
                textDNI.setText("");
                textEMAIL.setText("");
                textCONTRASEÑA.setText("");

            }
        });

        //boton eliminar accion
        botonEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                if(JOptionPane.showConfirmDialog(table1, "¿Seguro que desea eliminar al usuario seleccionado?", "Confirmación", JOptionPane.INFORMATION_MESSAGE) == 0){
                    try {

                        PreparedStatement ps = conn.prepareStatement("DELETE FROM users WHERE id=?");
                        ps.setInt(1, (Integer) table1.getValueAt(table1.getSelectedRow(),0));
                        ps.executeUpdate();
                        personas.remove(table1.getSelectedRow());

                    } catch (SQLException throwables){
                        throwables.printStackTrace();
                    }

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

                    botonAñadir.setEnabled(true);
                    botonNuevo.setEnabled(true);
                    botonModificar.setEnabled(true);
                    botonEliminar.setEnabled(true);

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


                // METER LOS DATOS EN LA BASE DE DATOS
                try {
                    establecerConexion();
                    asignar();

                    PreparedStatement ps = conn.prepareStatement("insert into users values (?,?,?,?,?,?)");



                    ps.setInt(1, Integer.parseInt(String.valueOf(persona.getID())));
                    ps.setString(2, persona.getNombre());
                    ps.setString(3, persona.getApellidos());
                    ps.setString(4, persona.getDNI());
                    ps.setString(5, persona.getEmail());
                    ps.setString(6, persona.getContraseña());

                    ps.executeUpdate();

                    System.out.println("El registro fue insertado correctamente...");
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }

            }
        });

        table1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                int seleccionado = table1.getSelectedRow();

                if (seleccionado != -1){

                    Persona per = personas.get(seleccionado);

                    textID.setText(String.valueOf(per.getID()));
                    textNOMBRE.setText(per.getNombre());
                    textAPELLIDOS.setText(per.getApellidos());
                    textDNI.setText(per.getDNI());
                    textEMAIL.setText(per.getEmail());
                    textCONTRASEÑA.setText(per.getContraseña());

                    textNOMBRE.setEditable(true);
                    textAPELLIDOS.setEditable(true);
                    textDNI.setEditable(true);
                    textEMAIL.setEditable(true);
                    textCONTRASEÑA.setEditable(true);

                    botonAñadir.setEnabled(false);
                    botonNuevo.setEnabled(true);

                }




            }
        });


        comboBox1.addItem("Español");
        comboBox1.addItem("Ingles");
        comboBox1.addItem("Portugues");
        comboBox1.addItem("Chino Tradicional");
        comboBox1.addItem("Rumano");


        // combobox para cambiar idioma con un switch
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String idiomaSeleccionado = comboBox1.getSelectedItem().toString();




                switch (idiomaSeleccionado) {
                    case "Español":
                        cargarIdioma("spanish");
                        break;

                    case "Ingles":
                        cargarIdioma("english");
                        break;

                    case "Portugues":
                        cargarIdioma("portugues");
                        break;

                    case "Chino Tradicional":
                        cargarIdioma("chinoTradicional");
                        break;

                    case "Rumano":
                        cargarIdioma("rumano");
                        break;

                    default:
                        System.out.println("Fuera de rangos de switch");
                }

            }
        });

        // Objeto Persona






        VERUSUARIOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int seleccionado = table1.getSelectedRow();

                if (seleccionado != -1) {

                    // Crea un nuevo frame para mostrar los datos del usuario seleccionado
                    JFrame frame2 = new JFrame("Ver Usuario");
                    frame2.setBounds(500, 350, 450, 375);

                    // Crea un panel principal para el frame
                    JPanel panelPrincipal = new JPanel(new FlowLayout(FlowLayout.CENTER));
                        panelPrincipal.setBackground(Color.LIGHT_GRAY);


                    // Crear un panel para los datos de los usuarios
                    JPanel panelUser = new JPanel();
                    panelUser.setLayout(new GridLayout(6, 1));
                        panelUser.setBackground(Color.LIGHT_GRAY);


                    String path = "src/GUIForm/images/vader2.png";
                    ImageIcon fotoUser = new ImageIcon(path);

                    JLabel labelPhoto = new JLabel();
                    labelPhoto.setSize(200,500);
                    labelPhoto.setIcon(fotoUser);


                    panelPrincipal.add(labelPhoto);







                    // Crea los componentes del panel
                    JLabel labelID = new JLabel("ID:");
                    JLabel labelNombre = new JLabel("Nombre:");
                    JLabel labelApellidos = new JLabel("Apellidos:");
                    JLabel labelDNI = new JLabel("DNI:");
                    JLabel labelEmail = new JLabel("Email:");
                    JLabel labelContraseña = new JLabel("Contraseña:");

                    JTextField textID = new JTextField();
                    textID.setEditable(false);
                    textID.setText(String.valueOf(personas.get(seleccionado).getID()));
                    textID.setPreferredSize(new Dimension(150,10));

                    JTextField textNombre = new JTextField();
                    textNombre.setEditable(false);
                    textNombre.setText(personas.get(seleccionado).getNombre());

                    JTextField textApellidos = new JTextField();
                    textApellidos.setEditable(false);
                    textApellidos.setText(personas.get(seleccionado).getApellidos());

                    JTextField textDNI = new JTextField();
                    textDNI.setEditable(false);
                    textDNI.setText(personas.get(seleccionado).getDNI());

                    JTextField textEmail = new JTextField();
                    textEmail.setEditable(false);
                    textEmail.setText(personas.get(seleccionado).getEmail());

                    JTextField textContraseña = new JTextField();
                    textContraseña.setEditable(false);
                    textContraseña.setText(personas.get(seleccionado).getContraseña());


                    // Agrega los componentes al panel
                    panelUser.add(labelID);
                    panelUser.add(textID);
                    panelUser.add(labelNombre);
                    panelUser.add(textNombre);
                    panelUser.add(labelApellidos);
                    panelUser.add(textApellidos);
                    panelUser.add(labelDNI);
                    panelUser.add(textDNI);
                    panelUser.add(labelEmail);
                    panelUser.add(textEmail);
                    panelUser.add(labelContraseña);
                    panelUser.add(textContraseña);





                    // Agregar los paneles
                    frame2.add(panelPrincipal);
                    panelPrincipal.add(panelUser);
                    frame2.setVisible(true);
                    frame2.setResizable(false);
                } else {
                    System.out.println("Error, no hay ningun usuario seleccionado...");
                    JOptionPane.showMessageDialog(panel1, "No hay ninguna persona seleccionada...");
                }








            }
        });
    }



    static JFrame frame = new JFrame("EjercicioFormulario");
    //MAIN
    public static void main(String[] args) throws SQLException {

        frame.setContentPane(new EjercicioFormulario().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setBounds(500,350,1100,500);
        frame.setVisible(true);








        ArrayList<Persona> personas = new ArrayList<Persona>();




        actualizarTabla(new EjercicioFormulario().table1, personas);

        new EjercicioFormulario().table1.setPreferredScrollableViewportSize(new Dimension(700, 500));
        JScrollPane scrollPane = new JScrollPane(new EjercicioFormulario().table1);








    }




    private static void actualizarTabla(JTable tablaPrincipal, ArrayList<Persona> personas) {
        tablaPrincipal.setModel(new ModeloTablaPersona(personas));
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
    private JComboBox comboBox1;
    private JButton VERUSUARIOButton;


    // ESTABLECER CONEXION CON EL SGBD
    public static void establecerConexion() throws SQLException {

        // BBDD INSTITUTO
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String pwd = "admin";


        System.out.println("CONEXION ESTABLECIDA");

        conn = DriverManager.getConnection(url, user, pwd);

    }
    // ASIGNAR LA BBDD
    public static void asignar() throws SQLException {
        String query = "use mydb";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
       // LimpiarBBDD();

    }


    ///////////////////////////////////////////     CAMBIOS DE IDIOMA   //////////////////////////////////////////


    public void cargarIdioma(String idioma){


        Properties propiedades = new Propiedades(idioma);

        labelID.setText(propiedades.getProperty("ID"));
        labelNombre.setText(propiedades.getProperty("NOMBRE"));
        labelApellidos.setText(propiedades.getProperty("APELLIDO"));
        labelCONTRASEÑA.setText(propiedades.getProperty("CONTRASEÑA"));

        botonAñadir.setText(propiedades.getProperty("AÑADIR"));
        botonEliminar.setText(propiedades.getProperty("ELIMINAR"));
        botonModificar.setText(propiedades.getProperty("MODIFICAR"));
        botonNuevo.setText(propiedades.getProperty("NUEVO"));




    }





/*
    public static void LimpiarBBDD() throws SQLException {
            PreparedStatement ps = conn.prepareStatement("TRUNCATE FROM users");
            ps.executeUpdate();
    }*/
}

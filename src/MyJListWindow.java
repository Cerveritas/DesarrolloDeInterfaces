import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MyJListWindow {
    public static void main(String[] args) {


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 200, 350, 400);

        JPanel panelPrincipal = new JPanel(new GridBagLayout());


        JLabel jlist = new JLabel("Jlist");
        panelPrincipal.add(jlist, new GridBagConstraints(0, 0, 0, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 35, 20, 35), 0, 0));
        jlist.setBorder(new BevelBorder(1));
        jlist.setHorizontalAlignment(JLabel.CENTER);
        Font font = new Font("Arial", Font.PLAIN, 40);
        jlist.setFont(font);




        JTextArea texto = new JTextArea();
        panelPrincipal.add(texto, new GridBagConstraints(0, 1, 1, 1, 1.0, 0, GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(0, 15, 0, 10), 0, 0));


        JButton botonAgregar = new JButton("Agregar");
        panelPrincipal.add(botonAgregar, new GridBagConstraints(1, 1, 1, 1, 1.0, 0, GridBagConstraints.EAST, GridBagConstraints.BOTH, new Insets(0, 0, 0, 23), 0, 0));


        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> listaNombres = new JList<>(listModel);
        panelPrincipal.add(listaNombres, new GridBagConstraints(0, 2, 3, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(5, 0, 0, 10), 0, 0));

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.add(listaNombres);
        panelPrincipal.add(scrollPane, new GridBagConstraints(0, 2, 3, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(5, 0, 10, 10), 0, 0));
        scrollPane.setPreferredSize(new Dimension(300, 100));


        panelPrincipal.setBackground(Color.LIGHT_GRAY);


        JButton botonEliminar = new JButton("Eliminar");
        panelPrincipal.add(botonEliminar, new GridBagConstraints(0, 3, 1, 1, 1.0, 0, GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(0, 15, 0, 10), 0, 0));

        JButton botonBorrarLista = new JButton("Borrar Lista");
        panelPrincipal.add(botonBorrarLista, new GridBagConstraints(1, 3, 1, 1, 1.0, 0, GridBagConstraints.EAST, GridBagConstraints.BOTH, new Insets(0, 0, 0, 23), 0, 0));





        // CAMBIO DE COLOR DE JLABEL
        jlist.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

                jlist.setForeground(Color.RED);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                jlist.setForeground(Color.BLACK);
            }
        });







        // BOTON DE AGREGAR
        botonAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtenemos el texto del JTextArea
                String nombre = texto.getText();

                // Verificamos si el texto no esta vacio
                if (!nombre.isEmpty()) {
                    // Agregamos el nombre de DefaultListModel
                    listModel.addElement(nombre);
                    JLabel textoResult = new JLabel("Se agregó un nuevo elemento");
                    panelPrincipal.add(textoResult, new GridBagConstraints(0, 4, 1, 1, 1.0, 0, GridBagConstraints.EAST, GridBagConstraints.EAST, new Insets(0, 0, 0, 10), 0, 0));


                    // Limpiamos el JTextArea
                    texto.setText("");
                }


            }
        });


        // BOTON DE ELIMINAR EL ELEMENTO MARCADO
        botonEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreSelected = listaNombres.getSelectedValue();
                if (nombreSelected != null){
                    listModel.removeElement(nombreSelected);

                }
            }
        });

        // BOTON DE ELIMINAR TODOS LOS ELEMENTOS AGREGADOS ANTERIORMENTE
        botonBorrarLista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.removeAllElements();

            }
        });
















        frame.add(panelPrincipal);
        frame.setVisible(true);


    }
}




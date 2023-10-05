import javax.swing.*;
import java.awt.*;

public class NuevosComponentes {

    public static void main(String[] args) {


        JFrame frame = new JFrame("Nuevos Componentes Para El Formulario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,200,500,600);


        JPanel panelPrincipal = new JPanel(new GridBagLayout());


        JLabel lUsuario = new JLabel("USUARIO");
            JTextField usuarioField = new JTextField();
                panelPrincipal.add(lUsuario, new GridBagConstraints(0,1,1,1,1.0,0, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(10,0,0,10),0,0));
                panelPrincipal.add(usuarioField, new GridBagConstraints(1,1,1,1,1.0,0, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(10,0,0,10),0,0));


        JLabel lConstrasena = new JLabel("CONTRASEÑA");
            JPasswordField contrasenaField = new JPasswordField();
                panelPrincipal.add(lConstrasena, new GridBagConstraints(0,2,1,1,1.0,0, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0,0,0,10),0,0));
                panelPrincipal.add(contrasenaField, new GridBagConstraints(1,2,1,1,1.0,0, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(0,0,0,10),0,0));

        JLabel lHabla = new JLabel("HABLAME SOBRE TI");
            JTextArea hablaArea = new JTextArea();
                panelPrincipal.add(lHabla, new GridBagConstraints(0,3,3,1,1,0, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(50,10,0,10),0,0));
                panelPrincipal.add(hablaArea, new GridBagConstraints(0,4,3,1,1,4.0, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(0,10,0,10),0,0));



        JLabel lLista = new JLabel("SELECCIONA TU PAIS");

            JList Jlista = new JList();
                String[] paises = {"España", "Francia", "Alemania", "Italia", "Portugal", "Suecia", "China", "USA", "Reino unido", "Andorra"};
                Jlista.setListData(paises);
                    panelPrincipal.add(lLista, new GridBagConstraints(0,5,3,1,1,0, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(20,0,0,10),0,0));
                    panelPrincipal.add(Jlista, new GridBagConstraints(0,6,3,1,1,0, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(5,0,0,10),0,0));

                ScrollPane scrollPane = new ScrollPane();
                    scrollPane.add(Jlista);
                        panelPrincipal.add(scrollPane,  new GridBagConstraints(0,7,3,1,1,0, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(5,0,10,10),0,0));
                        scrollPane.setPreferredSize(new Dimension(300, 100));



                        panelPrincipal.setBackground(Color.LIGHT_GRAY);



        JButton button = new JButton("ENVIAR");
        panelPrincipal.add(button, new GridBagConstraints(0,8,4,1,1.0,1.0, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(5,0,0,10),0,0));


        button.setForeground(Color.BLACK);
        button.setFont(new Font("Arial", Font.BOLD, 20));


        // Agrega un efecto de sombra
        button.setBackground(Color.CYAN);
        button.setBorderPainted(true);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setOpaque(true);



        JScrollPane scrollPaneVentana = new JScrollPane(panelPrincipal);
        frame.add(scrollPaneVentana);

        //frame.add(panelPrincipal);
        frame.setVisible(true);


    }
}

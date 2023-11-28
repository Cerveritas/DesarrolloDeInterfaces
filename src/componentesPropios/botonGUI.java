package componentesPropios;

import javax.swing.*;

public class botonGUI {
    private JPanel mainPanel;
    private JButtonImagen2 JButtonImagen21;


    public static void main(String[] args) {
        JFrame frame = new JFrame("GUIBoton");
        frame.setContentPane(new botonGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(0, 0, 100, 100);
    }

   /* public void createUIComponents(){
        JButtonImagen21 = new JButtonImagen2();
    }*/
}


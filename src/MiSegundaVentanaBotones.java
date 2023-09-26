import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import java.awt.*;

public class MiSegundaVentanaBotones {
    public static void main(String[] args) {







        JPanel panelPrincipal = new JPanel();

        JPanel panelInterno1 = new JPanel();
            panelInterno1.setBackground(Color.blue);

        JPanel panelInterno2 = new JPanel();
            panelInterno2.setBackground(Color.MAGENTA);


        JButton boton01 = new JButton("Boton1");
        JButton boton02 = new JButton("Boton2");
        JButton boton03 = new JButton("Boton3");



        panelPrincipal.add(boton01);
        panelInterno1.add(boton02);
        panelInterno2.add(boton03);
        panelPrincipal.add(panelInterno1);
        panelPrincipal.add(panelInterno2);




        //panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.setLayout(new FlowLayout());






        JFrame frame = new JFrame();
        frame.setBounds(800, 200, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panelPrincipal);
        //frame.setSize(400,400);





        frame.setVisible(true);








    }
}

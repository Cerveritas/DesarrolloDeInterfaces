import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;

public class MiSegundaVentana {
    public static void main(String[] args) {





        JPanel panelPrincipal = new JPanel();
            //panelPrincipal.setLayout(new GridLayout(1,2));  <-- CON ESTO PONEMOS UNO AL LADO DEL OTRO SIN DIMENSIONAR NADA, TODO SIMETRICO


        JPanel panelInterno1 = new JPanel();
            panelInterno1.setBackground(Color.MAGENTA);
            panelInterno1.setPreferredSize(new Dimension(400,200));


        JPanel panelInterno2 = new JPanel();
            panelInterno2.setBackground(Color.GREEN);
            panelInterno2.setPreferredSize(new Dimension(400,200));



        JButton boton02 = new JButton("Boton1");
            boton02.setBackground(Color.GREEN);

        JButton boton03 = new JButton("Boton2");
            boton03.setBackground(Color.MAGENTA);




        panelPrincipal.add(panelInterno1);
        panelPrincipal.add(panelInterno2);


        panelInterno1.add(boton02);
            boton02.setPreferredSize(new Dimension(100,50));
        panelInterno2.add(boton03);
            boton03.setPreferredSize(new Dimension(100,50));





        //panelInterno1.setLayout(new BorderLayout());
        //panelInterno2.setLayout(new FlowLayout());





        panelPrincipal.add(panelInterno1);
        panelPrincipal.add(panelInterno2);


        JFrame frame = new JFrame("UWU");
        frame.setBounds(800, 200, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panelPrincipal);
        //frame.setSize(400,400);





        frame.setVisible(true);








    }
}

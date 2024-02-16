package undirLaFlota.model;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PAGPrincipal {
    public JPanel PanelPrincipalInicio;
    private JPanel FotoPanel;
    private JPanel TituloPanel;
    private JLabel barcoLabel;
    private JButton JUGARButton;
    private JLabel theShipLabel;
    private JLabel añoLabel;



    /*Border bordeRedondeado = new Border() {
        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.setColor(Color.BLACK);
            g.fillRoundRect(x, y, width - 1, height - 1, 10, 10);


        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(5, 5, 5, 5);
        }

        @Override
        public boolean isBorderOpaque() {
            return true;
        }
    };*/


    public PAGPrincipal() {

        /*JUGARButton.setBorder(bordeRedondeado);*/
        JUGARButton.setPreferredSize(new Dimension(250,20));

        JUGARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                // Configura las propiedades del nuevo JFrame
                JFrame frame = new JFrame("GUImainFOR");
                frame.setContentPane(new GUImainFOR().PanelPrincipal);
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setBounds(500,200,1000,700);


                // Hace visible el nuevo JFrame
                frame.setVisible(true);
                PanelPrincipalInicio.setVisible(false);







            }
        });




    }
}

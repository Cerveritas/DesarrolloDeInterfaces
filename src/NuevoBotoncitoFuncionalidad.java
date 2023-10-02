import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NuevoBotoncitoFuncionalidad {
    public static void main(String[] args) {



            // se crea frame y panel
            JFrame frame;
            frame = new JFrame();
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setBounds(10,10,300,300);
            JPanel mainPanel=new JPanel();
            //layout
            mainPanel.setLayout(new GridBagLayout());
            // se añaden los botones



        // boton1

        JButton boton1 = new JButton("Boton 1");
            mainPanel.add(boton1,
                    new GridBagConstraints(
                            0,
                            0,
                            1,
                            1,
                            1.0,
                            1.0,
                            GridBagConstraints.CENTER,
                            GridBagConstraints.BOTH,
                            new Insets(0,0,0,0),
                            0,
                            0));
            //boton 2
            mainPanel.add(new JButton("Button 2"),
                    new GridBagConstraints(
                            1,
                            0,
                            1,
                            1,
                            1.0,
                            1.0,
                            GridBagConstraints.CENTER,
                            GridBagConstraints.BOTH,
                            new Insets(0,0,0,0),
                            0,
                            0));
            //boton 3
            mainPanel.add(new JButton("Button 3"),
                    new GridBagConstraints(
                            2,
                            0,
                            1,
                            1,
                            1.0,
                            1.0,
                            GridBagConstraints.CENTER,
                            GridBagConstraints.BOTH,
                            new Insets(0,0,0,0),
                            0,
                            0));
            // boton 4
        TextArea tf = new TextArea("Pulsa el boton 1");
            mainPanel.add(tf,
                    new GridBagConstraints(
                            0,
                            1,
                            3,
                            1,
                            1.0,
                            4.0,
                            GridBagConstraints.CENTER,
                            GridBagConstraints.BOTH,
                            new Insets(0,0,0,0),
                            0,
                            0));
            //boton 5
            mainPanel.add(new JButton("Button 5"),
                    new GridBagConstraints(
                            1,
                            2,
                            2,
                            1,
                            1.0,
                            1.0,
                            GridBagConstraints.SOUTH,
                            GridBagConstraints.HORIZONTAL,
                            new Insets(0,0,0,0),
                            0,
                            0));

            // se añade el panel al frame
            frame.add(mainPanel);

            frame.setVisible(true);


            boton1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tf.setText("Boton 1");
                }
            });
        }
    }






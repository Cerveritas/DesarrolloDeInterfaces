import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiPrimeraCalculadora {


    public static void main(String[] args) {




        JFrame frame = new JFrame("CALCULATOR");
        frame.setBounds(800, 200, 500, 500); // Tamaño
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para la finalizacion del programa


        JTextField textResult = new JTextField("Recarte es una putita");
            textResult.setPreferredSize(new Dimension(400,35));


        JPanel panelPrincipal = new JPanel();
            panelPrincipal.setBackground(Color.magenta);

        JPanel panelResultado = new JPanel();
            panelResultado.setBackground(Color.magenta);
            panelResultado.setPreferredSize(new Dimension(450, 50));
            panelResultado.setBorder(BorderFactory.createTitledBorder("💥-RESULTADO-💥"));


        JPanel panelEspecia = new JPanel(new GridLayout(1, 2,10,10));
            panelEspecia.setPreferredSize(new Dimension(400,90));
            panelEspecia.setBackground(Color.MAGENTA);

        JPanel panelBotones = new JPanel(new GridLayout(4, 4,10,10));
            panelBotones.setPreferredSize(new Dimension(400,300));
            panelBotones.setBackground(Color.MAGENTA);











        JButton botonC = new JButton("C");
                botonC.setBackground(Color.gray);
                botonC.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.BLACK));

        JButton botonMasMenos = new JButton("+/-");
               botonMasMenos.setBackground(Color.lightGray);


        JButton botonDividir = new JButton("➗");
            botonDividir.setBackground(Color.lightGray);

        JButton botonMultiplicar = new JButton("❌");
            botonMultiplicar.setBackground(Color.lightGray);

        JButton boton7 = new JButton("7");
            boton7.setBackground(Color.WHITE);

        JButton boton8 = new JButton("8");
            boton8.setBackground(Color.WHITE);

        JButton boton9 = new JButton("9");
            boton9.setBackground(Color.WHITE);

        JButton botonRestar = new JButton("➖");
            botonRestar.setBackground(Color.lightGray);

        JButton boton4 = new JButton("4");
            boton4.setBackground(Color.WHITE);

        JButton boton5 = new JButton("5");
            boton5.setBackground(Color.WHITE);

        JButton boton6 = new JButton("6");
            boton6.setBackground(Color.WHITE);

        JButton botonSumar = new JButton("➕");
            botonSumar.setBackground(Color.lightGray);

        JButton boton1 = new JButton("1");
            boton1.setBackground(Color.WHITE);

        JButton boton2 = new JButton("2");
            boton2.setBackground(Color.WHITE);

        JButton boton3 = new JButton("3");
            boton3.setBackground(Color.WHITE);

        JButton boton0 = new JButton("0");
            boton0.setBackground(Color.WHITE);

        /***********************************************************************/
        JButton botonIgual = new JButton("=");
            botonIgual.setBackground(Color.lightGray);

        JButton botonReset = new JButton("RESET");
            botonReset.setBackground(Color.gray);
            botonReset.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.BLACK));









        panelBotones.add(botonC);
        panelBotones.add(botonMasMenos);
        panelBotones.add(botonDividir);
        panelBotones.add(botonMultiplicar);
        panelBotones.add(boton7);
        panelBotones.add(boton8);
        panelBotones.add(boton9);
        panelBotones.add(botonRestar);
        panelBotones.add(boton4);
        panelBotones.add(boton5);
        panelBotones.add(boton6);
        panelBotones.add(botonSumar);
        panelBotones.add(boton1);
        panelBotones.add(boton2);
        panelBotones.add(boton3);
        panelBotones.add(boton0);

        panelEspecia.add(botonIgual);
        panelEspecia.add(botonReset);


        panelResultado.add(textResult);








        panelPrincipal.add(panelResultado);
        panelPrincipal.add(panelBotones);
        panelPrincipal.add(panelEspecia);
        //panelPrincipal.add(panelNumerico);


        frame.add(panelPrincipal);





        frame.setVisible(true);





        //ACCIONES ASIGNADOS A LOS BOTONES ❤

        // accion boton 0
        boton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResult.setText("0");
            }
        });

        // accion boton 1
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResult.setText("1");
            }
        });

        // accion boton 2
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResult.setText("2");
            }
        });

        // accion boton 3
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResult.setText("3");
            }
        });

        // accion boton 4
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResult.setText("4");
            }
        });

        // accion boton 5
        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResult.setText("5");
            }
        });

        // accion boton 6
        boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResult.setText("6");
            }
        });

        // accion boton 7
        boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResult.setText("7");
            }
        });

        // accion boton 8
        boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResult.setText("8");
            }
        });

        // accion boton 9
        boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResult.setText("9");
            }
        });

        // accion boton Reset
        botonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResult.setText("");
            }
        });
    }
}

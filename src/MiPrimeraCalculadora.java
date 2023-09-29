import javax.swing.*;
import java.awt.*;

public class MiPrimeraCalculadora {


    public static void main(String[] args) {




        JFrame frame = new JFrame("CALCULATOR");
        frame.setBounds(800, 200, 500, 500); // Tamaño
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para la finalizacion del programa



        JTextField textResult = new JTextField(40);

        JPanel panelPrincipal = new JPanel();

        JPanel panelResultado = new JPanel();

        JPanel panelEspecia = new JPanel(new GridLayout(1, 2,1,1));
            panelEspecia.setPreferredSize(new Dimension(400,90));

        JPanel panelBotones = new JPanel(new GridLayout(5, 4,1,1));
            panelBotones.setPreferredSize(new Dimension(400,300));










            JButton botonDividir = new JButton("C");
                botonDividir.setBackground(Color.decode("FFFFFF"));
            JButton botonMultiplicar = new JButton("+/-");
                botonMultiplicar.setBackground(Color.lightGray);
            JButton botonRestar = new JButton("/");
                botonRestar.setBackground(Color.lightGray);
            JButton botonSumar = new JButton("*");
                botonSumar.setBackground(Color.lightGray);
            JButton botonIgual = new JButton("7");
                botonIgual.setBackground(Color.GRAY);
            JButton botonPunto = new JButton("8");
                botonPunto.setBackground(Color.GRAY);
            JButton boton7 = new JButton("9");
                boton7.setBackground(Color.GRAY);
            JButton boton8 = new JButton("-");
                boton8.setBackground(Color.lightGray);
            JButton boton9 = new JButton("4");
                boton9.setBackground(Color.GRAY);
            JButton boton4 = new JButton("5");
                boton4.setBackground(Color.GRAY);
            JButton boton5 = new JButton("6");
                boton5.setBackground(Color.GRAY);
            JButton boton6 = new JButton("+");
                boton6.setBackground(Color.lightGray);
            JButton boton1 = new JButton("1");
                boton1.setBackground(Color.GRAY);
            JButton boton2 = new JButton("2");
                boton2.setBackground(Color.GRAY);
            JButton boton3 = new JButton("3");
                boton3.setBackground(Color.GRAY);
            JButton boton0 = new JButton("0");
                boton0.setBackground(Color.GRAY);

            JButton botonIguala = new JButton("=");
                botonIguala.setBackground(Color.decode("FFFFFF"));
            JButton botonreset = new JButton("RESET");
                botonreset.setBackground(Color.decode("FFFFFF"));



       // JPanel panelNumerico = new JPanel(new GridLayout(6, 0));








        panelBotones.add(botonDividir);
        panelBotones.add(botonMultiplicar);
        panelBotones.add(botonRestar);
        panelBotones.add(botonSumar);
        panelBotones.add(botonIgual);
        panelBotones.add(botonPunto);
        panelBotones.add(boton7);
        panelBotones.add(boton8);
        panelBotones.add(boton9);
        panelBotones.add(boton4);
        panelBotones.add(boton5);
        panelBotones.add(boton6);
        panelBotones.add(boton1);
        panelBotones.add(boton2);
        panelBotones.add(boton3);
        panelBotones.add(boton0);

        panelEspecia.add(botonIguala);
        panelEspecia.add(botonreset);


        panelResultado.add(textResult);









        panelPrincipal.add(panelResultado);
        panelPrincipal.add(panelBotones);
        panelPrincipal.add(panelEspecia);
        //panelPrincipal.add(panelNumerico);


        frame.add(panelPrincipal);





        frame.setVisible(true);



    }
}

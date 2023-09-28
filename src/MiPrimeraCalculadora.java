import javax.swing.*;
import java.awt.*;

public class MiPrimeraCalculadora {


    public static void main(String[] args) {




        JFrame frame = new JFrame();
        frame.setBounds(800, 200, 500, 600); // Tamaño
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para la finalizacion del programa



        JTextField textResult = new JTextField(40);

        JPanel panelPrincipal = new JPanel();

        JPanel panelResultado = new JPanel();

        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.LEFT));
            JButton botonVacio = new JButton(" ");
            JButton botonCE = new JButton("CE");
            JButton botonC = new JButton("C");
            JButton botonMasMenos = new JButton("+/-");
            JButton botonDividir = new JButton("/");
            JButton botonMultiplicar = new JButton("*");
            JButton botonRestar = new JButton("-");
            JButton botonSumar = new JButton("+");
            JButton botonIgual = new JButton("=");
            JButton botonPunto = new JButton(".");


        JPanel panelNumerico = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton boton7 = new JButton("7");
        JButton boton8 = new JButton("8");
        JButton boton9 = new JButton("9");
        JButton boton4 = new JButton("4");
        JButton boton5 = new JButton("5");
        JButton boton6 = new JButton("6");
        JButton boton1 = new JButton("1");
        JButton boton2 = new JButton("2");
        JButton boton3 = new JButton("3");
        JButton boton0 = new JButton("0");









        panelBotones.add(botonVacio);
        panelBotones.add(botonCE);
        panelBotones.add(botonC);
        panelBotones.add(botonMasMenos);
        panelBotones.add(botonDividir);
        panelBotones.add(botonMultiplicar);
        panelBotones.add(botonRestar);
        panelBotones.add(botonSumar);
        panelBotones.add(botonIgual);
        panelBotones.add(botonPunto);

        panelNumerico.add(boton7);
        panelNumerico.add(boton8);
        panelNumerico.add(boton9);
        panelNumerico.add(boton4);
        panelNumerico.add(boton5);
        panelNumerico.add(boton6);
        panelNumerico.add(boton1);
        panelNumerico.add(boton2);
        panelNumerico.add(boton3);
        panelNumerico.add(boton0);

        panelResultado.add(textResult);









        panelPrincipal.add(panelBotones);
        panelPrincipal.add(panelNumerico);
        panelPrincipal.add(panelResultado);

        frame.add(panelPrincipal);





        frame.setVisible(true);



    }
}

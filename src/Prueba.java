import javax.swing.*;
import java.awt.*;

public class Prueba {

    public static void main(String[] args) {






        JFrame frame = new JFrame();
        frame.setBounds(800, 200, 500, 600); // Tamaño
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para la finalizacion del programa






        JPanel panelPrincipal = new JPanel();
            panelPrincipal.setBackground(Color.blue);



        JPanel panelBotones = new JPanel(new GridLayout(5,0));
            panelBotones.setPreferredSize(new Dimension(800,200));


        JPanel panelPrueba = new JPanel(new GridLayout());
            panelPrueba.setBackground(Color.cyan);














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













        panelPrincipal.add(panelPrueba);
        panelPrincipal.add(panelBotones);



        frame.add(panelPrincipal);





        frame.setVisible(true);









    }
}


package ProyectoCalculadora;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {


    public static double numero1;
    public static String operador = "";



    public static void main(String[] args) {





        JFrame frame = new JFrame("CALCULATOR");
        frame.setBounds(800, 200, 320, 450); // Tamaño
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para la finalizacion del programa


        JTextField textResult = new JTextField("0");
        textResult.setPreferredSize(new Dimension(250,60));
        Font font = new Font("Arial", Font.PLAIN, 35);
        textResult.setFont(font);
        textResult.setHorizontalAlignment(SwingConstants.RIGHT);



        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setBackground(Color.LIGHT_GRAY);

        JPanel panelResultado = new JPanel();
        panelResultado.setBackground(Color.LIGHT_GRAY);
        panelResultado.setPreferredSize(new Dimension(300, 70));
        panelResultado.setBorder(BorderFactory.createTitledBorder("💥-RESULTADO-💥"));


        JPanel panelEspecia = new JPanel(new GridLayout(1, 2,10,10));
        panelEspecia.setPreferredSize(new Dimension(250,80));
        panelEspecia.setBackground(Color.LIGHT_GRAY);

        JPanel panelBotones = new JPanel(new GridLayout(4, 4,10,10));
        panelBotones.setPreferredSize(new Dimension(250,200));
        panelBotones.setBackground(Color.LIGHT_GRAY);











        JButton botonC = new JButton("C");
        botonC.setBackground(Color.decode("#DB9D00"));
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
        botonIgual.setBackground(Color.decode("#DB9D00"));

        JButton botonReset = new JButton("RESET");
        botonReset.setBackground(Color.decode("#990014"));
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
        frame.setResizable(false);





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


        // ACCIONES PARA LOS OPERANDOS Y EL IGUAL

        // accion boton sumar
        botonSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                numero1 = Double.parseDouble(textResult.getText());
                operador = "+";
                textResult.setText("");
            }
        });

        // accion boton restar
        botonRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                numero1 = Double.parseDouble(textResult.getText());
                operador = "-";
                textResult.setText("");
            }
        });

        // accion boton multiplicar
        botonMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                numero1 = Double.parseDouble(textResult.getText());
                operador = "*";
                textResult.setText("");
            }
        });

        // accion boton dividir

        botonDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                numero1 = Double.parseDouble(textResult.getText());
                operador = "/";
                textResult.setText("");
            }
        });





        // accion boton igual
        botonIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero2 = Double.parseDouble(textResult.getText());

                switch (operador){
                    case "+":
                        double resultado = numero1 + numero2;
                        textResult.setText(Double.toString(resultado));
                        break;

                    case "-":
                        resultado = numero1 - numero2;
                        textResult.setText(Double.toString(resultado));
                        break;

                    case "*":
                        resultado = numero1 * numero2;
                        textResult.setText(Double.toString(resultado));
                        break;

                    case "/":
                        resultado = numero1 / numero2;
                        textResult.setText(Double.toString(resultado));
                        break;

                    default: textResult.setText("El orden de las operaciones no es correcto");
                }


                // otra manera de hacer las operaciones con elses

                /*

                if (operador.equals("+")){
                        double resultado = numero1 + numero2;
                            textResult.setText(Double.toString(resultado));
                    } else if (operador.equals("-")){
                        double resultado = numero1 - numero2;
                            textResult.setText(Double.toString(resultado));
                    } else if (operador.equals("*")){
                        double resultado = numero1 * numero2;
                            textResult.setText(Double.toString(resultado));
                    } else if (operador.equals("/")){
                        double resultado = numero1 / numero2;
                            textResult.setText(Double.toString(resultado));
                    }*/

            }
        });

    }
}













package ProyectoCalculadora;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
            panelPrincipal.setBackground(Color.decode("#A069E0"));

        JPanel panelResultado = new JPanel();
            panelResultado.setBackground(Color.decode("#A069E0"));
            panelResultado.setPreferredSize(new Dimension(300, 70));
            panelResultado.setBorder(BorderFactory.createTitledBorder("💥-RESULTADO-💥"));


        JPanel panelEspecia = new JPanel(new GridLayout(1, 2,10,10));
            panelEspecia.setPreferredSize(new Dimension(250,80));
            panelEspecia.setBackground(Color.decode("#A069E0"));

        JPanel panelBotones = new JPanel(new GridLayout(4, 4,10,10));
            panelBotones.setPreferredSize(new Dimension(250,200));
            panelBotones.setBackground(Color.decode("#A069E0"));



/********************************************************************************************************************************************************************************************************************/

        // OPCIONES UNICAMENTE DE BOTONES ESPECIALES PARA SALIR Y MINIMIZAR

        Border border = BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.lightGray, Color.darkGray);




        // panel especial de las opciones
        JPanel panelOpciones = new JPanel(new GridLayout(1,1,40,10));
            panelPrincipal.add(panelOpciones);


        // botonExit
        JButton botonExit = new JButton("X" );
            botonExit.setBackground(Color.decode("#04E0DD"));
            botonExit.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.BLACK));
            botonExit.setPreferredSize(new Dimension(40,40));
            botonExit.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar
            botonExit.setBorder(border);
            botonExit.setBorder(new LineBorder(Color.BLACK, 5));

        // agregacion de boton exit al panel de opciones
        panelOpciones.add(botonExit, BorderLayout.EAST);


        // accion de estos botones

        botonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        botonExit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                botonExit.setBackground(Color.decode("#9BC9E0"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                botonExit.setBackground(Color.decode("#04E0DD"));
            }
        });



/********************************************************************************************************************************************************************************************************************/






        JButton botonC = new JButton("C");
            botonC.setBackground(Color.decode("#DB9D00"));
            botonC.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.BLACK));
            botonC.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar

        JButton botonMasMenos = new JButton("+/-");
            botonMasMenos.setBackground(Color.lightGray);
            botonMasMenos.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar


        JButton botonDividir = new JButton("➗");
            botonDividir.setBackground(Color.lightGray);
            botonDividir.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar

        JButton botonMultiplicar = new JButton("❌");
            botonMultiplicar.setBackground(Color.lightGray);
            botonMultiplicar.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar

        JButton boton7 = new JButton("7");
            boton7.setBackground(Color.WHITE);
            boton7.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar

        JButton boton8 = new JButton("8");
            boton8.setBackground(Color.WHITE);
            boton8.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar

        JButton boton9 = new JButton("9");
            boton9.setBackground(Color.WHITE);
            boton9.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar

        JButton botonRestar = new JButton("➖");
            botonRestar.setBackground(Color.lightGray);
            botonRestar.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar

        JButton boton4 = new JButton("4");
            boton4.setBackground(Color.WHITE);
            boton4.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar

        JButton boton5 = new JButton("5");
            boton5.setBackground(Color.WHITE);
            boton5.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar

        JButton boton6 = new JButton("6");
            boton6.setBackground(Color.WHITE);
            boton6.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar

        JButton botonSumar = new JButton("➕");
            botonSumar.setBackground(Color.lightGray);
            botonSumar.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar

        JButton boton1 = new JButton("1");
            boton1.setBackground(Color.WHITE);
            boton1.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar

        JButton boton2 = new JButton("2");
            boton2.setBackground(Color.WHITE);
            boton2.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar

        JButton boton3 = new JButton("3");
            boton3.setBackground(Color.WHITE);
            boton3.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar

        JButton boton0 = new JButton("0");
            boton0.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar
            boton0.setBackground(Color.WHITE);

        /***********************************************************************/

        JButton botonIgual = new JButton("=");
            botonIgual.setBackground(Color.decode("#04E0DD"));
            botonIgual.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar

        JButton botonReset = new JButton("RESET");
            botonReset.setBackground(Color.decode("#990014"));
            botonReset.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.BLACK));
            botonReset.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar









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





        frame.setUndecorated(true);
        frame.setVisible(true);
        frame.setResizable(false);







        //ACCIONES ASIGNADOS A LOS BOTONES ❤

        // accion boton 0
        boton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textResult.getText().equals("0")){
                    textResult.setText("0");
                } else {
                    textResult.setText(textResult.getText() + "0");
                }
            }
        });

        boton0.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                boton0.setBackground(Color.LIGHT_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton0.setBackground(Color.WHITE);
            }
        });

        // accion boton 1
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textResult.getText().equals("0")){
                    textResult.setText("1");
                } else {
                    textResult.setText(textResult.getText() + "1");
                }
            }
        });

        boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                boton1.setBackground(Color.LIGHT_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton1.setBackground(Color.WHITE);
            }
        });

        // accion boton 2
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textResult.getText().equals("0")){
                    textResult.setText("2");
                } else {
                    textResult.setText(textResult.getText() + "2");
                }
            }
        });

        boton2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                boton2.setBackground(Color.LIGHT_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton2.setBackground(Color.WHITE);
            }
        });

        // accion boton 3
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textResult.getText().equals("0")){
                    textResult.setText("3");
                } else {
                    textResult.setText(textResult.getText() + "3");
                }
            }
        });

        boton3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                boton3.setBackground(Color.LIGHT_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton3.setBackground(Color.WHITE);
            }
        });

        // accion boton 4
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textResult.getText().equals("0")){
                    textResult.setText("4");
                } else {
                    textResult.setText(textResult.getText() + "4");
                }
            }
        });

        boton4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                boton4.setBackground(Color.LIGHT_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton4.setBackground(Color.WHITE);
            }
        });

        // accion boton 5
        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textResult.getText().equals("0")){
                    textResult.setText("5");
                } else {
                    textResult.setText(textResult.getText() + "5");
                }
            }
        });

        boton5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                boton5.setBackground(Color.LIGHT_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton5.setBackground(Color.WHITE);
            }
        });

        // accion boton 6
        boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textResult.getText().equals("0")){
                    textResult.setText("6");
                } else {
                    textResult.setText(textResult.getText() + "6");
                }
            }
        });

        boton6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                boton6.setBackground(Color.LIGHT_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton6.setBackground(Color.WHITE);
            }
        });

        // accion boton 7
        boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textResult.getText().equals("0")){
                    textResult.setText("7");
                } else {
                    textResult.setText(textResult.getText() + "7");
                }
            }
        });

        boton7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                boton7.setBackground(Color.LIGHT_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton7.setBackground(Color.WHITE);
            }
        });

        // accion boton 8
        boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textResult.getText().equals("0")){
                    textResult.setText("8");
                } else {
                    textResult.setText(textResult.getText() + "8");
                }
            }
        });

        boton8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                boton8.setBackground(Color.LIGHT_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton8.setBackground(Color.WHITE);
            }
        });

        // accion boton 9
        boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textResult.getText().equals("0")){
                    textResult.setText("9");
                } else {
                    textResult.setText(textResult.getText() + "9");
                }
            }
        });

        boton9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                boton9.setBackground(Color.LIGHT_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton9.setBackground(Color.WHITE);
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
                    case "+": // <-- situacion SUMA
                        double resultado = numero1 + numero2;
                        textResult.setText(Double.toString(resultado));
                        break;

                    case "-": // <-- situacion RESTA
                        resultado = numero1 - numero2;
                        textResult.setText(Double.toString(resultado));
                        break;

                    case "*": // <-- situacion MULTIPLICACION
                        resultado = numero1 * numero2;
                        textResult.setText(Double.toString(resultado));
                        break;

                    case "/": // <-- situacion DIVISION
                        resultado = numero1 / numero2;
                        textResult.setText(Double.toString(resultado));
                        break;

                    default: textResult.setText("ERROR");
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


        botonIgual.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                botonIgual.setBackground(Color.decode("#9BC9E0"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                botonIgual.setBackground(Color.decode("#04E0DD"));
            }
        });









    } // <-- cierre del main
}













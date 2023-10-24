package ProyectoCalculadora;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class Calculator {


    public static double numero1;
    public static String operador = "";


    public static void main(String[] args) {


        JFrame frame = new JFrame("CALCULATOR");
        frame.setBounds(800, 200, 320, 450); // Tamaño
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para la finalizacion del programa


        JTextField textResult = new JTextField("0");
        textResult.setPreferredSize(new Dimension(250, 60));
        Font font = new Font("Arial", Font.PLAIN, 35);
        textResult.setFont(font);
        textResult.setHorizontalAlignment(SwingConstants.RIGHT);
        textResult.setBackground(Color.decode("#B7ACDF"));


        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setBackground(Color.decode("#A069E0"));

        JPanel panelResultado = new JPanel();
        panelResultado.setBackground(Color.decode("#A069E0"));
        panelResultado.setPreferredSize(new Dimension(300, 70));
        panelResultado.setBorder(BorderFactory.createTitledBorder("💥-RESULTADO-💥"));


        JPanel panelEspecia = new JPanel(new GridLayout(1, 2, 10, 10));
        panelEspecia.setPreferredSize(new Dimension(250, 80));
        panelEspecia.setBackground(Color.decode("#A069E0"));

        JPanel panelBotones = new JPanel(new GridLayout(4, 4, 10, 10));
        panelBotones.setPreferredSize(new Dimension(250, 200));
        panelBotones.setBackground(Color.decode("#A069E0"));


/********************************************************************************************************************************************************************************************************************/

        // OPCIONES UNICAMENTE DE BOTONES ESPECIALES PARA SALIR Y MINIMIZAR

        Border border = BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.lightGray, Color.darkGray);


        // panel especial de las opciones
        JPanel panelOpciones = new JPanel(new GridLayout(1, 1, 40, 10));
        panelPrincipal.add(panelOpciones);


        // botonExit
        JButton botonExit = new JButton("X");
        botonExit.setBackground(Color.decode("#04E0DD"));
        botonExit.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.BLACK));
        botonExit.setPreferredSize(new Dimension(40, 40));
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


        JButton botonC = new JButton("√");
            botonC.setBackground(Color.decode("#EB23D7"));
            botonC.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.BLACK));
            botonC.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar

        JButton botonFactorizacion = new JButton("BHO");
            botonFactorizacion.setBackground(Color.decode("#EB23D7"));
            botonFactorizacion.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.BLACK));
            botonFactorizacion.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar


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
            botonReset.setBackground(Color.decode("#D4AAEA"));
            botonReset.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.BLACK));
            botonReset.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar


        panelBotones.add(botonC);
        panelBotones.add(botonFactorizacion);
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


        // movimiento de ventana
        final Point[] initialClick = {null};
        frame.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                initialClick[0] = e.getPoint();
                frame.getComponentAt(initialClick[0]);
            }
        });

        frame.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                int thisX = frame.getLocation().x;
                int thisY = frame.getLocation().y;

                int xMoved = thisX + e.getX() - initialClick[0].x;
                int yMoved = thisY + e.getY() - initialClick[0].y;

                frame.setLocation(xMoved, yMoved);
            }
        });


        //ACCIONES ASIGNADOS A LOS BOTONES ❤

        // accion boton 0
        boton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textResult.getText().equals("0")) {
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
                if (textResult.getText().equals("0")) {
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
                if (textResult.getText().equals("0")) {
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
                if (textResult.getText().equals("0")) {
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
                if (textResult.getText().equals("0")) {
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
                if (textResult.getText().equals("0")) {
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
                if (textResult.getText().equals("0")) {
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
                if (textResult.getText().equals("0")) {
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
                if (textResult.getText().equals("0")) {
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
                if (textResult.getText().equals("0")) {
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
        botonReset.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                botonReset.setBackground(Color.decode("#E0D5E8"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                botonReset.setBackground(Color.decode("#D4AAEA"));
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

                switch (operador) {
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

                    default:
                        textResult.setText("ERROR");

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


        JButton botonEstelar = new JButton("©CopiRight Sergio Cervera Jimenez");
        JPanel panelEstelar = new JPanel();
        panelPrincipal.add(panelEstelar);
        panelEstelar.add(botonEstelar);
        botonEstelar.setBackground(Color.decode("#A069E0"));
        panelEstelar.setBackground(Color.decode("#A069E0"));
        Font font3 = new Font("Arial", Font.PLAIN, 10);
        botonEstelar.setFont(font3);
        //botonEstelar.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.decode("#A069E0"), Color.decode("#A069E0")));
        botonEstelar.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar
        botonEstelar.setBorderPainted(false);






// este se usa para abrir una ventana aparte, no dentro del mismo frame

/*
        // Acción del botón para abrir la segunda ventana
        botonC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                JFrame secondFrame = new JFrame("Segunda Ventana");
                secondFrame.setBounds(800, 200, 320, 200); // Tamaño de la segunda ventana
                secondFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);






                // Agrega componentes a la segunda ventana
                // (puedes agregar botones, campos de texto, etc., según tus necesidades)

                // Muestra la segunda ventana
                secondFrame.setVisible(true);
            }
        });
*/


/**********************************************************************************************************************************************************************************************************************/
/**********************************************************************************************************************************************************************************************************************/
/**********************************************************************************************************************************************************************************************************************/
/**********************************************************************************************************************************************************************************************************************/
/**********************************************************************************************************************************************************************************************************************/
/**********************************************************************************************************************************************************************************************************************/
////////////////////////////////////////COMIENZO DEL SEGUNDO FRAME////////////////////////////////////////

        JPanel secondPanel = new JPanel();
        secondPanel.setBackground(Color.decode("#A069E0"));


        botonC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().remove(panelPrincipal);
                frame.getContentPane().add(secondPanel);
                frame.revalidate();
                frame.repaint();
            }
        });




        // Configura los componentes de secondPanel

        JButton backButton = new JButton("Volver a la Calculadora");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().remove(secondPanel);
                frame.getContentPane().add(panelPrincipal);
                frame.revalidate();
                frame.repaint();
            }
        });


        backButton.setBackground(Color.decode("#EB23D7"));
        backButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.BLACK));
        backButton.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar
        backButton.setPreferredSize(new Dimension(400, 60));




        secondPanel.add(backButton);

        // Resto de código para secondPanel...


        JPanel panelTitulo = new JPanel();
            panelTitulo.setBackground(Color.decode("#A069E0"));
            secondPanel.add(panelTitulo);

        JLabel label = new JLabel("INDICAME EL NUMERO A CALCULAR");
            panelTitulo.add(label);
            Font fontLabel = new Font("Arial", Font.PLAIN, 16);
            label.setFont(fontLabel);
                EmptyBorder margenPanelTitulo = new EmptyBorder(25, 20, 25, 20);
                    panelTitulo.setBorder(margenPanelTitulo);




        JTextField textResults = new JTextField("");
        textResults.setPreferredSize(new Dimension(250, 60));
        Font fontResults = new Font("Arial", Font.PLAIN, 35);
        textResults.setFont(fontResults);
        textResults.setHorizontalAlignment(SwingConstants.RIGHT);
        textResults.setBackground(Color.decode("#B7ACDF"));


        secondPanel.add(textResults);




        JButton botonCalcularRC = new JButton("CALCULAR");
            secondPanel.add(botonCalcularRC);
        botonCalcularRC.setBackground(Color.decode("#04E0DD"));
        botonCalcularRC.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.BLACK));
        botonCalcularRC.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar
        botonCalcularRC.setPreferredSize(new Dimension(250, 50));



/*
        ScrollPane scrollPane = new ScrollPane();
        secondPanel.add(scrollPane, new GridBagConstraints(0, 2, 3, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(5, 0, 10, 10), 0, 0));
        scrollPane.setPreferredSize(new Dimension(200, 150));
        scrollPane.setBackground(Color.WHITE);
*/


        JTextArea res = new JTextArea("");
        res.setPreferredSize(new Dimension(250, 60));
        font = new Font("Arial", Font.PLAIN, 35);
        res.setFont(font);
        //res.setHorizontalAlignment(SwingConstants.RIGHT);
        res.setPreferredSize(new Dimension(300,170));
        res.setWrapStyleWord(true);
        res.setLineWrap(true);


        secondPanel.add(res);

        botonCalcularRC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double numeroUser = Integer.parseInt(textResults.getText());
                double raiz = Math.pow(numeroUser, 0.5);

                res.setText(String.valueOf(raiz));


            }
        });



        frame.add(secondPanel);

        // Inicialmente, muestra el panel de la calculadora



        secondPanel.setVisible(false);
        frame.setLayout(new CardLayout());
        frame.setVisible(true);



/**********************************************************************************************************************************************************************************************************************/
/**********************************************************************************************************************************************************************************************************************/
/**********************************************************************************************************************************************************************************************************************/
/**********************************************************************************************************************************************************************************************************************/
/**********************************************************************************************************************************************************************************************************************/
/**********************************************************************************************************************************************************************************************************************/
////////////////////////////////////////COMIENZO DEL TERCER FRAME////////////////////////////////////////


        JPanel tercerPanel = new JPanel();
        tercerPanel.setBackground(Color.decode("#A069E0"));

        botonFactorizacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().remove(panelPrincipal);
                frame.getContentPane().add(tercerPanel);
                frame.revalidate();
                frame.repaint();
            }
        });




        // Configura los componentes de secondPanel

        JButton backButton2 = new JButton("Volver a la Calculadora");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().remove(tercerPanel);
                frame.getContentPane().remove(secondPanel);
                frame.getContentPane().add(panelPrincipal);
                frame.revalidate();
                frame.repaint();
            }
        });


        backButton2.setBackground(Color.decode("#EB23D7"));
        backButton2.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.BLACK));
        backButton2.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar
        backButton2.setPreferredSize(new Dimension(400, 60));




        tercerPanel.add(backButton2);

        // Resto de código para secondPanel...


        JPanel panelLabelFac = new JPanel();
        tercerPanel.add(panelLabelFac);
        JLabel labelFac = new JLabel("INDICA EL NUMERO A CONVERSAR");
        panelLabelFac.add(labelFac);
        panelLabelFac.setBackground(Color.decode("#A069E0"));


        JTextField jTextFieldFac = new JTextField();
        tercerPanel.add(jTextFieldFac);
        jTextFieldFac.setPreferredSize(new Dimension(300, 40));
        jTextFieldFac.setBackground(Color.decode("#B7ACDF"));
        Font fontFac = new Font("Arial", Font.PLAIN, 35);
        jTextFieldFac.setFont(fontFac);
        jTextFieldFac.setHorizontalAlignment(SwingConstants.RIGHT);



        JButton botonFac = new JButton("CALCULAR CONVERSION");
        tercerPanel.add(botonFac);
        botonFac.setBackground(Color.decode("#04E0DD"));
        botonFac.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.BLACK));
        botonFac.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar
        botonFac.setPreferredSize(new Dimension(250, 50));



        //Text Area Resultado
        JTextArea taResultadoFact = new JTextArea();
        JScrollPane spResultadoFact = new JScrollPane(taResultadoFact);
        JScrollBar scrollBar = new JScrollBar();
        //scrollBar.setBackground(COLOR_TEXTFIELD);
        //scrollBar.setUI(new CustomScrollBarUI());
        //scrollBar.setBorder(new LineBorder(COLOR_PRINCIPAL, 1));
        spResultadoFact.setVerticalScrollBar(scrollBar);
        taResultadoFact.setFont(new Font("Courier New", Font.BOLD, 16));
        //taResultadoFact.setBackground(COLOR_TEXTFIELD);
        taResultadoFact.setEditable(false);
        //taResultadoFact.setBorder(new LineBorder(COLOR_SECUNDARIO));
        tercerPanel.add(spResultadoFact);
        spResultadoFact.setPreferredSize(new Dimension(250, 200));




    //      CODIGO PARA REALIZAR UNA OPERACION DE FACTORIZACION     //
/*

        botonFac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String resultado = new String("Factorización de " +jTextFieldFac.getText());
                int n = Integer.parseInt(jTextFieldFac.getText());
                String espacio = " ";
                int iaux = 0;
                int l = Integer.parseInt(jTextFieldFac.getText());
                String espacioauxiliar = "   ";
                String espaciofinal= "   ";
                int naux = Integer.parseInt(jTextFieldFac.getText());
                for (int i= 2 ; i <=n;)
                {
                    int numdig = 0;
                    int numdig2 = 0;
                    if (n % i == 0) {
                        for (int j = n; j > 0; j = j / 10) {
                            numdig++;
                        }
                        resultado += ("\n" + espaciofinal + n+" | "+i);
                        n = n / i;
                        for (int k = n; k > 0; k = k / 10) {
                            numdig2++;
                        }
                        while (numdig > numdig2) {
                            espaciofinal = espaciofinal + espacio;
                            numdig--;
                        }
                    }
                    if (n % i != 0) {
                        i++;
                    }
                    iaux = i;
                }
                if (n == iaux) {
                    resultado += ("\n" + espaciofinal + iaux+" | " +iaux);}
                int numdig = 0;
                for (int j = naux; j > 0 ; j = j / 10) {
                    numdig++;
                }
                while (numdig > 1) {
                    espacioauxiliar = espacioauxiliar + espacio;
                    numdig--;
                }
                resultado += ("\n" + espacioauxiliar + 1+" | " +1 + "\n");

                taResultadoFact.setText(resultado);
            }
        });

*/




        botonFac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                int numeroUser = Integer.parseInt(jTextFieldFac.getText());


                if (numeroUser == 0) {
                    System.out.println("El número binario es: 0");
                } else {
                    String binary = "";
                    String octal = "";
                    String hex = "";
                    int num = numeroUser;

                    while (num > 0) {
                        int remainder = num % 2;
                        binary = remainder + binary;
                        num /= 2;
                    }

                    num = numeroUser;

                    while (num > 0) {
                        int remainder = num % 8;
                        octal = remainder + octal;
                        num /= 8;
                    }

                    num = numeroUser;

                    while (num > 0) {
                        int remainder = num % 16;
                        if (remainder < 10) {
                            hex = remainder + hex;
                        } else {
                            char hexDigit = (char) ('A' + (remainder - 10));
                            hex = hexDigit + hex;
                        }
                        num /= 16;
                    }


                    taResultadoFact.setText("El numero "+numeroUser+"\n"+
                                            "En binario es "+binary+"\n"+
                                            "En hexadecimal es "+hex+"\n"+
                                            "En octal es "+octal);
                }
            }
        });




/**********************************************************************************************************************************************************************************************************************/
/**********************************************************************************************************************************************************************************************************************/
/**********************************************************************************************************************************************************************************************************************/
/**********************************************************************************************************************************************************************************************************************/
/**********************************************************************************************************************************************************************************************************************/
/**********************************************************************************************************************************************************************************************************************/
////////////////////////////////////////COMIENZO DEL FRAME ESTELAR////////////////////////////////////////






        // Acción del botón para abrir la segunda ventana
        botonEstelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                JFrame stelarFrame = new JFrame("Ventana Estelar");
                stelarFrame.setBounds(800, 200, 320, 300); // Tamaño de la ventana estelar
                stelarFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);





                JPanel panelRedaccion = new JPanel();
                stelarFrame.add(panelRedaccion);
                JTextArea textAreaEstelar = new JTextArea(
                        "\"Quiero expresar mi sincera gratitud\ny reconocimiento " +
                        "por el arduo \ntrabajo y esfuerzo que han sido\ninvertidos en la creación de esta\ncalculadora. " +
                        "Este proyecto no habría\nsido posible sin el compromiso\ny esfuerazo realizado. " +
                        "\nAgradezco profundamente sus\ncontribuciones,\nque han permitido que esta calculadora\nsea una herramienta valiosa para\nnuestros usuarios.\n " +
                        "¡Gracias por su trabajo excepcional!\"");
                panelRedaccion.add(textAreaEstelar);
                textAreaEstelar.setPreferredSize(new Dimension(220,220));


                textAreaEstelar.setEditable(false);


                JButton botonExitEstelar = new JButton("EXIT");
                JPanel panelBotonEstelear = new JPanel();
                panelRedaccion.add(panelBotonEstelear);
                panelBotonEstelear.add(botonExitEstelar);
                botonExitEstelar.setBackground(Color.decode("#04E0DD"));
                botonExitEstelar.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.BLACK));
                botonExitEstelar.setFocusPainted(false); // <-- para que no salga cuadradito rectangular al clicar
                botonExitEstelar.setPreferredSize(new Dimension(250, 50));

                botonExitEstelar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });





                // Muestra la ventana estelar
                stelarFrame.setUndecorated(true);
                stelarFrame.setVisible(true);
                stelarFrame.setResizable(false);
            }
        });
    } // <-- cierre del main
}













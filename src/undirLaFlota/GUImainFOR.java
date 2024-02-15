package undirLaFlota;

import javax.swing.*;
import java.awt.*;

public class GUImainFOR {
    private JPanel PanelPrincipal;
    private JButton[][] botones;


    public static void main(String[] args) {
        JFrame frame = new JFrame("GUImainFOR");
        frame.setContentPane(new GUImainFOR().PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(50,50,700,700);

    }

    public GUImainFOR() {
        botonesTablero();
    }

    public void botonesTablero(){
        botones = new JButton[20][20];
        PanelPrincipal.setLayout(new GridLayout(20,20));
        for (int i = 0; i < 20; i++){
            for (int j = 0; j< 20; j++){
                botones[i][j] = new JButton();
                botones[i][j].setBackground(Color.GREEN);
                PanelPrincipal.add(botones[i][j], i,j);
            }
        }


    }









}

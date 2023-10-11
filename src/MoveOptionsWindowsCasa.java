import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MoveOptionsWindowsCasa {
    public static void main(String[] args) {



        JFrame frame = new JFrame("MoveOptionsWindowsCasa");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setBounds(700, 350, 500, 225);

        JPanel panelPrincipal = new JPanel(new GridBagLayout());





/********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************/

        DefaultListModel<String> listModelIZQ = new DefaultListModel<>();
        JList<String> listaNombresIZQ = new JList<>(listModelIZQ);
            panelPrincipal.add(listaNombresIZQ, new GridBagConstraints(0, 0, 0, 0, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));


        listModelIZQ.addElement("Sergio");
        listModelIZQ.addElement("Nahiara");
        listModelIZQ.addElement("Messi");
        listModelIZQ.addElement("Mark");
        listModelIZQ.addElement("Machu");
        listModelIZQ.addElement("Luis");
        listModelIZQ.addElement("Paco");
        listModelIZQ.addElement("Kevin");
        listModelIZQ.addElement("Brian");
        listModelIZQ.addElement("Brian1");
        listModelIZQ.addElement("Brian2");
        listModelIZQ.addElement("Brian3");


        ScrollPane scrollPaneIZQ = new ScrollPane();
        scrollPaneIZQ.add(listaNombresIZQ);
        panelPrincipal.add(scrollPaneIZQ, new GridBagConstraints(0, 0, 1, 4, 1.0, 1.0, GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(10, 10, 10, 10), 0, 0));
        scrollPaneIZQ.setPreferredSize(new Dimension(300, 100));


/********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************/





        DefaultListModel<String> listModelDER = new DefaultListModel<>();
        JList<String> listaNombresDER = new JList<>(listModelDER);
        panelPrincipal.add(listaNombresDER, new GridBagConstraints(0, 0, 0, 0, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));




        ScrollPane scrollPaneDER = new ScrollPane();
            scrollPaneDER.add(listaNombresDER);
                panelPrincipal.add(scrollPaneDER, new GridBagConstraints(2, 0, 1, 4, 1.0, 1.0, GridBagConstraints.EAST, GridBagConstraints.BOTH, new Insets(10, 10, 10, 10), 0, 0));
                    scrollPaneDER.setPreferredSize(new Dimension(300, 100));



/********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************/

        JButton botonDERDER = new JButton(">>");
            panelPrincipal.add(botonDERDER, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(10, 10, 10, 10), 0, 0));


        JButton botonDER = new JButton(" >");
            panelPrincipal.add(botonDER, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(10, 10, 10, 10), 0, 0));


        JButton botonIZQ = new JButton("< ");
            panelPrincipal.add(botonIZQ, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(10, 10, 10, 10), 0, 0));

        JButton botonIZQIZQ = new JButton("<<");
            panelPrincipal.add(botonIZQIZQ, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(10, 10, 10, 10), 0, 0));




/********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************/

        frame.add(panelPrincipal);
        frame.setVisible(true);
        frame.setResizable(false);

/********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************/



        // METODO PARA BOTON DERECHO

        botonDER.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String seleccionado = listaNombresIZQ.getSelectedValue();

                if (seleccionado != null){
                    listModelIZQ.removeElement(seleccionado);
                    listModelDER.addElement(seleccionado);
                }
            }
        });



        // METODO PARA BOTON IZQUIERDO

        botonIZQ.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String seleccionado = listaNombresDER.getSelectedValue();

                if (seleccionado != null){
                    listModelDER.removeElement(seleccionado);
                    listModelIZQ.addElement(seleccionado);
                }
            }
        });




        // METODO PARA DOBLE BOTON DERECHO

        botonDERDER.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {


                int numElementos = listModelIZQ.getSize();
                List<String> elementos = new ArrayList<>();

                for (int i = 0; i < numElementos; i++) {
                    elementos.add(listModelIZQ.get(i));
                }

                listModelIZQ.clear();

                for (String elemento : elementos) {
                    listModelDER.addElement(elemento);
                }
            }
        });



        // METODO PARA DOBLE BOTON IZQUIERD

        botonIZQIZQ.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                int numElementos = listModelDER.getSize();
                List<String> elementos = new ArrayList<>();

                for (int i = 0; i < numElementos; i++) {
                    elementos.add(listModelDER.get(i));
                }

                listModelDER.clear();

                for (String elemento : elementos) {
                    listModelIZQ.addElement(elemento);
                }

            }
        });
    }
}

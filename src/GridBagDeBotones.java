import javax.swing.*;
import java.awt.*;

public class GridBagDeBotones {
    public static void main(String[] args) {



        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,200,500,500);


        JPanel panelUnico = new JPanel(new GridBagLayout());





        JLabel lName = new JLabel("FUll Name");
            JTextField nameField = new JTextField();
                panelUnico.add(lName, new GridBagConstraints(0,0,1,1,1.0,0.10, GridBagConstraints.EAST, GridBagConstraints.EAST, new Insets(0,0,0,10),0,0));
                panelUnico.add(nameField, new GridBagConstraints(1,0,3,1,0.1,0.10, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,10),0,0));

        JLabel lStreet = new JLabel("Street");
                panelUnico.add(lStreet, new GridBagConstraints(1,1,1,1,1.0,0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0,0,10,0),0,0));

        JLabel lCity = new JLabel("City");
                panelUnico.add(lCity, new GridBagConstraints(2,1,1,1,1.0,0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0,0,10,0),0,0));

        JLabel lZipCode = new JLabel("ZipCode");
                panelUnico.add(lZipCode, new GridBagConstraints(3,1,1,1,1.0,0.10, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new Insets(0,0,10,0),0,0));

        JLabel lAddress = new JLabel("Address");
            JTextField AdderessField = new JTextField();
            JTextField AdderessField2 = new JTextField();
            JTextField AdderessField3 = new JTextField();
                panelUnico.add(lAddress, new GridBagConstraints(0,2,1,1,1.0,0.10, GridBagConstraints.EAST, GridBagConstraints.EAST, new Insets(0,0,0,10),0,0));
                panelUnico.add(AdderessField, new GridBagConstraints(1,2,1,1,1.0,0.10, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,10),0,0));
                panelUnico.add(AdderessField2, new GridBagConstraints(2,2,1,1,1.0,0.10, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,10),0,0));
                panelUnico.add(AdderessField3, new GridBagConstraints(3,2,1,1,1.0,0.10, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,10),0,0));

        JLabel lPhone = new JLabel("Phone");
            JTextField phoneField = new JTextField();
                panelUnico.add(lPhone, new GridBagConstraints(0,3,1,1,1.0,0.10, GridBagConstraints.EAST, GridBagConstraints.EAST, new Insets(0,0,0,10),0,0));
                panelUnico.add(phoneField,  new GridBagConstraints(1,3,1,1,1.0,0.10, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,10),0,0));

        JLabel lAge = new JLabel("Age");
            JTextField ageField = new JTextField();
                panelUnico.add(lAge, new GridBagConstraints(2,3,1,1,1.0,0.10, GridBagConstraints.EAST, GridBagConstraints.EAST, new Insets(0,0,0,10),0,0));
                panelUnico.add(ageField,  new GridBagConstraints(3,3,1,1,1.0,0.10, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,10),0,0));

        JLabel lDescription = new JLabel("Description");
            JTextArea descriptionField = new JTextArea();
                panelUnico.add(lDescription, new GridBagConstraints(0,4,1,1,1.0,1.0, GridBagConstraints.NORTHEAST, GridBagConstraints.NORTHEAST, new Insets(0,0,0,10),0,0));
                panelUnico.add(descriptionField, new GridBagConstraints(1,4,3,1,1,4.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,10),0,0));

        JButton boton = new JButton("Submit");
                panelUnico.add(boton, new GridBagConstraints(3,5,1,1,1.0,1.0, GridBagConstraints.NORTHEAST, GridBagConstraints.NORTHEAST, new Insets(0,0,0,10),0,0));

















        frame.add(panelUnico);
        frame.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;

public class MiPrimeraVentana {
    public static void main(String[] args) {


        JFrame f = new JFrame();
        f.setBounds(0, 0, 300, 600); // Tamaño
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para la finalizacion del programa


        // Este es el panel principal
        JPanel panel = new JPanel(new FlowLayout());
        f.add(panel);



        // Crear etiqueta y campo de texto para el DNI
        JLabel DNIlabel = new JLabel("Número de DNI:");
        JTextField DNItextField = new JTextField(25);

        // Crear etiqueta y campo de texto para el nombre
        JLabel nombreLabel = new JLabel("Nombre:");
        JTextField nombreTextField = new JTextField(25);

        JLabel apellidosLabel = new JLabel("Apellidos:");
        JTextField apellidosTextField = new JTextField(25);

        // Crear etiqueta y campo de texto para el apellido
        JLabel sexoLabel = new JLabel("Sexo:");
        JTextField sexoTextField = new JTextField(25);

        JLabel nacionalidadLabel = new JLabel("Nacionalidad:");
        JTextField nacionalidadTextField = new JTextField(25);

        JLabel FechaNacimientoLabel = new JLabel("FechaNacimiento:");
        JTextField FechaNacimientoTextField = new JTextField(25);

        JLabel DomicilioLabel = new JLabel("Domicilio:");
        JTextField DomicilioTextField = new JTextField(25);



        // Agregrar componentes al panel
        panel.add(DNIlabel);
        panel.add(DNItextField);

        panel.add(nombreLabel);
        panel.add(nombreTextField);

        panel.add(sexoLabel);
        panel.add(sexoTextField);

        panel.add(apellidosLabel);
        panel.add(apellidosTextField);

        panel.add(nacionalidadLabel);
        panel.add(nacionalidadTextField);

        panel.add(FechaNacimientoLabel);
        panel.add(FechaNacimientoTextField);

        panel.add(DomicilioLabel);
        panel.add(DomicilioTextField);

        // Agregar el panel a la vetana
        f.add(panel);



        // Boton sin uso
        JButton submitButton = new JButton("ENVIAR");
        panel.add(submitButton);

        // Mostrar la ventana
        f.setVisible(true); // Visibilidad

    }
}

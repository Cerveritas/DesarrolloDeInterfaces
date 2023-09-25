import javax.swing.*;

public class MiPrimeraVentanaCopi {
    public static void main(String[] args) {


        // Crear una ventana
        JFrame frame = new JFrame("Formulario de DNI");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel
        JPanel panel = new JPanel();

        // Crear etiqueta para el DNI
        JLabel label = new JLabel("Número de DNI:");
        panel.add(label);

        // Crear campo de texto para ingresar el DNI
        JTextField dniTextField = new JTextField(10);
        panel.add(dniTextField);

        // Crear un botón para enviar el formulario
        JButton submitButton = new JButton("Enviar");
        panel.add(submitButton);

        // Agregar el panel a la ventana
        frame.add(panel);

        // Mostrar la ventana
        frame.setVisible(true);
    }
}










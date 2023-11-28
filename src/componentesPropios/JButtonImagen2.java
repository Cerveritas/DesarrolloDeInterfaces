package componentesPropios;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public class JButtonImagen2 extends JButton implements Serializable {

    private String rutaimagen;

    public JButtonImagen2() {
        super();
        initialize();
    }

    private void initialize() {
        this.setBorder(BorderFactory.createLineBorder(Color.RED));
        this.setBackground(Color.BLUE);
        this.setSize(500,200);
    }

    public String getRutaimagen() {
        return rutaimagen;
    }

    public void setRutaimagen(String rutaimagen) {
        this.rutaimagen = rutaimagen;
    }


}

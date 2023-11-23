package componentesPropios;

import javax.swing.*;
import java.io.Serializable;



public class JButtonImagen extends JButton implements Serializable {

    private String rutaImagen;



    public JButtonImagen() {

    }



    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }







}


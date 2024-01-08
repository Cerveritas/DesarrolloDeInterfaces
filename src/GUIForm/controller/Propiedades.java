package GUIForm.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Propiedades extends Properties {

// RECARTE
    public final String ESP = "spanish.properties";
    public final String ENG = "english.properties";


    public Propiedades (String idioma){
        if (idioma.equals("spanish")) {
            getProperties("spanish.properties");
        } else if (idioma.equals("english")){
            getProperties("english.properties");
        } else {
            getProperties("english");
        }
    }


    private void getProperties(String idioma) {
        try {
            this.load(getClass().getResourceAsStream(idioma));
        } catch (IOException ex){

        }
    }



    // RECARTE
    public static Properties cargarIdioma(String idiomaPath) {

        Properties propiedades = new Properties();
        try (InputStream input = new FileInputStream("src/GUIForm/propierties/"+idiomaPath)) {
            propiedades.load(input);
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return propiedades;
    }

}

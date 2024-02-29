package PreparacionExamen2.properties;

import java.io.IOException;
import java.util.Properties;

public class Propiedades extends Properties {

    public Propiedades(String idioma) {

        if (idioma.equals("spanish")){
            getProperties("spanish.properties");
        } else if (idioma.equals("english")) {
            getProperties("english.properties");
        } else {
            getProperties("español.properties");
        }

    }

    private void getProperties(String idioma){
        try {
            this.load(getClass().getResourceAsStream(idioma));
        } catch (IOException ex){

        }
    }
}

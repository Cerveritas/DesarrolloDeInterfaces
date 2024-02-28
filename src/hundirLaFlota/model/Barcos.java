package hundirLaFlota.model;

public class Barcos {

    private String Submarino;
    private String Destructor;
    private String Acorazado;
    private String Portaviones;
    private String fragata;
    private String patera;

    public Barcos(String submarino, String destructor, String acorazado, String portaviones, String fragata, String patera) {
        Submarino = submarino;
        Destructor = destructor;
        Acorazado = acorazado;
        Portaviones = portaviones;
        this.fragata = fragata;
        this.patera = patera;
    }


    public String getSubmarino() {
        return Submarino;
    }

    public void setSubmarino(String submarino) {
        Submarino = submarino;
    }

    public String getDestructor() {
        return Destructor;
    }

    public void setDestructor(String destructor) {
        Destructor = destructor;
    }

    public String getAcorazado() {
        return Acorazado;
    }

    public void setAcorazado(String acorazado) {
        Acorazado = acorazado;
    }

    public String getPortaviones() {
        return Portaviones;
    }

    public void setPortaviones(String portaviones) {
        Portaviones = portaviones;
    }

    public String getFragata() {
        return fragata;
    }

    public void setFragata(String fragata) {
        this.fragata = fragata;
    }

    public String getPatera() {
        return patera;
    }

    public void setPatera(String patera) {
        this.patera = patera;
    }
}

package Tablas.PrimerTrabajo;

public class Persona {


    private int ID;
    private String Nombre;
    private String Apellidos;
    private String DNI;
    private String Email;
    private String Contraseña;


    public  Persona(){};


    public Persona(int ID, String nombre, String apellidos, String DNI, String email, String contraseña) {
        this.ID = ID;
        Nombre = nombre;
        Apellidos = apellidos;
        this.DNI = DNI;
        Email = email;
        Contraseña = contraseña;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }
}

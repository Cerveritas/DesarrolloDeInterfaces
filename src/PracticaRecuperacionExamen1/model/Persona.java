package PracticaRecuperacionExamen1.model;

public class Persona {

    // Creamos los atributos
    private int Id;
    private String Nombre;
    private String Apellidos;
    private String DNI;
    private String Email;
    private String Contraseña;

    // Creamos el constructor parametrizado
    public Persona(int id, String nombre, String apellidos, String DNI, String email, String contraseña) {
        Id = id;
        Nombre = nombre;
        Apellidos = apellidos;
        this.DNI = DNI;
        Email = email;
        Contraseña = contraseña;
    }

    public Persona() {
    }

    // Creamos los getters and setters


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

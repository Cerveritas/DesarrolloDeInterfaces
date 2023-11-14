package ConexionesConBBDD.Pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class PrimeraConexion {

    static Connection conn;

    public static void main(String[] args) throws SQLException {


        establecerConexion();
        creacionBBDD();



    }


    

        // ESTABLECER CONEXION CON EL SGBD

        public static void establecerConexion() throws SQLException{

            String url = "jdbc:mysql://localhost:3306/";
            String user = "root";
            String pwd = "admin";

            conn = DriverManager.getConnection(url, user, pwd);

        }
        public static void asignar() throws SQLException {
            String query = "use prueba";
            Statement st = conn.createStatement();
            st.executeUpdate(query);
        }


    // METODO 1 -> Crear la base de datos ut14
    public static void creacionBBDD() throws SQLException {
        establecerConexion();

        String query = "CREATE DATABASE prueba";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
        System.out.println("La base de datos ut14 fue creada correctamente...");
    }



}

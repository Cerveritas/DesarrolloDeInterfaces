package PracticaRecuperacionExamen1.model;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ModeloTablaPersona extends AbstractTableModel {


    private List<Persona> personas;

    public ModeloTablaPersona(List<Persona> personas) {
    this.personas = personas;
    }


    private enum ColumnasTablaPersona{

        ID("Id"),
        NOMBRE("Nombre"),
        APELLIDOS("Apellidos"),
        DNI("DNI"),
        EMAIL("Email"),
        CONTRASEÑA("Contraseña");


        final String header;


        ColumnasTablaPersona(String header) {
            this.header = header;
        }
    }







    @Override
    public int getRowCount() {
        return personas.size();
    }

    @Override
    public int getColumnCount() {
        return ColumnasTablaPersona.values().length;
    }

    @Override
    public String getColumnName(int column){
        return ColumnasTablaPersona.values()[column].header;
    }




    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Persona persona = personas.get(rowIndex);

        switch (ColumnasTablaPersona.values()[columnIndex]){

            case ID:
                return persona.getId();

            case NOMBRE:
                return persona.getNombre();

            case APELLIDOS:
                return persona.getApellidos();

            case DNI:
                return persona.getDNI();

            case EMAIL:
                return persona.getEmail();

            case CONTRASEÑA:
                return persona.getContraseña();

            default:
                throw new RuntimeException("No existe la columna "+columnIndex);

        }
    }

    public void agregarPersona(Persona persona){
        personas.add(persona);
        fireTableDataChanged();
    }
}

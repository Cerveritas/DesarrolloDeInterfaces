package Tablas.PrimerTrabajo;

import Tablas.StudentTableModel;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ModeloTablaPersona extends AbstractTableModel {


    private enum ColumnasTablaPersona {

        ID("ID"),
        NOMBRE("NOMBRE"),
        APELLIDOS("APELLIDOS"),
        DNI("DNI"),
        EMAIL("EMAIL"),
        CONTRASEÑA("CONTRASEÑA");

        final String header;

        ColumnasTablaPersona(String header){
            this.header = header;
        }
    }


    private List<Persona> personas;

    public ModeloTablaPersona(List<Persona> personas){
        super();
        this.personas = personas;
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
    public String getColumnName (int column){
        return ModeloTablaPersona.ColumnasTablaPersona.values()[column].header;
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona persona = personas.get(rowIndex);

        switch (ColumnasTablaPersona.values()[columnIndex]){

            case ID:
                return persona.getID();

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







}

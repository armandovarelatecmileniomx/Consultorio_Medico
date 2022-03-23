package mx.tecmilenio.consultoriomedico;

import java.util.ArrayList;
import java.util.List;

public class Paciente implements InterfacePaciente {

    List<String> lista_pacientes = new ArrayList<>();

    @Override
    public void crearPaciente() {
        System.out.println("crearPaciente() ");
        lista_pacientes.add("Jesus Armando Varela Ramos");
        System.out.println("El tamaño de la lista es: " + lista_pacientes.size());
        System.out.println("El paciente se creo correctamente");
    }

    @Override
    public void leerPacientes() {
        System.out.println("Estos son todos los pacientes que existen en la base de datos");

        for (String leer_pacientes: lista_pacientes){
            System.out.println(leer_pacientes);
        }

    }

    @Override
    public void actualizarPaciente() {
        lista_pacientes.set(0, "");
        System.out.println("Los datos del paciente se actualizaron con exito");
    }

    @Override
    public void eliminarPaciente(int index) {
        lista_pacientes.remove(0);
        System.out.println("El paciente a sido eliminado");
    }
}

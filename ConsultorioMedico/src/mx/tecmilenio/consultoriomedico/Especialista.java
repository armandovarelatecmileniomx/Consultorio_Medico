package mx.tecmilenio.consultoriomedico;

import java.util.ArrayList;
import java.util.List;

public class Especialista implements InterfaceEspecialista{

    List<String> lista_especialista = new ArrayList<>();

    @Override
    public void crearEspecialista() {
        System.out.println("crearPaciente() ");
        lista_especialista.add("Pedro Antonio Varela Ramos");
        System.out.println("El tamaño de la lista es: " + lista_especialista.size());
        System.out.println("El paciente se creo correctamente");
    }

    @Override
    public void leerEspecialista() {
        System.out.println("Estos son todos los pacientes que existen en la base de datos");

        for (String leer_pacientes: lista_especialista){
            System.out.println(leer_pacientes);
        }

    }

    @Override
    public void actualizarEspecialista() {
        lista_especialista.set(0, "");
        System.out.println("Los datos del paciente se actualizaron con exito");
    }

    @Override
    public void eliminarEspecialista(int index) {
        lista_especialista.remove(0);
        System.out.println("El paciente a sido eliminado");
    }


}

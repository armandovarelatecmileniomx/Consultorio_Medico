package mx.tecmilenio.consultoriomedico;

import java.util.Scanner;

public class Consultorio implements InterfaceConsultorio{

    @Override
    public void crearConsultorio() {
        System.out.println("El consultorio se creo correctamente");
    }

    @Override
    public void leerConsultorio() {
        System.out.println("Estos son los consultorios que existen en la base de datos");
    }

    @Override
    public void actualizarConsultorio() {
        System.out.println("El consultorio se actualizo correctamente");
    }

    @Override
    public void eliminarConsultorio(int index) {
        System.out.println("El consultorio se elimino correctamente");
    }
}

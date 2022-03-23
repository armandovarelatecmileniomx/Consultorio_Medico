package mx.tecmilenio.consultoriomedico;

import java.util.Scanner;

public class MenuPacientes {

    public MenuPacientes(){}

    public int executarMenuPacientes(){

        int opcionMenuPacientes;

        Scanner scannerOpcionMenuPacientes = new Scanner(System.in);

        do{
            System.out.println("Que desea hacer en, Paciente");
            System.out.println("1.- Crear paciente");
            System.out.println("2.- Leer pacientes");
            System.out.println("3.- Modificar paciente");
            System.out.println("4.- Eliminar paciente");
            opcionMenuPacientes = scannerOpcionMenuPacientes.nextInt();

        }while(opcionMenuPacientes > 4 || opcionMenuPacientes < 1);

        return opcionMenuPacientes;
    }

}

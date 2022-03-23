package mx.tecmilenio.consultoriomedico;

import java.util.Scanner;

public class MenuPrincipal {

    public MenuPrincipal(){}

    public int executarMenuPrincipal(){

        int opcionMenuPrincipal;

        Scanner scannerOpcionMenuPrincipal = new Scanner(System.in);

        do{
            System.out.println("Bienvenido, Sistema Medico - Especialidades");
            System.out.println("Seleccione una opcion del menu: ");
            System.out.println("1.- Paciente: ");
            System.out.println("2.- Especialista: ");
            System.out.println("3.- Consulta: ");
            System.out.println("4.- Consultorio: ");
            opcionMenuPrincipal = scannerOpcionMenuPrincipal.nextInt();
        }while (opcionMenuPrincipal > 4 || opcionMenuPrincipal < 1);

        return opcionMenuPrincipal;
    }

}

package mx.tecmilenio.consultoriomedico;

import java.util.Scanner;

public class MenuEspecialistas {

    public MenuEspecialistas(){}

    public int executarMenuEspecialistas(){

        int opcionMenuEspecialistas;

        Scanner scannerOpcionMenuEspecialistas = new Scanner(System.in);

        do{
            System.out.println("Que desea hacer en, Especialista");
            System.out.println("1.- Crear especialista");
            System.out.println("2.- Leer especialistas");
            System.out.println("3.- Modificar especialista");
            System.out.println("4.- Eliminar especialsta");
            opcionMenuEspecialistas = scannerOpcionMenuEspecialistas.nextInt();
        }while(opcionMenuEspecialistas > 5 || opcionMenuEspecialistas < 1);

        return opcionMenuEspecialistas;
    }

}

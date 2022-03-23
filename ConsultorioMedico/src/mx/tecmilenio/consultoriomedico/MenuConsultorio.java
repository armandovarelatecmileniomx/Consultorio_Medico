package mx.tecmilenio.consultoriomedico;

import java.util.Scanner;

public class MenuConsultorio {

    public MenuConsultorio(){}

    public int executarMenuConsultorio(){

        int opcionMenuConsultorio;

        Scanner scannerOpcionMenuConsultorio = new Scanner(System.in);

        do{
            System.out.println("Que desea hacer en, Consultorio");
            System.out.println("1.- Crear consultorio");
            System.out.println("2.- Leer consultorios");
            System.out.println("3.- Modificar consultorio");
            System.out.println("4.- Eliminar consultorio");
            opcionMenuConsultorio = scannerOpcionMenuConsultorio.nextInt();
        }while(opcionMenuConsultorio > 5 || opcionMenuConsultorio < 1);

        return opcionMenuConsultorio;
    }

}

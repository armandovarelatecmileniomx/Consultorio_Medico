package mx.tecmilenio.consultoriomedico;

import java.util.Scanner;

public class MenuConsultas {

    public MenuConsultas(){}

    public int executarMenuConsultas(){

        int opcionMenuConsultas;

        Scanner scannerOpcionMenuConsultas = new Scanner(System.in);

        do{
            System.out.println("Que desea hacer en, Consulta");
            System.out.println("1.- Crear consulta");
            System.out.println("2.- Leer consultas");
            System.out.println("3.- Modificar consulta");
            System.out.println("4.- Eliminar consulta");
            opcionMenuConsultas = scannerOpcionMenuConsultas.nextInt();
        }while(opcionMenuConsultas > 5 || opcionMenuConsultas < 1);

        return opcionMenuConsultas;
    }

}

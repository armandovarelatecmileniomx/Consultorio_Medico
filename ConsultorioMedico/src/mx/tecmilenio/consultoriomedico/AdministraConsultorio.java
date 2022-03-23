package mx.tecmilenio.consultoriomedico;

import jdk.swing.interop.SwingInterOpUtils;

public class AdministraConsultorio {

    public static void main(String[] args) {

        int opcionMenuPrincipal;
        MenuPrincipal mp = new MenuPrincipal();
        opcionMenuPrincipal = mp.executarMenuPrincipal();
        boolean flagMenuPrincipal = true;
        boolean flagSubmenu = true;

        while( flagMenuPrincipal ){
            switch(opcionMenuPrincipal){
                case 1:
                    flagMenuPrincipal = false;
                    int opcionMenuPacientes;
                    MenuPacientes menuPacientes = new MenuPacientes();
                    menuPacientes.executarMenuPacientes();
                    opcionMenuPacientes = menuPacientes.executarMenuPacientes();

                    while( flagSubmenu ){
                        switch (opcionMenuPacientes){
                            case 1:
                                flagSubmenu = false;
                                Paciente paciente1 = new Paciente();
                                paciente1.crearPaciente();
                                break;
                            case 2:
                                flagSubmenu = false;
                                Paciente paciente2 = new Paciente();
                                paciente2.leerPacientes();
                                break;
                            case 3:
                                flagSubmenu = false;
                                Paciente paciente3 = new Paciente();
                                paciente3.actualizarPaciente();
                                break;
                            case 4:
                                flagSubmenu = false;
                                Paciente paciente4 = new Paciente();
                                paciente4.eliminarPaciente(0);
                                break;
                            default:
                                break;
                        }
                    }

                    break;
                case 2:
                    flagMenuPrincipal = false;
                    int opcionMenuEspecialistas;
                    MenuEspecialistas menuEspecialistas = new MenuEspecialistas();
                    opcionMenuEspecialistas = menuEspecialistas.executarMenuEspecialistas();

                    switch (opcionMenuEspecialistas){
                        case 1:
                            flagSubmenu = false;
                            Especialista especialista1 = new Especialista();
                            especialista1.crearEspecialista();
                            break;
                        case 2:
                            flagSubmenu = false;
                            Especialista especialista2 = new Especialista();
                            especialista2.leerEspecialista();
                            break;
                        case 3:
                            flagSubmenu = false;
                            Especialista especialista3 = new Especialista();
                            especialista3.actualizarEspecialista();
                            break;
                        case 4:
                            flagSubmenu = false;
                            Especialista especialista4 = new Especialista();
                            especialista4.eliminarEspecialista(0);
                            break;
                        default:
                            break;
                    }

                    break;
                case 3:
                    flagMenuPrincipal = false;
                    int opcionMenuConsultorio;
                    MenuConsultorio menuConsultorio = new MenuConsultorio();
                    opcionMenuConsultorio = menuConsultorio.executarMenuConsultorio();

                    switch (opcionMenuConsultorio){
                        case 1:
                            flagSubmenu = false;
                            Consultorio consultorio1 = new Consultorio();
                            consultorio1.crearConsultorio();
                            break;
                        case 2:
                            flagSubmenu = false;
                            Consultorio consultorio2 = new Consultorio();
                            consultorio2.leerConsultorio();
                            break;
                        case 3:
                            flagSubmenu = false;
                            Consultorio consultorio3 = new Consultorio();
                            consultorio3.actualizarConsultorio();
                            break;
                        case 4:
                            flagSubmenu = false;
                            Consultorio consultorio4 = new Consultorio();
                            consultorio4.eliminarConsultorio(0);
                            break;
                        default:
                            break;
                    }

                    break;
                case 4:
                    flagMenuPrincipal = false;
                    int opcionMenuConsultas;
                    MenuConsultas menuConsultas = new MenuConsultas();
                    opcionMenuConsultas = menuConsultas.executarMenuConsultas();

                    switch (opcionMenuConsultas){
                        case 1:
                            flagSubmenu = false;
                            Consultorio consultorio1 = new Consultorio();
                            consultorio1.crearConsultorio();
                            break;
                        case 2:
                            flagSubmenu = false;
                            Consultorio consultorio2 = new Consultorio();
                            consultorio2.leerConsultorio();
                            break;
                        case 3:
                            flagSubmenu = false;
                            Consultorio consultorio3 = new Consultorio();
                            consultorio3.actualizarConsultorio();
                            break;
                        case 4:
                            flagSubmenu = false;
                            Consultorio consultorio4 = new Consultorio();
                            consultorio4.eliminarConsultorio(0);
                            break;
                        default:
                            break;
                    }

                    break;
                default:
                    System.out.println("Saliendo del sistema...");
                    break;

            }
        }

    }

}

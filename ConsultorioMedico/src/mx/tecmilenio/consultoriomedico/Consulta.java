package mx.tecmilenio.consultoriomedico;

public class Consulta implements InterfaceConsulta{

    @Override
    public void crearConsulta() {
        System.out.println("La consulta se creo correctamente");
    }

    @Override
    public void leerConsulta() {
        System.out.println("Estas son todas las consutlas que exiten en la base de datos");
    }

    @Override
    public void actualizarConsulta() {
        System.out.println("La consulta se actualizo correctamente");
    }

    @Override
    public void eliminarConsulta() {
        System.out.println("La consulta se elimino correctamente");
    }
}

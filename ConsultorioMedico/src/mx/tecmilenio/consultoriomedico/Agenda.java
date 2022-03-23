package mx.tecmilenio.consultoriomedico;

public class Agenda {

    int idAgenda;
    int idPaciente;
    int idDoctor;
    String consultaEspecialidad;
    String fechaConsulta;
    String horaConsulta;

    public int getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(int idAgenda) {
        this.idAgenda = idAgenda;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getConsultaEspecialidad() {
        return consultaEspecialidad;
    }

    public void setConsultaEspecialidad(String consultaEspecialidad) {
        this.consultaEspecialidad = consultaEspecialidad;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(String horaConsulta) {
        this.horaConsulta = horaConsulta;
    }
}

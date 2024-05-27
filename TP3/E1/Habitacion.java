import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    private int cantidadCamas;
    private boolean saturada;
    private List<Paciente> pacientesInternados;

    //constrcutor
    public Habitacion(int cantidadCamas, boolean saturada) {
        this.cantidadCamas = cantidadCamas;
        this.saturada = saturada;
        this.pacientesInternados = new ArrayList<>();   //se inicia lista dentro del constructor
    }

    public boolean getSaturada() {
        return saturada;
    }

    public List<Paciente> getPacientesInternados() {
        return pacientesInternados;
    }

    public int getCantidadCamas() {
        return cantidadCamas;
    }

    public void internarPaciente(Paciente paciente) {
        pacientesInternados.add(paciente);
    }

    public void darAltaPaciente(Paciente paciente) {
        pacientesInternados.remove(paciente);
    }

}
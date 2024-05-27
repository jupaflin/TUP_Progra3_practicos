public class Paciente {
    private String nombre;
    private String apellido;
    private String dni;
    private boolean necesitaAtencion;

    //constructor
    public Paciente(String nombre, String apellido, String dni, boolean necesitaAtencion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.necesitaAtencion = necesitaAtencion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public boolean getNecesitaAtencion() {
        return necesitaAtencion;
    }
}

public class Titular {
    private int numeroIdentidad;
    private String nombre;
    private String apellido;
    private String numeroCelular;
    private String eMail;
    
    //constructor
    public Titular(int numeroIdentidad, String nombre, String apellido, String numeroCelular, String eMail){
        this.numeroIdentidad = numeroIdentidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCelular = numeroCelular;
        this.eMail = eMail;
    }

    //getters
    public int getNumeroIdentidad() {
        return numeroIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public String geteMail() {
        return eMail;
    }

    //setters
    public void setNumeroIdentidad(int numeroIdentidad) {
        this.numeroIdentidad = numeroIdentidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}

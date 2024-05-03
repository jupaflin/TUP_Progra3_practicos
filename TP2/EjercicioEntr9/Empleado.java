package EjercicioEntr9;

import java.time.Year;

public class Empleado {     //atributos comunes que van a ser heredados por las otras clases
    private String nombre;
    private String dni;
    private String domicilio;
    private Year fechaIngreso;

    public Empleado(String nombre, String dni, String domicilio, int anioIngreso) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.fechaIngreso = Year.of(anioIngreso);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Year getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Year fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}

package EjercicioEntr9;

public class Administrativo extends Empleado {
    private String areaAdministrada;

    public Administrativo(String nombre, String dni, String domicilio, int anioIngreso, String areaAdministrada) {
        super(nombre, dni, domicilio, anioIngreso);
        this.areaAdministrada = areaAdministrada;
    }

    public String getAreaAdministrada() {
        return areaAdministrada;
    }

    public void setAreaAdministrada(String areaAdministrada) {
        this.areaAdministrada = areaAdministrada;
    }

    public double calcularSueldo() {
        double sueldoFinal = 650000; //sueldo base para todos los administrativos
        switch (areaAdministrada.toLowerCase()) {       //depende el area, se recibe un bono
            case "recursos humanos":
                sueldoFinal += 50000;
                break;
            case "finanzas":
                sueldoFinal += 100000;
                break;
        }
        return sueldoFinal;
    }

}

package EjercicioEntr9;

public class Repartidor extends Empleado {
    private int repartosMensuales;

    public Repartidor(String nombre, String dni, String domicilio, int anioIngreso) {
        super(nombre, dni, domicilio, anioIngreso);
    }

    public int getRepartosMensuales() {
        return repartosMensuales;
    }

    public void setRepartosMensuales(int repartosMensuales) {
        this.repartosMensuales = repartosMensuales;
    }

    //metodo para calcular el bono por reparto del repartidor
    public double calcularBonoReparto() {
        return repartosMensuales * 500;
    }

    //metodo para calcular el sueldo total del repartidor
    public double calcularSueldo() {
        return 650000 + calcularBonoReparto();
    }
}

package EjercicioEntr9;

public class Vendedor extends Empleado {
    private double ventasMensuales;

    public Vendedor(String nombre, String dni, String domicilio, int anioIngreso) {
        super(nombre, dni, domicilio, anioIngreso);
    }

    public double getVentasMensuales() {
        return ventasMensuales;
    }

    public void setVentasMensuales(double ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }

    // Método para calcular la comisión del vendedor
    public double calcularComision() {
        return ventasMensuales * 0.005;
    }

    // Método para calcular el sueldo total del vendedor
    public double calcularSueldo() {
        return 650000 + calcularComision();
    }
}

package EjercicioEntr9;

public class Cajero extends Empleado {
    private String sucursal;

    public Cajero(String nombre, String dni, String domicilio, int anioIngreso, String sucursal) {
        super(nombre, dni, domicilio, anioIngreso);
        this.sucursal = sucursal;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    //metodo para calcular el sueldo total del cajero
    public double calcularSueldo() {
        //aca puede ir una logica. Tipo dependiendo de la sucursal, gana mas o menos
        return 650000;
    }
}

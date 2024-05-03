package Ejercicio10;

public class Departamento extends InmuebleVivienda { //sub: depaFamiliar, depaMono
    private int numPiso;
    private double valorAdministracion;

    public Departamento(int identificador, double areaMetrosCuadrados, String direccion, int numBanos, int numPiso, double valorAdministracion) {
        super(identificador, areaMetrosCuadrados, direccion, 1, numBanos);
        this.numPiso = numPiso;
        this.valorAdministracion = valorAdministracion;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Valor de la administracion: " + valorAdministracion);
        System.out.println("Numero de piso: " + numPiso);
    }
}

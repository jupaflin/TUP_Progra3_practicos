package Ejercicio10;

public class Oficina extends InmuebleComercial {
    private int numPuestosTrabajo;

    public Oficina(int identificador, double areaMetrosCuadrados, String direccion, String localizacion, String centroComercial, int numPuestosTrabajo) {
        super(identificador, areaMetrosCuadrados, direccion, localizacion, centroComercial);
        this.numPuestosTrabajo = numPuestosTrabajo;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de puestos de trabajo: " + numPuestosTrabajo);
    }
}
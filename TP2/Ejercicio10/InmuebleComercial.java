package Ejercicio10;

public class InmuebleComercial extends Inmueble { //sub: local, oficina
    private String localizacion;
    private String centroComercial;

    // Constructor
    public InmuebleComercial(int identificador, double areaMetrosCuadrados, String direccion, String localizacion, String centroComercial) {
        super(identificador, areaMetrosCuadrados, direccion);
        this.localizacion = localizacion;
        this.centroComercial = centroComercial;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Localizacion: " + localizacion);
        System.out.println("Centro comercial: " + centroComercial);
    }
}

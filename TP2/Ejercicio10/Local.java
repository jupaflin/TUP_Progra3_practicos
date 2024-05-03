package Ejercicio10;

public class Local extends InmuebleComercial {
    private String tipoLocal;

    // Constructor
    public Local(int identificador, double areaMetrosCuadrados, String direccion, String localizacion, String centroComercial, String tipoLocal) {
        super(identificador, areaMetrosCuadrados, direccion, localizacion, centroComercial);
        this.tipoLocal = tipoLocal;
    }

    // Método para imprimir los atributos del local
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo de local: " + tipoLocal);
    }
}

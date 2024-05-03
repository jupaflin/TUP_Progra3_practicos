package Ejercicio10;
public class Inmueble { //sub: inmuebleComercial, inmuebleVivienda
    private int identificador;
    private double areaMetrosCuadrados;
    private String direccion;

    public Inmueble(int identificador, double areaMetrosCuadrados, String direccion) {
        this.identificador = identificador;
        this.areaMetrosCuadrados = areaMetrosCuadrados;
        this.direccion = direccion;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getAreaMetrosCuadrados() {
        return areaMetrosCuadrados;
    }

    public void setAreaMetrosCuadrados(double areaMetrosCuadrados) {
        this.areaMetrosCuadrados = areaMetrosCuadrados;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void imprimir() {
        System.out.println("Identificador: " + identificador);
        System.out.println("Área (metros cuadrados): " + areaMetrosCuadrados);
        System.out.println("Dirección: " + direccion);
    }
}

package Ejercicio10;

public class InmuebleVivienda extends Inmueble { //sub: deparamento, casa
    private int numHabitaciones;
    private int numBanos;

    // Constructor
    public InmuebleVivienda(int identificador, double areaMetrosCuadrados, String direccion, int numHabitaciones, int numBanos) {
        super(identificador, areaMetrosCuadrados, direccion);
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
    }

    // Método para imprimir los atributos de la vivienda
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de habitaciones: " + numHabitaciones);
        System.out.println("Número de baños: " + numBanos);
    }
}

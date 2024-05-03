package Ejercicio10;

public class Casa extends InmuebleVivienda { //sub: casaConjunto, casaIndependiente

    public Casa(int identificador, double areaMetrosCuadrados, String direccion, int numHabitaciones, int numBanos) {
        super(identificador, areaMetrosCuadrados, direccion, numHabitaciones, numBanos);
    }

    protected Casa(int identificador, double areaMetrosCuadrados, String direccion) {
        super(identificador, areaMetrosCuadrados, direccion, 0, 0);
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }
}
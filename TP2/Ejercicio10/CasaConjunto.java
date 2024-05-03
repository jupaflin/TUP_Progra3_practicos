package Ejercicio10;

public class CasaConjunto extends Casa {
    private double valorAdministracion;
    private boolean tieneAreasComunes;

    public CasaConjunto(int identificador, double areaMetrosCuadrados, String direccion, int numHabitaciones, int numBanos, double valorAdministracion, boolean tieneAreasComunes) {
        super(identificador, areaMetrosCuadrados, direccion, numHabitaciones, numBanos);
        this.valorAdministracion = valorAdministracion;
        this.tieneAreasComunes = tieneAreasComunes;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Valor de administración: " + valorAdministracion);
        System.out.println("Tiene áreas comunes: " + (tieneAreasComunes ? "Sí" : "No"));
    }
}

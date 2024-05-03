package Ejercicio10;

public class DepaMono extends Departamento { 
    
    public DepaMono(int identificador, double areaMetrosCuadrados, String direccion, int numBanos, double valorAdministracion) {
        super(identificador, areaMetrosCuadrados, direccion, numBanos, 0, valorAdministracion); // Establece 0 habitaciones para monoambiente
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }
}
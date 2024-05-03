package Ejercicio10;

public class Principal {
    //valores de los inmuebles usados
    private static final double valorMetroCuadradoCasaConjunto = 2500000;
    private static final double valorMetroCuadradoLocal = 3000000;

    public static void main(String[] args) {
        //se crean dos instancias de inmuebles
        CasaConjunto casaConjunto = new CasaConjunto(12345, 200.0, "Calle 123", 3, 2, 2500000.0, true);
        Local localComercial = new Local(54321, 100.0, "Avenida Principal", "Interno", "Centro Comercial XYZ", "Tienda");

        //se calculan precios
        double precioCasa = calcularPrecioVenta(casaConjunto, valorMetroCuadradoCasaConjunto);
        double precioLocal = calcularPrecioVenta(localComercial, valorMetroCuadradoLocal);

        System.out.println("Datos de la Casa:");
        casaConjunto.imprimir();
        System.out.println("Precio de venta: $" + precioCasa);

        System.out.println();

        System.out.println("Datos del Local Comercial:");
        localComercial.imprimir();
        System.out.println("Precio de venta: $" + precioLocal);
    }

    private static double calcularPrecioVenta(Inmueble inmueble, double valorMetroCuadrado) {
        return inmueble.getAreaMetrosCuadrados() * valorMetroCuadrado;
    }

    //antes de entregar me di cuenta que me faltan los setters y getters de cada clase
}

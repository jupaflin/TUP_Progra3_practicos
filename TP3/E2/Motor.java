public class Motor {
    private int numero;
    private int kilometraje;
    private int cilindrada;

    public Motor(int numero, int kilometraje, int cilindrada) {
        this.numero = numero;
        this.kilometraje = kilometraje;
        this.cilindrada = cilindrada;
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public int getCilindrada() {
        return cilindrada;
    }
}

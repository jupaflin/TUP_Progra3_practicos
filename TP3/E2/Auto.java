public class Auto {
    private String patente;
    private String marca;
    private String modelo;
    private Motor motor;

    public Auto(String patente, String marca, String modelo, Motor motor) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    // Getters
    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }
}

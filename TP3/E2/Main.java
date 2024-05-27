public class Main {
    public static void main(String[] args) {
        // Crear objetos Motor
        Motor motor1 = new Motor(12345, 10000, 1600);
        Motor motor2 = new Motor(67890, 5000, 2000);

        // Crear objeto Auto que contiene motor1
        Auto auto1 = new Auto("ABC123", "Toyota", "Corolla", motor1);

        // Imprimir detalles de auto1 junto con su motor
        System.out.println("Detalles de auto1:");
        System.out.println("Patente: " + auto1.getPatente());
        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Modelo: " + auto1.getModelo());
        System.out.println("Motor número: " + auto1.getMotor().getNumero());
        System.out.println("Motor kilometraje: " + auto1.getMotor().getKilometraje());
        System.out.println("Motor cilindrada: " + auto1.getMotor().getCilindrada());

        // Imprimir detalles de motor2
        System.out.println("\nDetalles de motor2:");
        System.out.println("Motor número: " + motor2.getNumero());
        System.out.println("Motor kilometraje: " + motor2.getKilometraje());
        System.out.println("Motor cilindrada: " + motor2.getCilindrada());
    }
}

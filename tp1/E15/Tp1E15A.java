public class Tp1E15A {
    public static void main(String[] args) {
        int numero = 1;
        while (numero != 0) {
            System.out.println("Ingresar numero: ");
            numero = Integer.parseInt(System.console().readLine());
            if (numero == 0) {
                System.out.println("Saliendo...");
            } else {
                if (numero % 2 == 0) {
                    System.out.println("Es par.");
                } else {
                    System.out.println("Es impar.");
                }
                if (numero >= 0) {
                    System.out.println("Es positivo.");
                } else {
                    System.out.println("Es negativo");
                }
            }
        }
    }
}
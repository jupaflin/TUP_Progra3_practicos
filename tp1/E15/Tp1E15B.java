public class Tp1E15B {
    public static void main(String[] args) {
        int numero = 0;
        do {
            try {           //manejo de error
                System.out.println("Ingresar numero: ");
                numero = Integer.parseInt(System.console().readLine());
                if (numero % 2 == 0){
                    System.out.println("Es par.");
                } else {
                    System.out.println("Es impar.");
                }
                if (numero >= 0){
                    System.out.println("Es positivo.");
                } else {
                    System.out.println("Es negativo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Eso no es un numero valido.");
                continue;       //sigue con la proxima iteracion del loop
            }
        } while (numero != 0);
    }
}

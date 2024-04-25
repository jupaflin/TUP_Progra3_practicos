public class Tp1E15C {
    public static void main(String[] args) {
        char respuesta = ' ';
        do {
            try {
                System.out.println("Ingresar numero: ");
                int numero = Integer.parseInt(System.console().readLine());
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
                continue;       //sigue con la proxima iteracion del loop, no estoy seguro si continue es necesario
            }
            System.out.println("Desea contuniar? S/N");
            respuesta = System.console().readLine().charAt(0); //agarra el primer caracter ingresado
        } while (respuesta != 'n' && respuesta != 'N');
    }
}
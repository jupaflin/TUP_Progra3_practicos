public class Tp1E8 {
    public static void main(String[] args) {
        System.out.println("ingresar un caracter:");
        String input = System.console().readLine();     //input letra
        char caracter = input.charAt(0);            //convierte la primer letra del input en char
        verificarMayuscula(caracter);
    }

    private static void verificarMayuscula(char caracter) {
        if (caracter >= 'A' && caracter <= 'Z') {                   //en base al orden de char en unicode
            System.out.println(caracter + " es mayuscula.");
        } else {
            System.out.println(caracter + " no es mayuscula.");
        }
    }
}

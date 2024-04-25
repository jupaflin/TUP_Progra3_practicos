public class Tp1E7 {
    public static void main(String[] args) {
        String input = System.console().readLine();  //input del valor
        int numero = Integer.parseInt(input);       //transforma valor a int
        determinarParImpar(numero); 
    }

    private static void determinarParImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println(numero + " es par.");
        } else {
            System.out.println(numero + " es impar.");
        }
    }
}


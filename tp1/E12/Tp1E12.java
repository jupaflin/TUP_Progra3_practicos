public class Tp1E12 {
    public static void main(String[] args) {
        System.out.println("Ingresar numero: ");
        int numero = Integer.parseInt(System.console().readLine());
        int factorial = 1;
        for(int i = 1;  i <= numero ; i++){
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + numero + " es " + factorial);
    }
}

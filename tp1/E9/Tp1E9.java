public class Tp1E9 {        //ejer 9 y 10
    public static void main(String[] args) {
        System.out.println("Ingrese la longitud del lado a:");      //input
        int a = Integer.parseInt(System.console().readLine());      //de string a int

        System.out.println("Ingrese la longitud del lado b:");
        int b = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese la longitud del lado c:");
        int c = Integer.parseInt(System.console().readLine());

        if (esTriangulo(a, b, c)) {
            System.out.println("Los lados " + a + ", " + b + ", " + c + " pueden formar un triangulo.");
            String tipo = tipoTriangulo(a, b, c);
            System.out.println("El triangulo es " + tipo + ".");
        } else {
            System.out.println("Los lados " + a + ", " + b + ", " + c + " no pueden formar un triangulo.");
        }

    }

    private static boolean esTriangulo(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    private static String tipoTriangulo(int a, int b, int c) {
        if (a == b && b == c) {
            return "equilatero";            //no es necesario declarar explicitamente que es String si lleva comillas dobles. A diferencia de C++.
        }
        else if (a != b && b!= c && c != a) {
            return "escaleno";
        }
        else {
            return "izsoceles";
        }
    }
}    

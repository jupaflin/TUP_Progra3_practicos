public class Tp1E16 {
    public static void main(String[] args) {
        double respuesta = -1;      //double porque puede tener decimales
        while (respuesta != 0) {
            try {
                System.out.println("Ingresar millas: ");
                respuesta = Integer.parseInt(System.console().readLine());
                if (respuesta == 0){
                    System.out.println("Saliendo...");
                } else {
                    respuesta = (respuesta*1.6093);
                    respuesta = (Math.floor(respuesta * 100)) / 100;    //deja solo 2 decimales
                    System.out.println("Equivalen a " + respuesta + " kilometros.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Eso no es un numero valido.");
            }
        }
    }
}
public class Tp1E17 {   //ejer 17 y 18
    public static void main(String[] args) {
        int dia = 0;
        boolean finDeSemana = false;
        System.out.println("Ingresar numero de dia de la semana:");
        try {
            dia = Integer.parseInt(System.console().readLine());
            String respuesta = "";
            switch(dia) {
                case 1:
                    respuesta = "lunes";
                    break;
                case 2:
                    respuesta = "martes";
                    break;
                case 3:
                    respuesta = "miercoles";
                    break;
                case 4:
                    respuesta = "jueves";
                    break;
                case 5:
                    respuesta = "viernes";
                    break;
                case 6:
                    respuesta = "sabado";
                    finDeSemana = true;
                    break;
                case 7:
                    respuesta = "domingo";
                    finDeSemana = true;
                    break;
                default: 
                    respuesta = "invalido";
            }
            if (respuesta == "invalido") {
                System.out.println("El valor ingresado no corresponde con un dia de la semana.");
            }
            else {
                System.out.println("El dia de la semana es " + respuesta);
                if (finDeSemana == false) {
                    System.out.println("Es un dia laborable.");
                } else {
                    System.out.println("Es un fin de semana!");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("No se ingreso un numero.");
        }
    }
}
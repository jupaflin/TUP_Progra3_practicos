public class TP1E19 {
    public static void main(String[] args) {
        String palabra = "";
        String cadena = "";
        do {
            System.out.println("Ingresar palabra. Ingresar NADA para terminar.");
            palabra = System.console().readLine();
            cadena = cadena.concat(palabra);        //se supone que esto crea un string nuevo cada vez, porque en Java los strings son inmutables
            System.out.println("Resultado: "+ cadena);
        } while (!palabra.equals(""));
    }
}
        // palabra !=   verifica si dos variables de referencia apuntan al mismo objeto
        // !palabra.equals   compara el contenido de los objetos
public class Tp1E14 {
    public static void main(String[] args) {

        boolean completado = false;

        do {
            System.out.println("Ingrese numero A: ");
            int A = Integer.parseInt(System.console().readLine());

            System.out.println("Ingrese numero B: ");
            int B = Integer.parseInt(System.console().readLine());
            
            if (A < B){
                System.out.println("A tiene que ser mayor que B...");
            } else {
                for (int i = B+1; i < A; i++){
                    if (i % 2 == 0){
                        System.out.println(i);
                        completado = true;
                    }
                }
            }
        }
        while (completado == false);
    }
}
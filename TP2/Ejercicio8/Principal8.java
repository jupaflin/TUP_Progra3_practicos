public class Principal8 {
    public static void main(String[] args) {
        //crea un titular para la tarjeta de credito
        Titular titular = new Titular(123456789, "Juan", "Perez", "123456789", "juan@example.com");

        //crea una tarjeta de crédito con saldo disponible de $15000
        TarjetaCredito tarjeta = new TarjetaCredito("Visa", "Banco X", "1234567890123456", 15000, titular);

        //crea una instancia de Posnet
        Posnet posnet = new Posnet();

        //efectua un pago de $10000 en 5 cuotas
        String ticket = posnet.efectuarPago(tarjeta, 10000, 5);

        //imprime el ticket generado
        if (ticket != null) {
            System.out.println("Ticket:");
            System.out.println(ticket);
        } else {
            System.out.println("No se pudo realizar el pago debido a saldo insuficiente.");
        }
    }
}
//falta, chequear si el enunciado pide algo mas
//clases UML
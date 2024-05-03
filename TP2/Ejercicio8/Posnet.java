public class Posnet {
    //metodo para efectuar un pago
    public String efectuarPago(TarjetaCredito tarjeta, double montoTotal, int cuotas) {
        //calcula el recargo
        double recargo = 0;
        if (cuotas > 1) {
            recargo = 0.03 * (cuotas - 1) * montoTotal;
        }

        //calcula el monto total a pagar, incluyendo el recargo
        double montoTotalConRecargo = montoTotal + recargo;

        //verifica si la tarjeta tiene saldo suficiente
        if (tarjeta.getSaldoDisponible() >= montoTotalConRecargo) {
            //calcula el monto de cada cuota
            double montoCuota = montoTotalConRecargo / cuotas;

            //retorna el ticket con los datos del pago
            return "Nombre: " + tarjeta.getTitularTarjeta().getNombre() + " " + tarjeta.getTitularTarjeta().getApellido() +
                   "\nMonto total a pagar: $" + montoTotalConRecargo +
                   "\nMonto de cada cuota: $" + montoCuota;
        } else {
            //si no hay saldo suficiente, retorna null
            return null;
        }
    }
}
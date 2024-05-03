public class TarjetaCredito {
    private String entidadFinanciera;
    private String bancoTarjeta;
    private String numeroTarjeta;
    private double saldoDisponible;
    private Titular titularTarjeta;

    //constructor
    public TarjetaCredito(String entidadFinanciera, String bancoTarjeta, String numeroTarjeta, double saldoDisponible, Titular titularTarjeta){
        this.entidadFinanciera = entidadFinanciera;
        this.bancoTarjeta = bancoTarjeta;
        this.numeroTarjeta = numeroTarjeta;
        this.saldoDisponible = saldoDisponible;
        this.titularTarjeta = titularTarjeta;
    }

    // Getters
    public String getEntidadFinanciera() {
        return entidadFinanciera;
    }

    public String getBancoTarjeta() {
        return bancoTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public Titular getTitularTarjeta() {
        return titularTarjeta;
    }

    // Setters
    public void setEntidadFinanciera(String entidadFinanciera) {
        this.entidadFinanciera = entidadFinanciera;
    }

    public void setBancoTarjeta(String bancoTarjeta) {
        this.bancoTarjeta = bancoTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public void setTitularTarjeta(Titular titularTarjeta) {
        this.titularTarjeta = titularTarjeta;
    }
}

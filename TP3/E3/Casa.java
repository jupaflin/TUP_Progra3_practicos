public class Casa {
    String direccion;
    int habitantes;
    private class Dormitorios {
        int dormitoriosTamano;
        boolean banoEnSuit;
        int cantidadVentanas;
    }
    private class Baños {
        boolean existenciaBanera;
        boolean existenciaAnteBano;
    }
    private class Patio {
        boolean frenteOFondo;
        int patioTamano;
    }
    private class Cocina {
        String tipoHorno;
        String electricoOGas;
        int bañosTamano;
    }
}
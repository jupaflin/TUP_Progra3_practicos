package EjercicioEntr9;

public class Principal9 {
    public static void main(String[] args) {
        //se instancia un empleado de cada tipo
        Vendedor vendedor = new Vendedor("Juan", "123456789", "Calle 123", 2020);
        vendedor.setVentasMensuales(1000000);

        Administrativo administrativo = new Administrativo("María", "987654321", "Avenida XYZ", 2019, "Recursos Humanos");

        Repartidor repartidor = new Repartidor("Carlos", "456789123", "Plaza Principal", 2021);
        repartidor.setRepartosMensuales(10);

        Cajero cajero = new Cajero("Pedro", "789456123", "Avenida ABC", 2020, "Sucursal Central");

        //se hace print de los recibos de cada uno
        System.out.println("Recibo de sueldo para " + vendedor.getNombre() + ":");
        imprimirRecibo(vendedor);
        System.out.println();

        System.out.println("Recibo de sueldo para " + administrativo.getNombre() + ":");
        imprimirRecibo(administrativo);
        System.out.println();

        System.out.println("Recibo de sueldo para " + repartidor.getNombre() + ":");
        imprimirRecibo(repartidor);
        System.out.println();

        System.out.println("Recibo de sueldo para " + cajero.getNombre() + ":");
        imprimirRecibo(cajero);
    }

    //metodo para imprimir el recibo de sueldo de un empleado
    public static void imprimirRecibo(Empleado empleado) {      //deberia mover esta logica a un GestorRecibos.java???
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("DNI: " + empleado.getDni());
        System.out.println("Domicilio: " + empleado.getDomicilio());
        System.out.println("Fecha de ingreso: " + empleado.getFechaIngreso());
        
        //imprimir detalle segun el tipo de empleado
        if (empleado instanceof Vendedor) {
            Vendedor vendedor = (Vendedor) empleado;
            System.out.println("Tipo de empleado: Vendedor");
            System.out.println("Ventas mensuales: $" + vendedor.getVentasMensuales());
            System.out.println("Comisión: $" + vendedor.calcularComision());
        } else if (empleado instanceof Administrativo) {
            Administrativo administrativo = (Administrativo) empleado;
            System.out.println("Tipo de empleado: Administrativo");
            System.out.println("Área: " + administrativo.getAreaAdministrada());
            System.out.println("Sueldo: $" + administrativo.calcularSueldo());
        } else if (empleado instanceof Repartidor) {
            Repartidor repartidor = (Repartidor) empleado;
            System.out.println("Tipo de empleado: Repartidor");
            System.out.println("Repartos mensuales: " + repartidor.getRepartosMensuales());
            System.out.println("Bono por reparto: $" + repartidor.calcularBonoReparto());
            System.out.println("Sueldo: $" + repartidor.calcularSueldo());
        } else if (empleado instanceof Cajero) {
            Cajero cajero = (Cajero) empleado;
            System.out.println("Tipo de empleado: Cajero");
            System.out.println("Sucursal: " + cajero.getSucursal());
            System.out.println("Sueldo: $" + cajero.calcularSueldo());
        }
    }
}

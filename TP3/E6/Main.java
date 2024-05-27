import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de BaseEmpleados
        BaseEmpleados baseEmpleados = new BaseEmpleados();

        // Crear empleados de ejemplo y agregarlos a la lista
        try {
            // Crear empleados administrativos
            baseEmpleados.agregarEmpleado(new Administrativo(1, "Juan", "Perez", 30, "01/01/2010", 2500.0));
            baseEmpleados.agregarEmpleado(new Administrativo(2, "Maria", "Gomez", 35, "15/06/2012", 2800.0));

            // Crear empleados de maestranza
            baseEmpleados.agregarEmpleado(new OperarioMaestranza(3, "Pedro", "Martinez", 25, "10/03/2015", 2000.0));
            baseEmpleados.agregarEmpleado(new OperarioMaestranza(4, "Laura", "Sanchez", 28, "20/09/2017", 2200.0));

            // Crear empleados vendedores
            baseEmpleados.agregarEmpleado(new Vendedor(5, "Carlos", "Lopez", 40, "05/07/2013", 3000.0));
            baseEmpleados.agregarEmpleado(new Vendedor(6, "Ana", "Rodriguez", 32, "12/11/2016", 3200.0));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Verificar la cantidad de empleados
        System.out.println("Cantidad de empleados: " + baseEmpleados.verCantidadEmpleados());

        // Mostrar todos los empleados
        System.out.println("Todos los empleados:");
        baseEmpleados.mostrarTodosLosEmpleados();

        // Mostrar empleados por tipo
        System.out.println("\nEmpleados administrativos:");
        baseEmpleados.mostrarEmpleadosPorTipo("Administrativo");

        System.out.println("\nEmpleados de maestranza:");
        baseEmpleados.mostrarEmpleadosPorTipo("OperarioMaestranza");

        System.out.println("\nEmpleados vendedores:");
        baseEmpleados.mostrarEmpleadosPorTipo("Vendedor");

        // Eliminar dos empleados
        baseEmpleados.eliminarEmpleado(3);
        baseEmpleados.eliminarEmpleado(6);

        // Verificar la cantidad de empleados después de eliminar
        System.out.println("\nCantidad de empleados después de eliminar: " + baseEmpleados.verCantidadEmpleados());

        // Buscar un empleado por nombre
        System.out.println("\nBuscar empleado por nombre:");
        baseEmpleados.buscarEmpleado("Juan");
    }
}


abstract class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String fechaIngreso;
    private double sueldo;

    public Empleado(int id, String nombre, String apellido, int edad, String fechaIngreso, double sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaIngreso = fechaIngreso;
        this.sueldo = sueldo;
    }

    public abstract void realizarTareas();

    // Getters y setters (para todos los atributos)
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public double getSueldo() {
        return sueldo;
    }
}

class Administrativo extends Empleado {
    public Administrativo(int id, String nombre, String apellido, int edad, String fechaIngreso, double sueldo) {
        super(id, nombre, apellido, edad, fechaIngreso, sueldo);
    }

    @Override
    public void realizarTareas() {
        System.out.println("Realizando tareas administrativas.");
    }
}

class OperarioMaestranza extends Empleado {
    public OperarioMaestranza(int id, String nombre, String apellido, int edad, String fechaIngreso, double sueldo) {
        super(id, nombre, apellido, edad, fechaIngreso, sueldo);
    }

    @Override
    public void realizarTareas() {
        System.out.println("Realizando tareas de operario de maestranza.");
    }
}

class Vendedor extends Empleado {
    public Vendedor(int id, String nombre, String apellido, int edad, String fechaIngreso, double sueldo) {
        super(id, nombre, apellido, edad, fechaIngreso, sueldo);
    }

    @Override
    public void realizarTareas() {
        System.out.println("Realizando tareas de ventas.");
    }
}

class BaseEmpleados {
    private List<Empleado> empleados;

    public BaseEmpleados() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void eliminarEmpleado(int id) {
        empleados.removeIf(empleado -> empleado.getId() == id);
    }

    public void mostrarTodosLosEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre() + " " + empleado.getApellido() +
                    ", Fecha de ingreso: " + empleado.getFechaIngreso());
        }
    }

    public void buscarEmpleado(String nombreEmpleado) {
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equals(nombreEmpleado)) {
                System.out.println("Datos del empleado:");
                System.out.println("ID: " + empleado.getId());
                System.out.println("Nombre: " + empleado.getNombre());
                System.out.println("Apellido: " + empleado.getApellido());
                System.out.println("Edad: " + empleado.getEdad());
                System.out.println("Fecha de ingreso: " + empleado.getFechaIngreso());
                System.out.println("Sueldo: " + empleado.getSueldo());
                return;
            }
        }
        System.out.println("Empleado no encontrado.");
    }

    public int verCantidadEmpleados() {
        return empleados.size();
    }

    public void mostrarEmpleadosPorTipo(String tipoEmpleado) {
        for (Empleado empleado : empleados) {
            if (empleado.getClass().getSimpleName().equals(tipoEmpleado)) {
                System.out.println("Nombre: " + empleado.getNombre() + " " + empleado.getApellido() +
                        ", Tipo: " + empleado.getClass().getSimpleName());
            }
        }
    }

    // Getters y setters adicionales
    public List<Empleado> getEmpleados() {
        return empleados;
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //crea una lista de habitaciones
        List<Habitacion> habitaciones = new ArrayList<>();

        //Crea habitaciones
        habitaciones.add(new Habitacion(5, false)); // Habitación 1
        habitaciones.add(new Habitacion(3, false)); // Habitación 2


        //Crea pacientes
        Paciente paciente1 = new Paciente("Juan", "Perez", "12345678", true);
        Paciente paciente2 = new Paciente("Ana", "Gomez", "87654321", false);

        //Asigna paciente a habitación si el paciente tiene que ser atendido y la habitación no esta saturada
        if (paciente1.getNecesitaAtencion() == true && habitaciones.get(0).getSaturada() == false) {
            habitaciones.get(0).internarPaciente(paciente1);
        }
        
        if (paciente2.getNecesitaAtencion() == true && habitaciones.get(1).getSaturada() == false) {
            habitaciones.get(1).internarPaciente(paciente2);
        }
        
        //pide input de numero de habitacion
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de habitacion: ");
        int numeroHabitacion = scanner.nextInt();
        scanner.close();

        //selecciona el numero de habitacion en la lista
        Habitacion habitacion = habitaciones.get(numeroHabitacion - 1);

        //Imprime los pacientes internados en la habitacion seleccionada
        List<Paciente> pacientesInternados = habitacion.getPacientesInternados();
            System.out.println("Pacientes internados en la habitacion: ");
            for (Paciente paciente : pacientesInternados) {
                System.out.println(paciente.getNombre() + " " + paciente.getApellido() + " " + paciente.getDni());
            }
    }
}

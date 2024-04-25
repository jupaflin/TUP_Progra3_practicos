public class Tp1E1 { //del punto 1 al 6
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        Persona persona1 = new Persona("Lautaro","Martinez",'M',24,"Bahia Blanca"); 
        Persona persona2 = new Persona("Juan","Perez");
        Celular celular1 = new Celular("modelo1","marca1");
    }
}

class Persona {
    private String nombre;
    private String apellido;
    private char sexo;
    private int edad;
    private String ciudad;

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.sexo = ' ';
        this.edad = 0;
        this.ciudad = "";
    }

    public Persona(String nombre, String apellido, char sexo, int edad, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Sexo: " + sexo);
        System.out.println("Edad: " + edad);
        System.out.println("Ciudad: " + ciudad);
    }

    public void mayorDeEdad() {
        if (edad > 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " no es mayor de edad.");
        }
    }
}    

class Auto {
    private String color;
    private String patente;
    private int año;
    private String modelo;
    private int km;

    public Auto() {
        this.color = "";
        this.patente = "";
        this.año = 0;
        this.modelo = "";
        this.km = 0;
    }

    public Auto(String color, String patente, int año, String modelo, int km) {
        this.color = color;
        this.patente = patente;
        this.año = año;
        this.modelo = modelo;
        this.km = km;
    }

    public void encender() {
        System.out.println("El auto se encendió");
    }

    public void kilometrajeMayor() {
        if (km > 100000) {
            System.out.println("Auto: " + modelo + ", Patente: " + patente + ", Kilometros: " + km);
        }
    }
}

class Celular {
    private String Modelo;
    private String Marca;
    private int memoria;
    private boolean radio;
    private int nroCelular;

    public Celular() {
        this.Modelo = "";
        this.Marca = "";
        this.memoria = 0;
        this.radio = false;
        this.nroCelular = 0;
    }

    public Celular(String Modelo, String Marca, int memoria, boolean radio, int nroCelular) {
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.memoria = memoria;
        this.radio = radio;
        this.nroCelular = nroCelular;
    }

    public Celular(String Modelo, String Marca) {
        this.Modelo = Modelo;
        this.Marca = Marca;
    }

    public void realizarLlamada() {
        System.out.println("Llamando...");
    }

    public void cortarLlamada() {
        System.out.println("Llamada terminada");
    }
}
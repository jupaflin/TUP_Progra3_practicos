import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Clase abstracta Shape con posición y perímetro
abstract class Shape {
    protected double x;
    protected double y;
    protected double perimetro;

    public Shape(double x, double y, double perimetro) {
        this.x = x;
        this.y = y;
        this.perimetro = perimetro;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void mover(double deltaX, double deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    abstract String getTipo();
}

// Clase Circle que hereda de Shape
class Circle extends Shape {
    public Circle(double x, double y, double perimetro) {
        super(x, y, perimetro);
    }

    @Override
    String getTipo() {
        return "Círculo";
    }
}

// Clase Rectangle que hereda de Shape
class Rectangle extends Shape {
    public Rectangle(double x, double y, double perimetro) {
        super(x, y, perimetro);
    }

    @Override
    String getTipo() {
        return "Rectángulo";
    }
}

// Clase Triangle que hereda de Shape
class Triangle extends Shape {
    public Triangle(double x, double y, double perimetro) {
        super(x, y, perimetro);
    }

    @Override
    String getTipo() {
        return "Triángulo";
    }
}

// Clase ShapeList para manejar una lista de figuras
class ShapeList {
    private List<Shape> listaFiguras;

    public ShapeList() {
        listaFiguras = new ArrayList<>();
    }

    public void agregarFigura(Shape figura) {
        listaFiguras.add(figura);
    }

    public void insertarFiguraEnPosicion(Shape figura, int posicion) {
        if (posicion >= 0 && posicion <= listaFiguras.size()) {
            listaFiguras.add(posicion, figura);
        } else {
            System.out.println("Posición inválida");
        }
    }

    public int cantidadFiguras() {
        return listaFiguras.size();
    }

    public void quitarFiguraDePosicion(int posicion) {
        if (posicion >= 0 && posicion < listaFiguras.size()) {
            listaFiguras.remove(posicion);
        } else {
            System.out.println("Posición inválida");
        }
    }

    public void eliminarFigura(Shape figura) {
        listaFiguras.remove(figura);
    }

    public void dibujarFiguras() {
        for (Shape figura : listaFiguras) {
            System.out.println(figura.getTipo() + ": Posición = (" + figura.getX() + ", " + figura.getY() + "), Perímetro = " + figura.getPerimetro());
        }
    }

    public void escalarFiguras(double factor) {
        for (Shape figura : listaFiguras) {
            double nuevoPerimetro = figura.getPerimetro() * factor;
            figura.setPerimetro(nuevoPerimetro);
        }
    }

    public void moverFiguras(double deltaX, double deltaY) {
        for (Shape figura : listaFiguras) {
            figura.mover(deltaX, deltaY);
        }
    }

    public Shape encontrarFiguraPorPosicion(double x, double y) {
        for (Shape figura : listaFiguras) {
            if (figura.getX() == x && figura.getY() == y) {
                return figura;
            }
        }
        return null; // Retorna null si no se encuentra ninguna figura en la posición dada
    }
}

// Clase principal para probar el código
public class Main {
    public static void main(String[] args) {
        ShapeList shapeList = new ShapeList();
        Scanner scanner = new Scanner(System.in);

        // Agregar un círculo
        System.out.println("Ingrese la posición (x, y) y el perímetro del círculo:");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double perimetro = scanner.nextDouble();
        Circle circle = new Circle(x, y, perimetro);
        shapeList.agregarFigura(circle);

        // Agregar un rectángulo
        System.out.println("Ingrese la posición (x, y) y el perímetro del rectángulo:");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        perimetro = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(x, y, perimetro);
        shapeList.agregarFigura(rectangle);

        // Agregar un triángulo
        System.out.println("Ingrese la posición (x, y) y el perímetro del triángulo:");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        perimetro = scanner.nextDouble();
        Triangle triangle = new Triangle(x, y, perimetro);
        shapeList.agregarFigura(triangle);

        // Dibujar las figuras
        System.out.println("Figuras antes de escalar:");
        shapeList.dibujarFiguras();

        // Encontrar una figura por posición para escalar
        System.out.println("Ingrese la posición (x, y) para encontrar una figura para escalar:");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        Shape figuraEncontrada = shapeList.encontrarFiguraPorPosicion(x, y);
        if (figuraEncontrada != null) {
            System.out.println("Figura encontrada: " + figuraEncontrada.getTipo() + " en posición (" + figuraEncontrada.getX() + ", " + figuraEncontrada.getY() + ")");
            System.out.println("Ingrese el factor de escalado:");
            double factor = scanner.nextDouble();
            figuraEncontrada.setPerimetro(figuraEncontrada.getPerimetro() * factor);
        } else {
            System.out.println("No se encontró ninguna figura en la posición (" + x + ", " + y + ")");
        }

        // Dibujar las figuras después de escalar
        System.out.println("Figuras después de escalar:");
        shapeList.dibujarFiguras();

        // Encontrar una figura por posición para mover
        System.out.println("Ingrese la posición (x, y) para encontrar una figura para mover:");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        figuraEncontrada = shapeList.encontrarFiguraPorPosicion(x, y);
        if (figuraEncontrada != null) {
            System.out.println("Figura encontrada: " + figuraEncontrada.getTipo() + " en posición (" + figuraEncontrada.getX() + ", " + figuraEncontrada.getY() + ")");
            System.out.println("Ingrese el desplazamiento en x y en y:");
            double deltaX = scanner.nextDouble();
            double deltaY = scanner.nextDouble();
            figuraEncontrada.mover(deltaX, deltaY);
        } else {
            System.out.println("No se encontró ninguna figura en la posición (" + x + ", " + y + ")");
        }

        // Dibujar las figuras después de mover
        System.out.println("Figuras después de mover:");
        shapeList.dibujarFiguras();

        // Usar los métodos adicionales
        System.out.println("Ingrese los detalles de una nueva figura para agregarla al final de la lista (x, y, perímetro):");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        perimetro = scanner.nextDouble();
        Circle nuevoCircle = new Circle(x, y, perimetro);
        shapeList.agregarFigura(nuevoCircle);
        System.out.println("Figura agregada al final de la lista.");

        System.out.println("Ingrese los detalles de una nueva figura para insertar en una posición (x, y, perímetro, posición):");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        perimetro = scanner.nextDouble();
        int posicion = scanner.nextInt();
        Rectangle nuevoRectangle = new Rectangle(x, y, perimetro);
        shapeList.insertarFiguraEnPosicion(nuevoRectangle, posicion);
        System.out.println("Figura insertada en la posición " + posicion);

        System.out.println("Cantidad de figuras en la lista: " + shapeList.cantidadFiguras());

        System.out.println("Ingrese la posición de la figura que desea quitar:");
        posicion = scanner.nextInt();
        shapeList.quitarFiguraDePosicion(posicion);
        System.out.println("Figura en la posición " + posicion + " ha sido quitada.");

        // Dibujar las figuras después de las modificaciones
        System.out.println("Figuras después de las modificaciones:");
        shapeList.dibujarFiguras();

        scanner.close();
    }
}

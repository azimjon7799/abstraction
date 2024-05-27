package TaskA;

public class Main {
    public static void main(String[] args) {
        GeometricFigure triangle = new Triangle(3, 4,5);
        GeometricFigure trapezium = new Trapezium(10, 6,5);
        GeometricFigure rectangle = new Rectangle(5, 10);
        triangle.info();
        trapezium.info();
        rectangle.info();
    
    }
}

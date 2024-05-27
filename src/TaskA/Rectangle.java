package TaskA;

public class Rectangle extends GeometricFigure{

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double area(){
        return sideA * sideB;
    }

    @Override
    double perimeter(){
        return (sideA + sideB) * 2;
    }

    @Override
    void info(){
        System.out.println("Rectangle Area: " + this.area());
        System.out.println("Rectangle Perimeter: " + this.perimeter());
    }
    
}

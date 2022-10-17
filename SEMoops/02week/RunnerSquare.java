import java.util.Scanner;

public class RunnerSquare {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length:    ");
        double length = sc.nextDouble();
        Square square = new Square();
        square.setLength(length);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println("length: " + square.getLength());
        System.out.println(square.toString());
        System.out.println(square);
        sc.close();    
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


 
 class Square {
    private double length;

    @Override
    public String toString() {
        return "Square [length=" + getLength() + "]";
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return getLength() * getLength();
    }

    public double getPerimeter() {
        return getLength() * 4;
    }
}

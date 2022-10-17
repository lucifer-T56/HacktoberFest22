import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Radius:    ");
        double radius = sc.nextDouble();
        cirlceRadious r = new cirlceRadious();
        r.setRadious(radius);
        System.out.println(r);
        sc.close();    
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class cirlceRadious {
    private double radious;

    @Override
    public String toString() {
        return "cirlceRadious [radious=" + radious +"  circumference="+getcircumference()+"  area="+getArea()+ "]";
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public double getArea() {
        return Math.PI * radious * radious;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radious;
    }

    public double getcircumference() {
        return 2 * Math.PI * radious;
    }
}

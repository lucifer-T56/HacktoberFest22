
import java.util.Scanner;

public class Employee
{
    private int pan;
    private String name;
    private double taxincome;
    private double tax;
    
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter pan number: ");
        pan = in.nextInt();
        in.nextLine();
        System.out.print("Enter Name: ");
        name = in.nextLine();
        System.out.print("Enter taxable income: ");
        taxincome = in.nextDouble();
        in.close();
    }
    
    public void cal() {
        if (taxincome <= 250000)
            tax = 0;
        else if (taxincome <= 500000)
            tax = (taxincome - 250000) * 0.1;
        else if (taxincome <= 1000000)
            tax = 30000 + ((taxincome - 500000) * 0.2);
        else
            tax = 50000 + ((taxincome - 1000000) * 0.3);
    }
    
    public void display() {
        System.out.println("Pan Number\tName\tTax-Income\tTax");
        System.out.println(pan + "\t" + name + "\t" 
            + taxincome + "\t" + tax);
    }
    
    public static void main(String args[]) {
        Employee obj = new Employee();
        obj.input();
        obj.cal();
        obj.display();
    }
}

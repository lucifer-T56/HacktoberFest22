


import java.util.Scanner;

public class Calculator
{
    private int a;
    private int b;
    private int sum;
    private int diff;

    public void inputdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        sc.close();
    }
    
    public void calculate() {
        sum = a + b;
        diff = a - b;
    }
    
    public void outputdata() {
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
    }
    
    public static void main(String args[]) {
        Calculator obj = new Calculator();
        obj.inputdata();
        obj.calculate();
        obj.outputdata();
    }
}

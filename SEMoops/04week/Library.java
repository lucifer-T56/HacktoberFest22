import java.util.Scanner;

public class Library
{
    private String name;
    private int price;
    private int day;
    private double fine;
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of the book: ");
        name = sc.nextLine();
        System.out.print("Enter printed price of the book: ");
        price = sc.nextInt();
        System.out.print("For how many days fine needs to be paid: ");
        day = sc.nextInt();
        sc.close();
    }
    
    public void cal() {
        if (day <= 7)
            fine = day * 0.25;
        else if (day <= 15)
            fine = (7 * 0.25) + ((day - 7) * 0.4);
        else if (day <= 30)
            fine = (7 * 0.25) + (8 * 0.4) + ((day - 15) * 0.6);
        else
            fine = (7 * 0.25) + (8 * 0.4) + (15 * 0.6) + ((day - 30) * 0.8);
    }
    
    public void display() {
        System.out.println("Name of the book: " + name);
        System.out.println("Printed price of the book: "+price);
        System.out.println("Fine to be paid: " + fine);
    }
    
    public static void main(String args[]) {
        Library lb = new Library();
        lb.input();
        lb.cal();
        lb.display();
    }
}
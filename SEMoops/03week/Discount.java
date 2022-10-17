import java.util.Scanner;

public class Discount
{
    private int cost;
    private String name;
    private double dc;
    private double amt;
    
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        name = in.nextLine();
        System.out.print("Enter article cost: ");
        cost = in.nextInt();
        in.close();
    }
    
    public void cal() {
        if (cost <= 5000)
            dc = 0;
        else if (cost <= 10000)
            dc = cost * 0.1;
        else if (cost <= 15000)
            dc = cost * 0.15;
        else
            dc = cost * 0.2;
            
        amt = cost - dc;
    }
    
    public void display() {
        System.out.println("Name of the customer\tDiscount\tAmount to be paid");
        System.out.println(name + "\t" + dc + "\t" + amt);   
    }
    
    public static void main(String args[]) {
        Discount obj = new Discount();
        obj.input();
        obj.cal();
        obj.display();
    }
}

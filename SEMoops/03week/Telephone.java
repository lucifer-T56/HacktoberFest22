import java.util.Scanner;

public class Telephone
{
    private int prv;
    private int pre;
    private int call;
    private String name;
    private double amt;
    private double total;
    
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        name = in.nextLine();
        System.out.print("Enter previous reading: ");
        prv = in.nextInt();
        System.out.print("Enter present reading: ");
        pre = in.nextInt();
        in.close();
    }
    
    public void cal() {
        call = pre - prv;
        if (call <= 100)
            amt = 0;
        else if (call <= 200)
            amt = (call - 100) * 0.9;
        else if (call <= 400)
            amt = (100 * 0.9) + (call - 200) * 0.8;
        else
            amt = (100 * 0.9) + (200 * 0.8) + ((call - 400) * 0.7);
            
        total = amt + 180;
    }
    
    public void display() {
        System.out.println("Name of the customer\tCalls made\tAmount to be paid");
        System.out.println(name + "\t" + call + "\t" + total);
    }
    
    public static void main(String args[]) {
        Telephone obj = new Telephone();
        obj.input();
        obj.cal();
        obj.display();
    }
}

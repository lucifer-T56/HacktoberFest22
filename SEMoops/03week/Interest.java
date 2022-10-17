import java.util.Scanner;

public class Interest
{
    private int p;
    private float r;
    private int t;
    private double interest;
    private double amt;
    
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter principal: ");
        p = in.nextInt();
        System.out.print("Enter time: ");
        t = in.nextInt();
        in.close();
    }
    
    public void cal() {
        if (t == 1)
            r = 6.5f;
        else if (t == 2)
            r = 7.5f;
        else if (t == 3)
            r = 8.5f;
        else
            r = 9.5f;
            
        interest = (p * r * t) / 100.0;
        amt = p + interest;
    }
    
    public void display() {
        System.out.println("Principal: " + p);
        System.out.println("Interest: " + interest);
        System.out.println("Amount Payable: " + amt);
    }
    
    public static void main(String args[]) {
        Interest obj = new Interest();
        obj.input();
        obj.cal();
        obj.display();
    }
}

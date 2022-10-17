import java.util.Scanner;

public class Bill
{
    private int bno;
    private String name;
    private int call;
    private double amt;
    
    public Bill() {
        bno = 0;
        name = "";
        call = 0;
        amt = 0.0;
    }
    
    public Bill(int bno, String name, int call) {
        this.bno = bno;
        this.name = name;
        this.call = call;
    }
    
    public void calculate() {
        double charge;
        if (call <= 100)
            charge = call * 0.6;
        else if (call <= 200)
            charge = 60 + ((call - 100) * 0.8);
        else if (call <= 300)
            charge = 60 + 80 + ((call - 200) * 1.2);
        else
            charge = 60 + 80 + 120 + ((call - 300) * 1.5);
            
        amt = charge + 125;
    }
    
    public void display() {
        System.out.println("Bill No: " + bno);
        System.out.println("Name: " + name);
        System.out.println("Calls: " + call);
        System.out.println("Amount Payable: " + amt);
    }
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String custName = sc.nextLine();
        System.out.print("Enter Bill Number: ");
        int billNum = sc.nextInt();
        System.out.print("Enter Calls: ");
        int numCalls = sc.nextInt();
        sc.close();
        
        Bill obj = new Bill(billNum, custName, numCalls);
        obj.calculate();
        obj.display();
    }
}

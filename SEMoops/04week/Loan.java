import java.util.Scanner;

public class Loan
{
    private int time;
    private double principal;
    private double rate;
    private double interest;
    private double amt;
    
    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal :: ");
        principal = sc.nextInt();
        System.out.print("Enter time(in Year) :: ");
        time = sc.nextInt();
        sc.close();
    }
    
    public void calculate() {
        if (time <= 5)
            rate = 15.0;
        else if (time <= 10)
            rate = 12.0;
        else
            rate = 10.0;
            
        interest = (principal * rate * time) / 100.0;
        amt = principal + interest;
    }
    
    public void display() {
        System.out.println("Interest :: " + interest);
        System.out.println("Amount Payable :: " + amt);
    }
    
    public static void main(String [] args) {
        Loan bank = new Loan();
        bank.getdata();
        bank.calculate();
        bank.display();
    }
}
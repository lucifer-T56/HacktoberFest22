import java.util.Scanner;

public class Honda
{
    private int type;
    private int cost;
    private double newCost;
    
    public void gettype() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter type : ");
        type = sc.nextInt();
        System.out.print("Enter cost : ");
        cost = sc.nextInt();
        sc.close();
    }
    /* 
    Type of Engine	Rate of increment
         2 stroke	 10% of the cost
         4 stroke	 12% of the cost
    */
    public void find() {
        switch (type) {
            case 2->
            newCost = cost + (cost * 0.1);
            case 4->
            newCost = cost + (cost * 0.12);
            default ->
            System.out.println("Incorrect type");
            
        }
    }
    
    public void printcost() {
        System.out.println("Type :: " + type);
        System.out.println("New cost :: " + newCost);
    }
    
    public static void main(String args[]) {
        Honda hero = new Honda();
        hero.gettype();
        hero.find();
        hero.printcost();
    }
    
}
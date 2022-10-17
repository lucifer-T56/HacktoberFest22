import java.util.Scanner;

public class Discount {
    public void discount(int price) {
        System.out.println("Amount after single discount = " + discount(price, 10));
        System.out.println("Amount after successive discount = " + discount(price, 10, 8));
    }
    public double discount(int price, int d) {
        double priceAfterDisc = price - price * d / 100.0;
        return priceAfterDisc;
    }
    public double discount(int price, int d1, int d2) {
        double priceAfterDisc1 = price - price * d1 / 100.0;
        double priceAfterDisc2 = priceAfterDisc1 - priceAfterDisc1 * d2 / 100.0;
        return priceAfterDisc2;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price: ");
        int price = sc.nextInt();
        Discount obj = new Discount();
        obj.discount(price);
        sc.close();
    }
}

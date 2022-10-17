import java.util.Scanner;
public class CSE3_1LabPrctice {

public static void main(String[] args) {
    try {
     Scanner sc = new Scanner(System.in); 
        System.out.println(" enter Numbers :    ");
        int n = sc.nextInt();
        int nn = sc.nextInt();
        System.out.println("GCD :: "+gcd(n,nn));
        sc.close();
    } catch (Exception e) {
        System.out.println(e);
    }
}
private static int gcd(int a, int b) {
    if (b == 0)
        return a;
    return gcd(b, a % b);
}
}

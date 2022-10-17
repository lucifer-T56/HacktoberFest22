package Zeroprctice.method;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter 4 numbers: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(), d = sc.nextDouble();
        Operation op = new Operation(a, b, c, d);
        System.out.println(op);
        sc.close();   
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Exception: " + e);
        }
    }
}

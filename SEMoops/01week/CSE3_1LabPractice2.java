import java.util.Scanner;
public class CSE3_1LabPractice2 {
public static void main(String[] args) {
    try {
     Scanner sc = new Scanner(System.in); 
        System.out.println(" Range :    ");
        int n = sc.nextInt();
        int nn = sc.nextInt();
        System.out.println("prime number in range :: ");
        printPrime(n, nn);
        sc.close();
    } catch (Exception e) {
        System.out.println(e);
    }
}
private static void printPrime(int low,int high){
    for(int i=low;i<=high;i++){
        if(isPrime(i)){
            System.out.print(i+"  ");
        }
    }
}
private static boolean isPrime(int n) {
    if (n == 1)
        return false;
    for (int i = 2; i < n; i++)
        if (n % i == 0)
            return false;
    return true;
}
}

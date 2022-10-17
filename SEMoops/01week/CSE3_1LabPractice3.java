import java.util.*;
public class CSE3_1LabPractice3 {
public static void main(String[] args) {
    try {
     Scanner sc = new Scanner(System.in); 
        System.out.println(" Number :    ");
        int n = sc.nextInt();
        System.out.println("prime Factors in range :: ");
        primeFactors(n);
        sc.close();
    } catch (Exception e) {
        System.out.println(e);
    }
}
private static void primeFactors(int n){
    int i=2;
    while(n>1){
        if(n%i==0){
            System.out.print(i+"  ");
            n=n/i;
        }
        else{
            i++;
        }
    }
}
}


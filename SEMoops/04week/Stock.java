import java.util.Scanner;

public class Stock
{
    private String title;
    private String author;
    private String pub;
    private int noc;
    
    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title: ");
        title = sc.nextLine();
        System.out.print("Enter book author: ");
        author = sc.nextLine();
        System.out.print("Enter book publisher: ");
        pub = sc.nextLine();
        System.out.print("Enter no. of copies: ");
        noc = sc.nextInt();
        sc.close();
    }
    
    public void purchase(String t, String a, String p, int n) {
        if(t.equals(title) && a.equals(author) && p.equals(pub)){
                if (noc > n) {
                    noc -= n;
                    System.out.println("Updated noc = " + noc);
                }
                else {
                    System.out.println("Stock is under flowing");
                }}else{
                    System.out.println("Book is not avalable");
                }
        }
    
    
    public static void main(String args[]) {
        Stock bookseller = new Stock();
        bookseller.getdata();
        bookseller.purchase("Amit 69", "Amit Biswas",
            "Niku press", 10);
            bookseller.purchase("My 108 wellwishers", "Chirantn Mazumdar",
            "Butterfly publishers", 108);
            bookseller.purchase("Atanu's Journey", "Avik Das",
            "khuki", 20);
    }
}

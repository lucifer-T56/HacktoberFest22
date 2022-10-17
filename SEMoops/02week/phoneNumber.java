import java.util.Scanner;

public class phoneNumber {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            long phoneNumber = sc.nextLong();
            String first = sc.next();
            String last = sc.next();
            data obj = new data();
            obj.setNumber(phoneNumber);
            obj.setFirstName(first);
            obj.setLastName(last);
            System.out.println(obj.toString());
            sc.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
class data{
    private long  number;
    private String firstName;
    @Override
    public String toString() {
        return "data [firstName=" + getFirstName() + ", lastName=" + getLastName() + ", mobile number=" + getNumber() + "]";
    }
    private String lastName;
    public long getNumber() {
        return number;
    }
    public void setNumber(long number) {
        this.number = number;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
}

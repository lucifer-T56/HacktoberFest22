import java.util.Scanner;

public class JobData {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employ Name ");
        String name = sc.nextLine();
        System.out.println("Enter Employ Salary");
        long salary = sc.nextLong();
        System.out.println("Enter Employ commition in percentage");
        long commission = sc.nextLong();
        Employ employ = new Employ();
        employ.setName(name);
        employ.setSalary(salary);
        System.out.println(employ.toString());
        System.out.println("Salary with commition ="+employ.getMonthlySalary(commission));
        sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class Employ{
    private String name;
    private long salary;
    
    @Override
    public String toString() {
        return "Employ [name=" + name + ", salary=" + salary + " ,monthly slary=" + getMonthlySalary() + "]";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    

    public long getMonthlySalary(){
        return salary/12;
    }

    public long getMonthlySalary (long commission){
        return salary/12+salary*commission/100;
    }

}

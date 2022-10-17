package Zeroprctice.method;

public class Operation {
    private double a;
    private double b;
    private double c;
    private double d;
    public Operation(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public double multiply() {
        return a*b*c*d;   
    }
    public double divide() {
        return a/b+c/d;   
    }
    public double add() {
        return a+b+c+d;   
    }
    public double subtract() {
        return a-b-c-d;   
    }
    @Override
    public String toString() {
        return "Operation [a=" + a + " , b=" + b + " , c=" + c + " , d=" + d + " multiply= "+multiply()+" , divide ="+divide()+"  ,  add= "+add()+" ,  subtract= "+subtract()+"]";
    }
    

}

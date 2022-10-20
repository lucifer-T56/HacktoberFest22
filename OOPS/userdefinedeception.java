/*Write program a in Java to create a user defined exception named PayOutOfBoundsException (provided the monthly salary of a person is less than Rs. 10,000/-) and fire the exception.*/

import java.util.*;
class PayOutOfBoundsException extends Exception{
	PayOutOfBoundsException(String str){
	super(str);
	}
}
class Main{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Payment:: ");
	int payment=sc.nextInt();
	int balance=9999;
	
	try{
	if(payment>9999)
		throw new PayOutOfBoundsException("your balance is less than Rs. 10,000/-");
	else
		System.out.println("now balance:: "+(balance-payment));
	}
	catch(PayOutOfBoundsException poobe){
		System.out.println(poobe);
	}

	}
}
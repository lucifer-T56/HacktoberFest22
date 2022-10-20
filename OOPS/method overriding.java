/*Create a class named "Animal" which includes methods like eat() and sleep().Create a child class of Animal named "Bird" and override the parent class methods.Add a new method named fly().
Create an instance of Animal class and invoke the eat and sleep methods using this object.
Create an instance of Bird class and invoke the eat,sleep and fly methods using this object.*/


class Animal{
	public void eat(){
	System.out.println("A:eat");
	}
	public void sleep(){
	System.out.println("A:sleep");
	}
}
class Bird extends Animal{
	public void eat(){
	System.out.println("B:eat");
	}
	public void sleep(){
	System.out.println("B:sleep");
	}
	public void fly(){
	System.out.println("B:fly");
	}
}
class Test1{
	public static void main(String [] args){
	Animal a=new Animal();
	a.eat();
	a.sleep();
	Bird b=new Bird();
	b.eat();
	b.sleep();
	b.fly();
	}
}
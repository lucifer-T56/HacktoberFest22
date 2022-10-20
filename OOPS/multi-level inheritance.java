/*There are 3 classes Box,BoxWeight and BoxShipment.The member variables of the Box class are height,width and depth and there is a method volume() which will calculate the volume of the Box.The BoxWeight class also contains the above variables(height,width and depth) and also contains an extra variables i.e. weight which denotes the cost for shipment.Write a program in java that will calculate the volume of the shipment and print the value of the weight and cost of the shipment using concept of multi-level inheritence.*/

class Box{
double height,width,depth;
	Box(double height,double width,double depth){
		this.height=height;
		this.width=width;
		this.depth=depth;
	}
	double volume(){
		return height*width*depth;
	}
}
class BoxWeight extends Box{
	double weight;
	BoxWeight(double height,double width,double depth,double weight){
		super(height,width,depth);
		this.weight=weight;
	}
}
class BoxShipment extends BoxWeight{
	double cost;
	BoxShipment(double height,double width,double depth,double weight,double cost){
		super(height,width,depth,weight);
		this.cost=cost;
	}
}
class Demoshipment{
	public static void main(String[] args){
	BoxShipment bs=new BoxShipment(10,20,15,10,3.41);
	System.out.println("Volume="+bs.volume());
	System.out.println("Weight="+bs.weight);
	System.out.println("Cost="+bs.cost);
	}
}
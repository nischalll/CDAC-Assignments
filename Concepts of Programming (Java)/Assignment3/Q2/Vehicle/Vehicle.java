package Vehicle;

public class Vehicle {
	public int noOfWheels;
	public String color;
	public String fuel;
	public int speed;

	Vehicle(int noOfWheels, String color, String fuel, int speed){
		this.noOfWheels=noOfWheels;
		this.color=color;
		this.fuel=fuel;
		this.speed=speed;
	}

	public void start(){
		System.out.println("\uD83D\uDE99 Started dun dun dun dun......");
	}
	public void accelerate(){
		System.out.println("brummmmmmmmm......");
	}
	public void brake(){
		System.out.println(".......");
	}
}

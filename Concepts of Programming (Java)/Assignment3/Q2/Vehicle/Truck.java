package Vehicle;

public class Truck extends Vehicle{
	public int noOfDoors;
	public int loadCapacity;
	public int sizeOfContainers;

	Truck(int noOfWheels, String color, String fuel, int speed, int loadCapacity,int noOfDoors, int sizeOfContainers){
		super(noOfWheels, color, fuel, speed);
		this.loadCapacity=loadCapacity;
		this.noOfDoors=noOfDoors;
		this.sizeOfContainers=sizeOfContainers;
	}

	public void loadContainer(){
		System.out.println("===Loaded Content===");
	}
}

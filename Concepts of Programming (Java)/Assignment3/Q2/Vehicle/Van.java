package Vehicle;

public class Van extends Vehicle{
	public int noOfDoors;
	public int loadCapacity;
	public int noOfBoxes;

	Van(int noOfWheels, String color, String fuel, int speed, int loadCapacity,int noOfDoors, int noOfBoxes){
		super(noOfWheels, color, fuel, speed);
		this.loadCapacity=loadCapacity;
		this.noOfDoors=noOfDoors;
		this.noOfBoxes = noOfBoxes;
	}

	public void loadVan(){
		System.out.println("===Loaded Van===");
	}
}

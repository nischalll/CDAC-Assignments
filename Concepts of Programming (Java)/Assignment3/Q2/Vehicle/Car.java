package Vehicle;

public class Car extends Vehicle{
	public int noOfDoors;
	public int passengerSeats;

	Car(int noOfWheels, String color, String fuel, int speed, int passengerSeats,int noOfDoors){
		super(noOfWheels, color, fuel, speed);
		this.passengerSeats=passengerSeats;
		this.noOfDoors=noOfDoors;
	}
}

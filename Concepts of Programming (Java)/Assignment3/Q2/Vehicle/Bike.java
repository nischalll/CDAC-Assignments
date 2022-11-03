package Vehicle;

public class Bike extends Vehicle{
	public int passengerSeats;
	public int saddleHeight;

	Bike(int noOfWheels, String color, String fuel, int speed, int passengerSeats,int saddleHeight){
		super(noOfWheels, color, fuel, speed);
		this.passengerSeats=passengerSeats;
		this.saddleHeight=saddleHeight;
	}

}

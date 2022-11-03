package Vehicle;

public class Main {
	public static void main(String[] args){
		Bike bike = new Bike(2,"red","petrol",60,1,7);
		bike.start();
		bike.accelerate();
		bike.brake();


	}
}

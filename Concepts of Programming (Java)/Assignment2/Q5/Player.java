public class Player {
	public String name;
	public int age;
	public String countryName;
	public int totalRun;
	
	public Player(String name, int age, String countryName, int totalRun) {
		this.name = name;
		this.age = age;
		this.countryName = countryName;
		this.totalRun = totalRun;
	}
	
	public int getRuns() {
		return totalRun;
	}
}

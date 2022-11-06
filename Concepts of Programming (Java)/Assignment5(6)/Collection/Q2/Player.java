package CollectionDemo;

public class Player {
	private String name=null;
	
	private int totalRun;
	private int noOfWicket;
	private String country;
	private int noOfCentury;
	public int getNoOfCentury() {
		return noOfCentury;
	}

	public void setNoOfCentury(int noOfCentury) {
		this.noOfCentury = noOfCentury;
	}

	private String category;
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Player(String name, int totalRun,
				int noOfWicket, String country, 
				int noOfCentury, String category) 
	{
		this.name = name;
		this.totalRun = totalRun;
		this.noOfWicket = noOfWicket;
		this.country = country;
		this.noOfCentury = noOfCentury;
		this.category = category;
	}
	
	public String getName() {
		return name;
	}
	
	public int getTotalRun() {
		return totalRun;
	}
	
	
	
	@Override
	public String toString() {
		return "Player ["+name + ", totalRun=" + totalRun+" ,category="+category+"]\n";
	}
	
	
}

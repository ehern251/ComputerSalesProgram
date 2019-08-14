
public class VideoCard {

	private String name;
	private int memorySize;
	private double price;

	public VideoCard(String name, int memorySize, double price) {
		this.name = name;
		this.memorySize = memorySize;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getMemorySize() {
		return memorySize;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return "Name:\t " + name + "\n" + "Memory:\t + " + memorySize + "GB\n" + "Price:\t $" + price;
	}

}

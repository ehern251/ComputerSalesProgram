
public class HardDrive {

	private String name;
	private int size;
	private double price;

	public HardDrive(String name, int size, double price) {
		this.name = name;
		this.size = size;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return "Name:\t " + name + "\nSize:\t " + size + "GB\nPrice:\t $" + price;
	}

}

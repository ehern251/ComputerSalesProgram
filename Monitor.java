
public class Monitor {

	private String name;
	private double size;
	private double price;

	public Monitor(String name, double size, double price) {
		this.name = name;
		this.size = size;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getSize() {
		return size;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return "Name:\t " + name + "\n" + "Size:\t " + (int) size + '"' + "\n" + "Price:\t " + price;
	}

}

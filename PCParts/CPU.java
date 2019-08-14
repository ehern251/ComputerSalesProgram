
public class CPU {

	private String name;
	private double speed;
	private double price;

	public CPU(String name, double speed, double price) {
		this.name = name;
		this.speed = speed;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getSpeed() {
		return speed;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return "Name:\t " + name + "\n" + "Speed:\t " + (int) speed + "GHz\n" + "Price:\t $" + price;
	}

}

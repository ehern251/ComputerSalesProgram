	
	public class Case {

	private String name;
	private double height;
	private double width;
	private double depth;
	private String type;
	private double price;

	public Case(String name, double depth, double width, double height, String type, double price) {
		this.name = name;
		this.height = height;
		this.width = width;
		this.depth = depth;
		this.type = type;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public double getDepth() {
		return depth;
	}

	public String getType() {
		return type;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return "Name:\t " + name + "\n" + "Dimensions:\t " + depth + '"' + " x " + width + '"' + " x " + height + '"'
				+ "\n" + "Type:\t " + type + "\n" + "Price:\t $" + price;
	}

}


public class Computer {

	private Case towerCase;
	private Monitor monitor;
	private CPU cpu;
	private VideoCard videoCard;
	private HardDrive hardDrive;
	private Memory memory;

	public Computer(Case towerCase, Monitor monitor, CPU cpu, VideoCard videoCard, HardDrive hardDrive, Memory memory) {
		this.towerCase = towerCase;
		this.monitor = monitor;
		this.cpu = cpu;
		this.videoCard = videoCard;
		this.hardDrive = hardDrive;
		this.memory = memory;
	}

	public Case getTowerCase() {
		return towerCase;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public CPU getCpu() {
		return cpu;
	}

	public VideoCard getVideoCard() {
		return videoCard;
	}

	public HardDrive getHardDrive() {
		return hardDrive;
	}

	public Memory getMemory() {
		return memory;
	}

	public double getTotalCost() {
		return towerCase.getPrice() + monitor.getPrice() + cpu.getPrice() + videoCard.getPrice() + hardDrive.getPrice()
				+ memory.getPrice();
	}

	public void displayReceipt() {
		System.out.println("***************Receipt***************");
		// START TOWER
		System.out.println(towerCase.getName());
		System.out.println("\tType: " + towerCase.getType());
		System.out.println("\tDimensions:\t " + towerCase.getDepth() + '"' + " x " + towerCase.getWidth() + '"' + " x "
				+ towerCase.getHeight() + '"');
		System.out.println("\tPrice:.............................................$" + towerCase.getPrice());
		// END TOWER

		// START MONITOR
		System.out.println(monitor.getName());
		System.out.println("\tSize: " + monitor.getSize() + '"');
		System.out.println("\tPrice:.............................................$" + monitor.getPrice());
		// END MONITOR

		// START CPU
		System.out.println(cpu.getName());
		System.out.println("\tSpeed: " + cpu.getSpeed() + "GHz");
		System.out.println("\tPrice:.............................................$" + cpu.getPrice());
		// END CPU

		// START VIDEOCARD
		System.out.println(videoCard.getName());
		System.out.println("\tMemory Size: " + videoCard.getMemorySize() + "GB");
		System.out.println("\tPrice:.............................................$" + videoCard.getPrice());
		// END VIDEOCARD

		// START HD
		System.out.println(hardDrive.getName());
		System.out.println("\tSize: " + hardDrive.getSize() + "GB");
		System.out.println("\tPrice:.............................................$" + hardDrive.getPrice());
		// END HD

		// START MEMORY
		System.out.println(memory.getName());
		System.out.println("\tSize: " + memory.getSize() + "GB");
		System.out.println("\tPrice:.............................................$" + memory.getPrice());
		// END MEMORY

		System.out.println("Total Cost: $" + this.getTotalCost());
	}

}

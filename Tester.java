import java.util.Scanner;

public class Tester {

	private static int menuOption = -1;
	private static Case selectedCase;
	private static Monitor selectedMonitor;
	private static CPU selectedCPU;
	private static VideoCard selectedVideoCard;
	private static HardDrive selectedHardDrive;
	private static Memory selectedMemory;

	private static Case[] caseOptions = {
			new Case("Antec Twelve Hundred V3", 20.2, 8.39, 22.87, "ATX Full Tower", 154.99),
			new Case("BitPhenix Phenom M Arctic White", 9.8, 12.95, 14.69, "MicroATX Mini Tower", 89.99),
			new Case("Corsair 250D", 13.8, 10.9, 11.4, "MiniITX", 99.9) };

	private static Monitor[] monitorOptions = { new Monitor("Asus PB278Q", 27, 549.99),
			new Monitor("Dell U2412M", 24, 263.99), new Monitor("Samsung S22C300H", 21.5, 139.99) };

	private static CPU[] cpuOptions = { new CPU("AMD FX8350", 4.0, 188.99), new CPU("Intel Core i5-3570K", 34, 179.99),
			new CPU("Intel Core i7-3770K", 3.5, 249.99) };

	private static VideoCard[] videoCardOptions = { new VideoCard("Nvidia GeForce GTX 770", 2, 346.99),
			new VideoCard("Nvidia GeForce GTX 670", 2, 339.99), new VideoCard("AMD Radeon HD 7950", 3, 399.99) };

	private static HardDrive[] hardDriveOptions = { new HardDrive("Samsung MZ-7PD256BW", 256, 199.99),
			new HardDrive("Corsair CSSD-F240GBGT-BK", 240, 206.99), new HardDrive("Crucial CT128M4SSD1", 128, 199.95) };

	private static Memory[] memoryOptions = { new Memory("Corsair Vengeance", 8, 69.99),
			new Memory("G.Skill Ares Series", 16, 149.99), new Memory("Kingston Black Series", 8, 79.99) };

	public static void main(String[] args) {
		runMenu();
	}

	private static void runMenu() {
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println(menu());
			System.out.print("Please choose an option to build your computer: ");
			menuOption = scanner.nextInt();
		} while (menuOption < 1 || menuOption > 9);

		if (menuOption >= 1 && menuOption <= 6) {
			displayOptions();
			System.out.print("Please choose a " + getHeaderFooter() + ": ");
			selectPart(scanner.nextInt());
		} else if (menuOption == 7) {
			deleteComputer();
			runMenu();
		} else if (menuOption == 8) {
			System.out.println("");
			buildComputer().displayReceipt();
			System.out.println("");
			runMenu();
		} else if (menuOption == 9) {
			System.out.println("Program will exit!");
			System.exit(0);
		}

		scanner.close();
	}

	private static Computer buildComputer() {
		return new Computer(selectedCase, selectedMonitor, selectedCPU, selectedVideoCard, selectedHardDrive,
				selectedMemory);
	}

	private static void deleteComputer() {
		selectedCase = null;
		selectedMonitor = null;
		selectedCPU = null;
		selectedVideoCard = null;
		selectedHardDrive = null;
		selectedMemory = null;
	}

	private static void displayOptions() {
		System.out.println("**********************" + getHeaderFooter() + " Menu**********************");
		switch (menuOption) {
		case 1:
			for (int i = 1; i <= caseOptions.length; i++) {
				Case towerCase = caseOptions[i - 1];
				System.out.println(i + ". " + towerCase.getName());
				System.out.println("\tType: " + towerCase.getType());
				System.out.println("\tDimensions: " + towerCase.getDepth() + '"' + " x " + towerCase.getWidth() + '"'
						+ " x " + towerCase.getHeight() + '"');
				System.out.println("\tPrice:.............................................$" + towerCase.getPrice());
			}
			break;
		case 2:
			for (int i = 1; i <= monitorOptions.length; i++) {
				Monitor monitor = monitorOptions[i - 1];
				System.out.println(i + ". " + monitor.getName());
				System.out.println("\tSize: " + monitor.getSize() + '"');
				System.out.println("\tPrice:.............................................$" + monitor.getPrice());
			}
			break;
		case 3:
			for (int i = 1; i <= cpuOptions.length; i++) {
				CPU cpu = cpuOptions[i - 1];
				System.out.println(i + ". " + cpu.getName());
				System.out.println("\tSpeed: " + cpu.getSpeed() + "GHz");
				System.out.println("\tPrice:.............................................$" + cpu.getPrice());
			}
			break;
		case 4:
			for (int i = 1; i <= videoCardOptions.length; i++) {
				VideoCard videoCard = videoCardOptions[i - 1];
				System.out.println(i + ". " + videoCard.getName());
				System.out.println("\tMemory: " + videoCard.getMemorySize() + "GB");
				System.out.println("\tPrice:.............................................$" + videoCard.getPrice());
			}
			break;
		case 5:
			for (int i = 1; i <= hardDriveOptions.length; i++) {
				HardDrive hardDrive = hardDriveOptions[i - 1];
				System.out.println(i + ". " + hardDrive.getName());
				System.out.println("\tSize: " + hardDrive.getSize() + "GB");
				System.out.println("\tPrice:.............................................$" + hardDrive.getPrice());
			}
			break;
		case 6:
			for (int i = 1; i <= memoryOptions.length; i++) {
				Memory memory = memoryOptions[i - 1];
				System.out.println(i + ". " + memory.getName());
				System.out.println("\tSize: " + memory.getSize() + "GB");
				System.out.println("\tPrice:.............................................$" + memory.getPrice());
			}
		}
		System.out.println("********************************");
	}

	private static void selectPart(int option) {
		switch (menuOption) {
		case 1:
			selectedCase = caseOptions[option - 1];
			break;
		case 2:
			selectedMonitor = monitorOptions[option - 1];
			break;
		case 3:
			selectedCPU = cpuOptions[option - 1];
			break;
		case 4:
			selectedVideoCard = videoCardOptions[option - 1];
			break;
		case 5:
			selectedHardDrive = hardDriveOptions[option - 1];
			break;
		case 6:
			selectedMemory = memoryOptions[option - 1];
			break;
		}
		System.out.println("");
		runMenu();
	}

	private static String getHeaderFooter() {
		switch (menuOption) {
		case 1:
			return "Case";
		case 2:
			return "Monitor";
		case 3:
			return "CPU";
		case 4:
			return "Video Card";
		case 5:
			return "Hard Drive";
		case 6:
			return "Memory";
		default:
			return "Error";
		}
	}

	private static String menu() {
		return "***********Main Menu************\n" + "1. Choose a Case\n" + "2. Choose a Monitor\n"
				+ "3. Choose a CPU \n" + "4. Choose a Video Card \n" + "5. Choose a Hard Drive \n"
				+ "6. Choose a Memory \n" + "7. Delete Current Computer \n" + "8. Display Receipt \n"
				+ "9. Exit Program \n" + "********************************";
	}

}

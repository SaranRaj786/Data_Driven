package day3_10;

public class desktop implements hardware, software {

	public void desktopModel() {
		System.out.println("The Desktop contains");
	}

	@Override
	public void softwareResources() {

		System.out.println(" --> Software is a collection of programing code installed on computee Hard-drive   ");

	}

	@Override
	public void hardwareResources() {
		System.out.println("--> Hardware is any Physical device used within the machine ");
	}

	public static void main(String[] args) {
		desktop d = new desktop();
		d.hardwareResources();
		d.softwareResources();

	}

}

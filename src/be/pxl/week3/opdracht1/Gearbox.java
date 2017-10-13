package be.pxl.week3.opdracht1;

import java.util.ArrayList;

public class Gearbox {
	private int maxGears;
	private boolean clutchIsIn;
	private ArrayList<Gear> gears;
	private int currentGear = 0;

	public Gearbox(int maxGears) {
		this.maxGears = maxGears;
		this.gears = new ArrayList<>();
		for (int i = 0; i <= maxGears; i++) {
			addGear(i, i * 5.3);
		}
	}

	public void operateClutch(boolean in) {
		this.clutchIsIn = in;
	}

	private void addGear(int number, double ratio) {
		if (number >= 0 && number <= maxGears) {
			gears.add(new Gear(number, ratio));
		}

	}

	public void changeGear(int newGear) {
		if (newGear <= maxGears && clutchIsIn == true) {
			currentGear = newGear;
			System.out.println("Gear " + newGear + " selected");
		} else {
			System.out.println("Vreemd geluid");
			currentGear = 0;
		}

	}

	public double wheelSpeed(int revs) {
		if (clutchIsIn) {
			System.out.println("Vreemd geluid");
			return 0.0;
		} else {
			return gears.get(currentGear).driveSpeed(revs);
		}

	}

	private class Gear {

		private int gearNumber;
		private double ratio;

		public Gear(int gearNumber, double ratio) {
			this.gearNumber = gearNumber;
			this.ratio = ratio;
		}

		public double driveSpeed(int revs) {
			double result = revs * ratio;
			return result;
		}
	}

}

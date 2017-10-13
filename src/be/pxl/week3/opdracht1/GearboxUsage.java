package be.pxl.week3.opdracht1;

public class GearboxUsage {
	public static void main(String[] args) {
		
//		Gearbox gearBox = new Gearbox(3);
//		Gear gear1 = new Gear(2, 2.3);
//		Gear gear2 = new Gear(2, 2.3);
//		Gear gear3 = new Gear(2, 2.3);
//		gearBox.addGear(gear1);
//		gearBox.addGear(gear2);
//		gearBox.addGear(gear3);
		
		
		Gearbox mcLaren = new Gearbox(6);
		mcLaren.operateClutch(true);
		mcLaren.changeGear(1);
		mcLaren.operateClutch(false);
		System.out.println(mcLaren.wheelSpeed(1000));
		mcLaren.changeGear(2);
		System.out.println(mcLaren.wheelSpeed(3000));
		mcLaren.operateClutch(true);
		mcLaren.changeGear(3);
		mcLaren.operateClutch(false);
		System.out.println(mcLaren.wheelSpeed(6000));
	}
}

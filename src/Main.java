public class Main {
    public static void main(String[] args) {

        //tires
        Tire[] tires1 = { new Tire(18.0), new Tire(18.0) };
        Tire[] tires2 = { new Tire(19.0), new Tire(19.0) };
        Tire[] tires3 = { new Tire(17.5), new Tire(17.5) };

        //tanks
        TankSize tank1 = new TankSize(15.0);
        TankSize tank2 = new TankSize(18.0);
        TankSize tank3 = new TankSize(12.5);

        // engines
        Engine engine1 = new Engine("1000cc", "150hp");
        Engine engine2 = new Engine("1200cc", "170hp");
        Engine engine3 = new Engine("800cc", "120hp");

        // Create motorcycles
        Motorcycle motorcycle = new Motorcycle("Red", Brand.HONDA.name(), 1.8, Material.STEEL, tires1);
        motorcycle.setColor("Orange");

        Motorcycle motorcycle2 = new Motorcycle("Yellow", Brand.YAMAHA.name(), 2.0, Material.CARBON_FIBER, tires2);
        motorcycle2.setColor("Green");

        Motorcycle motorcycle3 = new Motorcycle("Blue", Brand.SUZUKI.name(), 2.2, Material.TITANIUM, tires3);

       //showing motorcycle info
        System.out.println("Motorcycle brand: " + motorcycle.getBrand());
        System.out.println("Motorcycle color: " + motorcycle.getColor());
        System.out.println("Motorcycle size: " + motorcycle.getSize());
        System.out.println("Frame material: " + motorcycle.getFrameMaterial());
        System.out.println("Tire size: " + motorcycle.getTireSize());
        System.out.println("Tank size: " + tank1.getSize() + " liters");
        System.out.println("Engine: " + engine1.getCC() + ", " + engine1.getHP());
        motorcycle.start();
        motorcycle.stop();

        System.out.println("Motorcycle brand: " + motorcycle2.getBrand());
        System.out.println("Motorcycle color: " + motorcycle2.getColor());
        System.out.println("Motorcycle size: " + motorcycle2.getSize());
        System.out.println("Frame material: " + motorcycle2.getFrameMaterial());
        System.out.println("Tire size: " + motorcycle2.getTireSize());
        System.out.println("Tank size: " + tank2.getSize() + " liters");
        System.out.println("Engine: " + engine2.getCC() + ", " + engine2.getHP());
        motorcycle2.start();
        motorcycle2.stop();

        System.out.println("Motorcycle brand: " + motorcycle3.getBrand());
        System.out.println("Motorcycle color: " + motorcycle3.getColor());
        System.out.println("Motorcycle size: " + motorcycle3.getSize());
        System.out.println("Frame material: " + motorcycle3.getFrameMaterial());
        System.out.println("Tire size: " + motorcycle3.getTireSize());
        System.out.println("Tank size: " + tank3.getSize() + " liters");
        System.out.println("Engine: " + engine3.getCC() + ", " + engine3.getHP());
        motorcycle3.start();
        motorcycle3.stop();
    }
}

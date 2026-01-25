// motorcycle class
public class Motorcycle {

    /**
     * The color of the motorcycle
     */
    private String color;

    /**
     * The brand of the motorcycle
     */
    private String brand;

    /**
     * The size of the motorcycle
     */
    private double size;

    private Tire[] tires;
    private Frame frame;

    /**
     * Motorcycle constructor
     *
     * @param color This is the color of the motorcycle.
     * @param brand This is the brand of the motorcycle.
     * @param size This is the size of the motorcycle.
     * @param frameMaterial This is the material of the motorcycle frame.
     * @param tires These are the tires for the motorcycle.
     */
    public Motorcycle(String color, String brand, double size, Material frameMaterial, Tire[] tires) {
        this.color = color;
        this.brand = brand;
        this.size = size;
        this.frame = new Frame(frameMaterial);
        this.tires = tires;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Material getFrameMaterial() {
        return frame.getMaterial();
    }

    public double getTireSize() {
        return tires[0].getSize();
    }

    public void start() {
        System.out.println("Motorcycle started!");
    }

    public void stop() {
        System.out.println("Motorcycle stopped.");
    }
}

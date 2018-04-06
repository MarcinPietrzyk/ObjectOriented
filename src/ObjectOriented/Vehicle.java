package ObjectOriented;

public abstract class Vehicle {
    private int numberOfWheels;
    private String engine;

    public Vehicle(int numberOfWheels, String engine) {
        this.numberOfWheels = numberOfWheels;
        this.engine = engine;
    }

    public void startEngine(){
        System.out.println("Engine has started.");
    }

}

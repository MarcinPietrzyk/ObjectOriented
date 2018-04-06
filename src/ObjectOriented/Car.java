package ObjectOriented;

public class Car extends Vehicle{
    private static final int NUMBER_OF_WHEELS = 4;
    private int numberOfSeats;

    public Car(int numberOfWheels, String engine) {
        super(numberOfWheels, engine);
    }

    public void startEngine(){
        super.startEngine();
        System.out.println("Force driver to fasten seat belts.");
    }
}

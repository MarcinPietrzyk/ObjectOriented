package ObjectOriented;

public class Car extends Vehicle{
    public void startEngine(){
        super.startEngine();
        System.out.print("Force driver to fasten seat belts.");
    }
}

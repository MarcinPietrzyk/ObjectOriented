package ObjectOriented;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inheritance");
        Car car1 = new Car(4,"diesel");
        car1.startEngine();

        Animal fish = new Goldfish();
        Animal human = new Human();
        System.out.println(fish);
        System.out.println(human);

    }

}

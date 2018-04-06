package ObjectOriented;

public class Human extends Mammal{
    public Human(int numberOfLimbs) {
        super(numberOfLimbs);
    }

    public Human() {
        super();
    }

    @Override
    public String toString() {
        return "I am a human";
    }
}

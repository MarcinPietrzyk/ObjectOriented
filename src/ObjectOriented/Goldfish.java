package ObjectOriented;

public class Goldfish extends Fish {
    public Goldfish(int numberOfLimbs) {
        super(numberOfLimbs);
    }

    public Goldfish() {
        super();
    }

    @Override
    public String toString() {
        return "I am goldfish";
    }
}

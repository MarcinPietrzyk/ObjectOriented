package ObjectOriented;

public abstract class Fish extends Animal {
    public Fish(int numberOfLimbs) {
        super(numberOfLimbs);

    }

    public Fish() {
        super();
    }

    @Override
    public String toString() {
        return "I like swim";
    }
}

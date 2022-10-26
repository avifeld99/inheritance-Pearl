package be.intecbrussel.canines;

public final class Labrador extends Dog {

    public Labrador() {

    }

    public Labrador (String name, int age, boolean canSkateboard) {
        super(name, age, canSkateboard);
    }

    @Override
    public String toString() {
        return "Labrador{}" + super.toString();
    }
}

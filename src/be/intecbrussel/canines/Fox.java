package be.intecbrussel.canines;

import java.util.Objects;

public class Fox extends Animal {

    public String name;

    @Override
    public void makeNoise() {
        System.out.println("ke kee kee");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fox)) return false;
        Fox fox = (Fox) o;
        return Objects.equals(name, fox.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}

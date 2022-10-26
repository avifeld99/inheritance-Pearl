package be.intecbrussel.canines;

import java.util.Objects;

public class Wolf {

    private String name;
    private int age;
    public final int legcount = 4;
    private static int count;
    {
        count++;
    }

    public Wolf() {
    }

    public Wolf(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Wolf.count = count;
    }

    public void makeNoise() {
        System.out.println("Awooooo!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wolf)) return false;
        Wolf wolf = (Wolf) o;
        return Objects.equals(name, wolf.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}



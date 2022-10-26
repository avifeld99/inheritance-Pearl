package be.intecbrussel;

import be.intecbrussel.canines.*;

public class MainApp {

    public static void main(String[] args) {

        Wolf wolf = new Wolf("Silver", 4);
        Dog dog = new Dog();
        Dog dog1 = new Dog();
        System.out.println(dog.equals(dog1)); // inherits equal and hashOf of the Wolf class
        Labrador labrador = new Labrador();
        Wolf wolfDog = new Dog();
        Wolf labrador1 = new Labrador();
        Animal animal = new Fox(); // Animal = abstract and not possible
        Animal animal1 = new Animal() {
            @Override
            public void makeNoise() {
                System.out.println("jlygfhg");
            }
        };
        Fox fox = new Fox();
        wolf.setName("mosh");
        labrador.setName("Chica");

        System.out.println(wolf);
        System.out.println(dog);
        System.out.println(labrador);
        System.out.println(wolf.getName());
        System.out.println(dog.getName());
        System.out.println(dog.isCanSkateBoard());
       /* wolf.makeNoise();
        dog.makeNoise();
        wolfDog.makeNoise();
        labrador.makeNoise();*/


        Wolf [] wolves = {wolf, wolfDog, labrador, dog};

        for (Wolf w : wolves) {
            if (w instanceof Dog) {
                System.out.println("who let the dogs out");
                w.makeNoise();
            } else {
                System.out.println("awooo wolf");
                w.makeNoise();
            }
        }

        System.out.println(Wolf.getCount());
        System.out.println(Dog.getCount());


        System.out.println(dog instanceof Wolf);
        System.out.println(dog instanceof Dog);
        System.out.println(dog instanceof Labrador); // fox is different inheritance, so ERROR


        Fox fox1 = new Fox();
        Fox fox2 = new Fox();
        System.out.println(fox1.name);
        System.out.println(fox1.hashCode());
        System.out.println(fox2.name);
        System.out.println(fox2.hashCode());
        System.out.println(fox1.equals(fox2));


    }

}

package ss7_interface_and_abstract_class.practice.animal_and_interface_edible.controller;

import ss7_interface_and_abstract_class.practice.animal_and_interface_edible.model.*;

public class AnimalAndEdible {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            animal.makeSound();
            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat() + "\n" + animal.makeSound());
            }
        }
        Edible[] edibles = new Edible[2];
        edibles[0] = new Aple();
        edibles[1] = new Orange();
        System.out.println(edibles[1].howToEat());
    }
}

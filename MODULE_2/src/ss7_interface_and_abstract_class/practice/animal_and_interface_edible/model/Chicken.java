package ss7_interface_and_abstract_class.practice.animal_and_interface_edible.model;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "cluck - cluck!";
    }

    @Override
    public String howToEat() {
        return "Boil chicken and eat";
    }
}

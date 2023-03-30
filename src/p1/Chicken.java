package p1;

public class Chicken extends Animal implements Edible{
    public Chicken(){
    }

    @Override
    public String howToEat() {
        return null;
    }

    @Override
    public String makeSound() {
        return "Cuk tak";
    }
}

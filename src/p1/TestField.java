package p1;

public class TestField {
    public static void main(String[] args) {
        Animal a1 = new Chicken();
        Animal a2 = new Tiger();
        System.out.println(a1.makeSound());
        System.out.println(a2.makeSound());
//        Edible e1 = (Edible) a1;
        System.out.println(((Edible) a1).howToEat());
    }
}

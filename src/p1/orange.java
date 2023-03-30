package p1;

public class orange extends Fruit implements Edible{
    public orange() {
    }

    @Override
    public String howToEat() {
        return "Remove it skin";
    }
}

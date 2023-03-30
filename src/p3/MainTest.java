package p3;
import src_from_p6.*;
public class MainTest {
    public static void main(String[] args) {
        CircleComparator c1 = new CircleComparator();
        Circle circle1 = new Circle(20);
        Circle circle2 = new Circle(10);
        System.out.println(c1.compare(circle1,circle2));
    }
}

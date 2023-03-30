package p2;

import src_from_p6.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        return (int) (this.getArea() - o.getArea());
    }
    @Override
    public String toString() {
        return "ComparableCircle{" +
                "radius=" + super.getRadius() +
                "} is " + super.toString() ;
    }

}

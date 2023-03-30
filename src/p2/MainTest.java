package p2;
import src_from_p6.*;

import java.util.ArrayList;
import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
        ComparableCircle cAble1 = new ComparableCircle(5,"red",true);
        ComparableCircle cAble2 = new ComparableCircle(7,"blue",false);
        ComparableCircle cAble3 = new ComparableCircle(3,"blue",true);
        System.out.println(cAble1.compareTo(cAble2));
        System.out.println(cAble1.getColor().compareTo(cAble2.getColor()));
        System.out.println(cAble2.getColor().compareTo(cAble3.getColor()));
        System.out.println("red".compareTo("blue"));

        ArrayList<ComparableCircle> myCircleList = new ArrayList<ComparableCircle>();
        myCircleList.add(cAble1);
        myCircleList.add(cAble2);
        myCircleList.add(cAble3);
        System.out.println("myCircleList" + myCircleList);

        ComparableCircle[] myCAbleList = new ComparableCircle[3];
        myCAbleList[0] = cAble1;
        myCAbleList[1] = cAble2;
        myCAbleList[2] = cAble3;
        System.out.println("myCAbleList" + myCAbleList);
        Arrays.sort(myCAbleList);
        for (ComparableCircle c : myCAbleList){
            System.out.println(c);
        }
//        System.out.println(myCAbleList);

    }
}

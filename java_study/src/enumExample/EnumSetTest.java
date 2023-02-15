package enumExample;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetTest {
    public static void main(String[] args) {
        EnumSet eset = EnumSet.allOf(Day.class); // Day에 들어있는 모든 상수를 eset에 담음

        Iterator<Day> dayIterator = eset.iterator();

        while (dayIterator.hasNext()){
            Day day = dayIterator.next();
            System.out.println(day);
        }
        System.out.println("-----------------------------------");

        EnumSet eset2 = EnumSet.range(Day.MONDAY, Day.WEDNESDAY); // MONDAY와 WEDNESDAY 사이에 있는 상수 값을 모두 포함
        Iterator<Day> dayIterator2 = eset2.iterator();
        while (dayIterator2.hasNext()){
            Day day = dayIterator2.next();
            System.out.println(day);
        }
    }
}

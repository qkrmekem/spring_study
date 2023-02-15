package enumExample;

import java.util.EnumMap;

public class EnumMapTest {
    public static void main(String[] args) {
        EnumMap emap = new EnumMap(Day.class);
        emap.put(Day.SUNDAY, "일요일은 휴식하는 날");
        emap.put(Day.FRIDAY, "내일부터 주말");
        emap.put(Day.MONDAY, "월요병 싫다");

        System.out.println(emap.get(Day.SUNDAY));
    }
}

package collection;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("k1", "hello");
        map.put("k2", "hi");
        map.put("k3", "안녕");
        map.put("k3", "안녕하세요");
        // Set에서는 중복값을 무시하고
        // HashMap에서는 나중에 들어온 값으로 덮어쓰기 함

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            String value = map.get(key);

            System.out.println(key + value);
        }
    }
}

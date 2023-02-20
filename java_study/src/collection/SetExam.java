package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {
        Set<MyData> set = new HashSet<>();
        set.add(new MyData("aaa", 100));
        set.add(new MyData("bbb", 200));
        set.add(new MyData("ccc", 300));
        set.add(new MyData("aaa", 100));

        Iterator<MyData> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

class MyData{
    private String name;
    private int value;

    @Override
    public boolean equals(Object o) {
        System.out.println("equals()");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return value == myData.value && Objects.equals(name, myData.name);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode()");
        return Objects.hash(name, value);
    }

    public MyData(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}

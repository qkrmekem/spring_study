package hello.core.singleton;

public class StatefulService {

    // 이렇게 되면 price가 공유필드가 되어버려 문제가 발생함!
//    private int price;

    public int order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
//        this.price = price; // 여기가 문제!!
        return price;
    }

//    public int getPrice(){
//        return price;
//    }

}

package hello.core.singleton;

public class SingletonService {

    // 1. static 멤버로 딱 1개만 생성
    private static final SingletonService instance = new SingletonService();

    // 2. public으로 설정해 객체 인스턴스가 필요하면 이 static 메서드를 툥해서만 조회하도록 허용
    public static SingletonService getInstance(){
        return instance;
    }

    // 3. private한 생성자를 선언하여 외부에서 객체 생성을 못하게 방지
    private SingletonService(){
    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}

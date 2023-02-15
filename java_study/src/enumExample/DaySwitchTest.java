package enumExample;

public class DaySwitchTest {
    public static void main(String[] args) {
        Day day = Day.SUNDAY;

        switch (day){
            // enum타입인 상수 day는 enum타입인 Day가 가지고 있는 상수 이름만 작성
            // case Day.SUNDAY: 는 컴파일 에러 발생
            case SUNDAY:
                System.out.println("일요일입니다");
                break;
            case MONDAY:
                System.out.println("월요일입니다");
                break;
            default:
                System.out.println("그 밖의 요일");
        }
    }
}

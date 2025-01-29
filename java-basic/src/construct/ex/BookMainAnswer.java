package construct.ex;

public class BookMainAnswer {
    public static void main(String[] args) {
        // 기본 생성자 사용
        BookAnswer book1 = new BookAnswer();
        book1.displayInfo();

        // title과 author만을 매개변수로 받는 생성자
        BookAnswer book2 = new BookAnswer("Hello, Java", "Seo");
        book2.displayInfo();

        // 모든 필드를 매개변수로 받는 생성자
        BookAnswer book3 = new BookAnswer("JPA 프로그래밍", "Kim", 700);
        book3.displayInfo();

    }
}

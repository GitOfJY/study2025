package construct;

public class MemberDefault {
    String name;

    // public MemberDefault() {}
    // 클래스에 생성자가 하나도 없으면 자바 컴파일러는 매개변수가 없고, 작동하는 코드가 없는 기본 생성자를 자동으로 만들어 준다.
    // 생성자 기능을 사용하지 않는 경우도 많기 때문에 편의 기능을 제공한다.

    MemberDefault() {
        System.out.println("생성자 호출");
        // 생성자가 하나라도 있으면 자바는 기본 생성자를 만들지 않는다.
    }
}

package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        nameField = nameParameter;
        // this.nameField = nameParameter;
        // this 생략 가능 (최근 스타일)
        // this를 사용하면 이 코드가 멤버 변수를 사용한다는 것을 눈으로 쉽게 확인할 수 있다

    }
}

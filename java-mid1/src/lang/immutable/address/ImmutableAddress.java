package lang.immutable.address;

public class ImmutableAddress {

    private final String value;
    // 불변 객체 생성
    // setValue가 없기 때문에 final 키워드가 없어도 불변 객체이다.
    // 공유 참조 때문에 사이드이팩트가 발생한 것이 아니다.
    // 공유 참조하는 인스턴스의 값을 변경하기 때문에 발생한다.

    public ImmutableAddress(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "value='" + value + '\'' +
                '}';
    }

}

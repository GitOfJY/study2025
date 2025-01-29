package final1;

public class FinalRefMain {
    public static void main(String[] args) {

        final Data data = new Data();
        // data = new Data();
        // 컴파일 오류, 이미 final로 할당되어있기 때문에 참조값 변경 불가능하다.

        // BUT, 참조 대상의 값은 변경 가능하다.
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);

    }
}

package lang.string.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = str1.concat(" java");
        // String.concat()은 내부에서 새로운 String 객체를 만들어서 반환한다.

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        // str1 = hello
        // str2 = hello java

        // String은 불변 객체이다. 따라서 변경이 필요한 경우 기존 값을 변경하지 않고, 대신에 새로운 결과를 만들어서 반환한다.
        // 문자열 풀에 있는 String 인스턴스의 값이 중간에 변경되면 같은 문자열을 참고하는 다른 변수의 값도 함께 변경된다.
        // 따라서 String은 불변 객체로 설계되었으며, 변경에 따른 사이드이팩트가 발생하지 않는다.

    }
}

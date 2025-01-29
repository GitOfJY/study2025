package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {

        String strWithSpaces = "   Java Programming  ";

        System.out.println("소문자로 변환 : " + strWithSpaces.toLowerCase());
        System.out.println("대문자로 변환 : " + strWithSpaces.toUpperCase());
        System.out.println("공백제거(trim) : " + strWithSpaces.trim() + "'");
        System.out.println("공백제거(strip) : " + strWithSpaces.strip() + "'");
        // trim() : 문자열 양쪽 끝의 공백을 제거, 단순히 whitespace만 제거 가능하다.
        // strip() : whitespace와 유니코드 공백을 포함해서 제거한다. - 자바11
        System.out.println("앞 공백 제거(strip) : " + strWithSpaces.stripLeading() + "'");
        System.out.println("뒤 공백 제거(strip) : " + strWithSpaces.stripTrailing() + "'");

        /*
        소문자로 변환 :    java programming
        대문자로 변환 :    JAVA PROGRAMMING
        공백제거(trim) : Java Programming'
        공백제거(strip) : Java Programming'
        앞 공백 제거(strip) : Java Programming  '
        뒤 공백 제거(strip) :    Java Programming'
        */

    }
}

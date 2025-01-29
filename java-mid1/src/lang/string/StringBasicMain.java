package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {

        /*
         String은 클래스, 참조형이다.
         String 생성하는 방법 2가지
         1. 쌍따옴표 사용 : "hello"
         2. 객체 생성 : new String("hello")
         - 자바 언어에서 1 -> 2로 자동 변경해 준다.
        */
        String str1 = "hello";
        String str2 = new String("hello");

        System.out.println("str1 = "+str1);
        System.out.println("str2 = "+str2);

    }
}

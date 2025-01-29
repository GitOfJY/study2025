package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 비교 : " + (str1 == str2));
        System.out.println("new String() equals 비교 : " + (str1.equals(str2)));
        // new String() == 비교 : false
        // new String() equals 비교 : true > value 비교, String에서 override 제공

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교 : "+ (str3 == str4));
        System.out.println("리터럴 equals 비교 : " + (str3.equals(str4)));
        // 리터럴 == 비교 : true (*****)
        // 리터럴 equals 비교 : true

        // 문자열 리터럴을 사용하는 경우 자바는 메모리 효율과 성능을 최적화를 위해 문자열 풀을 사용한다.
        // 자바가 실행되는 시점에 클래스에 문자열 리터럴이 있으면 문자열 풀에 String 인스턴스를 미리 만들어둔다.
        // 이때 같은 문자열이 있으면 만들지 않는다.
        // 따라서 같은 참조값을 반환한다.

    }
}

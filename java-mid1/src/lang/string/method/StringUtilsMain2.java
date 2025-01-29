package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {

        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        // format 메서드
        String format1 = String.format("num: %d, bool: %b, str: %s", num, bool, str);
        System.out.println(format1);

        String format2 = String.format("숫자 : %.2f", 10.1234);
        System.out.println(format2);

        // printf (print + format)
        System.out.printf("숫자: %.2f\n", 10.1234);

        // matches 메서드
        String regex = "Hello, (Java!|Wolrd!)";
        System.out.println("'str'이 패턴과 일치하는가? : " + str.matches(regex));

        /*
        num: 100, bool: true, str: Hello, Java!
        숫자 : 10.12
        숫자: 10.12
        'str'이 패턴과 일치하는가? : true
        */

    }
}

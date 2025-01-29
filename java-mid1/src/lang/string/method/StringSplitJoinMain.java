package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {

        String str = "Apple,Bannana,Orange";

        // split()
        String[] splitStr = str.split(",");
        for (String s : splitStr){
            System.out.println(s);
        }

        // join()
        String joinStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열 : " + joinStr);

        // 문자열 배열 연결
        String result = String.join("-", splitStr);
        System.out.println("result = "+result);

        /*
        Apple
        Bannana
        Orange
        연결된 문자열 : A-B-C
        result = Apple-Bannana-Orange
        */

    }
}

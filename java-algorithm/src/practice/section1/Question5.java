package practice.section1;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        /*
       설명
       영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
       특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

       입력
       첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.

       출력
       첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.

       a#b!GE*T@S
       S#T!EG*b@a

       kdj#@kdjg%$#kdjgk@kd$dk
       kdd#@kkgj%$#dkgjd@kj$dk

       kqQ!DGSGSdj#@kd#g%$#kdj&&gk@kd$d#%&DGS@!DHSQGk
       kGQ!SHDSGDd#@dk#k%$#gjd&&kg@dk$j#%&dSG@!SGDQqk
       */

        Question5 T = new Question5();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }

    public String solution(String str) {
        String answer = "";

        int len = str.length();
        String[] strList = new String[len];
        StringBuffer sb = new StringBuffer();

        for (int i=0; i<len; i++) {
            char x = str.charAt(i);
            if ((65<=x && x<=90) || (97<=x && x<=122)) {
                sb.append(Character.toString(x));
            } else {
                strList[i] = Character.toString(x);
            }
        }

        String[] arr = sb.reverse().toString().split("");
        int cnt = 0;

        for (int i=0; i< strList.length; i++) {
            if (strList[i] == null) {
                strList[i] = arr[cnt];
                cnt++;
            }
            answer += strList[i];
        }
        return answer;
    }

}

package lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object obj = new Object();
        String string = obj.toString();

        // toString() 반환값 출력
        // 패키지를 포함한 객체의 이름과 객체의 참조값(해시코드)를 16진수로 제공한다.
        // return getClass().getName()+@+Integer.toHexString(hasCode())
        System.out.println(string);
        // java.lang.Object@b4c966a

        // object 직접 출력
        System.out.println(obj);
        // java.lang.Object@b4c966a
        
    }
}

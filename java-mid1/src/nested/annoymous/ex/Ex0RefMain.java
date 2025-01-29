package nested.annoymous.ex;

public class Ex0RefMain {
    
    public static void hello(String str){
        System.out.println("프로그램시작"); // 변하지 않는 부분
        // 변하는 부분 시작
        // 핵심은 변하는 부분을 외부에서 전달 받는 것
        System.out.println(str);
        // 변하는 부분 종료
        System.out.println("프로그램 종료"); // 변하지 않는 부분
    }

    public static void main(String[] args) {
        hello("Hello Java");
        hello("Hello Spring");
    }

}

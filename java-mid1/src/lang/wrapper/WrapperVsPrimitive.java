package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {

        int iteratons = 1_000_000_000; // 반복 횟수 설정, 10억
        long startTime, endTime;

        // 기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iteratons; i++){
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간 : " + (endTime-startTime) + "ms");

        // 래퍼 클래스 Long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i=0; i<iteratons; i++ ){
            sumWrapper += i; // 오토 박싱 발생
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("래퍼 클래스 long 실행 시간 : " + (endTime-startTime) + "ms");

        /*
        sumPrimitive = 499999999500000000
        기본 자료형 long 실행 시간 : 234ms
        sumWrapper = 499999999500000000
        래퍼 클래스 long 실행 시간 : 2878ms
        */

    }
}

package extends1.super2;

public class ClassB extends ClassA{
    
    /*
    public ClassB() { }
    두 개의 생성자가 정의되어 있어 자바에서 기본 생성자 만들지 않음
    > ClassC에서 super(); 사용 불가능
    */
    
    public ClassB(int a ) {
        super(); // 기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a = " + a);
    }

    public ClassB(int a, int b){
        super(); // 기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a = " + a + ", ClassB 생성자 b = " + b);
    }
}

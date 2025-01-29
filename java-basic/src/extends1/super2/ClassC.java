package extends1.super2;

public class ClassC extends ClassB {
    
    public ClassC(){
        // super(); ClassB에 기본생성자가 없기 때문에 사용 불가능
        super(10, 20);
        System.out.println("ClassC 생성자");
    }
    
}

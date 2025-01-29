package enumeration.ex2;

public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();
    // 각각의 상수마다 별도의 인스턴스를 생성하고 생성한 인스턴스를 대입한다.
    // static > 메서드 영역에 선언
    // final > 인스턴스(참조값) 변경 불가능

    // private 생성자 추가, 외부에서 객체 생성하지 못 하도록
    private ClassGrade(){}

}

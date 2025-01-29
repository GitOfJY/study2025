package enumeration.ref1;

public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade(10);
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    // 각 등급의 인스턴스가 discountPercent 필드를 갖게 됨
    private final int discountPercent;

    private ClassGrade(int discountPercent){
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent(){
        return discountPercent;
    }

}

package enumeration.ex2;

public class ClassRefMain {
    public static void main(String[] args) {

        System.out.println("class BASIC = "+ClassGrade.BASIC.getClass());
        System.out.println("class GOLD = "+ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND = "+ClassGrade.DIAMOND.getClass());
        /*
        class BASIC = class enumeration.ex2.ClassGrade
        class GOLD = class enumeration.ex2.ClassGrade
        class DIAMOND = class enumeration.ex2.ClassGrade
        */

        System.out.println("ref BASIC = " + ClassGrade.BASIC);
        System.out.println("ref GOLD = " + ClassGrade.GOLD);
        System.out.println("ref DIAMOND = " + ClassGrade.DIAMOND);
        /*
        ref BASIC = enumeration.ex2.ClassGrade@1d81eb93
        ref GOLD = enumeration.ex2.ClassGrade@7291c18f
        ref DIAMOND = enumeration.ex2.ClassGrade@34a245ab
        */

    }
}

package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {

        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());
        /*
        class BASIC = class enumeration.ex3.Grade
        class GOLD = class enumeration.ex3.Grade
        class DIAMOND = class enumeration.ex3.Grade
        */

        System.out.println("ref BASIC = " + refValue(Grade.BASIC));
        System.out.println("ref GOLD = " + refValue(Grade.GOLD));
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));
        /*
        ref BASIC = 1d81eb93
        ref GOLD = 7291c18f
        ref DIAMOND = 34a245ab
        */

    }

    private static String refValue(Object grade){
        return  Integer.toHexString(System.identityHashCode(grade));
    }
}

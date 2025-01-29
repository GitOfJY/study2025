package enumeration.ref3;

public class ClassGradeRefMain3_2 {
    public static void main(String[] args) {

        int price = 10000;

        /*
        int basic = Grade.BASIC.dicount(price);
        int gold = Grade.GOLD.dicount(price);
        int diamond = Grade.DIAMOND.dicount(price);
        */

        System.out.println("BASIC 등급의 할인 금액 : " + Grade.BASIC.dicount(price));
        System.out.println("GOLD 등급의 할인 금액 : " + Grade.GOLD.dicount(price));
        System.out.println("DIAMOND 등급의 할인 금액 : " + Grade.DIAMOND.dicount(price));

    }
}

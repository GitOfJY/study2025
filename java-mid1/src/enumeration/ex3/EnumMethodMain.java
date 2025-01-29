package enumeration.ex3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {

        // 모든 ENUM 반환
        Grade[] values = Grade.values();
        System.out.println("values : " + Arrays.toString(values));
        // values : [BASIC, GOLD, DIAMOND]
        for (Grade value : values){
            System.out.println("name = "+value.name() + ", ordinal = " + value.ordinal());
            // name(이름) = BASIC, ordinal(순서) = 0
        }

        // String -> Enum 반환, 잘못된 문자면 IllegalArgumentException 발생
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);
        // gold = GOLD

    }
}

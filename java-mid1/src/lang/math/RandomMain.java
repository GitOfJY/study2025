package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {

        Random random = new Random();
        // Random random = new Random(1);
        // seed가 같으면 random의 결과가 같다.
        // 결과값이 고정되기 때문에 테스트 코드 같은 곳에서 같은 결과를 검증할 수 있다.

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        // 범위 조회
        int randomRange1 = random.nextInt(10);
        System.out.println("0 ~ 9 = " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1;
        System.out.println("1 ~ 10 = " + randomRange2);

    }
}

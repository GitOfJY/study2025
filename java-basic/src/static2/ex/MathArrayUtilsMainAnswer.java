package static2.ex;

import static static2.ex.MathArrayUtilsAnswer.*;

public class MathArrayUtilsMainAnswer {
    public static void main(String[] args) {

        // MathArrayUtilsAnswer mathArrayUtilsAnswer = new MathArrayUtilsAnswer();
        // 요구사항 : MathArrayUtilsAnswer의 인스턴스 생성하지 못하도록 막아라.
        // private으로 생성자를 막아 놓는다.
        // 'MathArrayUtilsAnswer()' has private access in 'static2.ex.MathArrayUtilsAnswer'

        int[] values = {1, 2, 3, 4, 5};
        // System.out.println("sum = "+MathArrayUtilsAnswer.sum(values));
        // System.out.println("average = "+MathArrayUtilsAnswer.average(values));
        // System.out.println("min = "+MathArrayUtilsAnswer.min(values));
        // System.out.println("max = "+MathArrayUtilsAnswer.max(values));

        System.out.println("sum = "+sum(values));
        System.out.println("average = "+average(values));
        System.out.println("min = "+min(values));
        System.out.println("max = "+max(values));

    }
}

package lang.wrapper.test;

public class WrapperTest2 {
    public static void main(String[] args) {

       String[] array = {"1.5", "2.5", "3.0"};
        double result = 0;

       for (String a : array){
           double num = Double.parseDouble(a);
           result += num;
       }

        System.out.println("sum : " + result);

    }
}

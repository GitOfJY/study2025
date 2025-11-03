package reflection;

import reflection.data.Calculator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class MethodV3 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("호출 메서드 : ");
        String methodName = scanner.nextLine();

        System.out.print("숫자1 : ");
        int number1 = scanner.nextInt();
        System.out.print("숫자2 : ");
        int number2 = scanner.nextInt();

        Calculator calculator = new Calculator();
        // 호출할 메서드를 변수 이름으로 동적 선택

        Class<? extends Calculator> calculatorClass = calculator.getClass();
        Method method = calculatorClass.getMethod(methodName, int.class, int.class);

        Object returnValue = method.invoke(calculator, number1, number2);
        System.out.println("result = " + returnValue);
    }
}

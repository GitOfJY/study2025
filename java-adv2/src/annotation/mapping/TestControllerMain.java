package annotation.mapping;

import java.lang.reflect.Method;

public class TestControllerMain {
    public static void main(String[] args) {
        TestController testController = new TestController();
        Class<? extends TestController> testControllerClass = testController.getClass();
        for (Method method : testControllerClass.getDeclaredMethods()) {
            SimpleMapping mapping = method.getAnnotation(SimpleMapping.class);
            if (mapping != null) {
                System.out.println("[" + mapping.value() + "] -> " + method);
            }
        }
    }
}

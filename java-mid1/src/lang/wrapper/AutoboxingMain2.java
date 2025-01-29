package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {

        // Primitive -> Wrapper
        int value = 7;
        // Integer boxedValue = Integer.valueOf(value);
        // 오토 박싱(Auto-boxing)
        Integer boxedValue = value;

        // Wrapper -> Primitive
        // int unboxedValue = boxedValue.intValue();
        // 오토 언박싱(Auto-unboxing)
        int unboxedValue = boxedValue;

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
        
    }
}

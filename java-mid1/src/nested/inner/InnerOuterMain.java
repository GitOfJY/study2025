package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {

        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner(); // 참조값이 전달되어야함, new 사용
        inner.print();

        System.out.println("innerClass : " + inner.getClass());
        // innerClass : class nested.inner.InnerOuter$Inner

    }
}

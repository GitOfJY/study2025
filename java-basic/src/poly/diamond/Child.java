package poly.diamond;

public class Child implements InterfaceA, InterfaceB{
// interface 다중 구현

    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

}

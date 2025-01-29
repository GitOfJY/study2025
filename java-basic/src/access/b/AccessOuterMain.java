package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {

        AccessData data = new AccessData();

        // public
        data.publicField = 1;
        data.publicMethod();

        // default > 불가 (동일한 패키지에서만 접근 가능)
        // data.defaultField = 2;
        // data.defaultMethod();

        // private > 불가
        // data.priavteField = 3;
        // data.privateMethod();

        data.innerAccess();

    }
}

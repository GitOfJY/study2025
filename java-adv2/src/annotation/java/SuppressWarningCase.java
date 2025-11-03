package annotation.java;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarningCase {

    @SuppressWarnings("unused")
    public void unusedWarnings() {
        // 사용되지 않는 변수 경고 억제
        int unusedVariable = 10;
    }

    @SuppressWarnings("deprecation")
    public void deprecatedWarning() {
        // 더 이상 사용되지 않는 메서드 호출
        java.util.Date date = new java.util.Date();
        int date1 = date.getDate();
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public void uncheckedWarning() {
        // 제네릭 타입 캐스팅 경고 억제, raw type 사용 경고
        List list = new ArrayList();

        List<String> stringList = (java.util.List<String>) list;
    }

    @SuppressWarnings("all")
    public void suppressAllWarnings() {
        // 제네릭 타입 캐스팅 경고 억제, raw type 사용 경고
        List list = new ArrayList();
        List<String> stringList = (java.util.List<String>) list;

        // 더 이상 사용되지 않는 메서드 호출
        java.util.Date date = new java.util.Date();
        int date1 = date.getDate();
    }

}

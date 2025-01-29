package generic.ex5;

public class EraserBox<T> {

    public boolean instanceCheck(Object param){
        // return param instanceof T;
        return false;
    }

    public void create(){
        // return new T();
    }
    
    // 컴파일 오류
    // 타입 이레이저 방식의 한계

}

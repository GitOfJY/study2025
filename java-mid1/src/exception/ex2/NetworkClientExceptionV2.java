package exception.ex2;

public class NetworkClientExceptionV2 extends Exception{

    private String errorCode;

    public NetworkClientExceptionV2(String errorCode, String message){
        // 오류 메세지는 상위 클래스인 Throwable에서 기본으로 제공하는 기능 사용
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode(){
        return errorCode;
    }

}

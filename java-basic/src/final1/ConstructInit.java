package final1;

public class ConstructInit {
    final int value;

    public ConstructInit(int value){
        this.value = value;
        // final을 필드에 사용할 경우 생성자를 통해 한 번만 초기화할 수 있다.
    }
}

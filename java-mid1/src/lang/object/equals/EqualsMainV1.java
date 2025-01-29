package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 userV1 = new UserV1("id-100");
        UserV1 userV2 = new UserV1("id-100");

        System.out.println("identity = " + (userV1 == userV2));
        // identity = false
        System.out.println("identity = " + (userV1.equals(userV2)));
        // identity = false ( Object가 기본으로 제공하는 equals는 결국 ==(동일성) 비교)
        // 오버라이딩 필요 !!


    }
}

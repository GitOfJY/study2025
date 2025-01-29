package lang.object.equals;

public class EqualsMainV2 {
    public static void main(String[] args) {
        UserV2 userV1 = new UserV2("id-100");
        UserV2 userV2 = new UserV2("id-100");

        System.out.println("identity = " + (userV1 == userV2));
        // identity = false (동일성 비교, 참조값비교)
        System.out.println("identity = " + (userV1.equals(userV2)));
        // identity = true (동등성 비교)

    }
}

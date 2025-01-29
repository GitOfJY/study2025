package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 18, 10);
        // 객체가 만들어지면서 생성자 바로 호출

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members){
            System.out.println("이름 : "+member.name+" 나이 : "+member.age+" 성적 : "+member.grade);
        }
    }
}

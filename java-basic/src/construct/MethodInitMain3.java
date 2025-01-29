package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("user1", 15, 90);

        MemberInit member2 = new MemberInit();
        member2.initMember("user2", 18, 80);

        MemberInit[] members = {member2, member1};

        for (MemberInit s : members){
            System.out.println("이름: "+s.name+" 나이: "+s.age+" 성적: "+s.grade);
        }
        
    }

}

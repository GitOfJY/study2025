package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 18);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members){
            System.out.println("이름 : "+member.name+" 나이 : "+member.age+" 성적 : "+member.grade);
        }

        /*
         생성자 호출 - name = user1, age = 15, grade = 90
         이름 : user1 나이 : 15 성적 : 90
         이름 : user2 나이 : 18 성적 : 80
        */

    }
}

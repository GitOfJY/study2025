package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 오버로딩 생성자 추가
    MemberConstruct(String name, int age){

        // 첫 번째 생성자 내부에서 두번째 생성자 호출
        // MemberConstruct(String name, int age, int grade) 호출
        // this()는 생성자 첫줄에만 작성할 수 있다.
        this(name, age, 50);

        /*
        this.name = name;
        this.age = age;
        this.grade = 80;
        System.out.println("오버로딩 생성자 호출 - name = "+name+", age = "+age+", grade = "+grade);
        */

    }

    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 - name = "+name+", age = "+age+", grade = "+grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

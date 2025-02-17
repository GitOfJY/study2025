package class1;

public class ClassStart4 {

    public static void main(String[] args) {

        /**
         Ex4. Student 타입을 사용하는 배열
         배열을 사용하면 특정 타입을 연속한 데이터 구조로 묶어서 편리하게 관리할 수 있다
         Student 클래스를 사용한 변수들도 Student 타입이기 때문에 학생도 배열을 사용해서 하나의 데이터 구조로 묶어서 관리할 수 있다
         */

        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // 배열에 참조값 대입
        // Student를 담을 수 있는 배열을 생성하고 해당 배열에 student1, student2 인스턴스를 보관한다
        Student[] students = new Student[2];
        // Student 변수를 2개 보관할 수 있는 사이즈 2의 배열을 만든다
        // Student 타입의 변수는 Student 인스턴스의 참조값을 보관한다
        // Student 배열 각각의 항목도 Student 타입의 변수일 뿐이다
        // 따라서 Student 타입의 참조값을 보관한다
        // 배열에는 아직 참조값을 대입하지 않았기 때문에 참조값이 없다는 의미의 null 값으로 초기화 된다

        // 배열에 객체를 보관
        students[0] = student1;
        // ** 자바에서 대입은 항상 변수에 들어 있는 값을 복사한다 **
        // students[0] = x001;
        students[1] = student2;
        // student1, student2에는 참조값이 보관되어 있다
        // 따라서 이 참조값이 배열에 저장된다
        // 또는 student1, student2에 보관된 참조값을 읽고 복사해서 배열에 대입하고 표현한다

        // ** 변수에는 인스턴스 자체가 들어있는 것이 아니다 **
        // 인스턴스 위치를 가리키는 참조값이 들어있을 뿐이다
        // 따라서 대입(=)시에 인스턴스가 복사되는 것이 아니라 참조값이 복사된다

        // 배열에 들어있는 객체 사용
        // 배열에 들어있는 객체를 사용하려면 먼저 배열에 접근하고, 그 다음에 객체에 접근하면 된다
        System.out.println("이름: " + students[0].name + " 나이: " + students[0].age + " 성적: " + students[0].grade);
        System.out.println("이름: " + students[1].name + " 나이: " + students[1].age + " 성적: " + students[1].grade);

        // 배열 접근 시작
        // System.out.println("이름: " + students[0].name);
        // System.out.println("이름: " + x005[0].name);
        // [0]을 사용해서 x005 배열의 0번 요소에 접근
        // System.out.println("이름: " + x001.name);
        // .을 사용해서 참조값으로 객체에 접근
        // System.out.println("이름: " + "학생1");

    }
}

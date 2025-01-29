package class1;

public class ClassStart3 {

    public static void main(String[] args) {

        /**
         Ex3. Student class 사용, 객체도입

         타입은 데이터의 종류나 형태를 나타낸다
         int는 정수, string은 문자 > 학생이라는 타입을 만들자!

         클래스를 사용하면 int, string과 같은 타입을 직접 만들 수 있다
         사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도가 필요하다
         이 설계도가 바로 클래스

         설계도를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 한다
         클래스를 통해서 사용자가 원하는 종류의 데이터 타입을 마음껏 정의할 수 있다

         > 클래스, 객체, 인스턴스
         클래스는 설계도이고, 이 설계도를 기반으로 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 한다
         여기서 '학생클래스'를 기반으로 학생1, 학생2 객체(인스턴스)를 만들었다

         참조값을 변수에 보관해야 하는 이유
         객체를 생성하는 new Student() 코드 자체에는 아무런 이름이 없다
         단순히 Student 클래스 기반으로 메모리에 실제 객체를 만드는 것이다
         따라서 생성한 객체에 접근할 수 있는 방법이 필요하다
         이러한 이유로 객체를 생성할 때 반환되는 참조값을 어딘가에 보관해두어야 한다
         Studenet student1 변수에 참조값을 저장해두었으므로 저장한 참조값을 통해서 실제 메모리에 존재하는 객체에 접근할 수 있다

         1. Student 객체 생성
         Student student1 = new Student();
         2. new Student()의 결과로 x001 참조값 반환
         Student studnet1 = x001;
         3. 결과
         student1 = x001;
         */

        // 1. 변수 선언
        Student student1;
        // Student는 Student 타입의 객체를 받을 수 있다

        // 2. 객체 생성
        student1 = new Student();
        // student1 = x001;
        // Student 인스턴스 참조값 보관

        // 메모리에 student1(객체) 생성
        // new > Student 클래스 정보를 기반으로 새로운 객체를 생성한다
        // Student 클래스는 String name, int age, int grade 멤버 변수를 가지고 있다
        // 이 변수를 포함한 메모리 공간도 함께 확보한다

        // 3. 참조값 보관
        // 객체를 생성하면 자바는 메모리 어딘가에 있는 이 객체에 접근할 수 있는 참조값(주소)를 반환한다
        // new 키워드를 통해 객체가 생성되고 나면 참조값을 반환한다
        // 앞서 선언한 변수 Student student1에 생성된 객체의 참조값을 보관한다
        // Student student1 변수는 이제 메모리에 존재하는 실제 객체를 접근하여 사용할 수 있다

        // 4. 객체 사용
        // 클래스를 통해 생성된 객체를 사용하려면 메모리에 존재하는 객체에 접근해야한다
        // 실제 메모리에 존재하는 객체에 접근하려면 . 을 사용하면 된다
        
        // 객체 값 대입
        student1.name = "학생1";
        // 1. student1 객체의 name 멤버변수에 값 대입
        // x001.name = "학생1"; 
        // 2. 변수에 있는 참조값을 통해 실제 객체에 접근, 해당 객체의 name 멤버 변수에 값 대입
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1); // class1.Student@2f4d3709 (패키지.클래스(경로)@참조값)
        System.out.println(student2); // class1.Student@4e50df2e

        // 객체 값 사용
        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);
        // 1. 객체 값 읽기
        // System.out.println("이름: " + student1.name);
        // 2. 변수에 있는 참조값을 통해 실제 객체에 접근하고, name 변수에 접근한다
        // System.out.println("이름: " + x.001.name);
        // 3. 객체의 멤버 변수의 값을 읽어옴
        // System.out.println("이름: " + "학생1");

        /**
         객체 - Object
         객체는 클래스에서 정의한 속성과 기능을 가진 실체이다
         객체는 서로 독립적인 상태를 가진다
         예를 들어 stuent1은 학생1의 속성을 가지는 객체이고, student2는 학생2의 속성을 가지는 객체이다
         student1과 student2는 같은 클래스에 만들어졌지만 서로 다른 객체이다

         인스턴스 - Instance (관계에 초점을 맞춘 단어)
         인스턴스는 특정 클래스로부터 생성된 객체를 의미한다 > 그래서 객체와 인스턴스라는 용어는 자주 혼용된다
         인스턴스는 주로 객체가 어떤 클래스에 속해 있는지 강조할 때 사용한다
         예를 들어 student1 객체는 Student 클래스의 인스턴스라고 표현한다

         > 용어상 인스턴스는 객체보다 좀 더 관계에 초첨을 맞춘 단어이다
         > 둘 다 클래스에서 나온 실체라는 핵심 의미는 갖기 때문에 보통 구분하지 않고 사용한다
         */

    }
}

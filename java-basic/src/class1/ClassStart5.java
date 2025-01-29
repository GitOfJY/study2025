package class1;

public class ClassStart5 {

    public static void main(String[] args) {

        /**
         Ex5. Student 타입을 사용하는 배열 - 리팩토링
         배열을 사용한 덕분에 출력에서 for문을 도입할 수 있다
         */

        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // 배열 선언
        // Student[] students = new Student[2];
        // students[0] = student1;
        // students[1] = student2;

        // 배열 선언 최적화
        Student[] students = new Student[]{student1, student2};
        // Student[] students = {student1, student2};

        // for문 적용
        for (int i=0; i<students.length; i++) {
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 성적: " + students[i].grade);

            // for문 최적화 - 반복 요소를 변수에 담아 처리
            Student s = students[i];
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }

        // 향상된 for문
        for (Student s : students) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }

    }
}

package class1;

public class ClassStart2 {

    public static void main(String[] args) {

        /**
         Ex2. 배열 사용
         배열을 사용해 코드 변경 최소화 성공했지만
         한 학생의 데이터가 3개의 배열로 나누어져 있다
         데이터 변경할 때 실수할 가능성이 높다
         > 학생이라는 개념을 하나로 묶는 것 : 클래스의 도입
         */

        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for (int i=0; i< studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrades[i]);
        }

    }
}

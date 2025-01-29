package enumeration.test;

public class AuthGradeMain1 {
    public static void main(String[] args) {

        AuthGrade[] grades = AuthGrade.values();
        for (AuthGrade grade : grades){
            printGrade(grade);
        }

    }

    private static void printGrade(AuthGrade authGrade){
        System.out.println("grade = " + authGrade.getLevel() +", 설명 = " + authGrade.getDescription() );
    }

}

package oop1.ex;

public class RectangleOopMainAnswer {
    public static void main(String[] args) {
        RectangleAnswer rectangle = new RectangleAnswer();
        rectangle.height = 8;
        rectangle.width = 8;

        int area = rectangle.calculateArea();
        System.out.println("넓이 : "+area);

        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 : "+perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부 : "+(square ? "정사각형입니다." : "정사각형이 아닙니다."));

    }
}

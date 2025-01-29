package oop1.ex;

public class Rectangle {

    int width;
    int height;;

    void getArea() {
        int area = width * height;
        System.out.println("넓이 : "+area);
    }

    void getPerimeter() {
        int perimeter = width*2 + height*2;
        System.out.println("둘레 : "+perimeter);
    }

    void getSquare(){
        if (height  == width) {
            System.out.println("정사각형입니다.");
        } else {
            System.out.println("정사각형이 아닙니다.");
        }
    }

}

package oop1.ex;

public class Rectangle {

    void calculateArea(int width, int height) {
        int area = width * height;
        System.out.println("넓이 : " + area);
    }
    void calculatePerimeter(int width, int height) {
        int perimeter =  (width + height) * 2;
        System.out.println("둘레 길이  : " + perimeter);
    }
    void isSquare(int width,int height) {
        boolean square =  width == height;
        System.out.println("정사각형 여부 : " + square);
    }
}

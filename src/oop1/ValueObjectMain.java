package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {
        ValueData valueObject = new ValueData();
        valueObject.add();
        valueObject.add();
        System.out.println("최종 숫자는 : " + valueObject.value);
    }
}

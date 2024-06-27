package ref;

import class1.Student;

public class Method2 {
    public static void main(String[] args) {

        Student student1 = createStudent("학생1", 18, 90);
        Student student2 =createStudent("학생2", 17, 85);

        printStudent(student1);
        printStudent(student2);

    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }
    static void printStudent(Student student1) {
        System.out.println("이름 : " + student1.name + " 나이 : " + student1.age + " 성적 : " + student1.grade);
    }
}




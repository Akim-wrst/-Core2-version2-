package task.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// TODO: Учет посещаемости:
//  Создайте класс Student с полями name и attendance.
//  Создайте метод, который будет принимать список студентов и выводить студентов с наихудшей посещаемостью.
//  Создайте метод, который будет принимать список студентов и возвращать среднюю посещаемость.

public class Student2 {
    String name;
    int attendance;

    public Student2(String name, int attendance) {
        this.name = name;
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", attendance=" + attendance +
                '}';
    }

    public static void minAttendance(List<Student2> students) {
        List<Integer> list = new ArrayList<>();
        for (Student2 student : students) {
            list.add(student.attendance);
        }
        Collections.sort(list);
        int min = list.get(0);
        for (Student2 student : students) {
            if (min == student.attendance) {
                System.out.println(student);
            }
        }
    }

    public static double averageAttendance(List<Student2> stud) {
        double counter = 0;
        double result = 0;
        for (Student2 st : stud) {
            result += st.attendance;
            counter++;
        }
        return result / counter;
    }

    public static void main(String[] args) {
        Student2 st = new Student2("Akim", 20);
        Student2 st2 = new Student2("Vadim", 10);
        Student2 st3 = new Student2("Vladimir", 40);
        Student2 st4 = new Student2("Roma", 20);
        List<Student2> stud = new ArrayList<>();
        stud.add(st);
        stud.add(st2);
        stud.add(st3);
        stud.add(st4);
        Student2.minAttendance(stud);
        System.out.println("----------------------------------------------");
        System.out.println(Student2.averageAttendance(stud));
    }
}

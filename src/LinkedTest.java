import ra.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedTest {
    public static void main(String[] args) {
        LinkedList<Student> linkedStudent1 = new LinkedList<>();
        LinkedList<Student> linkedStudent2 = new LinkedList<>();
        Student st1 = new Student("sv001", "Nguyen Van A", 20);
        Student st2 = new Student("sv002", "Nguyen Van B", 18);
        Student st3 = new Student("sv003", "Nguyen Van C", 22);
        Student st4 = new Student("sv004", "Nguyen Van D", 19);
        Student st5 = new Student("sv005", "Nguyen Van E", 21);
        linkedStudent1.add(st1);
        linkedStudent1.add(st2);
        linkedStudent1.add(st3);
        linkedStudent2.add(st4);
        linkedStudent2.add(st5);
        linkedStudent1.addFirst(st4);
        linkedStudent1.addLast(st5);
        linkedStudent1.removeFirst();
        System.out.println("thong tin linkedStudent1");
        for (Student st : linkedStudent1) {
            System.out.println(st.toString());
        }
        System.out.println("thong tin linkedStudent2");
        for (Student st : linkedStudent2) {
            System.out.println(st.toString());
        }
    }
}

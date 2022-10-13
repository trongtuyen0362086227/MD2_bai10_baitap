package ra;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class Student implements Comparable<Student> {
    private String StudentID;
    private String StudentName;
    private int age;

    public Student() {
    }

    public Student(String studentID, String studentName, int age) {
        StudentID = studentID;
        StudentName = studentName;
        this.age = age;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Ma sv: " + this.StudentID + " - ten sv: " + this.StudentName + " - Tuoi sv: " + this.age;
    }
    @Override
    public String toString() {
        return "Tên: "+getStudentName()+" - Giới tính: "+getStudentSex()+" - Ngày sinh: "+getStudentBirthDate();
    }



    @Override
    public int compareTo(Student o) {
        return getStudentBirthDate().compareTo(o.getStudentBirthDate());
    }
}

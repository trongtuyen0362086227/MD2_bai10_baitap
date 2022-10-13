import ra.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListdemo {
    public static void main(String[] args) {
        List<Student> listStudent1 = new ArrayList<>();
        List<Student> listStudent2 = new ArrayList<>();
        Student st1 = new Student("sv001", "Nguyen Van A", 20);
        Student st2 = new Student("sv002", "Nguyen Van B", 18);
        Student st3 = new Student("sv003", "Nguyen Van C", 22);
        Student st4 = new Student("sv004", "Nguyen Van D", 19);
        Student st5 = new Student("sv005", "Nguyen Van E", 21);
// Them tung phan tu
        listStudent1.add(st1);
        listStudent1.add(st2);
        listStudent1.add(st3);
        listStudent2.add(st4);
        listStudent2.add(st5);
        // them ca danh sach
        listStudent1.addAll(listStudent2);
        // xoa danh sach
//                listStudent1.clear();
        // isEmty kiem tra danh sach co phan tu hay ko ko co ->false
        System.out.println(listStudent1.isEmpty());
        //kiem tra phan tu co trong danh sach ko
        System.out.println(listStudent1.contains(st1));

        // cach1 sd Iterlator de duyet cac phan tu
        //Equals so sanh
        System.out.println(listStudent2.equals(listStudent1));
        //remove(truyen ten phan tu)
        listStudent1.remove(st3);
        listStudent1.removeAll(listStudent2);
        //size
        System.out.println("So phan tu cua mang "+listStudent1.size());
        //toarray chuyen ve mang
        Object[] arrStudent = listStudent1.toArray();
        System.out.println(listStudent1.get(1).toString());
        //set chen phan tu de vao vi tri bat ki cua mang
        listStudent1.set(1,st3);
        //add(index,o)
        listStudent1.add(1,st5);
        //IndexOf (vi tri cua phan tu trong danh sach)
        System.out.println("vi tri cua SV001 trong mang la "+listStudent1.lastIndexOf(st1));
        //subList{index-indext} cat ra danh sach
        List<Student> listStudent3 = listStudent1.subList(0,2);
        Iterator<Student> StudenIterrator = listStudent1.iterator();
        while (StudenIterrator.hasNext()) {
            System.out.println(StudenIterrator.next().toString());
        }
//         cach2 Duyet  cac danh sach bang foreach;
        for (Student st:listStudent3){
            System.out.println(st.toString());
        }
    }
}
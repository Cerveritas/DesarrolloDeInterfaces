package Tablas;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        JPanel p = new JPanel();


        Student s1 = new Student("000000001A", "Alejandro", "Recarte", 22);
        Student s2 = new Student("000000002B", "Inés", "Trigo", 453);
        Student s3 = new Student("000000003C", "Sergio", "Cervera", 21);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        JTable t = new JTable(new StudentTableModel(students));
        JScrollPane sp = new JScrollPane(t);

        p.add(sp);
        f.add(p);
        f.setBounds(0,0,400,400);
        f.setVisible(true);
    }
}


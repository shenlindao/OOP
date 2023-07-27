package Seminar.Seminar_03.Ex_01;

import java.util.ArrayList;

public class StydyGroup {

    private ArrayList<Student> students;

    public StydyGroup(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}

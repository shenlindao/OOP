package Seminar.Seminar_03.Ex_01;

import java.util.ArrayList;
import java.util.Iterator;

public class GroupStudentsIterator implements Iterator<Student> {
    private final ArrayList<Student> students;
    private int count;

    public GroupStudentsIterator(StydyGroup students) {
        this.students = students.getStudents();
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        if (count < students.size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Student next() {
        if (hasNext()) {
            count++;
            return students.get(count);
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        students.remove(count);
    }

}

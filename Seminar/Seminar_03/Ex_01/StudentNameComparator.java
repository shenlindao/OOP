package Seminar.Seminar_03.Ex_01;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        int resultOfComparing = o1.getLastName().compareTo(o2.getLastName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
        }
        return resultOfComparing;

    }

    @Override
    public Comparator<Student> reversed() {
        return Comparator.super.reversed();
    }
}

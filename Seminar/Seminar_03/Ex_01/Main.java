package Seminar.Seminar_03.Ex_01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Иван", "Иванов", 1, 5);
        Student student2 = new Student("Пётр", "Петров", 2, 4);
        Student student3 = new Student("Василий", "Василиев", 3, 5);

        ArrayList<Student> groupList = new ArrayList<>();

        groupList.add(student1);
        groupList.add(student2);
        groupList.add(student3);

        StydyGroup group1 = new StydyGroup(groupList);
        /*
         * GroupStudentsIterator studentsIterator = new GroupStudentsIterator(group1);
         * while (studentsIterator.hasNext()) {
         * Student current = studentsIterator.next();
         * if (current.getAverageScore() < 4) {
         * studentsIterator.remove();
         * }
         * System.out.println(current);
         * }
         * 
         */

        groupList.sort(new StudentNameComparator());
        System.out.println(groupList);

        groupList.sort(new StudentNameComparator().reversed());
        System.out.println(groupList);
    }
}

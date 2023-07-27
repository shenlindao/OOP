package Seminar.Seminar_03.Ex_01;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private int id;
    double averageScore;

    public Student(String firstName, String lastName, int id, double averageScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.averageScore = averageScore;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student: " + id + " - " +
                "firstName: " + firstName + " - " +
                "lastName: " + lastName + " - " +
                "averageScore: " + averageScore;
    }

    @Override
    public int compareTo(Student o) {
        return (int) (this.getAverageScore() - o.getAverageScore());
    }

}
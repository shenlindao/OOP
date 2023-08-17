package Homework.Homework_05.model.data;

import java.util.Calendar;

public class Student extends User {

  private static int studentId = 1;
  private String group;
  private String speciality;
  private double meanBall;

  public Student(int studentId, String name, String lastName, Calendar birthDay, String group, String speciality,
      double meanBall) {
    super(name, lastName, birthDay);
    Student.studentId = studentId + 1;
    this.group = group;
    this.speciality = speciality;
    this.meanBall = meanBall;
  }

  public static int getStudentId() {
    return studentId;
  }

  public static void setStudentId(int studentId) {
    Student.studentId = studentId;
  }

  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public String getSpeciality() {
    return speciality;
  }

  public void setSpeciality(String speciality) {
    this.speciality = speciality;
  }

  public double getMeanBall() {
    return meanBall;
  }

  public void setMeanBall(double meanBall) {
    this.meanBall = meanBall;
  }

  @Override
  public String toString() {
    return "Студент [" + getStudentId() + "]: Фамилия - " + getLastName() + ", Имя - " + getName() + ", Специальность - " + getSpeciality()
        + ", Средний балл - " + getMeanBall();
  }
}

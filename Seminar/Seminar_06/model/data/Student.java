package Seminar.Seminar_06.model.data;

import java.util.Calendar;

public class Student extends User {
  private static int studentId = 0;
  private String group;
  private String speciality;
  private double averageMark;

  public Student(String name, String lastName, Calendar birthday/*
                                                                 * , String group, String speciality, double averageMark
                                                                 */) {
    super(name, lastName, birthday);
    this.studentId = studentId++;
  }

  public static int getStudentId() {
    return studentId;
  }

  public String getGroup() {
    return group;
  }

  public String getSpeciality() {
    return speciality;
  }

  public double getAverageMark() {
    return averageMark;
  }

  public void setAverageMark(double averageMark) {
    this.averageMark = averageMark;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public void setSpeciality(String speciality) {
    this.speciality = speciality;
  }

  @Override
  public String toString() {
    return super.toString() + '\'' +
        ", group='" + group + '\'' +
        ", speciality='" + speciality + '\'' +
        ", averageMark=" + averageMark;
  }
}
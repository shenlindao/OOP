package Seminar.Seminar_06.model.data;

import java.util.ArrayList;
import java.util.Calendar;

public class Teacher extends User {
  private static int teachertId = 0;
  private ArrayList<String> disciplines;
  private double rating;
  private String department;

  public Teacher(String name, String lastName, Calendar birthday/*
                                                                 * , ArrayList<String> disciplines, double rating,
                                                                 * String department
                                                                 */) {
    super(name, lastName, birthday);
    this.teachertId = teachertId++;
    // this.disciplines = disciplines;
    // this.rating = rating;
    // this.department = department;
  }

  public static int getTeachertId() {
    return teachertId;
  }

  public ArrayList<String> getDisciplines() {
    return disciplines;
  }

  public double getRating() {
    return rating;
  }

  public String getDepartment() {
    return department;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  @Override
  public String toString() {
    return super.toString() + '\'' +
        ", disciplines='" + disciplines + '\'' +
        ", rating=" + rating +
        ", department='" + department + '\'';
  }
}
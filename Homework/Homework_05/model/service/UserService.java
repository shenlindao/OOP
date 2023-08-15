package Homework.Homework_05.model.service;

import java.util.Calendar;
import java.util.List;

import Seminar.Seminar_05.model.data.Student;
import Seminar.Seminar_05.model.data.Teacher;
import Seminar.Seminar_05.model.data.User;

public class UserService<T extends User> implements DateService<T> {

  @Override
  public Student createStudent(int id, String name, String lastName, Calendar birthDay, String group, String speciality,
      double meanBall) {
    Student student = new Student(name, lastName, birthDay, group, speciality, meanBall);
    return student;
  }

  @Override
  public Teacher createTeacher(int id, String name, String lastName, Calendar birthDay, String disciplines,
      String department, double rating) {
    Teacher teacher = new Teacher(name, lastName, birthDay, disciplines, department, rating);
    return teacher;
  }

  @Override
  public List<T> readDate() {
    throw new UnsupportedOperationException("Unimplemented method 'readDate'");
  }

}

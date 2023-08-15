package Homework.Homework_05.controller;

import java.util.Calendar;

import Seminar.Seminar_05.model.data.Student;
import Seminar.Seminar_05.model.data.Teacher;
import Seminar.Seminar_05.model.service.DateService;
import Seminar.Seminar_05.model.service.UserService;

public class Controller {

  private DateService<Student> serviceStudent = new UserService<>();

  public Student createNewStudent(int id, String name, String lastName, Calendar birthDay, String group, String speciality,
      double meanBall) {
    return serviceStudent.createStudent(name, lastName, birthDay, group, speciality, meanBall);
  }

  private DateService<Teacher> serviceTeacher = new UserService<>();

  public Teacher createNewTeacher(int id, String name, String lastName, Calendar birthDay, String disciplines,
      String department, double rating) {
    return serviceTeacher.createTeacher(name, lastName, birthDay, disciplines, department, rating);
  }

}

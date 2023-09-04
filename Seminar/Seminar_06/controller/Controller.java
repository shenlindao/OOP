package Seminar.Seminar_06.controller;

import java.util.ArrayList;
import java.util.Calendar;

import Seminar.Seminar_06.model.data.Student;
import Seminar.Seminar_06.model.data.Teacher;
import Seminar.Seminar_06.model.service.DataService;
import Seminar.Seminar_06.model.service.UserService;

public class Controller {
  private DataService service = new UserService();

  public Student createNewStudent(String name, String lastName, Calendar birthday) {
    return service.createStudent(name, lastName, birthday);
  }

  public Teacher createNewTeacher(String name, String lastName, Calendar birthday) {
    return service.createTeacher(name, lastName, birthday);
  }

  public ArrayList<Teacher> showTeacher() {
    return service.getTeacherList();
  }

  public ArrayList<Student> showStudent() {
    return service.getStudentList();
  }

}
package Seminar.Seminar_06.model.service;

import java.util.ArrayList;
import java.util.Calendar;

import Seminar.Seminar_06.model.data.Student;
import Seminar.Seminar_06.model.data.Teacher;

public interface DataService {
  Student createStudent(String name, String lastName, Calendar birthday);

  Teacher createTeacher(String name, String lastName, Calendar birthday);

  ArrayList<Teacher> getTeacherList();

  ArrayList<Student> getStudentList();
}
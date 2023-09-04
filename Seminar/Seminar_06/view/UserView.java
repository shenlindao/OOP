package Seminar.Seminar_06.view;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import Seminar.Seminar_06.controller.Controller;
import Seminar.Seminar_06.model.data.Student;
import Seminar.Seminar_06.model.data.Teacher;
import Seminar.Seminar_06.model.data.User;

public class UserView<T extends User> {
  private Scanner in = new Scanner(System.in);
  private Controller contr = new Controller();

  public void startInterface() {
    while (true) {
      System.out.println(
          "Выберите действие:\n1) Создать нового  преподавателя\n2) Создать нового студента\n3) Показать всех преподавателей\n"
              +
              "4) Показать всех студентов\n5) Выход");
      int choise = in.nextInt();
      in.nextLine();
      switch (choise) {
        case 1:
          System.out.println(createTeacher().toString());
          break;
        case 2:
          System.out.println(createStudent().toString());
          break;
        case 3:
          System.out.println(contr.showTeacher());
          break;
        case 4:
          System.out.println(contr.showStudent());
          break;
        case 5:
          return;

      }
    }
  }

  public Student createStudent() {
    System.out.print("Введите имя: ");
    String name = in.nextLine();
    System.out.print("Введите фамилию: ");
    String lastName = in.nextLine();
    System.out.print("Введите дату рождения в формате dd.mm.yyyy: ");
    String[] tempDate = in.nextLine().split("\\.");
    Calendar birthday = new GregorianCalendar(Integer.parseInt(tempDate[2]), Integer.parseInt(tempDate[1]),
        Integer.parseInt(tempDate[0]));

    return contr.createNewStudent(name, lastName, birthday);
  }

  public Teacher createTeacher() {
    System.out.print("Введите имя: ");
    String name = in.nextLine();
    System.out.print("Введите фамилию: ");
    String lastName = in.nextLine();
    System.out.print("Введите дату рождения в формате dd.mm.yyyy: ");
    String[] tempDate = in.nextLine().split("\\.");
    Calendar birthday = new GregorianCalendar(Integer.parseInt(tempDate[2]), Integer.parseInt(tempDate[1]),
        Integer.parseInt(tempDate[0]));
    return contr.createNewTeacher(name, lastName, birthday);
  }

}
package Homework.Homework_05.view;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import Seminar.Seminar_05.controller.Controller;

public class UserView {
  Controller controller = new Controller();
  String name;
  String lastName;
  String[] tempDate;
  Calendar birthDay;

  public void commonData(String name, String lastName, String[] tempDate, Calendar birthDay, Scanner scan) {
    System.out.println("Имя: ");
    name = scan.nextLine();
    System.out.println("Фамилия: ");
    lastName = scan.nextLine();
    System.out.println("День рождения в формате: yyyy/m/dd: ");
    tempDate = scan.nextLine().split("/");
    birthDay = new GregorianCalendar(Integer.parseInt(tempDate[0]), Integer.parseInt(tempDate[1]),
        Integer.parseInt(tempDate[2]));
  }

  public void addUser() {
    Scanner scan = new Scanner(System.in);
    int inCommand;
    String group;
    String speciality;
    double meanBall;
    String disciplines;
    String department;
    double rating;

    boolean noExit = true;
    while (noExit) {
      System.out.println("Выбор типа пользователя для добавления: ");
      System.out.println("1 Студент ");
      System.out.println("2 Учитель ");
      System.out.println("0 Выход");
      inCommand = Integer.parseInt(scan.nextLine());
      switch (inCommand) {
        case 1:
          commonData(name, lastName, tempDate, birthDay, scan);
          System.out.println("Группа: ");
          group = scan.nextLine();
          System.out.println("Специальность: ");
          speciality = scan.nextLine();
          System.out.println("Средний балл: ");
          meanBall = scan.nextDouble();
          System.out.println(controller.createNewStudent(name, lastName, birthDay, group, speciality, meanBall));
          scan.close();
          break;
        case 2:
          commonData(name, lastName, tempDate, birthDay, scan);
          System.out.println("Дисциплина: ");
          disciplines = scan.nextLine();
          System.out.println("Кафедра: ");
          department = scan.nextLine();
          System.out.println("Рейтинг: ");
          rating = scan.nextDouble();
          System.out.println(controller.createNewTeacher(name, lastName, birthDay, disciplines, department, rating));
          scan.close();
          break;
        default:
          noExit = false;
          scan.close();
          System.out.println("До свидания!");
          break;
      }
    }
  }
}

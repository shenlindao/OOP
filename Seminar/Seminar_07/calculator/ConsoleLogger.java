package Seminar.Seminar_07.calculator;

public class ConsoleLogger implements Loggable {

  @Override
  public void log(String info) {
    System.out.println("Logger: " + info);
    ;
  }

}

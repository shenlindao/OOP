package Seminar.Seminar_06.model.data;

import java.time.Year;
import java.util.Calendar;

public abstract class User {
  private String name;
  private String lastName;
  private Calendar birthday;

  public User(String name, String lastName, Calendar birthday) {
    this.name = name;
    this.lastName = lastName;
    this.birthday = birthday;
  }

  public String getName() {
    return name;
  }

  public String getLastName() {
    return lastName;
  }

  public Calendar getBirthday() {
    return birthday;
  }

  @Override
  public String toString() {
    return "name='" + name + '\'' +
        ", lastName='" + lastName + '\'' +
        ", birthday=" + birthday.get(Calendar.DATE) + "." + birthday.get(Calendar.MONTH) + "."
        + birthday.get(Calendar.YEAR);
  }
}
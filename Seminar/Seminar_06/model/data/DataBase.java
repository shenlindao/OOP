package Seminar.Seminar_06.model.data;

import java.util.ArrayList;

public class DataBase {
  ArrayList<User> db;

  public DataBase(ArrayList<User> db) {
    this.db = db;
  }

  public DataBase() {
    this.db = new ArrayList<>();
  }

  public ArrayList<User> getDb() {

    return db;
  }

  public void setDb(ArrayList<User> db) {
    this.db = db;
  }

  public void addInDB(User user) {
    db.add(user);
  }

  @Override
  public String toString() {
    String res = "";
    for (User obj : db) {
      res += obj.toString() + "\n";
    }
    return res;
  }
}
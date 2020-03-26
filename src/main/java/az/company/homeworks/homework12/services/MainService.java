package az.company.homeworks.homework12.services;

import az.company.homeworks.homework12.Menu;

public class MainService {
  public String menuContent() {
    return new Menu().show();
  }
}

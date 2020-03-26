package az.company.homeworks.homework13.services;

import az.company.homeworks.homework13.Menu;

public class MainService {
  public String menuContent() {
    return new Menu().show();
  }
}

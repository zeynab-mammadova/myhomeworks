package az.company.homeworks.homework13.controller;

import az.company.homeworks.homework13.services.MainService;

public class MainController {
  private final MainService mainService;

  public MainController() {
    this.mainService = new MainService();
  }

  public String help() {
    return mainService.menuContent();
  }
}

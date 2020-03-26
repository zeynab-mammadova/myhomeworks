package az.company.homeworks.homework13;


import az.company.homeworks.homework13.console.Console;
import az.company.homeworks.homework13.controller.FamilyController;
import az.company.homeworks.homework13.controller.MainController;
import az.company.homeworks.homework13.entities.*;
import az.company.homeworks.homework13.io.Command;
import az.company.homeworks.homework13.io.Parser;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Core {

  private final Console console;
  private final Menu menu;
  private final FamilyController familyController;
  private final Parser parser;
  private final MainController mainController;

  public Core(Console console) {
    this.console = console;
    this.familyController = new FamilyController();
    this.menu = new Menu();
    this.parser = new Parser();
    this.mainController = new MainController();
  }

  public void run() throws Exception {
    boolean cont = true;
    console.printLn(menu.show());
    while (cont) {

      String line = console.readLn();
      Command user_input = parser.parse(line);
      switch (user_input) {
        case TEST_DATA_CREATE:
          Map<String, String> schedule = new HashMap<>();
          schedule.put(DayOfWeek.MONDAY.name(), "Watch a film");
          schedule.put(DayOfWeek.TUESDAY.name(), "Go to courses and go to University");
          schedule.put(DayOfWeek.WEDNESDAY.name(), "Do home work;go to University");
          schedule.put(DayOfWeek.THURSDAY.name(), "Go to courses;go to University");
          schedule.put(DayOfWeek.FRIDAY.name(), "Do some home work;go to University");
          schedule.put(DayOfWeek.SATURDAY.name(), "Do some home work");
          schedule.put(DayOfWeek.SUNDAY.name(), "Do home work");


          Pet pet = new DomesticCat(Species.CAT, "Yulaf", 3, 79);
          Pet pet2 = new Dog(Species.DOG, "Awesome_boy", 4, 48);
          Set<Pet> pets = new HashSet<>();
          pets.add(pet);
          pets.add(pet2);
          Family Karoline = new Family(
                  new Woman("Laura", "Karoline",   LocalDate.of(1973,8,31),88,schedule),
                  new Man("Michael", "Karoline", LocalDate.of(1970, 2, 20),89,schedule),pets);
          Family West = new Family(
                  new Woman("Jane", "West", LocalDate.of(1964, 2, 18),78,schedule),
                  new Man("Tom", "West", LocalDate.of(1976, 1, 15),79,schedule),  pets);
          Human Rose = new Woman("Rose", "Karoline",   LocalDate.of(1993, 6, 5), 87,schedule);
          Human John = new Woman("John", "Karoline",  LocalDate.of(2007, 8, 30), 72, schedule);
          Karoline.addChild(John);
          familyController.saveFamily(Karoline);
          familyController.saveFamily(West);
          familyController.createNewFamily(
                  new Woman("Huda", "Parker", LocalDate.of(1957, 12, 31),89,schedule),
                  new Man("Mike", "Parker", LocalDate.of(1955, 4, 11),94,schedule));
          familyController.bornChild("Susan", "Jame", West);
          familyController.adoptChild(Rose, Karoline);
          familyController.addPet(0, new DomesticCat(Species.CAT, "Badem", 4, 45));
          console.printLn("Test data created!");
          break;
        case ENTIRE_LIST_SHOW:
          familyController.displayAllFamilies();
          break;
        case FAMILY_MEMBERS_MORE_THAN_SHOW:
          console.printLn("Enter the number which will show family members more than this number: ");
          int value1 = Integer.parseInt(console.readLn());
          System.out.println(familyController.getFamiliesBiggerThan(value1));
          break;
        case FAMILY_MEMBERS_LESS_THAN_SHOW:
          console.printLn("Enter the number which will show family members less than this number: ");
          int value2 = Integer.parseInt(console.readLn());
          System.out.println(familyController.getFamiliesLessThan(value2));
          break;
        case FAMILY_MEMBERS_EQUALS_COUNT:
          console.printLn("Enter the number which will show family members equal to this number: ");
          int value3 = Integer.parseInt(console.readLn());
          System.out.println("There is "+familyController.countFamiliesWithMemberNumber(value3)+" family with this member number");
          break;
        case FAMILY_CREATE:
          console.printLn("Enter the mother's name");
          String momname = console.readLn();
          console.printLn("Enter the mother's last name");
          String momLname = console.readLn();
          console.printLn("Enter the mother's birth year");
          int mYear = Integer.parseInt(console.readLn());
          console.printLn("Enter the mother's month of birth(with number)");
          int mMonth = Integer.parseInt(console.readLn());
          console.printLn("Enter the mother's birthday");
          int mDay = Integer.parseInt(console.readLn());
          console.printLn("Enter the mother's iq");
          int mIq = Integer.parseInt(console.readLn());
          console.printLn("Enter the father's name");
          String fathername = console.readLn();
          console.printLn("Enter the father's last name");
          String fatherLname = console.readLn();
          console.printLn("Enter the father's birth year");
          int fYear = Integer.parseInt(console.readLn());
          console.printLn("Enter the father's month of birth");
          int fMonth = Integer.parseInt(console.readLn());
          console.printLn("Enter the father's birthday");
          int fDay = Integer.parseInt(console.readLn());
          console.printLn("Enter the father's iq");
          int fIq = Integer.parseInt(console.readLn());
          familyController.createNewFamily(
                  new Woman(momname,momLname, LocalDate.of(mYear,mMonth,mDay),mIq),
                  new Man(fathername,fatherLname, LocalDate.of(fYear,fMonth,fDay),fIq));
          System.out.println("New family created");
          break;
        case FAMILY_INDEX_DELETE:
          console.printLn("Enter the index for deleting");
          int index1 = Integer.parseInt(console.readLn())-1;
          familyController.deleteFamilyByIndex(index1);
          break;
        case FAMILY_INDEX_EDIT:
          console.printLn("Choose a number between 1-3");
          console.printLn("1. Give birth to a baby");
          console.printLn("2. Adopt a child");
          console.printLn("3. Return to main menu ");
          int number = Integer.parseInt(console.readLn());
          switch (number){
            case 1:
              console.printLn("Enter the index");
              int index2 = Integer.parseInt(console.readLn())-1;
              console.printLn("Enter girl name (or skip this step for write boy name)");
              String girlName = console.readLn();
              console.printLn("Enter boy name");
              String boyName = console.readLn();
              familyController.bornChild(girlName,boyName,familyController.getFamilyById(index2));
              System.out.println("Ingee,ingee");
              break;
            case 2:
              console.printLn("Enter the index");
              int index3 = Integer.parseInt(console.readLn())-1;
              console.printLn("Enter the name");
              String cName = console.readLn();
              console.printLn("Enter the surname name");
              String cSname = console.readLn();
              console.printLn("Enter the birth year");
              int cYear = Integer.parseInt(console.readLn());
              console.printLn("Enter the birth month");
              int cMonth = Integer.parseInt(console.readLn());
              console.printLn("Enter the birth day");
              int cDay = Integer.parseInt(console.readLn());
              console.printLn("Enter the iq");
              int cIq  = Integer.parseInt(console.readLn());
              familyController.adoptChild(
                      new Human(cName,cSname, LocalDate.of(cYear,cMonth,cDay),cIq),
                      familyController.getFamilyById(index3));
              System.out.println("I'll love my new family..");
              break;
            case 3:
              menu.show();
              break;
          }
          break;
        case ALL_CHILDREN_ABOVE_AGE_REMOVE:
          console.printLn("Enter the age");
          int childAge = Integer.parseInt(console.readLn());
          familyController.deleteAllChildrenOlderThan(childAge);
          System.out.println("Done!");
          break;
        case SAVE_DATA:
          familyController.saveData();
          break;
        case LOAD_DATA:
          familyController.loadData();
          break;
        case EXIT:
          cont = false;
          break;
        case HELP:
          System.out.println("Invalid Option");
          //default:
          console.printLn(mainController.help());
          break;
      }
    }
  }
}

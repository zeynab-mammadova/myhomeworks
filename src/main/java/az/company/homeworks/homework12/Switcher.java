package az.company.homeworks.homework12;

import az.company.homeworks.homework12.App.Man;
import az.company.homeworks.homework12.App.Woman;
import az.company.homeworks.homework12.Controller.FamilyController;
import az.company.homeworks.homework12.Dao.CollectionFamilyDao;
import az.company.homeworks.homework12.Dao.FamilyDao;
import az.company.homeworks.homework12.Service.FamilyService;
import az.company.homeworks.homework12.App.Family;
import az.company.homeworks.homework12.App.Human;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Switcher {
        public static void main(String[] args) throws ParseException {
            Menu displayMenu = new Menu();
            FamilyDao familyDao=new CollectionFamilyDao();
            FamilyService familyService=new FamilyService(familyDao);
           FamilyController controller=new FamilyController(familyService);
            Scanner scanner = new Scanner(System.in);
            boolean command = true;
            while (command) {
                displayMenu.menu1();
                String menu_item = scanner.next();
                switch (menu_item) {
                    case "1":
                       Human Michael = new Man("Michael", "Karoline", LocalDate.of(1970, 2, 20).toEpochDay(), null);
                  Human Laura = new Woman("Laura", "Karoline", LocalDate.of(1973, 8, 31).toEpochDay(), null);

                       Human Tom = new Man("Tom", "West", LocalDate.of(1976, 1, 15).toEpochDay(), null);
                        Human Jane = new Woman("Jane", "West", LocalDate.of(1964, 2, 18).toEpochDay(), null);

                        controller.createNewFamily(Michael, Laura);
                        controller.createNewFamily(Tom, Jane);
                        controller.displayAllFamilies();
                        break;

                    case "2":
                        controller.displayAllFamilies();
                        break;

                    case "3":
                        System.out.println("Enter number for filtering");
                        int number_big = scanner.nextInt();
                       controller.getAllFamiliesBiggerThan(number_big);
                        break;

                    case "4":
                        System.out.println("Enter number for filtering");
                        int number_less = scanner.nextInt();
                       controller.getAllFamiliesLessThan(number_less);
                        break;

                    case "5":
                        System.out.println("Enter number for filtering");
                        int number_equal = scanner.nextInt();
                       controller.countFamiliesWithMemberNumber(number_equal);
                        break;
                    case "6":
                        System.out.println("Enter mother's name:");
                        String mom_name = scanner.next();
                        System.out.println("Enter mothers's surname:");
                        String mom_surname = scanner.next();
                        System.out.println("Enter year of birth,month of birth,day of birth: ");
                        String mom_birth = scanner.next();
                        System.out.println("Enter level of intelligence");
                        int mom_iq = scanner.nextInt();

                        System.out.println("Enter father's name:");
                        String dad_name = scanner.next();
                        System.out.println("Enter father's surname:");
                        String dad_surname = scanner.next();
                        System.out.println("Enter year of birth,month of birth,day of birth: ");
                        String dad_birth = scanner.next();
                        System.out.println("Enter level of intelligence");
                        int dad_iq = scanner.nextInt();
                        controller.createNewFamily(new Woman(mom_name, mom_surname, mom_birth, mom_iq), new Human(dad_name, dad_surname, dad_birth, dad_iq));
                        System.out.println("Data saved");
                        break;

                    case "7":
                        System.out.println("Enter id to delete family");
                        int delete = scanner.nextInt();
                        controller.deleteFamilyByIndex(delete);
                        System.out.println("Data deleted");
                        break;

                    case "8":

                        boolean command2 = true;
                        while (command2) {
                            displayMenu.menu2();
                            String menu_item1 = scanner.next();
                            switch (menu_item1) {
                                case "1":
                                    System.out.println("Enter ID of family to which you want add:");
                                    int familyId = scanner.nextInt();
                                    Family familyById = controller.getFamilyById(familyId);
                                    System.out.println("Enter name for boy");
                                    String boy = scanner.next();
                                    System.out.println("Enter name for girl");
                                    String girl = scanner.next();
                                    controller.bornChild(familyById, boy, girl);
                                    System.out.println("Data saved");
                                    break;
//                                case "2":
//                                    try {
//                                        System.out.println("Enter ID of family to which you want add:");
//                                        Family family = controller.getFamilyById(familyId);
//                                        int familyId1 = scanner.nextInt();
//                                        System.out.println("Enter name:");
//                                        String name = scanner.next();
//                                        System.out.println("Enter surname: ");
//                                        String surname = scanner.next();
//                                        System.out.println("Enter year of birth");
//                                        String birthYear = scanner.next();
//                                        System.out.println("Enter level of intelligence");
//                                        int iq = scanner.nextInt();
//                                        controller.adoptChild(familyId1, new Human(name, surname, birthYear, iq));
//                                        System.out.println("Data saved");
//                                    } catch (InputMismatchException ex) {
//                                        System.out.println("Please enter valid data");
//                                    }
//                                    break;
                                case "3":
                                    command2 = false;
                                    break;
                                default:
                                    System.out.println("Please enter command from menu");
                                    break;
                            }
                        }
                        break;

                    case "9":
                        System.out.println("Enter number for filtering");
                        int older_than = scanner.nextInt();
                        controller.deleteAllChildrenOlderThan(older_than,2020);
                        break;

                    case "10":
                        command = false;
                        System.out.println("Bye Bye");
                        break;
                    default:
                        System.out.println("Please enter command from menu");
                        break;
                }
            }

        }
    }
package az.company.homeworks.homework8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
          Map<String, String> tb = new HashMap<String, String>();
  Human Michael = new Human("Michael", "Karoline", 1975);
        Human Laura = new Human("Laura", "Karoline", 1975);
        Human John = new Human("John", "Bravo", 2004);
        Human Rose = new Human("Rose", "Bravo", 2006);
        DomesticCat cat=new DomesticCat(Pet.Species.DOMESTICCAT,"Meowchik",55);
        Dog dog=new Dog(Pet.Species.DOG,"Pug",66);
          Set<Pet> pets=new HashSet<Pet>();
          pets.add(dog);
          pets.add(cat);
               String[][] planner = {{DayOfWeek.SUNDAY.name(), "Read book"}, {DayOfWeek.MONDAY.name(), "Go to the IBA"},
                {DayOfWeek.TUESDAY.name(), "Go to the museum"}, {DayOfWeek.WEDNESDAY.name(), "Go to the IBA"},
                {DayOfWeek.THURSDAY.name(), "Do homework"}, {DayOfWeek.FRIDAY.name(), "Go to the IBA"},
                {DayOfWeek.SATURDAY.name(), "Sleep"},
        };

        Family family = new Family();
        family.setFather(Michael);
        family.setMother(Laura);
        family.addChild(John);
        family.addChild(Rose);
        family.setPet(pets);
        family.deleteChild(1);

        System.out.println("Number of family members: " + family.countFamily(family));
        System.out.println("Family members: " );
        System.out.println(family.toString());

    }
}


package az.company.homeworks.homework6;

import az.company.homeworks.homework5.Family;
import az.company.homeworks.homework5.Human;
import az.company.homeworks.homework5.Pet;

public class Main {
    public static void main(String[] args) {

    az.company.homeworks.homework5.Human Michael = new az.company.homeworks.homework5.Human("Michael", "Karoline", 1975,90);
    az.company.homeworks.homework5.Human Laura = new az.company.homeworks.homework5.Human("Laura", "Karoline", 1975,93);
    az.company.homeworks.homework5.Human John=new az.company.homeworks.homework5.Human("John","Bravo",2004,88);
    az.company.homeworks.homework5.Human Rose=new Human("Rose","Bravo",2006,90);
    az.company.homeworks.homework5.Pet hamster=new Pet("Hamster","Yulaf",2,40,new String[]{"eating,running,sleeping"});

    az.company.homeworks.homework5.Family family=new Family();
        family.setFather(Michael);
        family.setMother(Laura);
        family.addChild(John);
        family.addChild(Rose);
        family.setPet(hamster);
        System.out.println(family.toString());
        System.out.println("Number of family members: "+family.countFamily());
family.deleteChild(0);
        System.out.println("Number of family members after child leave family: "+family.countFamily());
        System.out.println(family.toString());
}
}

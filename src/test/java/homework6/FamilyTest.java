package homework6;

import static org.junit.jupiter.api.Assertions.*;

import az.company.homeworks.homework6.Family;
import az.company.homeworks.homework6.Human;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FamilyTest {

    @Test
    public void addChild() {
        Family family = new Family();
        Human John = new Human("John", "Bravo", 2004, 88);
        family.addChild(John);
        boolean actual = false;
        for (int i = 0; i < family.getChildren().length; i++) {
            if (family.getChildren()[i] == John) {
                actual = true;
            }
        }
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void deleteChild() {
        Family family = new Family();
        Human John = new Human("John", "Bravo", 2004, 88);
        family.addChild(John);
        family.deleteChild(0);
        boolean actual = true;
        for (int i = 0; i < family.getChildren().length; i++) {
            if (family.getChildren()[i] == John) {
                actual = false;
            }
        }
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void countFamily() {
        Family family = new Family();
        Human Michael = new Human("Michael", "Karoline", 1975, 90);
        Human Laura = new Human("Laura", "Karoline", 1975,  93);
        Human John = new Human("John", "Bravo", 2004,  88);
        family.setFather(Michael);
        family.setMother(Laura);
        family.addChild(John);
        int actual = family.countFamily();
        int expected = 3;
        assertEquals(expected, actual);
    }
}
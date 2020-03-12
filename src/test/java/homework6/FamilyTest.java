package homework6;

import static org.junit.jupiter.api.Assertions.*;

import az.company.homeworks.homework6.Family;
import az.company.homeworks.homework6.Human;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FamilyTest {
    Family family;
    Human[] children;
    Human John;
    Human Rose;
    Human testChild;

    @BeforeEach
    public void init() {
        family = new Family(new Human("Laura", "Karoline", 1975, 93), new Human("Michael", "Karoline", 1975, 90), new Human[]{Rose, John});
        John = new Human("John", "Bravo", 2004, 88);
        Rose = new Human("Rose", "Bravo", 2006, 90);
        family.setChildren(children);
        testChild = new Human("Test", "Testt", 2000, 100);

    }

    @Test
    public void deleteChildWithIndex() {
        assertTrue(family.deleteChild(1));
    }

    @Test
    public void deleteChildWithWrongIndex(){
        assertFalse(family.deleteChild(-1));

    }

    @Test
    public void  deleteChildWithObject(){
        assertTrue(family.deleteChild(Rose));
    }

    @Test
    public void  deleteChildWithWrongObject(){
        assertFalse(family.deleteChild(testChild));
    }


    @Test
    public void addChild() {
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
    public void countFamily() {
        int expected = 2 + family.getChildren().length;
        assertEquals(expected, family.countFamily());
    }


}
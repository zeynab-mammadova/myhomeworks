package az.company.homeworks.homework12.Service;

import az.company.homeworks.homework12.App.Family;
import az.company.homeworks.homework12.App.Human;
import az.company.homeworks.homework12.App.Man;
import az.company.homeworks.homework12.App.Pet;
import az.company.homeworks.homework12.Dao.FamilyDao;
import az.company.homeworks.homework12.Exception.FamilyOverflowException;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FamilyService {
    private FamilyDao familyDao;

    public FamilyService(FamilyDao familyDao) {
        this.familyDao = familyDao;
    }

    public List<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }

    public void displayAllFamilies() {
        List<Family> families = getAllFamilies();
        families.forEach(family -> System.out.printf("%d. %s\n", families.indexOf(family)+1, family.prettyFormat()));
    }

    public void getAllFamiliesBiggerThan(int index) {
        Stream<Family> familyStream = getAllFamilies().stream();
        familyStream
                .filter(family -> family.countFamily() > index)
                .forEach(family -> System.out.printf("%s\n", family.prettyFormat()));
    }

    public void getAllFamiliesLessThan(int index) {
        Stream<Family> familyStream = getAllFamilies().stream();
        familyStream
                .filter(family -> family.countFamily() < index)
                .forEach(family -> System.out.printf("%s\n", family.prettyFormat()));
    }

    public int countFamiliesWithMemberNumber(int memberCount) {
        List<Family> families = familyDao.getAllFamilies();
        families = families.stream()
                .filter(family -> family.countFamily() == memberCount)
                .collect(Collectors.toList());

        return families.size();
    }

    public void createNewFamily(Human father, Human mother) {
        familyDao.saveFamily(new Family(father, mother));
    }

    public boolean deleteFamilyByIndex(int index) {
        return familyDao.deleteFamily(familyDao.getFamilyByIndex(index));
    }

    public Family bornChild(Family family, String boyName, String girlName) {
        Random rand = new Random();
        if (!familyDao.getAllFamilies().contains(family)) familyDao.saveFamily(family);
        String surname = family.getFather().getSurname();
        LocalDate birthDate = LocalDate.now();
        Human child;
        if (rand.nextBoolean()) child = new Man(boyName, surname, birthDate.toEpochDay(), family);
        else child = new Man(girlName, surname, birthDate.toEpochDay(), family);
        try {
            family.addChild(child);
        } catch (FamilyOverflowException e) {
            throw e;
        }
        return family;
    }


    public Family adoptChild(Family family, Human human) throws  FamilyOverflowException{
        if (getAllFamilies().contains(family)) {
            family.addChild(human);
        } else {
            family.addChild(human);
            familyDao.saveFamily(family);
        }
        return family;
    }

    public int count() {
        return familyDao.getAllFamilies().size();
    }

    public Family getFamilyById(int index)throws FamilyOverflowException {
        return familyDao.getFamilyByIndex(index);
    }

    public void deleteAllChildrenOlderThan(int age, int year) {

        getAllFamilies()
                .stream()
                .forEach((family) -> {
                    List<Human> children = family.getChildren();
                    children
                            .removeIf((child) -> (year - child.getYear()) > age);
                    family.setChildren(children);
                    familyDao.saveFamily(family);
                });
    }
    public Set<Pet> getPets(int index) {
        return getFamilyById(index).getPet();
    }

    public void addPet(int index, Pet pet) {
        getFamilyById(index).addPet(pet);
    }
}

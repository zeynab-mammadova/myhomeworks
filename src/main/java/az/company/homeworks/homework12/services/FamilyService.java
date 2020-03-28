package az.company.homeworks.homework12.services;

import az.company.homeworks.homework12.dao.CollectionFamilyDao;
import az.company.homeworks.homework12.dao.FamilyDao;
import az.company.homeworks.homework12.entities.*;
import az.company.homeworks.homework12.exception.FamilyOverflowException;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FamilyService {
    private FamilyDao<Family> familyDao = new CollectionFamilyDao();

    public List<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }

    public void saveFamily(Family f) {
        familyDao.saveFamily(f);
    }

    public void displayAllFamilies() {
        for (int i = 0; i <getAllFamilies().size() ; i++) {
            System.out.println(i+1+"."+getFamilyById(i));
        }
    }

    public List<Family> getFamiliesBiggerThan(int value) {
        return getAllFamilies().stream().filter(family -> family.countFamily() > value).collect(Collectors.toList());
    }

    public List<Family> getFamiliesLessThan(int value) {
        return getAllFamilies().stream().filter(family -> family.countFamily() < value).collect(Collectors.toList());
    }

    public int countFamiliesWithMemberNumber(int value) {
        return (int) getAllFamilies().stream().filter(family -> family.countFamily() == value).count();
    }

    public void createNewFamily(Woman mother, Man father) {
        Family family = new Family(mother, father);
        saveFamily(family);
    }

    public void deleteFamilyByIndex(int index) {
        familyDao.deleteFamily(index);
    }

    public void bornChild(String feminine, String masculine, Family family) {
        String surname = family.getMother().getSurname();
        LocalDate birthDate = LocalDate.now();
        Random generator = new Random();
        String[] gender = {"Male", "Female"};
        int a = generator.nextInt(gender.length);
        String setGender = gender[a];
        if ("male".equalsIgnoreCase(setGender)) {
            Man child = new Man(masculine, surname,birthDate);
            family.addChild(child);
        }
        if ("female".equalsIgnoreCase(setGender)) {
            Woman child = new Woman(feminine, surname, birthDate);
            family.addChild(child);
        }
        if(family.countFamily()>6){
            throw new FamilyOverflowException("Family size can not exceed 6");
        }
    }

    public void adoptChild(Human child, Family family) {
        if(family!=null && family.countFamily()>6){
            throw new FamilyOverflowException("Family size can not exceed 6");
        }
        family.getChildren().add(child);

    }

    public void deleteAllChildrenOlderThan(int age) {
        LocalDate now = LocalDate.now();
        getAllFamilies()
                .stream()
                .filter(family -> family.getChildren() != null)
                .forEach(family -> IntStream.range(0, family.getChildren().size())
                        .filter(i -> Period.between(family.getChildren().get(i).getBirthDate(), now).getYears() > age)
                        .forEach(family::deleteChild));
    }


    public int count() {
        return getAllFamilies().size();
    }

    public Family getFamilyById(int index) {
        return familyDao.getFamilyByIndex(index);
    }

    public Set<Pet> getPets(int index) {
        return getFamilyById(index).getPets();
    }

    public void addPet(int index, Pet pet) {
        getFamilyById(index).getPets().add(pet);
    }


}

package az.company.homeworks.homework13.controller;

import az.company.homeworks.homework13.entities.*;
import az.company.homeworks.homework13.services.FamilyService;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public class FamilyController {
        private FamilyService familyService= new FamilyService();
    public List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }

    public void saveFamily(Family f) {
        familyService.saveFamily(f);
    }

    public void displayAllFamilies() {
        familyService.displayAllFamilies();
    }


    public List<Family> getFamiliesBiggerThan(int value) {
       return familyService.getFamiliesBiggerThan(value);
    }


    public List<Family> getFamiliesLessThan(int value) {
        return familyService.getFamiliesLessThan(value);
    }


    public int countFamiliesWithMemberNumber(int value) {
        return familyService.countFamiliesWithMemberNumber(value);
    }


    public void createNewFamily(Woman mother, Man father){
       familyService.createNewFamily(mother,father);
    }


    public void deleteFamilyByIndex(int index) {
        familyService.deleteFamilyByIndex(index);
    }


    public void bornChild(String feminine, String masculine, Family family){
        familyService.bornChild(feminine, masculine, family);
    }


    public void adoptChild(Human child, Family family) {
        familyService.adoptChild(child, family);
    }


    public void deleteAllChildrenOlderThan(int age,int year){
        familyService.deleteAllChildrenOlderThan(age,year);
    }


    public int count(){
        return familyService.count();
    }


    public Family getFamilyById (int index) {
        return familyService.getFamilyById(index);
    }


    public Set<Pet> getPets(int index){
        return familyService.getPets(index);
    }


    public void addPet(int index, Pet pet){
       familyService.addPet(index,pet);
    }

    public void saveData() throws IOException {
        familyService.saveData();
    }

    public void loadData() throws IOException, ClassNotFoundException {
        familyService.loadData();
    }
}

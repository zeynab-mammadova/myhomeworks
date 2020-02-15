package sefiqe;

import java.util.Arrays;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] scedule;

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] scedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.scedule = scedule;
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public int getIq() {
        return iq;
    }

    public Pet getPet() {
        return pet;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public String[][] getScedule() {
        return scedule;
    }
    void greetPet(){
        System.out.println("Hello " + pet.getName());
    }
    void describePet(){
        System.out.println("I have a"+ pet.getSpecies() + "he is "
                +pet.getAge() + "years old,he is " + (pet.getTrickLevel()>50 ? "very sly" : "almost not sly"));
    }

    @Override
    public String toString() {
        return "Human{" +
                "name ="+this.name+","+
                "surname = "+this.surname+","+
                "year="+ this.year+","+
                "iq="+this.iq+","+
                "mother="+this.mother.surname + this.mother.name + ","+
                "father="+this.father.surname+this.father.name + ","+
                "pet="+pet.toString();
    }
}

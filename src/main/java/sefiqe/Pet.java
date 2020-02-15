package sefiqe;

import java.util.Arrays;

public class Pet {
    String species;
    String name;
    int age;
    int trickLevel;
    String [] habit;

    public Pet(String species, String name, int age, int trickLevel, String[] habit) {
        this.species = species;
        this.name = name;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habit = habit;
    }

    public Pet(String species, String name) {
        this.species = species;
        this.name = name;
    }

    public Pet() {
    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public String[] getHabit() {
        return habit;
    }

    void eat(){
        System.out.println("I am eating");
    }
    void respond(){
        System.out.println("Hello,owner. i am- " + this.name + "I miss you.");
    }
    void foul(){
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return species + "{"+
                "nickname =" + this.name +","+
                "age =" +this.age +","+
                "trickLevel =" +this.trickLevel +","+
                "habits ="+ Arrays.toString(habit) +"}";
    }
}

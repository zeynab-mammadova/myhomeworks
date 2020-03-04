package az.company.homeworks.homework8;

import java.util.HashSet;

public class Dog extends Pet {

private Species spec=Species.DOG;

    public Dog(Species species, String nickname, int trickLevel) {
        species = spec;
        nickname = super.getNickname();
        trickLevel = super.getTrickLevel();
    }

    public Dog(Species species, String nickname, int age, int trickLevel, HashSet<String> habits) {
        species = spec;
        nickname = super.getNickname();
        age = super.getAge();
        trickLevel = super.getTrickLevel();
        habits = super.getHabits();
    }

    public Dog() {
        this(Species.UNKNOWN, "Dog", 60);
    }
    public Species getSpec() {
        return spec;
    }

    public void setSpec(Species spec) {
        this.spec = spec;
    }


    @Override
    public void respond() {
        System.out.printf("I'm %s\n",this.getNickname());
    }
    @Override
    public void foul() {
        System.out.println("Oops..");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "spec=" + spec +
                '}';
    }
}

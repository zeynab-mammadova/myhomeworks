package az.company.homeworks.homework7;

import java.util.Objects;

public abstract class Pet {

    enum Species {
        DOG,
        DOMESTICCAT,
        HAMSTER,
        ROBOCAT,
        FISH,
        UNKNOWN
    }


    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;
    private Species species;


    public Pet(String nickname, int trickLevel) {
        this.nickname = nickname;
        this.trickLevel = trickLevel;
    }

    public Pet(String nickname, int age, int trickLevel, String[] habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet() {

    }

    public void eat() {
        System.out.println("I am eating");
    }

    public abstract void respond();

    public void foul() {
        System.out.println("I need to cover it up.");
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String toString() {
        return "{nickname= " + getNickname() + ", age= " + getAge() + ", trickLevel= " + getTrickLevel() + ", habits= " + getHabits() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return Objects.equals(getNickname(), pet.getNickname());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getNickname());
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalized in Pet class: " + this);
    }
}


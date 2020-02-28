package az.company.homeworks.homework8;

public class Fish extends Pet {
private Species spec=Species.FISH;

    public Fish(Species species, String nickname, int trickLevel) {
        species = spec;
        nickname =super.getNickname();
        trickLevel = super.getTrickLevel();
    }

    public Fish(Species species, String nickname, int age, int trickLevel, String[] habits) {
        species = spec;
        nickname = super.getNickname();
        age = super.getAge();
        trickLevel = super.getTrickLevel();
        habits = super.getHabits();
    }


    public Fish() {
        this(Species.UNKNOWN, "FISH", 60);
    }

    public Species getSpec() {
        return spec;
    }

    public void setSpec(Species spec) {
        this.spec = spec;
    }


    @Override
    public void respond() {
        System.out.printf("I'm s%\n",this.getNickname());
    }

    @Override
    public String toString() {
        return "Fish{" +
                "species=" + spec +
                '}';
    }

}

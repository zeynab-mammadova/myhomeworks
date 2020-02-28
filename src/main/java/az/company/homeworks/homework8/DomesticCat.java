package az.company.homeworks.homework8;

public class DomesticCat extends Pet {
    private Species spec=Species.DOMESTICCAT;

    public DomesticCat(Species species,String nickname, int trickLevel) {
        species = spec;
        nickname = super.getNickname();
        trickLevel = super.getTrickLevel();
    }

    public DomesticCat(Species species,String nickname, int age, int trickLevel, String[] habits) {
        species = spec;
        nickname = super.getNickname();
        age = super.getAge();
        trickLevel = super.getTrickLevel();
        habits = super.getHabits();
    }
    public DomesticCat() {
        this(Species.UNKNOWN, "DomesticCat", 60);
    }


    @Override
    public void respond() {
        System.out.printf("Meow I am %s\n", this.getNickname());
    }
    @Override
    public void foul() {
        System.out.println("I peed..");
    }

    public Species getSpec() {
        return spec;
    }

    public void setSpec(Species spec) {
        this.spec = spec;
    }
}

package az.company.homeworks.homework7;

public class DomesticCat extends Pet {
    private Species spec = Species.DOMESTICCAT;

    public DomesticCat(Species species, String nickname, int trickLevel) {
        species = spec;
        nickname = super.getNickname();
        trickLevel = super.getTrickLevel();
    }

    public DomesticCat() {
        this(Species.UNKNOWN, "DomesticCat", 60);
    }

    @Override
    public void eat() {
        super.eat();
    }
    @Override
    public void respond() {
        System.out.printf("Meow I am %s\n", this.getNickname());
    }

    @Override
    public void foul() {
        System.out.println("I peed..");
    }

}

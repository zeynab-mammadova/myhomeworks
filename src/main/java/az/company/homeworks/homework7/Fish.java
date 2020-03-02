package az.company.homeworks.homework7;

public class Fish extends Pet{
private Species spec=Species.FISH;

    public Fish(Species species, String nickname, int trickLevel) {
        species = spec;
        nickname =super.getNickname();
        trickLevel = super.getTrickLevel();
    }

    public Fish() {
        this(Species.UNKNOWN, "FISH", 60);
    }

    @Override
    public void eat() {
        super.eat();
    }
    @Override
    public void respond() {
        System.out.printf("I'm s%\n",this.getNickname());
    }



}

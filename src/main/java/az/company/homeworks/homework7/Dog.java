package az.company.homeworks.homework7;

public class Dog extends Pet {

private Species spec=Species.DOG;

    public Dog(Species species, String nickname, int trickLevel) {
        species = spec;
        nickname = super.getNickname();
        trickLevel = super.getTrickLevel();
    }

    public Dog() {
        this(Species.UNKNOWN, "Dog", 60);
    }

    @Override
    public void eat() {
        super.eat();
    }
    @Override
    public void respond() {
        System.out.printf("I'm %s\n",this.getNickname());
    }
    @Override
    public void foul() {
        System.out.println("Oops..");
    }

}

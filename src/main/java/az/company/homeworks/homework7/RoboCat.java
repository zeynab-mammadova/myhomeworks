package az.company.homeworks.homework7;

public class RoboCat extends Pet {

    private Species spec=Species.ROBOCAT;

    public RoboCat(Species species, String nickname, int trickLevel) {
        species = spec;
        nickname = super.getNickname();
        trickLevel = super.getTrickLevel();
    }

    public RoboCat() {
        this(Species.UNKNOWN, "RoboCat", 60);
    }


    @Override
    public void respond() {
        System.out.printf("I'm %s\n",this.getNickname());
    }
}

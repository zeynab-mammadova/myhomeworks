package homework4;
import java.util.Arrays;
public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel; // in this interval (1-100)
    String []habits;
    void eat(){
        System.out.println("I am eating");
    }
    void respond(){
        System.out.println("Hello, owner. I am "+this.nickname+" .I miss you!'");
    }
    void foul(){
        System.out.println("I need to cover it up");
    }
    public String toString()
    {
        String display=this.species+"{ nickname = '"+this.nickname+"', age = "+this.age+", tricklevel = "+this.trickLevel+ ", habits = "+ Arrays.toString(this.habits) +" }";
        return display;
    }
    public Pet(){}
    public Pet(String species,String nickname){
        this.species=species;
        this.nickname=nickname;
    }
    public Pet(String species,String nickname,int age,int trickLevel,String[] habits){
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.trickLevel=trickLevel;
        this.habits=habits;
    }

}

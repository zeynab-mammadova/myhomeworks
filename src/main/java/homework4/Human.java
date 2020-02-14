package homework4;
import java.util.Arrays;
import java.util.Random;
public class Human {
    String name;
    String surname;
    int year;
    int iq; // in this interval(1-100)
    Pet pet;
    Human mother;
    Human father;
    String[][]schedule=new String[7][2];
Random random=new Random();
    void greatPet(){
        System.out.println("Hello "+pet.nickname);
    }
    void describePet(){
        System.out.println("I have a "+pet.species+" ,he is "+pet.age+" years old, he is "+(pet.trickLevel>50? "very sly": "almost not sly"));
    }
    public String toString(){
        String display;
        display="Human{ name='"+this.name+"', surname='"+this.surname+"', year="+this.year+", iq="+this.iq+", mother='"+this.mother.name+" "+this.mother.surname+"', father='"+this.father.name+" "+this.father.surname+"', ";
        display+="Pet = "+this.pet.species+"{ nickname='"+this.pet.nickname+"', age="+this.pet.age+", tricklevel="+this.pet.trickLevel+", habits="+ Arrays.toString(this.pet.habits)+"}}";
        return display;
    }
    public Human(){}
    public Human(String name, String surname,int year){
        this.name=name;
        this.surname=surname;
        this.year=year;
    }
    public Human(String name, String surname,int year,Human mother,Human father){
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.mother=mother;
        this.father=father;
    }
    public Human(String name, String surname,int year,int iq,Human mother,Human father,Pet pet,String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
        this.pet = pet;
        this.schedule = schedule;
    }
    public boolean feedPet(boolean feedTime){
        if(feedTime || random.nextInt()<this.pet.trickLevel){
            System.out.println("Hm... I will feed "+this.pet.nickname+"");
            return true;
        }else{
            System.out.println("I think "+this.pet.nickname+" is not hungry.");
            return false;
        }
    }


}
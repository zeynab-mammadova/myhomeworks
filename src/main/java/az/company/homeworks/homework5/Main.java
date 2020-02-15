package az.company.homeworks.homework5;

public class Main {
    public static void main(String[] args) {
        Human Micael = new Human("Michael", "Karoline", 1975);
        Human Laura = new Human("Laura", "Karoline", 1975);
        Pet dog = new Pet("dog", "Pug");
        dog.setAge(5);
        dog.setTrickLevel(53);
        dog.setHabits(new String[]{"walking", "sleeping","eating"});
        Family family1 = new Family( Laura, Micael);
        System.out.println(family1.toString());


    }
}

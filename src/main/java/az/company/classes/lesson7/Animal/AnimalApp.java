package az.company.classes.lesson7.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Animal("Pick");
        Dog dog1 = new Dog("Pug");
        Cat cat1 = new Cat("Tom");
        Fish fish1 = new Fish("Nemo");
        Animal dragon = new Animal("Dragi") {
            @Override
            public String toString() {
                return "Hello.I'm dragon " +
                        "My name is: " + name
                        ;
            }
        };


        List<Animal> animalList=new ArrayList<>();
        animalList.add(dog1);
        animalList.add(cat1);
        animalList.add(fish1);
        animalList.add(animal);
        animalList.add(dragon);
        System.out.println(animalList);
    }
}
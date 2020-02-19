package az.company.classes.lesson7.Animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Hello.I'm cat " +
                "My name is: " + name
                ;
    }
}

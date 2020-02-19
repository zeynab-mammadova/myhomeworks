package az.company.classes.lesson7.Animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Hello.I'm dog " +
                "My name is: " + name
                ;
    }
}

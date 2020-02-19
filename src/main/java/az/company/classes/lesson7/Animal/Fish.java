package az.company.classes.lesson7.Animal;

public class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Hello.I'm fish " +
                "My name is: " + name
                ;
    }
}

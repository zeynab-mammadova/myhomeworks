package az.company.classes.lesson7.Animal;

public class Animal {
   public String name;

    public Animal(String name) {
        this.name = '\"'+name.toUpperCase()+'\"';
    }

    @Override
    public String toString() {
        return "Hello.I'am animal " +
                "My name is: " + name
                ;
    }
}

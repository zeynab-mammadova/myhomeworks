package az.company.classes.lessons1_2_3;

public class MyPizzaApp {
    public static void main(String[] args) {
        MyPizza p1 = new MyPizza(30, "Margaritta");
        MyPizza p2 = new MyPizza(40, "Chicken Barbekue");
        System.out.println(MyPizza.counter);
    }

}
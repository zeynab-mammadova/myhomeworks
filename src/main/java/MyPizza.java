public class MyPizza {
    int price;
    String name;
    static int counter=0;
    public MyPizza(int price,String name){
        this.price=price;
        this.name=name;
        counter++;
    }

}

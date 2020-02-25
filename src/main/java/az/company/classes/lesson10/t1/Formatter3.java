package az.company.classes.lesson10.t1;

public class Formatter3 extends Formatter0 {
    @Override
    public void print(String hello) {
        super.print(hello);
        System.out.println("***********\n" +
                "* " +  hello + "*\n" +
                "***********\n");

    }
}

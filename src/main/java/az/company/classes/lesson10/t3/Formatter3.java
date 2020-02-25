package az.company.classes.lesson10.t3;

public class Formatter3 extends Formatter0 {
    String str;

    public Formatter3(String str) {
        this.str = str;

    }
    public Formatter3(Formatter0 fmt) {
        this.str = fmt.toString();

    }

    @Override
    public String toString() {
        return "***********\n" +
                "*  " +  str + "  *\n" +
                "***********\n";
    }
}

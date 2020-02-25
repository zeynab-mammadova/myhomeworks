package az.company.classes.lesson10.t3;

public class Formatter2 extends Formatter0 {
    String str;

    public Formatter2(String str) {
        this.str = str;

    }
    public Formatter2(Formatter0 fmt) {
        this.str = fmt.toString();

    }

    @Override
    public String toString() {
        return str.toUpperCase();
    }
}

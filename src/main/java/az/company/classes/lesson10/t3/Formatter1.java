package az.company.classes.lesson10.t3;

public class Formatter1 extends Formatter0 {
    String str;

    public Formatter1(String str) {
        this.str = str;

    }
    public Formatter1(Formatter0 fmt) {
        this.str = fmt.toString();

    }

    @Override
    public String toString() {
        return str.toLowerCase();
    }
}

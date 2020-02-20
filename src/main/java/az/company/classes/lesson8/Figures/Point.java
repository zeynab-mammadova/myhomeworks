package az.company.classes.lesson8.Figures;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Points{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

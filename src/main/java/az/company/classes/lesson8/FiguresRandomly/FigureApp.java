package az.company.classes.lesson8.FiguresRandomly;

import java.util.ArrayList;

public class FigureApp {
    public static void main(String[] args) {
        ArrayList<Figure>figures=new ArrayList<>();
        Circle c=new Circle(new Point(4,3),3);
                Rectangle r=new Rectangle(new Point(2,10), new Point(1,14) );
                Triangle t=new Triangle(new Point(1,30),new Point(4,27),new Point(4,19));
            double sumOfareas = 0;
            figures.add(c);
            figures.add(r);
            figures.add(t);
        for (Figure f: figures) {
            sumOfareas += f.Area();
        }
                System.out.println(sumOfareas);
        }
}

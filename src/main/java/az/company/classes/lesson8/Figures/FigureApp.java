package az.company.classes.lesson8.Figures;

import java.awt.geom.Area;
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
        System.out.println(figures);
        System.out.println(c.Area());
        System.out.println(r.Area());
        System.out.println(t.Area());
        System.out.println(c.Area()+r.Area()+t.Area());
        }
}

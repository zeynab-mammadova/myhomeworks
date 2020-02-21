package az.company.classes.lesson8.FiguresRandomly;

import java.util.Random;

public class Figure {
public int Area(){
return 0;
}

public int createRandom(){
    Random random = new Random();
    return  random.nextInt(10);

}
public Point createPoint(){
    return new Point (createRandom(),createRandom());
}

}

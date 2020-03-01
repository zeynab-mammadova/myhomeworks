package az.company.classes.lesson12;

import java.util.ArrayList;
import java.util.List;

public class RandomSquare {
    public void generateRandom(List<Integer> random) {
        List<Integer> list = new ArrayList<Integer>(20);
        for(int i=0;i<20;i++){
            list.add((int) (Math.random() * (20)) - 10);
        }
    }


    public static void main(String[] args) {
        System.out.println();
    }

}

package az.company.classes.lesson25;

import java.util.HashSet;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomUnique {
    public static void main(String[] args) {

    HashSet<Integer> set = new HashSet<>();
        Random randomGenerator = new Random();
        int counter=0;
    while (set.size() < 50) {
        int random = randomGenerator.nextInt(25);
        if (set.contains(random)){
            counter++;
        }
        set.add(random);
        System.out.println(set);
    }

        System.out.println(counter);


    }
}
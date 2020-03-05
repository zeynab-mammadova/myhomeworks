package az.company.atHome.StreamExamples;

import az.company.classes.Array;

import java.util.Arrays;

public class Stream2 {
    public static void main(String[] args) {
        String [] names={"Zeynab","Nick","Nazrin","Alexey","Nigar"};
        Arrays.stream(names)              //Stream.of.()names
    .filter(x->x.startsWith("N"))
                .forEach(System.out::println);
    }
}

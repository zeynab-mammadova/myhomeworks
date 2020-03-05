package az.company.atHome.StreamExamples;

import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        Stream.of("Ava","Aneri","Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }
}

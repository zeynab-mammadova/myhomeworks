package az.company.classes.lesson15;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Brackets {

    public int calc(String origin) {
        List<String> brackets = Arrays.asList("()(()())((()()))(())()");

        AtomicInteger counter = new AtomicInteger();
        brackets
                .stream()
                .filter(x -> x.startsWith("("))
                .peek(x -> counter.getAndIncrement())
                .forEach(System.out::println);
        return counter.getAndIncrement();
    }


}

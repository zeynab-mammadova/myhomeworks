package az.company.classes.lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SentencesApp4 {
  private static List<String> list(String... items) {
    return Arrays.asList(items);
  }

  public static void main(String[] args) {
    List<String> subjects = list("Noel", "The cat", "The dog");
    List<String> verbs =    list("wrote", "chased", "slept on");
    List<String> objects =  list("the book","the ball","the bed");

    ArrayList<Sentence> outcome = new ArrayList<>();

    subjects.forEach(subj ->
        verbs.forEach(verb ->
            objects.forEach(obj ->
                outcome.add(new Sentence(subj, verb, obj))
            )
        )
    );
    outcome.forEach(s -> System.out.println(s));

  }
}

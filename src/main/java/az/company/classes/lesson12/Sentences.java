package az.company.classes.lesson12;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Sentences {
    public static void main(String[] args) {

        List<String> subjects = Arrays.asList("Noel", "The cat", "The dog");
        List<String> verbs = Arrays.asList("wrote", "chased", "slept on");
        List<String> objects = Arrays.asList("the book", "the ball", "the bed");
        List<List<String>> sentence = new ArrayList<List<String>>(3);
        sentence.add(subjects);
        sentence.add(verbs);
        sentence.add(objects);
        printAll(sentence, "", 0);

    }
    public  static void printAll(List<List<String>> list, String output, int indexOfList){
        if(indexOfList == list.size()) {
            System.out.println(output);
            return;
        }
        List<String> currentList = list.get(indexOfList);
        for(String str: currentList) {
            printAll(list, output+" " + str, indexOfList+1);
        }
    }
}

package az.company.classes.lesson13;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SentencesApp2FlatMap {
  public static void main(String[] args) throws IOException {
    Map<String, List<String>> sv = read("subj_verb.txt");
    Map<String, List<String>> vo = read("verb_obj.txt");
    List<Sentence> sentences = makeSentences(sv, vo);
    write(sentences, "sentences.txt");
  }

  private static List<Sentence> makeSentences(Map<String, List<String>> sv, Map<String, List<String>> vo) {
    return sv.keySet().stream().flatMap(subj ->
        sv.get(subj).stream().flatMap(verb ->
            vo.get(verb).stream().map(obj ->
                new Sentence(subj, verb, obj)
            )
        )
    ).collect(Collectors.toList());
  }

  private static void write(List<Sentence> sentences, String filename) throws IOException {
    File ofile = new File(filename);
    BufferedWriter bw = new BufferedWriter(new FileWriter(ofile));
    for (Sentence line: sentences) {
      bw.write(line.represent());
      bw.write("\n");
    }
    bw.close();
  }

  private static Map<String, List<String>> read(String filename) throws FileNotFoundException {
    File file = new File(filename);
    BufferedReader br = new BufferedReader(new FileReader(file));

    HashMap<String, List<String>> dict = new HashMap<>();
    Stream<String> lines = br.lines();
    //  splitted[0] splitted[1]
    // wrote: the book, the letter, the code
    lines.forEach(line -> {
      String[] splitted = line.split(":");
      String key = splitted[0].trim();
      String[] values_dirty = splitted[1].split(",");
      ArrayList<String> values = new ArrayList<>();
      for (String v: values_dirty) {
        values.add(v.trim());
      }
      dict.put(key, values);
    });
    return dict;
  }
}

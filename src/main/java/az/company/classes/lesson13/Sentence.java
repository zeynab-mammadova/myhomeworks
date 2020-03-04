package az.company.classes.lesson13;

public class Sentence {
  final String subj;
  final String verb;
  final String obj;

  public Sentence(String subj, String verb, String obj) {
    this.subj = subj;
    this.verb = verb;
    this.obj = obj;
  }

  public String represent() {
    return String.format("%s %s %s", subj, verb, obj);
  }

  @Override
  public String toString() {
    return String.format("Sentence:[%s]", represent());
  }
}

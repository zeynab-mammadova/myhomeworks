package az.company.classes.lesson21;

public class InvertString {
  // contains only [a-zA-Z]
  // abc -> ABC
  // aBc -> AbC
  // Abc -> aBC
  // 1.

  // 2. NO if. NO tern op.
  public String invert(String origin)
    {
      char[] chars = origin.toCharArray();
      for (int i = 0; i < chars.length; i++) {
        chars[i] = Character.isUpperCase(chars[i]) ? Character.toLowerCase(chars[i]) : Character.toUpperCase(chars[i]);
      }
      return new String(chars);
    }


  }
package az.company.classes.lesson24;

public class IsPalindrome {
  public static boolean check(int n) {
    int sum = 0;
    int rem;
    int first = n;
    while (n > 0) {
      rem = n % 10;
      sum = sum * 10 + rem;
      n /= 10;
    }
    if (first == sum) {
      return true;
    }
    return false;
  }

}

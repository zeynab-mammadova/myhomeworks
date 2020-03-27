package az.company.classes.lesson24;

import java.util.Arrays;
import java.util.Random;

public class BinarySearchApp {
  static int[] data = new Random().ints(0, 10000).limit(1000).toArray();
  static int[] sorted = data.clone();

  // count number of `if` statements
  // executed to find the given element
  static int find_conventional(int[] origin, int number)
  {
    int counter=0;
    for (int value : origin) {
      counter++;
      if (value == number) break;
    }
    return counter;
  }

  // count number of `if` statements
  // executed to find the given element
  static int find_binary(int[] origin, int number) {
    int checks=0;
    int l = 0;
    int r = origin.length - 1;
    while(l < r) {
      checks++;
      int m = (l + r) / 2;
      if (origin[m] == number) break;
      if (number > origin[m]){
        l = m + 1;
      }
      else r = m - 1;{
      }
    }
    return checks;
  }

  static boolean find_conventional1(int[] origin, int number) {
    int counter = 0;
    for (int el: origin) {
      counter++;
      if (el == number) return true;
    }
    return false;
  }

  // count number of `if` statements
  // executed to find the given element
  // we need to return `boolean` and `index` and `count`
  static boolean find_binary1(int[] origin, int number) {
    int checks = 0;
    int l = 0;
    int r = origin.length - 1;
    while (l < r) {
      checks++;
      int m = (l + r) / 2;
      if (number == origin[m]) return true;
      if (number > origin[m]) l = m + 1;
      else r = m - 1;
    }
    return false;
  }

  static int find_conventionalId(int[] origin, int number) {
    int counter = 0;
    for (int i = 0; i < origin.length; i++) {
      if(origin[i]==number) return i;
    }
    return -1;
  }

  // count number of `if` statements
  // executed to find the given element
  // we need to return `boolean` and `index` and `count`
  static int find_binaryId(int[] origin, int number) {
    int checks = 0;
    int l = 0;
    int r = origin.length - 1;
    while (l < r) {
      checks++;
      int m = (l + r) / 2;
      if (number == origin[m]) return m;
      if (number > origin[m]) l = m + 1;
      else r = m - 1;
    }
    return -1;
  }


  public static void main(String[] args) {
    Arrays.sort(sorted);
//    System.out.println(Arrays.toString(data));
//    System.out.println(Arrays.toString(sorted));
    int rnd = (int) (Math.random()*10000);
    int count1 = find_conventional(data, rnd);
    int count2 = find_binary(sorted, rnd);
    System.out.println(count1);
    System.out.println(count2);
  }
}

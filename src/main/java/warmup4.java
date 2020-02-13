public class warmup4 {

    public static boolean isCapital(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static boolean isSmall(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean isLetter(char c) {
        return isCapital(c) || isSmall(c);
    }

    public static boolean isVowel(char c) {
        final String vowels = "aeoiu";
        return vowels.indexOf(Character.toLowerCase(c)) >= 0;
    }

    public static boolean isConsonant(char c) {
        return !isVowel(c);
    }
    public static String alphabetSmall() {
        StringBuilder alpha = new StringBuilder();
        for (int i = 'a'; i <= 'z'; i++) {
            alpha.append((char)i);
        }
        return alpha.toString();
    }

    public static String alphabetCapital() {
        return alphabetSmall().toUpperCase();
    }
public static String mixedCapital(){
        return alphabetCapital()+alphabetSmall();
}
//public static String vowelSmall(){
//
//}
    public static void main(String[] args) {

        System.out.println(alphabetSmall());
        System.out.println(alphabetCapital());
        System.out.println(mixedCapital());
    }


}

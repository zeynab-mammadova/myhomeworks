//package az.company.classes.lesson13;
//
//import java.util.Optional;
//
//public class StrToIntApp {
//    static Optional<Integer> strToInt(String raw) {
//        try {
//            Optional.of(Integer.parseInt(raw));
//        } catch (NumberFormatException ex) {
//            return Optional.empty();
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Optional<Integer> value1 = strToInt("123");
//        Optional<Integer> value2 = strToInt("123q");
//    }
//
//}

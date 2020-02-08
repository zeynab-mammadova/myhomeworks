import java.util.Scanner;

public class AAA {
    public static void main(String[] args) {
        System.out.println("Hello what is your name?");
        Scanner in= new Scanner(System.in);
        String name= in.next();
        System.out.println("Hello "+ name);
        System.out.println("Nice to meet you "+ name);
        System.out.println("Bye "+ name);
        System.out.println("How old are you? ");
        Scanner inp= new Scanner(System.in);
        int old= in.nextInt();
        if (old<18){
            System.out.println("Go to the cinema");
        }
        else
            System.out.println("Go to the club");

    }
}

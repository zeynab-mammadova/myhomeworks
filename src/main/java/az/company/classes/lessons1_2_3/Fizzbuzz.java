package az.company.classes.lessons1_2_3;

import java.util.Scanner;
public class Fizzbuzz {
    public static void main(String[] args) {
        for(int i=0;i<30;i++){

            if(i%2==0){
                System.out.println("Fizz");
            }
            if(i%3==0){
                System.out.println("Buzz");
            }
            if(i%2==0 && i%3==0){
                System.out.println("FIZZBUZZ");
            }
        }


        }
    }



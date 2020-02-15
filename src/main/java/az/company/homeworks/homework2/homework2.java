package az.company.homeworks.homework2;

import java.util.*;
public class homework2 {
    public static <string> void main(String[] args) {
        System.out.println(" All set. Get ready to rumble!");
        String[][] square = new String[5][5];
        int i;
        int j;
        for ( i = 0; i < 5; i++) {
            for ( j = 0; j < 5; j++) {
                square[i][j] = "-|";
            }
        }
        while(true) {
            System.out.println();
            for (i = 0; i < 5; i++) {
                for ( j = 0; j < 5; j++) {
                    System.out.print(square[i][j] + "\t");
                }
                System.out.println("\t");
            }
            Random row = new Random();
            int resultRow = row.nextInt(5);
            Random col = new Random();
            int resultCol = col.nextInt(5);
            System.out.println("Enter a line for fire");
            Scanner r = new Scanner(System.in);
            int line = r.nextInt();
            System.out.println("Enter a bar for fire");
            Scanner c = new Scanner(System.in);
            int bar = c.nextInt();
            if(line>0 && line<5 && bar>0 && bar<5){
            if(line!=resultRow && bar!=resultCol){
                square[line][bar]="*|";
            }
            else{
                square[line][bar]="x|";
                for (i = 0; i < 5; i++) {
                    for ( j = 0; j < 5; j++) {
                        System.out.print(square[i][j] + "\t");
                    }
                    System.out.println("\t");

                }
                System.out.println(" You have won!");  break;  }
            }
            else{
                System.out.println("Please enter the number in [0 5) interval");
            }
        }

    }

}
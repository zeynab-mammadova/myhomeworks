import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the width of array:");
        int width = in.nextInt();
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the width of array:");
        int height = inp.nextInt();
        int[][] array = new int[width][height];
        for (int row = 1; row <= width; row++) {
            for (int col = 1; col <= height; col++) {
                if (row == 1 || row == width || col == 1 || col == height) {
                    System.out.print(1);
                } else {
                    System.out.print(2);
                }
            }
        }
        for (int row = 1; row <= width; row++) {
            for (int col = 1; col <= height; col++) {
                System.out.print(array[row][col]);
            }
            System.out.println("\t");
        }
    }
}
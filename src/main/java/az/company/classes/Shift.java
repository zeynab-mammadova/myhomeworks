package az.company.classes;

import java.util.Scanner;
public class Shift {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int SIZE = in.nextInt();
        int[] array = new int[SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200 - 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i=0;i<array.length;i++){
            if (array[i] > 0) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] > 0) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }System.out.print(array[i]+" ");
        }
        for (int i = 1; i <array.length ; i++) {
            for (int j = 0; j < i; j++) {
                if(array[j]<0){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

    }
}
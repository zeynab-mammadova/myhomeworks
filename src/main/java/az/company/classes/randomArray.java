package az.company.classes;

public class randomArray {
    public static void main(String[] args) {
        int MAX = 200;
        int a, b, c, d;
        a = 0;
        b = 0;
        c = 0;
        d = 0;


        int r;
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            r = (int) (Math.random() * (MAX)) - 100;
            array[i] = r;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] < 0) {
                a++;

            }
            if (array[i] % 2 != 0 && array[i] > 0) {
                b++;

            }
            if (array[i] % 2 == 0 && array[i] < 0) {
                c++;

            }
            if (array[i] % 2 == 0 && array[i] > 0) {
                d++;

            }
        }

            int[] array1 = new int[a];
            int[] array2 = new int[b];
            int[] array3 = new int[c];
            int[] array4 = new int[d];
            System.out.println("odd negative\n");
            for (int i = 0; i < a; i++) {
                array1[a] = array1[i];
                System.out.print(array1[i] + " ");
            }
            System.out.println("\nodd positive\n");
            for (int i = 0; i < b; i++) {
                array2[b] = array2[i];
                System.out.print(array2[i] + " ");
            }
            System.out.println("\neven negative\n");
            for (int i = 0; i < c; i++) {
                array3[c] = array3[i];
                System.out.print(array3[i] + " ");
            }
            System.out.println("\neven positive\n");
            for (int i = 0; i < d; i++) {
                array4[a] = array4[i];
                System.out.print(array3[i] + " ");
            }
        }

    }

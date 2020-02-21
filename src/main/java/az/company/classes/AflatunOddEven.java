package az.company.classes;

import java.util.Random;
public class AflatunOddEven {

    public static int[] fill(int[] array){
        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*100);
        }
        return array;
    }
    public static int[] combine(int[] array1,int[] array2){
        int[] array3=new int[array1.length+array2.length];
        int a=0;
        for(int i:array1){
            array3[a]=i;
            a+=2;
        }
        int b=1;
        for(int i:array2){
            array3[b]=i;
            b+=2;
        }
        return array3;
    }

    public static void main(String[] args) {
        Random random=new Random();
        final int length=5;
        int[] array1=new int[length];
        int[] array2=new int[length];
        int[] array3=new int[length*2];
        array1=fill(array1);
        array2=fill(array2);
        array3=combine(array1,array2);

        // PRINTING OUT ///////////////////
        for(int i=0;i<length;i++){
            System.out.print(array1[i]+"  ");
        }
        System.out.println();
        for(int i=0;i<length;i++){
            System.out.print(array2[i]+"  ");
        }
        System.out.println();
        for(int i:array3){
            System.out.print(i+" ");
        }
        ///////////////////////////////
    }
}
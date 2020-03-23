package az.company.classes.lesson22;

import java.util.Random;

public class TheSum {
    private static int sum=0;

    static int sum (int[] array,int index,int length)
    {
        if(index<length){
            sum+=array[index];
            sum(array,index+1,length);
        }
        else{
            return sum;
        }
        return sum;

    }


    public static void main(String[] args) {
        int[] array = new Random().ints(1, 10)
                .limit(10).toArray();
        System.out.println(sum(array,0,array.length));
    }
}

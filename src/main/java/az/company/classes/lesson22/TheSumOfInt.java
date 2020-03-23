package az.company.classes.lesson22;

import java.util.Random;

public class TheSumOfInt {

    public static int sumr(int num)
    {
        if (num <= 1)
            return num;
        return num + sumr(num - 1);
    }


    public static void main(String args[])
    {
        int num = 10;
        System.out.println(sumr(num));
    }


}

package az.company.classes.lesson11;

public class Map2 {
    static void countNum(String str)
    {
        int[] count = new int[256];

        int len = str.length();

        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

        char[] ch = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {

                if (str.charAt(i) == ch[j])
                    find++;
            }

            if (find == 1)
                System.out.println(count[str.charAt(i)] +":"+str.charAt(i) );
        }
    }
    public static void main(String[] args)
    {
        String str = "Hello world";
        countNum(str);
    }
}


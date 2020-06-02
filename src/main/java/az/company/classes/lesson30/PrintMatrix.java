package az.company.classes.lesson30;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintMatrix {
    public static String dataOrdered(int R, int C, int[][] m) {
        return IntStream.range(0, R*C).map(idx -> {
            int col = idx / R;
            int shift = idx - R * col;
            int r = (col&1)==0 ?  R-1-shift :shift;
            return m[r][col];
        })
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        int[][]a =
                {
                        {  1,  2,  3 },
                        {  5,  6,  7 },
                        {  9, 10, 11 },
                        { 13, 14, 15 },
                        { 17, 18, 19 },
                        { 21, 22, 23 },
                };
        System.out.println(dataOrdered(a.length, a[0].length, a));

    }
}

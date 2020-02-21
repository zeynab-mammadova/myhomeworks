package az.company.classes.lesson3;

import java.util.Scanner;
public class warmup3 {
    public static void main(String[] args) {
        System.out.println("Please enter the height: ");
Scanner h=new Scanner(System.in);
final int height=h.nextInt();
        System.out.println("Please enter the width: ");
        Scanner w= new Scanner(System.in);
        final int width= w.nextInt();
        double tan=((double)width)/height;
        StringBuilder envelope=new StringBuilder();
        for(int i=1;i<=height;i++){
            for (int j=1;j<=width;j++){
                if (i == 1 || i == height || j== 1 || j == width|| j==(int)(i*tan) ||width-j==(int)(i*tan )) {
                    envelope.append("*");
                }
                else{
                   envelope.append(" ");
            }
        }
        envelope.append("\n");
        }
        System.out.println(envelope);
    }
}

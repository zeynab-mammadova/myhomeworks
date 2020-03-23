package az.company.classes.lesson22;

public class Fibonacci {

    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return fibonacci(n-2) + fibonacci(n-1);
    }
    public static void main(String args[]) {
        int n = 10;
        for(int i = 0; i < n; i++){
            System.out.print(fibonacci(i) +" ");
        }
    }
}

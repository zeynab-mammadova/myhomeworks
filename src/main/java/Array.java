public class Array {
    public static void main(String[] args) {
        int MAX =20;
        int r;
        r=(int)(Math.random()*(MAX+1));
        int []array=new int[20];
        for(int i=0;i<array.length;i++){
            array[i]=r=(int)(Math.random()*(MAX+1));
            System.out.println(array[i]);
        }

    }
}

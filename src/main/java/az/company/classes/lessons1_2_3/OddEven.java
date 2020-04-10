package az.company.classes.lessons1_2_3;

public class OddEven {
    public static void main(String[] args) {
        int[] Odd = new int[20];
        int[] Even = new int[20];
        int[] Mix=new int[Odd.length+Even.length];
        for (int i = 0; i < Even.length; i++) {
            Even[i] = (int) (Math.random() * (20));
            if(Even[i]%2==0) {
                System.out.print(Even[i]+" ");
            }
        }
        System.out.println();
        for(int j=0;j<Odd.length;j++){
            Odd[j]=(int) (Math.random() * (20));
            if (Odd[j]%2!=0){
                System.out.print(Odd[j]+" ");
            }
        }
        System.out.println();
        int a=0;
        for(int i:Even){
            Mix[a]=i;
            a+=2;
        }
        int b=1;
        for(int i:Odd){
            Mix[b]=i;
            b+=2;
        }
        for(int i:Mix){
            System.out.print(i+" ");
        }
    }
}
import java.util.Scanner;

public class C9581 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[] array=new int[a];
        for (int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
        }
        //
        int count=0;
int sum=0;
        while (count<array.length-1){
            count++;

            int sum1=0;
            int sum3=0;
            for (int i=0;i<count;i++){
                sum1=sum1+array[i];
                System.out.println(i);
            }
            for (int i=count;i<array.length;i++){
                sum3=sum3+array[i] ;
            }

            sum=Math.max(sum,((sum1%b)+(sum3%b)));
        }
        System.out.println(sum);
    }
}

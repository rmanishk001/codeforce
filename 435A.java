import java.util.Scanner;
 
public class A435 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[] array=new int[a];
        for (int i=0;i< array.length;i++)
        {
            array[i]=sc.nextInt();
 
        }
        //
        int sum=0;
        int count=1;
        for (int i=0;i< array.length;i++) {
 
             if (sum+array[i]<=b)
             {
                 sum=sum+array[i];
             }else {
                 count++;
                 sum=array[i];
             }
        }
        //
        System.out.println(count);
    }
}

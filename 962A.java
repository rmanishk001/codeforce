import java.util.Scanner;

public class A962 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] array=new int[a];
        int count=0;
        int valu=0;
        int sum=0;
        for (int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
            sum=sum+array[i];
        }
        if (sum%2!=0)
        {
            sum=sum+1;
        }
        for (int i=0;i<array.length;i++)
        {
            count=count+array[i];
            if (count==sum/2)

            {
                valu=i+1;
                break;
            }
            if (count>=sum/2)
            {
                valu=i+1;
                break;
            }
        }
        System.out.println(valu);
    }
}

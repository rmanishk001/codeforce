import java.util.Scanner;

public class B347 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        int[] arrray=new int[a];
        for (int i=0;i<arrray.length;i++)
        {
            arrray[i]=sc.nextInt();
            if (arrray[i]==i)
            {
                count++;
            }
        }
        //
        int temp=0;
        for (int i=0;i<arrray.length;i++)
        {
            if (arrray[i]!=i)
            {
                if (arrray[arrray[i]]==i)
                {
                    count=count+2;temp++;
                    break;
                }
            }
        }
        if (temp==0 && count!=arrray.length)
        {
            count++;
        }
        System.out.println(count);
    }
}

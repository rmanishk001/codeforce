import java.util.Scanner;

public class B365 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        long[] array=new long[a];
        for (int i=0;i<array.length;i++)
        {
            array[i]=sc.nextLong();
        }
        //
        if (array.length==1)
        {
            System.out.println("1");
        }else {
            int count=0;
            int count2=2;
            for (int i=2;i< array.length;i++)
            {
                if (array[i]==(array[i-1]+array[i-2]))
                {
                    count2++;

                }else {
                    count=Math.max(count,count2);
                    count2=2;
                }
            }                    count=Math.max(count,count2);

            System.out.println(count);

        }
    }
}

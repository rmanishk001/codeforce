
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B15557 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i=0;i<a;i++)
        {
            int b=sc.nextInt();
            int c=sc.nextInt();
            int[] array=new int[b];
            int[] array2=new int[b];
            for (int j=0;j<array.length;j++)
            {
                array[j]=sc.nextInt();
                array2[j]=array[j];
            }
            Arrays.sort(array2);
            int count=1;
            Map<Integer,Integer> firsy=new HashMap<>();
            for (int j=0;j<array.length;j++)
            {
                firsy.put(array2[j],j );
            }
            for (int j=0;j<array.length-1;j++)
            {
                int l=firsy.get(array[j]);
                if (l!= array.length-1)
                {
                    if (array[j+1]!=array2[l+1])
                    {
                        count++;
                    }
                }else {
                    count++;
                }
            }
            if (count<=c)
            {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }

    }
}

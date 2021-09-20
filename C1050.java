import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C1050 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        long[] array=new long[a];
        long[] array2=new long[a];
        long count=0;
        long count3=0;
        Map<Integer,Long> hash=new HashMap<>();
        for (int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
            array2[i]=sc.nextInt();
            count=count+array2[i];
            Long count2=array[i]-array2[i];
            hash.put(i,count2);

            count3=count3+array[i];

        }
        if (count>b)
        {
            System.out.println("-1");
        }else if (b==count)
        {
            System.out.println(b);
        }else {
            int main=0;
            while (true) {
                int key = 0;
                long valu = 0;
                if (count3<=b){
                    System.out.println(main);
                    break;
                }
                for (int i = 0; i < hash.size(); i++) {
                    if (hash.get(i) > valu) {
                        valu = hash.get(i);
                        key = i;
                    }
                }
                count3=count3-hash.get(key);
                hash.put(key,(long)0);
                main++;

            }

        }




    }
}

import java.util.Scanner;

public class B554 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String[] array=new String[a];
        for (int i=0;i<array.length;i++)
        {
            array[i]=sc.next();
}
        int count=0;
        for (int i=0;i<array.length;i++)
        {
            int countr2=0;
            for (int j=0;j<array.length;j++)
            {
                if (array[i].equals(array[j]))
                {
                    countr2++;
                }
            }
            if (countr2>count)
            {
                count=countr2;
            }

        }
        System.out.println(count);
    }
}

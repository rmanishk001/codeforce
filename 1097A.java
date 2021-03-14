import java.util.Scanner;
 
public class A1097 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String[] array=new String[5];
        for (int i=0;i<array.length;i++)
        {
            array[i]=sc.next();
        }
        //
        char f=a.charAt(0);
        char s=a.charAt(1);
        int count=0;
        for (int i=0;i<array.length;i++)
        {
            for (int j=0;j<2;j++)
            {
                if (array[i].charAt(j)==f || array[i].charAt(j)==s)
                {
                    count++;
                }
            }
 
        }
        if (count>0)
        {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
 
    }
 
}

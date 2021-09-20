import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B988 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String[] array=new String[a];
        for (int i=0;i< array.length;i++)
        {
            array[i]=sc.next();
        }
        sorarray(array);
        if (isand(array)==true)
        {
            System.out.println("YES");
            for (var list :array) {
                System.out.println(list);

            }
        }else {
            System.out.println("NO");
        }

    }


    public static boolean patenmatching(String a,String b)
    {
        Pattern p= Pattern.compile(a);
        Matcher m=p.matcher(b);
        if (m.find()==true)
        {
            return true;
        }
        return false;


    }

    public static boolean isand(String[] arra)
    {

        for (int i=0;i<arra.length;i++)
        {
            for (int j=i+1;j<arra.length;j++)
            {
                if (i!=j)
                {
                    if (patenmatching(arra[i],arra[j] )!=true){
                        return false;
                    }
                }
            }
        }
        return true;
    }


    public static void sor(String[] array)
    {
        for (int i=0;i< array.length-1;i++)
        {
            if (array[i].length()>array[i+1].length())
            {
              swap(i,i+1,array);
            }
        }
    }
    public static void swap(int  a,int b ,String[] array)

    {
        var tem=array[a];
        array[a]=array[b];
        array[b]=tem;

    }

    public static void sorarray(String[] array)
    {
        for (int i=0;i<array.length;i++)
        {
            sor(array);
        }
    }
}

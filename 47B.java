
import java.util.Arrays;
import java.util.Scanner;

public class B47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        String c=sc.next();
        int aa=0;
        int bb=0;
        int cc=0;
        if (a.charAt(1)=='>')
        {
            if (a.charAt(0)=='A')
            {
                aa++;
            }else if (a.charAt(0)=='B')
            {
                bb++;
            }else if (a.charAt(0)=='C')
            {
                cc++;
            }
            //


        }else {
            if (a.charAt(2)=='A')
            {
                aa++;
            }else if (a.charAt(2)=='B')
            {
                bb++;
            }else if (a.charAt(2)=='C')
            {
                cc++;
            }


        }
        //

        if (b.charAt(1)=='>')
        {

            if (b.charAt(0)=='A')
            {
                aa++;
            }else if (b.charAt(0)=='B')
            {
                bb++;
            }else if (b.charAt(0)=='C')
            {
                cc++;
            }
            //


        }else {
            if (b.charAt(2)=='A')
            {
                aa++;
            }else if (b.charAt(2)=='B')
            {
                bb++;
            }else if (b.charAt(2)=='C')
            {
                cc++;
            }


        }
        //


        //
        if (c.charAt(1)=='>')
        {

            if (c.charAt(0)=='A')
            {
                aa++;
            }else if (c.charAt(0)=='B')
            {
                bb++;
            }else if (c.charAt(0)=='C')
            {
                cc++;
            }
            //


        }else {
            if (c.charAt(2)=='A')
            {
                aa++;
            }else if (c.charAt(2)=='B')
            {
                bb++;
            }else if (c.charAt(2)=='C')
            {
                cc++;
            }


        }
        //

     int[] array=new int[3];
     array[0]=aa;
     array[1]=bb;
     array[2]=cc;

     if (aa==bb ||  bb==cc)
     {
         System.out.println("Impossible");
     }else {
         Arrays.sort(array);
         for (int i = 0; i < array.length; i++) {
             if (array[i] == aa) {
                 System.out.print("A");
             } else if (array[i] == bb) {
                 System.out.print("B");
             } else {
                 System.out.print("C");
             }
         }
     }


    }
}

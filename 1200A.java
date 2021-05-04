import java.util.Scanner;

public class A1200 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] array=new int[10];
       String valu=sc.next();
       for (int i=0;i<a;i++)
       {
           if (valu.charAt(i)=='L')
           {
               for (int j=0;j<array.length;j++)
               {
                   if (array[j]==0)
                   {
                       array[j]=1;
                       break;
                   }
               }
           }else if (valu.charAt(i)=='R')
           {
               for (int j=array.length-1;j>=0;j-- )
               {
                   if (array[j]==0)
                   {
                       array[j]=1;
                       break;
                   }
               }
           }else {
               int aa= Integer.parseInt(String.valueOf(valu.charAt(i)));
           array[aa]=0;
           }
       }
       for (int j=0;j< array.length;j++)
       {
           System.out.print(array[j]);
       }
    }
}

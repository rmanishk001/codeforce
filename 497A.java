import java.util.Arrays;
import java.util.Scanner;
 
public class A479 {
   public static void main(String args[])
 
   {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       int[] array=new int[5];
       int j=0;
       array[j]=a+b*c;
       j++;
       array[j]=a*(b+c);
       j++;
       array[j]=a*b*c;
       j++;
       array[j]=(a+b)*c;
       j++;
       array[j]=a+b+c;
 
       Arrays.sort(array);
       System.out.println(array[array.length-1]);
   }
    }

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class B637 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
    String[] array=new String[a];
    for (int i=0;i<array.length;i++)
    {
        array[i]=sc.next();
    }
    Map<String,Integer> k=new HashMap<>();
   for (int i= array.length-1;i>=0;i--)
   {
       if (k.containsKey(array[i]))
       {
 
       }else {
           System.out.println(array[i]);
    k.put(array[i],i);   }
 
   }
 
    }
}

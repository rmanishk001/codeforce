import java.util.LinkedList;
import java.util.Scanner;

public class B427 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
     LinkedList<Integer> list=new LinkedList<>();
     long[] array=new long[a];
     for (int i=1;i<=a;i++)
     {
         array[i-1]=sc.nextLong();
         if (array[i-1]>b)
         {
             list.add(i);
         }
     }
     int count=0;
     if (list.isEmpty()==true)
     {
         int count2=0;
         for (int i=0;i<array.length;i++){
             if (array[i]>b){
                 count2++;
             }
         }
         if (count2>0)
         {
             System.out.println("0");
         }else {
             System.out.println((a - c) + 1);
         }
     }else {

         count = count + Math.max((list.get(0) - c) , 0);
         for (int i = 1; i < list.size(); i++) {
             int kk = list.get(i) - list.get(i - 1) - 1;
             count = count + Math.max((kk - c) + 1, 0);
         }
         int ll=a-list.get(list.size()-1);
         if (list.size()>1) {
             count = count + Math.max((ll - c) + 1, 0);
         }
         System.out.println(count);
     }
    }
}

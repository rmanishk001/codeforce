import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class C4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       Map<String, Integer> database=new HashMap<String,Integer>();
String s;
       for (int i=0;i<a;i++)
       {
         s=sc.next();
           if (!database.containsKey(s))
           {
               System.out.println("OK");
               database.put(s,1);
           }else {
               System.out.println(s+database.get(s));
               int count=database.get(s);
               database.put(s,count+1);
           }
      }
 
    }
}

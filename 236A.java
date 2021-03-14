import java.util.Scanner;
 
public class A236 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int count=0;
        for (int i=0;i<a.length();i++) {
            int count2 = 0;
            char s = a.charAt(i);
 
            for (int k = 0; k < i; k++) {
                if (s == a.charAt(k)) {
                    count2++;
 
                }
            }
            if (count2 == 0) {
 
                for (int j = i + 1; j < a.length(); j++) {
                    if (s == a.charAt(j)) {
                        count++;
 
                    }
                }
            }
        }
 
        int c=a.length()-count;
        if (c%2==0)
        {
            System.out.println("CHAT WITH HER!");
        }
        else
            System.out.println("IGNORE HIM!");
    }
}

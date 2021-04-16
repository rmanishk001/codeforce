
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String value1 = sc.next();
        int count4=0;
        for (int i=0;i<value1.length();i++) {
            if (value1.charAt(i) == '*') {
                count4++;
                break;
            }
        }
        String value2 = sc.next();
        if (count4==0) {
            if (value1.equals(value2))
            {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }else {
            
        if (a>b+1)
        {
            System.out.println("NO");
        }else {
            int count1=0;
            int count2=0;
            int count3=0;

            for (int i=0;i<value1.length();i++)
            {
                if (value1.charAt(i)!='*')
                {
                    if (value1.charAt(i)!=value2.charAt(i))
                    {
                        count1++;
                    }
                }else {
                    break;
                }
            }
            for (int i=value1.length()-1,j=value2.length()-1;i>=0;i--,j--)
            {
                if (value1.charAt(i)!='*')
                {
                    if (value1.charAt(i)!=value2.charAt(j))
                    {
                        count2++;
                    }
                }else {
                    break;
                }
        }
            if (count1>0 || count2>0)
            {
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
        }

    }
}}

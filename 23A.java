import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class A23 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String va=sc.next();
        int count = 0;
 
        for (int j=0;j<va.length();j++) {
            for (int i = j; i < va.length(); i++) {
                String a = va.substring(j, i + 1);
                String b = va.substring(j+1, va.length());
                Pattern p = Pattern.compile(a);
                Matcher m = p.matcher(b);
                if (m.find()) {
                    if (a.length()>count) {
                        count = a.length();
                    }
                }
            }
        }
        System.out.println(count);
    }
 
}



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Scanner;

public class A66 {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        BigDecimal a=new BigDecimal(name);

       BigDecimal h=new BigDecimal(127);
       int ss=a.compareTo(h);
       BigDecimal in=new BigDecimal(32767);
       BigDecimal lo=new BigDecimal(2147483647);
       double k=9223372036854775807.0;
       BigDecimal ll=new BigDecimal(k);
if (a.compareTo(h)==0 || a.compareTo(h)==-1)
{
    System.out.println("byte");
}else if (a.compareTo(in)==0 || a.compareTo(in)==-1)
{
    System.out.println("short");
}else if (a.compareTo(lo)==0 || a.compareTo(lo)==-1)
{
    System.out.println("int");
}else if (a.compareTo(ll)==-1)
{
    System.out.println("long");
}else {
    System.out.println("BigInteger");
}

    }
}

import java.util.Scanner;
 
public class A108 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int a=Integer.parseInt(name.charAt(0)+""+name.charAt(1));
        int b=Integer.parseInt(name.charAt(3)+""+name.charAt(4));
        //
 
        for (int i=1;;i++)
        {
            b++;
            if (b%60==0)
            {
                a++;
                b=b%60;
            }
            a=a%24;
 
            String value1="";
            String valu2="";
 
            if (a<10)
            {
                value1="0"+String.valueOf(a);
            }else {
                value1=String.valueOf(a);
            }
            //
            if (b<10)
            {
                valu2="0"+String.valueOf(b);
            }else {
                valu2=String.valueOf(b);
            }
            //
            int count=0;
            for (int j=0,k=1;j<2;j++,k--)
            {
                if (value1.charAt(j)==valu2.charAt(k))
                {
                    count++;
                }
            }
            if (count==2)
            {
                System.out.println(value1+":"+valu2);
                break;
            }else {
            }
           }
    }
}

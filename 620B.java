import java.util.Scanner;

public class B620 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(ans(a,b));

    }

    public static int ans(int a,int b)
    {
        int count=0;
        for (int i=a;i<=b;i++)
        {
            String m=String.valueOf(i);
            for (int j=0;j<m.length();j++)
            {
                count=count+valu(m.charAt(j));
            }
        }
        return count;
    }
    public static int  valu(char m)
    {
        if (m=='0')
        {
            return 6;
        }else if (m=='1')
        {
            return 2;
        }else if (m=='2')
        {
            return 5;
        }else if (m=='3')
        {
            return 5;
        }else if (m=='4')
        {
            return 4;
        }else if (m=='5')
        {
            return 5;
        }else if (m=='6')
        {
            return 6;
        }else if (m=='7')
        {
            return 3;
        }else if (m=='8')
        {
            return 7;
        }else if (m=='9')
        {
            return 6;
        }
        return 0;
    }
}

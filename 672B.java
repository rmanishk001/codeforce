import java.util.Scanner;
 
public class B627 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String name=sc.next();
        int count=0;
        for (int i=0;i<name.length();i++)
        {
            int count2=0;
            for (int j=0;j<i;j++)
            {
                if (name.charAt(i)==name.charAt(j))
                {
                    count2++;
                    break;
                }
            }
 
            if (count2>0)
            {
                count++;
            }
        }
        if (name.length()>26) {
           
 
                System.out.println("-1");
            }
        else {
            System.out.println(count);
        }
    }
}

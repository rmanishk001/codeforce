import java.util.Scanner;
 
public class A1060 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String input=sc.next();
        int length=0;
        for (int i=0;i<input.length();i++)
        {
            if (Integer.parseInt(String.valueOf(input.charAt(i)))==8)
            {
                length++;
            }
        }
        if (length>0)
        {
            int k=a/11;
 
            if ((length-2)==a)
            {
                System.out.println("0");
            }else {
                if (k > length) {
                    System.out.println(length);
                } else {
                    System.out.println(k);
                }
            }
 
 
        }else {
            System.out.println("0");
        }
    }
}

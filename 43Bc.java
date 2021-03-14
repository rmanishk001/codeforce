
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class B43 {
    public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String name= br.readLine();
        String name2=br.readLine();
        char[] array=name.toCharArray();
        int count=0;
        int count2=0;
        boolean[] array2=new boolean[array.length];
        for (int i=0;i<name2.length();i++)
        {
            if (name2.charAt(i)!=' ') {
                count2++;
                for (int j = 0; j < array.length; j++) {
                    if (array2[j]!=true) {
                        if (name2.charAt(i) == array[j]) {
                            count++;
                            array2[j]=true;
                            break;

                        }
                    }

                }

            }
        }
        if (count==count2)
        {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}

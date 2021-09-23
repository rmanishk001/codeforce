import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String[] array=new String[a];
        String[] array2=new String[a];
        for (int i=0;i<array2.length;i++)
        {
            array[i]=sc.next();
            array2[i]=sc.next();
        }
        int count2=0;
        boolean[] array3=new boolean[a];
        for (int i=0;i<array.length;i++){
            if (array3[i]!=true)
            {
                count2++;

                String cur=array2[i];
                while (true){
                    int count=0;
                    for (int j=0;j<array.length;j++)
                    {
                        if (array3[j]!=true) {
                            if (cur.equals(array[j])) {
                                array3[j]=true;
                                cur=array2[j];
                                count++;
                                break;

                            }
                        }
                    }
                    if (count==0)
                    {
                        break;
                    }
                }
            }
        }
        System.out.println(count2);
        boolean[] array4=new boolean[a];
        for (int i=0;i<array.length;i++){
            if (array4[i]!=true)
            {
                System.out.print(array[i]+" ");
                count2++;

                String cur=array2[i];
                while (true){
                    int count=0;
                    for (int j=0;j<array.length;j++)
                    {
                        if (array4[j]!=true) {
                            if (cur.equals(array[j])) {
                                array4[j]=true;
                                cur=array2[j];
                                count++;
                                break;

                            }
                        }
                    }
                    if (count==0)
                    {
                        break;
                    }
                }
                System.out.print(cur+"\n");
            }
        }




        }
    }


import java.util.Scanner;

public class B66 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] array=new int[a];
        for (int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        int count2=1;
        for (int i=1;i<array.length-1;i++)
        {
            int count=1;
            int count3=array[i];
            for (int j=i-1;j>=0;j--)
            {
                if (array[j]<=count3){
                    count3=array[j];
                    count++;
                }else {
                    break;
                }
            }
            //
            count3=array[i];
            for (int j=i+1;j<array.length;j++)
            {
                if (array[j]<=count3)
                {
                    count3=array[j];
                    count++;

                }else {
                    break;
                }
            }
            count2=Math.max(count,count2);
        }
        //
        int count=1;
        int cont3=array[0];
        for (int i=1;i< array.length;i++)
        {
            if (cont3>=array[i])
            {
                cont3=array[i];
             count++;
            }else {
                break;
            }
        }
        //
        count2=Math.max(count,count2);
        count=1;
        cont3=array[array.length-1];

        for (int i=array.length-2;i>=0;i--)
        {
            if (cont3>=array[i])
            {
                cont3=array[i];
                count++;
            }else {
                break;
            }
        }
        count2=Math.max(count,count2);
        System.out.println(count2);

    }
}

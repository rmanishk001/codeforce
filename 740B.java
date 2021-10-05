import java.util.Scanner;

public class B740 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[] array=new int[a];
        for (int i=0;i< array.length;i++){
            array[i]=sc.nextInt();

        }
        //
        int[] array2=new int[array.length];
        for (int i=0;i<array2.length;i++){
            array2[i]=0;

        }
        int sum=0;
        while (b>0){
            int c=sc.nextInt();
            int d=sc.nextInt();
            int sum2=0;
            for (int i=c-1;i<d;i++){
                int k=1;
                if (array2[i]!=0){
                    k=array2[i];
                }
                sum2=sum2+(array[i]*k);
            }
            if (sum2>0){

                for (int j=c-1;j<d;j++){

                    array2[j]=array2[j]+1;
                }
            }
            b--;
        }
        int final2=0;
        for (int j=0;j<array.length;j++){

            final2=final2+array[j]*array2[j];
            
        }
        System.out.println(final2);

    }

}

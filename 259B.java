import java.util.Scanner;

public class B259 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] array=new int[3][3];
        int m=0;
        for (int i=0;i<array.length;i++)
        {
            for (int j=0;j< array.length;j++)

            {
                array[i][j]=sc.nextInt();
                m=Math.min(array[i][j],m);
            }
        }
        //
int count=0;
        for (int i=1;;i++){
            for (int j=i;j>=1;j--)
            {
                for (int k=j;k>=1;k--)
                {
                    array[0][0]=i;
                    array[1][1]=j;
                    array[2][2]=k;
                    int l=array[0][0]+array[1][1]+array[2][2];


                    int f=array[0][0]+array[0][1]+array[0][2];
                    int fs=array[1][0]+array[1][1]+array[1][2];
                    int tt=array[0][2]+array[1][2]+array[2][2];
                    int kk=array[0][2]+array[1][1]+array[2][0];
                    int kkk=array[2][0]+array[2][1]+array[2][2];
                    int midd=array[1][0]+array[1][1]+array[1][2];

                    if (l==f && l==fs && l==tt && l==kk && l==kkk && l==midd) {

                        count++;
                        break;
                    }
                }
                if (count>0){
                    break;
                }
            }
            if (count>0)
            {
                break;
            }
        }
        for (int i=0;i<array.length;i++)
        {
            for (int j=0;j<array.length;j++)
            {
                System.out.print(array[i][j]+" ");

            }
            System.out.println();
        }
    }
}

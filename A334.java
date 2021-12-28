import java.util.Scanner;

public class A334{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=a;
        int f=1;
        int last=a*a;


     while(c>0){
        
         int count2=0;
         for(int i=f;i<a*a;i++){
             System.out.print(i+" ");
             count2++;
             f++;
             if(count2==a/2){
                 break;
             }
         }

         int count=0;

         for(int i=last;i>=0;i--){
             System.out.print(i+" ");
             
             last--;
             count++;

             if(count==a/2){
                 break;

             }
         }
         System.out.println();

        c--;

     }
    }
}

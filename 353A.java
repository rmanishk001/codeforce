import java.util.Scanner;

public class A353 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] array = new int[a];
        int[] array2 = new int[a];
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            array2[i] = sc.nextInt();
            count = count + array[i];
            count2 = count2 + array2[i];


        }
        if (a == 1) {
            if (count % 2 != 0 || count2 % 2 != 0) {
                System.out.println("-1");
            } else {
                System.out.println("0");
            }
        } else {
            if (count % 2 == 0 && count2 % 2 == 0) {
                System.out.println("0");
            } else if ((count + count2) % 2 != 0) {
                System.out.println("-1");
            } else {
                int count4 = 0;
                int count5=0;
                for (int i = 0; i < array.length; i++) {
                    if (count % 2 == 0 && count2 % 2 == 0) {
                       count5++;
                        break;
                    } else {
                        if (array[i] % 2 != 0 || array2[i] % 2 != 0) {
                            count = count - array[i];
                            count2 = count2 - array2[i];
                            int temp = array2[i];
                            array2[i] = array[i];
                            array[i] = temp;
                            count=count+array[i];
                            count2=count2+array2[i];
                        }
                    }
                }
                if (count%2==0 && count2%2==0)
                {
                    count5++;
                }
              if (count5>0)
              {
                  System.out.println("1");
              }else {
                  System.out.println("-1");
              }
            }
            //

        }
    }
}

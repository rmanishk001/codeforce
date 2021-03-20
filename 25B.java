
import java.util.Scanner;

public class B25 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String name = sc.next();
        if (a >= 2) {
            if (a % 2 == 0) {
                int aa = 2;
                for (int i = 0; i < name.length(); i++) {
                    if (aa == 0) {
                        System.out.print("-");
                        aa = 1;
                    } else {
                        aa--;
                    }
                    System.out.print(name.charAt(i));
                }
            } else {
                if (a > 3) {
                    System.out.print(name.charAt(0));
                    System.out.print(name.charAt(1));
                    System.out.print(name.charAt(2));
                    System.out.print("-");


                    int aa = 2;
                    for (int i = 3; i < name.length(); i++) {
                        if (aa == 0) {
                            System.out.print("-");
                            aa = 1;
                        } else {
                            aa--;
                        }
                        System.out.print(name.charAt(i));
                    }
                } else {
                    System.out.println(name);
                }
            }

            }else{
                System.out.println(name);
            }
        }
    }


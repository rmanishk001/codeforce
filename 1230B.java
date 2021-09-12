
public class B1230 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String valu=sc.next();
        if (a==b)
        {
            if (valu.length()==1)
            {
                System.out.println("0");
            }else {
                System.out.print("1");

                for (int i = 1; i < valu.length(); i++) {
                    System.out.print("0");
                }
            }
        }else if (b==0)
        {
            System.out.println(valu);
        }
        else {



                if (valu.charAt(0) != '1') {
                    System.out.print("1");
                    b--;

                } else {
                    System.out.print(valu.charAt(0));
                }





            for (int i=1;i<valu.length();i++){
                if (b>0 && Integer.parseInt(String.valueOf(valu.charAt(i)))>0){
                    System.out.print("0");
                    b--;
                }else {
                    System.out.print(valu.charAt(i));
                }

            }


        }
    }
}

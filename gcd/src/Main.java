import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int gcd = 1;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        System.out.println("enter the number:");
        int b=sc.nextInt();
        for(int i=1;i<=a && i<=b;i++)
        {
            if(a%i==0&&b%i==0)
                gcd=i;
        }
        System.out.println("the gcd is:"+gcd);

    }
}
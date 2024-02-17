import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check:");
        int x=sc.nextInt();
        int sqr=x*x;
        int sum=0;
        while(sqr>0)
        {
            int r=sqr%10;
            sum+=r;
            sqr/=10;
        }
        if(sum==x)
        {
            System.out.println(x+" is neon number ");

        }
        else
            System.out.println(x+" not a neon number");

    }
}
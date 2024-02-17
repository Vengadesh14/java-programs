import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st number:");
        int x= sc.nextInt();
        System.out.println("enter the 2nd number:");
        int y= sc.nextInt();
        //to find smallest number
        int ans=(x>y)?x:y;
        while (true)
        {
            if(ans%x==0 && ans%y==0)
                break;
            ans++;

        }
        System.out.println("lcm of "+x+ " and "+y+" is "+ans);

    }
}
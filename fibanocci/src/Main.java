import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int n1=sc.nextInt();
        System.out.println("enter the second number");
        int n2=sc.nextInt();
        System.out.print("enter the key");
        int count= sc.nextInt();
        System.out.println(n1+" "+n2);
        int n3;
        for(int i=2;i<count;i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);

        }

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("enter the binary number:");
        String x=sc.nextLine();
        System.out.println("enter the binary number:");
        String y= sc.nextLine();
        int num1=Integer.parseInt(x,2);
        int num2=Integer.parseInt(y,2);
        System.out.println("the binary of "+x+" is "+num1);
        System.out.println("the binary of "+y+" is "+num2);
        int num3=num1+num2;
        String result=Integer.toBinaryString(num3);
        System.out.println("the result is:"+result);
    }
}
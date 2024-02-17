import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string to reverse:");
        String a=sc.nextLine();
       // String rev=" ";
        StringBuffer sb;
        sb = new StringBuffer(String.valueOf(a));
        StringBuffer rev=sb.reverse();
        System.out.println("the reversed string is:"+rev);

    }
}
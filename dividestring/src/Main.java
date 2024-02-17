import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        int len=str.length();
        System.out.println("Enter the number of parts the string to be divided:");
        int n= sc.nextInt();
        String[] arr=new String [n];
        int temp=0,chars=len/n;
        if(len%n!=0)
        {
            System.out.println("This string cant be divided into "+n+" equal parts.");
        }
        else
        {
            for(int i=0;i<len;i=i+chars)
            {
                String part=str.substring(i,i+chars);
                arr[temp]=part;
                temp++;


            }
            System.out.println("The equally divided string is:");
            for(int j=0;j<arr.length;j++)
            {
                System.out.println(arr[j]);
            }

        }

    }
}
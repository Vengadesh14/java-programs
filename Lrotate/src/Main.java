import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int total,i;
        System.out.println("enter the number of elements you want to store:");
        total= sc.nextInt();
        int[] arr=new int[total];
        System.out.println("enter the elements you want to store:");
        for(i=0;i<total;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of rotation:");
        int n= sc.nextInt();
        String temp=Arrays.toString(arr);
        System.out.println("Before rotation-->"+temp);
       for(i=0;i<n;i++)
       {
           int first,j;
           first=arr[0];
           for(j=0;j<arr.length-1;j++)
           {
               arr[j]=arr[j+1];
           }
           arr[j]=first;
       }
       System.out.println("After rotation-->"+Arrays.toString(arr));
    }
}
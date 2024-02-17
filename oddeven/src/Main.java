import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the number of elements you want to store:");
        n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements you want to store:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
      String temp= Arrays.toString(arr);

        System.out.println(arr);
        int[] odd;
        int[] even;
        int e=0,o=0;
        for(int i=0;i< arr.length;i++)
        {

            if(arr[i]%2==0)
            {
                even[e]=arr[i];
                e++;
            }
            else {
                odd[o]=arr[i];
                o++;
            }
        }
        System.out.println("odd numbers-->"+Arrays.toString(odd));
        System.out.println("even numbers-->"+Arrays.toString(even));
    }
}
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8};
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("the element in the array is:");
        int m = sc.nextInt();
        for (int i = 0;i<arr.length;i++) {

            System.out.println(arr[i]);
        }
        System.out.println("enter the number to rotate");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            temp=arr[i];
            arr[i]=arr[i+1];


        }
    }
}
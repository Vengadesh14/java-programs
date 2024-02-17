public class Main {
    public static void main(String[] args) {

        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=n;j>=1;j--)
            {
                if(i>=j) {
                    System.out.print(" *");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
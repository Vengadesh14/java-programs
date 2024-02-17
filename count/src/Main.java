public class Main {
    public static void main(String[] args) {

        int num=45393153;
        int count=0,inc=0;
        while(num>0)
        {
            if(num%2!=0)
            {
                count++;
            }
            else {
                inc++;
            }
            num=num/10;

            //count++;
        }
        System.out.println("no of odd digits is:"+count);
        System.out.println("no of even digits is:"+inc);
    }
}
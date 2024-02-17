public class Main {
    public static void main(String[] args) {
      //*  String str="GoOD bOy";
       // StringBuffer str1=new StringBuffer(str);
      //  for(int i=0;i<str.length();i++)
       // {
           // if(Character.isLowerCase(str.charAt(i)))
         //   {
        //        str1.setCharAt(i,Character.toUpperCase(str.charAt(i)));
        //    }
         //   if(Character.isUpperCase(str.charAt(i)))
            //{
 //               str1.setCharAt(i,Character.toLowerCase(str.charAt(i)));
  //          }
 //       }
      //*  System.out.println(str1);
        String str="GoOD bOy";
        String str1=new String();
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
            {
              str1+=Character.toUpperCase(str.charAt(i));
            }
            if(Character.isUpperCase(str.charAt(i)))
            {
                str1+=Character.toLowerCase(str.charAt(i));
            }
        }
        System.out.println(str1);
    }
}
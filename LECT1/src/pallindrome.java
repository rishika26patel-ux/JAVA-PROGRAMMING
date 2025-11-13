public class pallindrome{
   public static void main(String[]args)
    {
        String a="MALAYALAM";
        String b="";
        for(int i=a.length()-1;i>=0;i--)
        {
            b+=a.charAt(i);
        }

        if(a.equals(b))
        {
            System.out.println("ji pallindrome hai");
        }
        else{
            System.out.println("ji pallindrome nii hai");
        }
    }
}

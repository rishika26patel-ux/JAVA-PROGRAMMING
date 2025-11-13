public class pallindrome{
    public static void main(String[]args)
    {
        String a="tanuu";
        String b="";
        for(int i=a.length()-1;i>=0;i--)
        {
            b+=a.charAt(i);
        }
        if(a.equals(b))
        {
            System.out.println("yes pallindrome");
        }
        else{
            System.out.println("no pallindrome");
        }
    }
}
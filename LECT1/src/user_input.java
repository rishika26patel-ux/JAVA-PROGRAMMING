import java.util.Scanner;
public class user_input {
    public static void main(String[]args)
    {
        //System.out.println("enter any number:");
        Scanner sc=new Scanner(System.in);
        //int a=sc.nextInt();

        System.out.println("enter string values");
        String str=sc.nextLine();
        System.out.println("you have entered:");
        System.out.println(str);
    }
}

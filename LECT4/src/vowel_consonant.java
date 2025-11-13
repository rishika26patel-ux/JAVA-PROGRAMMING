public class vowel_consonant {
    public static void main(String[]args)
    {
        String str="rgthjklmnbvwq";
        int  v=0;
        for(char ch:str.toCharArray())
        {
            if("AEIOUaeiou".indexOf(ch)!=-1)
            {
                v++;
            }
        }
        System.out.println(v);
    }
}

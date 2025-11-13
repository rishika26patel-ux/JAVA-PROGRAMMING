public class string {
    public static void main(String[]args){
        //StringBuilder str=new StringBuilder("RIS00");
      //APPEND
       // str.append("world");
        //System.out.println("append():"+str);
        //REPLACE
        //str.replace(1,4,"java");
        //System.out.println("replace();"+str);
        //DELETE
        //str.delete(1,2);
        //System.out.println("delete():"+str);
        //DELETECHARat()
        //str.deleteCharAt(3);
        //System.out.println("deleteCharAt()"+str);
        //REVERSE()
       // str.reverse();
        //System.out.println("reverse():"+str);

        //REVERSE STRING
        String str="i love java";
        String a[]=str.split(" ");
        StringBuilder result=new StringBuilder();

        for(String ele:a){
            StringBuilder val=new StringBuilder(ele);
            result.append(val.reverse().append(" "));
        }
        System.out.println("reverse String:"+result);
    }
}

public class CompressString {
    public static void main(String[]args){
        String str="riissshhhhoo";
        StringBuilder compressed=new StringBuilder();

        int count=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }else{
                compressed.append(str.charAt(i-1));
                compressed.append(count);
                count = 1;

            }
        }
        compressed.append(str.charAt(str.length()-1));
        compressed.append(count);

        System.out.println("original String:"+str);
        System.out.println("compressed String:"+compressed.toString());
    }
}

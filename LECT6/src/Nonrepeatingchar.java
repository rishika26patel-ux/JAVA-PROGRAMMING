//public class Nonrepeatingchar{
//public static void main(String[]args){
        //String str="rriiso";
        //for(int i=0;i<str.length();i++){
            //char ch=str.charAt(i);
          //  if(str.indexOf(ch)==str.lastIndexOf(ch)){
        //        System.out.println(" first non-repeating character:"+ ch);
      //           break;
    //        }
  //      }
//    }
//}

//ALL REPEATING CHARACTER
public class Nonrepeatingchar{
public static void main(String[]args){
    String str="rriiso";
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(str.indexOf(ch)==str.lastIndexOf(ch)){
            System.out.println("non-repeating character:"+ ch);
        }
    }
}
}


interface B { void msg();}
interface C { void msg();}
class D implements B,C{
    public void msg(){
        System.out.println("hii");
    }
}

public class TwoInterface {
    public static void main(String[]args){
        System.out.println("hellow");
    }
}

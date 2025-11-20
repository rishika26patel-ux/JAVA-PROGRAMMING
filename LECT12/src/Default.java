interface A{
    void sleep();
    default void data(){
        System.out.println("hehe");
    }
}
class B implements A{
    public void sleep(){
        System.out.println("byy");
    }
}
class C implements A{
    public void sleep(){
        System.out.println("hello");
    }
}

public class Default {
    public static void main(String[]args){
        C c1=new C();
        C c2=new C();
        c2.data();
        c1.sleep();
    }
}

class animal{
    void eat(){
        System.out.println(" dog is eating pizza");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("dog is barking hehe");
    }
}


public class Inheritance {
    public static void main(String[]args){
        dog s1=new dog();
        s1.bark();
        s1.eat();
    }
}

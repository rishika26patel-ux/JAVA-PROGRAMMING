class Animal{
void eat(){
    System.out.println(" dog is eating pizza");
}
}
class Dog extends Animal{
    void bark(){
        System.out.println("dog is barking hehe");
    }
}
class Puppy extends Dog{
    void happy(){
        System.out.println("puppy is cute");
    }
}
public class Multilevel {
    public static void main(String[]args){
        Dog s1=new Puppy();
        s1.eat();
        s1.bark();


    }
}

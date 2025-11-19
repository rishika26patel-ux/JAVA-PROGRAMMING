class animal {
    void eat() {
        System.out.println("pizza!!");
    }
}

class dog extends animal {
    void eat() {
        System.out.println("biryani!!");
    }
}
public class Overriding {
    public static void main(String[] args) {
        //dog d1 = new dog();
        animal s1=new dog();
        s1.eat();
    }
}
